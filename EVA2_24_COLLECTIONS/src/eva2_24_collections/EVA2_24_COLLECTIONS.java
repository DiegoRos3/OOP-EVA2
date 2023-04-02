/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_collections;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class EVA2_24_COLLECTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CORRECTIONS --> CONTENEDORES
        ArrayList miArreglo = new ArrayList(); //guardamos objetos en general
        miArreglo.add(new Persona());
        miArreglo.add(new Perro());
        miArreglo.add(new Automovil());
        
        ArrayList<Integer> miArreglo2 = new ArrayList<Integer>(); //guardamos enteros
        miArreglo2.add(100);
        miArreglo2.add(200);
        miArreglo2.add(300);
        miArreglo2.add(400);
        miArreglo2.add(500);
        System.out.println(miArreglo2);
    }
    
}
