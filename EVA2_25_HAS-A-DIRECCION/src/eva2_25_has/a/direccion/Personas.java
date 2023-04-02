/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_25_has.a.direccion;

/**
 *
 * @author Diego
 */
public class Personas{
    private String nombre;
    private String apellido;
    private int edad;
    private Direccion direccion; //has a (tiene una) direccion

    public Personas() {
        this.nombre = "-----";
        this.apellido = "-----";
        this.edad = 0;
        this.direccion = null; // no existe un tipo direccion
    }

    public Personas(String nombre, String apellido, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    public void imprimirDatos(){
        System.out.println("Persona: ");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Apellido: "+apellido);
        System.out.println("Edad: "+edad);
        if (direccion == null) {
            System.out.println("Sin direccion.");
        } else{
            direccion.imprimirDatos();
        }        
    }
}
