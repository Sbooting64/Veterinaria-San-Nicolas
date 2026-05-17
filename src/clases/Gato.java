/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 * Representa un gato registrado en la veterinaria.
 *
 * <p>Extiende la clase {@link Mascota} y agrega el indicador de si es doméstico.</p>
 *
 * @author mildr
 */
public class Gato extends Mascota {

    private boolean esDomestico;

    /**
     * Constructor vacío para compatibilidad con frameworks.
     */
    public Gato() {
    }

    /**
     * Crea un gato con los datos completos.
     *
     * @param id identificador de la mascota
     * @param nombre nombre del gato
     * @param edad edad en años
     * @param dueno dueño responsable
     * @param esDomestico indicador de si el gato es doméstico
     */
    public Gato(String id, String nombre, int edad, Dueno dueno, boolean esDomestico) {
        super(id, nombre, edad, dueno);
        this.esDomestico = esDomestico;
    }

    @Override
    public String obtenerCuidadosBasicos() {
        return "Arena limpia, vacunas y revisión médica.";
    }

    /**
     * Simula el sonido del gato.
     *
     * @return una cadena con el maullido del gato
     */
    public String maullar() {
        return "Miau";
    }

    /**
     * Indica si el gato es doméstico.
     *
     * @return {@code true} si el gato es doméstico, {@code false} en caso contrario
     */
    public boolean isEsDomestico() {
        return esDomestico;
    }

    /**
     * Establece si el gato es doméstico.
     *
     * @param esDomestico el valor a asignar
     */
    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }
}
