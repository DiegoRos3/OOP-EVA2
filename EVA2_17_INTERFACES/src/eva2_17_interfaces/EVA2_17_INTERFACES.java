/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_interfaces;

/**
 *
 * @author Diego
 */
public class EVA2_17_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //MostrarDatos md = new MostrarDatos();
        Persona per1 = new Persona("Jose Jose", 52);
        per1.imprimirDatos();
        
        Computadora pc = new Computadora(16, "i5-11700");
        pc.imprimirDatos();
    }
    
}
