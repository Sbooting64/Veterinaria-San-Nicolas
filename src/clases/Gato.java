/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author mildr
 */
public class Gato extends Mascota{
    
    private boolean esDomestico;
    
    public Gato(){
        
    }
    
    public Gato(String id, String nombre, int edad, Dueno dueno, boolean esDomestico){
        super(id, nombre, edad, dueno);
        this.esDomestico = esDomestico;
    }
    
    @Override
    public String obtenerCuidadosBasicos() {
        return "Arena limpia, vacunas y revisión médica.";
    }

    public String maullar() {
        return "Miau";
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }
    
}
