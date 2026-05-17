/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import excepciones.CitaTraslapadaException;
import excepciones.MascotaNoEncontradaException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Implementación de la lógica central de la veterinaria.
 *
 * Este facade administra los registros de dueños, mascotas y citas, ofreciendo
 * operaciones sencillas para el resto de la aplicación.
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
    public void agendarCita(Cita cita) throws CitaTraslapadaException {
        if (cita == null || cita.getMascota() == null || cita.getFechaHora() == null) {
            return;
        }

        for (Cita existente : citas) {
            if (existente != null && existente.getMascota() != null && existente.getFechaHora() != null
                    && existente.getMascota().getId().equals(cita.getMascota().getId())
                    && existente.getFechaHora().equals(cita.getFechaHora())) {
                throw new CitaTraslapadaException("Ya existe una cita programada para esta mascota en la misma fecha y hora.");
            }
        }

        citas.add(cita);
        mascotas.put(cita.getMascota().getId(), cita.getMascota());
    }

    @Override
    public Mascota buscarMascota(String id) throws MascotaNoEncontradaException {
        if (id == null || id.trim().isEmpty()) {
            throw new MascotaNoEncontradaException("El identificador de mascota no puede estar vacío.");
        }

        Mascota mascota = mascotas.get(id);
        if (mascota != null) {
            return mascota;
        }

        for (Cita c : citas) {
            if (c != null && c.getMascota() != null && c.getMascota().getId() != null
                    && id.equals(c.getMascota().getId())) {
                return c.getMascota();
            }
        }

        throw new MascotaNoEncontradaException("No se encontró una mascota con el ID especificado: " + id);
    }

    @Override
    public List<Cita> buscarHistorial(String idMascota) throws MascotaNoEncontradaException {
        if (idMascota == null || idMascota.trim().isEmpty()) {
            throw new MascotaNoEncontradaException("El identificador de mascota no puede estar vacío.");
        }

        boolean mascotaExiste = mascotas.containsKey(idMascota);
        List<Cita> historial = new ArrayList<>();

        for (Cita c : citas) {
            if (c != null && c.getMascota() != null && idMascota.equals(c.getMascota().getId())) {
                historial.add(c);
                mascotaExiste = true;
            }
        }

        if (!mascotaExiste) {
            throw new MascotaNoEncontradaException("No se encontró una mascota con el ID especificado: " + idMascota);
        }

        return historial;
    }
}
