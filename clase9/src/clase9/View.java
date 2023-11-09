/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase9;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class View {
    
    /*
        Metodo que solicita la data en pantalla
    */
    public void setData(Estudiante[] estudiante){
        for(int x=0; x<estudiante.length; x++){
            JOptionPane.showMessageDialog(null, "Se solicitarán los datos del estudiante "+(x+1));
            int cedula = Integer.parseInt(JOptionPane.showInputDialog(null,"Escriba la cedula:"));
            String nombre = JOptionPane.showInputDialog(null,"Escriba el nombre:");
            String apellidos = JOptionPane.showInputDialog("Escriba los apellidos");
            estudiante[x]=new Estudiante(cedula,nombre,apellidos);
        }
    }
    
    
    public void printData(Estudiante[] estudiante){
        
        String result ="";
        for (int i = 0; i < estudiante.length; i++) {
            result+= estudiante[i].toString() + "\n" ;
        }
        JOptionPane.showMessageDialog(null, result);
      
    }
    
    
}
