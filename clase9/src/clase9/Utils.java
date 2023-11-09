/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase9;

/**
 *
 * @author viti
 */
public class Utils {
    
    
    public void recordDummyData(Estudiante[] estudiante){
         // datos dummy
        for(int x=0; x<estudiante.length; x++){
           estudiante[x]= new Estudiante(x,"Nombre"+x,"Apellido"+x);
        }
    }
    
    public void printArray(Estudiante[] estudiante){
        for (int i = 0; i < estudiante.length; i++) {
            System.out.println(estudiante[i].toString());
        } 
    }
    
}
