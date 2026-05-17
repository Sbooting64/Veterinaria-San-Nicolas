/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 * Clase base para las mascotas registradas en la veterinaria.
 *
 * Define los atributos comunes a todas las mascotas, como identificador,
 * nombre, edad y el dueño asociado.
 *
 * @author mildr
 */
public abstract class Mascota {

    private String id;
    private String nombre;
    private int edad;
    private Dueno dueno;

    /**
     * Constructor vacío utilizado por herramientas de creación de objetos.
     */
    public Mascota() {
    }

    /**
     * Crea una mascota con los datos necesarios para su registro.
     *
     * @param id identificador único de la mascota
     * @param nombre nombre de la mascota
     * @param edad edad de la mascota en años
     * @param dueno dueño responsable de la mascota
     */
    public Mascota(String id, String nombre, int edad, Dueno dueno) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.dueno = dueno;
    }

    /**
     * Devuelve una descripción de los cuidados básicos recomendados para la mascota.
     *
     * @return la descripción de cuidados básicos
     */
    public abstract String obtenerCuidadosBasicos();

    /**
     * Obtiene el identificador de la mascota.
     *
     * @return el identificador de la mascota
     */
    public String getId() {
        return id;
    }

    /**
     * Establece el identificador de la mascota.
     *
     * @param id el identificador a asignar
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre de la mascota.
     *
     * @return el nombre de la mascota
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la mascota.
     *
     * @param nombre el nombre a asignar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la edad de la mascota.
     *
     * @return la edad en años
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad de la mascota.
     *
     * @param edad la edad en años
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene el dueño de la mascota.
     *
     * @return el dueño asociado
     */
    public Dueno getDueno() {
        return dueno;
    }

    /**
     * Establece el dueño de la mascota.
     *
     * @param dueno el dueño a asignar
     */
    public void setDueno(Dueno dueno) {
        this.dueno = dueno;
    }

    @Override
    public String toString() {
        return nombre + " - " + edad + " años";
    }
}
