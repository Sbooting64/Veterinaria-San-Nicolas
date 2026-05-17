/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Implementación de la lógica central de la veterinaria.
 *
 * <p>Este facade administra los registros de dueños, mascotas y citas, ofreciendo
 * operaciones sencillas para el resto de la aplicación.</p>
 *
 * @author mildr
 */
public class VeterinariaFacade implements IVeterinaria {

    private final Map<String, Dueno> duenos;
    private final Map<String, Mascota> mascotas;
    private final List<Cita> citas;

    /**
     * Inicializa la fachada con las colecciones vacías para dueños, mascotas y citas.
     */
    public VeterinariaFacade() {
        duenos = new HashMap<>();
        mascotas = new HashMap<>();
        citas = new ArrayList<>();
    }

    @Override
    public void registrarMascota(Mascota mascota) {
        if (mascota != null && mascota.getDueno() != null) {
            duenos.put(mascota.getDueno().getIdentificacion(), mascota.getDueno());
            mascotas.put(mascota.getId(), mascota);
        }
    }

    @Override
    public void agendarCita(Cita cita) {
        if (cita != null) {
            citas.add(cita);
        }
    }

    @Override
    public Mascota buscarMascota(String id) {
        if (id == null) {
            return null;
        }

        Mascota mascota = mascotas.get(id);
        if (mascota != null) {
            return mascota;
        }

        for (Cita c : citas) {
            if (c != null && c.getMascota() != null && id.equals(c.getMascota().getId())) {
                return c.getMascota();
            }
        }

        return null;
    }

    @Override
    public List<Cita> buscarHistorial(String idMascota) {
        List<Cita> historial = new ArrayList<>();

        for (Cita c : citas) {
            if (c.getMascota().getId().equals(idMascota)) {
                historial.add(c);
            }
        }

        return historial;
    }
}
