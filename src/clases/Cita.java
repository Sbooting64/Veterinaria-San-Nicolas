/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.time.LocalDateTime;

/**
 *
 * @author mildr
 */
public class Cita {
    
    private int idCita;
    private LocalDateTime fechaHora;
    private Mascota mascota;
    private String motivo;

    public Cita() {
    }

    public Cita(int idCita,LocalDateTime fechaHora,Mascota mascota, String motivo) {
        this.idCita = idCita;
        this.fechaHora = fechaHora;
        this.mascota = mascota;
        this.motivo = motivo;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
}
