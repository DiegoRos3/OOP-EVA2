/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_has.a.direccion;

/**
 *
 * @author Diego
 */
public class EVA2_25_HASADIRECCION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Personas perso = new Personas();
        perso.setNombre("Juan");
        perso.setApellido("Gutierritos");
        perso.setEdad(96);
        //para asignar direccion debes de crear pimero un objeto tipo direccion
        Direccion dir = new Direccion();
        dir.setCalle("Industrias");
        dir.setNumero(11101);
        dir.setColonia("Complejo industrial chihuahua");
        dir.setCp("31135");
        dir.setCiudad("Chihuahua");
        dir.setEstado("Chihuahua");
        perso.setDireccion(dir);
        
        perso.imprimirDatos();
    }
    
}
