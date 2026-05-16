/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author mildr
 */
public class Perro extends Mascota{
    
    private String raza;
    
    public Perro(){
        
    }
    
    public Perro(String id, String nombre, int edad, Dueno dueno, String raza){
        super(id, nombre, edad, dueno);
        this.raza = raza;
    }
    
    @Override
    public String obtenerCuidadosBasicos() {
        return "Vacunas, paseo diario y baño.";
    }

    public String ladrar() {
        return "Guau Guau";
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
