/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 * Excepción lanzada cuando una nueva cita entra en conflicto con una cita existente.
 *
 * <p>Se utiliza para detectar traslapes de horario en la agenda de citas.</p>
 *
 * @author mildr
 */
public class CitaTraslapadaException extends Exception {

    /**
     * Constructor que crea la excepción con un mensaje explicativo.
     *
     * @param mensaje razón del traslape de la cita
     */
    public CitaTraslapadaException(String mensaje) {
        super(mensaje);
    }
}
