package clases;

import org.junit.Test;

import static org.junit.Assert.*;

public class PerroGatoTest {

    @Test
    public void testPerroCuidadosBasicosYAcciones() {
        Dueno dueno = new Dueno("321", "Ana Gómez", "3120001111", "Carrera 10");
        Perro perro = new Perro("P100", "Toby", 5, dueno, "Beagle");

        assertEquals("Vacunas, paseo diario y baño.", perro.obtenerCuidadosBasicos());
        assertEquals("Guau Guau", perro.ladrar());
        assertEquals("P100", perro.getId());
        assertEquals("Toby", perro.getNombre());
        assertEquals("Beagle", perro.getRaza());
        assertEquals("Toby - 5 años", perro.toString());
    }

    @Test
    public void testGatoCuidadosBasicosYAcciones() {
        Dueno dueno = new Dueno("322", "Laura Ruiz", "3120002222", "Avenida 20");
        Gato gato = new Gato("G100", "Mimi", 3, dueno, false);

        assertEquals("Arena limpia, vacunas y revisión médica.", gato.obtenerCuidadosBasicos());
        assertEquals("Miau", gato.maullar());
        assertFalse(gato.isEsDomestico());
        gato.setEsDomestico(true);
        assertTrue(gato.isEsDomestico());
        assertEquals("Mimi - 3 años", gato.toString());
    }
}
