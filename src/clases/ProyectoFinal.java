/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clases;

import ui.MainFrame;

/**
 * Punto de entrada de la aplicación de gestión veterinaria.
 *
 * Inicializa la interfaz gráfica de usuario en el hilo de despacho de eventos
 * de Swing.<
 *
 * @author mildr
 */
public class ProyectoFinal {

    /**
     * Lanza la aplicación.
     *
     * @param args parámetros de línea de comando (no utilizados)
     */
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }
}
