/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase9;

/**
 *
 * @author viti
 */
public class Estudiante {
    // atributos
    public int cedula;
    public String nombre;
    public String apellidos;
    
    // constructor
    public Estudiante(int cedula, String nombre, String apellidos) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    // setters y getters    
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellidos=" + apellidos + '}';
    }
    
}
