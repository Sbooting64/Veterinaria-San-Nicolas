/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 * Excepción lanzada cuando una mascota no se encuentra en el sistema.
 *
 * <p>Se utiliza para señalar búsquedas fallidas de mascotas por su identificador.</p>
 *
 * @author mildr
 */
public class MascotaNoEncontradaException extends Exception {

    /**
     * Constructor que crea la excepción con un mensaje descriptivo.
     *
     * @param mensaje mensaje que explica el motivo de la excepción
     */
    public MascotaNoEncontradaException(String mensaje) {
        super(mensaje);
    }
}
