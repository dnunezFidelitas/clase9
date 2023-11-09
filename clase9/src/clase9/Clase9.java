/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase9;

import javax.swing.JOptionPane;

/**
 * Arreglos de objetos
 * @author viti
 */
public class Clase9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaración de un objeto de arreglos
        Estudiante arrEstudiante[] = new Estudiante[3];
    /*
        View view = new View();
        view.setData(arrEstudiante);
        view.printData(arrEstudiante);*/
        
        Utils util = new Utils();
        util.recordDummyData(arrEstudiante);
        util.printArray(arrEstudiante); 
    }

}
