/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.List;
import excepciones.CitaTraslapadaException;
import excepciones.MascotaNoEncontradaException;

/**
 * Interfaz que define las operaciones principales de la veterinaria.
 *
 * Se utiliza para abstraer la lógica de gestión de mascotas y citas,
 * permitiendo distintas implementaciones que cumplan con estas operaciones.
 *
 * @author mildr
 */
public interface IVeterinaria {

    /**
     * Registra una mascota en el sistema veterinario.
     *
     * @param mascota la mascota que se desea registrar
     */
    void registrarMascota(Mascota mascota);

    /**
     * Agrega una cita al sistema.
     *
     * @param cita la cita a agendar
     * @throws CitaTraslapadaException cuando existe una cita en el mismo horario para la mascota
     */
    void agendarCita(Cita cita) throws CitaTraslapadaException;

    /**
     * Busca una mascota por su identificador.
     *
     * @param id el identificador único de la mascota
     * @return la mascota encontrada
     * @throws MascotaNoEncontradaException cuando no se encuentra la mascota
     */
    Mascota buscarMascota(String id) throws MascotaNoEncontradaException;

    /**
     * Obtiene el historial de citas de una mascota.
     *
     * @param idMascota el identificador de la mascota
     * @return la lista de citas asociadas a la mascota
     * @throws MascotaNoEncontradaException cuando la mascota no existe
     */
    List<Cita> buscarHistorial(String idMascota) throws MascotaNoEncontradaException;
}
