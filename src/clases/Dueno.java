/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 * Representa al dueño de una mascota.
 *
 * <p>Contiene los datos personales básicos del propietario, como identificación,
 * nombre, teléfono y dirección.</p>
 *
 * @author mildr
 */
public class Dueno {

    private String identificacion;
    private String nombre;
    private String telefono;
    private String direccion;

    /**
     * Constructor vacío requerido por algunos frameworks y herramientas.
     */
    public Dueno() {
    }

    /**
     * Crea un dueño con todos los datos necesarios.
     *
     * @param identificacion documento de identificación del dueño
     * @param nombre nombre completo del dueño
     * @param telefono número de teléfono de contacto
     * @param direccion dirección física del dueño
     */
    public Dueno(String identificacion, String nombre, String telefono, String direccion) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    /**
     * Obtiene la identificación del dueño.
     *
     * @return la identificación del dueño
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * Establece la identificación del dueño.
     *
     * @param identificacion la identificación a asignar
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * Obtiene el nombre del dueño.
     *
     * @return el nombre del dueño
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del dueño.
     *
     * @param nombre el nombre a asignar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el teléfono de contacto del dueño.
     *
     * @return el teléfono del dueño
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el teléfono de contacto del dueño.
     *
     * @param telefono el teléfono a asignar
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene la dirección del dueño.
     *
     * @return la dirección del dueño
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del dueño.
     *
     * @param direccion la dirección a asignar
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
