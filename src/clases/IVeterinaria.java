/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.List;

/**
 *
 * @author mildr
 */
public interface IVeterinaria {
    
    
    void registrarMascota(Mascota mascota);
    
    void agendarCita(Cita cita);
    
    Mascota buscarMascota(String id);
    
    List<Cita> buscarHistorial(String idMascota);
}
