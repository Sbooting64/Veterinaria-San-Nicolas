/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 * Representa un perro registrado en la veterinaria.
 *
 * Extiende la clase {@link Mascota} y agrega información específica
 * como la raza.
 *
 * @author mildr
 */
public class Perro extends Mascota {

    private String raza;

    /**
     * Constructor vacío para compatibilidad con frameworks.
     */
    public Perro() {
    }

    /**
     * Crea un perro con los datos completos.
     *
     * @param id identificador de la mascota
     * @param nombre nombre del perro
     * @param edad edad en años
     * @param dueno dueño responsable
     * @param raza raza del perro
     */
    public Perro(String id, String nombre, int edad, Dueno dueno, String raza) {
        super(id, nombre, edad, dueno);
        this.raza = raza;
    }

    @Override
    public String obtenerCuidadosBasicos() {
        return "Vacunas, paseo diario y baño.";
    }

    /**
     * Simula el sonido que hace el perro.
     *
     * @return una cadena con el ladrido del perro
     */
    public String ladrar() {
        return "Guau Guau";
    }

    /**
     * Obtiene la raza del perro.
     *
     * @return la raza del perro
     */
    public String getRaza() {
        return raza;
    }

    /**
     * Establece la raza del perro.
     *
     * @param raza la raza a asignar
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }
}
