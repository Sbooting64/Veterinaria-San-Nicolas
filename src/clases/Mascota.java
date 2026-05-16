/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author mildr
 */
public abstract class Mascota {
    
    private String id;
    private String nombre;
    private int edad;
    private Dueno dueno;
    
    public Mascota (){
        
    }
    public Mascota(String id, String nombre, int edad, Dueno dueno){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.dueno = dueno;
    }
    
    public abstract String obtenerCuidadosBasicos();
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Dueno getDueno() {
        return dueno;
    }

    public void setDueno(Dueno dueno) {
        this.dueno = dueno;
    }

@Override
    public String toString() {
        return nombre + " - " + edad + " años";
    }
    
}
