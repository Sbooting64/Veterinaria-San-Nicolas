/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author mildr
 */
public class VeterinariaFacade implements IVeterinaria {
    
     private Map<String, Dueno> duenos;
    private List<Cita> citas;
    private Set<String> servicios;

    public VeterinariaFacade() {

        duenos = new HashMap<>();
        citas = new ArrayList<>();
        servicios = new HashSet<>();
    }

    @Override
    public void registrarMascota(Mascota mascota) {

        duenos.put(
            mascota.getDueno().getIdentificacion(),
            mascota.getDueno()
        );
    }

    @Override
    public void agendarCita(Cita cita) {

        citas.add(cita);
    }

    @Override
    public Mascota buscarMascota(String id) {

        for (Cita c : citas) {

            if (c.getMascota().getId().equals(id)) {
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
