/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_polimorfismo;

/**
 *
 * @author Diego
 */
public class EVA2_21_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estu = new Estudiante("Juan", "Gutierritos", 19, "22550162");
        estu.imprimirDatos();
        
        
        Docentes docente = new Docentes("Martina", "Chavez", 22, "Tiempo completo");
        docente.imprimirDatos();
        
        //POLIMORFISMO: PUEDO TRATAR A LOS OBJETOS ED LAS SUBCLASES COMO OBJETOS DE LA SUPERCLASE
        //AL REVES NO SE PUEDE
        
        //ESTOY ASIGNANDO UN OBJETO DE TIPO ESTUDIANTE A UNA VARIABLE DE TIPO PERSONA
        Persona perso = estu;
        //ESTOY GENERALIZANDO (SIMPLIFICANDO)
        Persona perso2 = docente;
        Persona perso3 = new Persona();
        //ES IMPOSIBLE CONVERTIR UNA PERSONA EN UN ESTUDIANTE
        //NO PODEMOS AGREGAR COSAS, SIMPLEMENTE OCULTAMOS PROPIEDADES
        //Estudiante estu2 = perso3;
    }
    
}
