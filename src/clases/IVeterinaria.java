/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.List;

/**
 * Interfaz que define las operaciones principales de la veterinaria.
 *
 * <p>Se utiliza para abstraer la lógica de gestión de mascotas y citas,
 * permitiendo distintas implementaciones que cumplan con estas operaciones.</p>
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
     */
    void agendarCita(Cita cita);

    /**
     * Busca una mascota por su identificador.
     *
     * @param id el identificador único de la mascota
     * @return la mascota encontrada, o {@code null} si no existe
     */
    Mascota buscarMascota(String id);

    /**
     * Obtiene el historial de citas de una mascota.
     *
     * @param idMascota el identificador de la mascota
     * @return la lista de citas asociadas a la mascota
     */
    List<Cita> buscarHistorial(String idMascota);
}
