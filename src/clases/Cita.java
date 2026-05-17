/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.time.LocalDateTime;

/**
 * Representa una cita médica agendada para una mascota.
 *
 * <p>Incluye la fecha y hora de la cita, la mascota a atender y el motivo
 * de la consulta.</p>
 *
 * @author mildr
 */
public class Cita {

    private int idCita;
    private LocalDateTime fechaHora;
    private Mascota mascota;
    private String motivo;

    /**
     * Constructor vacío utilizado para serialización o instancias por defecto.
     */
    public Cita() {
    }

    /**
     * Crea una cita con la información completa.
     *
     * @param idCita identificador único de la cita
     * @param fechaHora fecha y hora programada de la cita
     * @param mascota mascota asociada a la cita
     * @param motivo motivo de la consulta
     */
    public Cita(int idCita, LocalDateTime fechaHora, Mascota mascota, String motivo) {
        this.idCita = idCita;
        this.fechaHora = fechaHora;
        this.mascota = mascota;
        this.motivo = motivo;
    }

    /**
     * Obtiene el identificador de la cita.
     *
     * @return el identificador de la cita
     */
    public int getIdCita() {
        return idCita;
    }

    /**
     * Establece el identificador de la cita.
     *
     * @param idCita el identificador a asignar
     */
    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    /**
     * Obtiene la fecha y hora programada de la cita.
     *
     * @return fecha y hora de la cita
     */
    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    /**
     * Establece la fecha y hora de la cita.
     *
     * @param fechaHora la fecha y hora a asignar
     */
    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    /**
     * Obtiene la mascota asociada a la cita.
     *
     * @return la mascota asociada
     */
    public Mascota getMascota() {
        return mascota;
    }

    /**
     * Establece la mascota vinculada a la cita.
     *
     * @param mascota la mascota a asignar
     */
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    /**
     * Obtiene el motivo de la cita.
     *
     * @return el motivo de la consulta
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * Establece el motivo de la cita.
     *
     * @param motivo el motivo a asignar
     */
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}
