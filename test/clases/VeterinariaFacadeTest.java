package clases;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.Assert.*;

public class VeterinariaFacadeTest {

    private VeterinariaFacade veterinaria;
    private Dueno dueno;
    private Mascota perro;
    private Mascota gato;

    @Before
    public void setUp() {
        veterinaria = new VeterinariaFacade();
        dueno = new Dueno("123", "José Pérez", "3001234567", "Calle 1");
        perro = new Perro("P001", "Rocky", 4, dueno, "Labrador");
        gato = new Gato("G001", "Misu", 2, dueno, true);
    }

    @Test
    public void testRegistrarMascotaYBuscarPorId() {
        veterinaria.registrarMascota(perro);

        Mascota resultado = veterinaria.buscarMascota("P001");

        assertNotNull("La mascota registrada debe encontrarse.", resultado);
        assertEquals("P001", resultado.getId());
        assertEquals("Rocky", resultado.getNombre());
        assertEquals("José Pérez", resultado.getDueno().getNombre());
    }

    @Test
    public void testBuscarMascotaDesconocidaDevuelveNull() {
        assertNull("Una búsqueda por ID desconocido debe devolver null.", veterinaria.buscarMascota("NO_EXISTE"));
    }

    @Test
    public void testAgendarCitaYBuscarHistorial() {
        veterinaria.registrarMascota(gato);

        Cita cita1 = new Cita(1, LocalDateTime.now().plusDays(1), gato, "Vacunación");
        Cita cita2 = new Cita(2, LocalDateTime.now().plusDays(7), gato, "Revisión general");

        veterinaria.agendarCita(cita1);
        veterinaria.agendarCita(cita2);

        List<Cita> historial = veterinaria.buscarHistorial("G001");

        assertNotNull("El historial no debe ser null.", historial);
        assertEquals("Deben encontrarse dos citas en el historial.", 2, historial.size());
        assertEquals(1, historial.get(0).getIdCita());
        assertEquals(2, historial.get(1).getIdCita());
    }

    @Test
    public void testBuscarMascotaPorCitaSinRegistroDirecto() {
        Cita cita = new Cita(3, LocalDateTime.now().plusDays(3), perro, "Consulta");
        veterinaria.agendarCita(cita);

        Mascota resultado = veterinaria.buscarMascota("P001");

        assertNotNull("La mascota debe encontrarse a partir de la cita.", resultado);
        assertEquals("Rocky", resultado.getNombre());
    }
}
