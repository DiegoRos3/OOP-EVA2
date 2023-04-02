/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_22_polimorfismo_figuras;

import java.util.Scanner;

/**
 *
 * @author Diego
 */
public class EVA2_22_POLIMORFISMO_FIGURAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Circulo circ = new Circulo(5);
//        circ.imprimirDatos();
//        Figuras figu = circ;
//        System.out.println("Area: "+ figu.calcularArea());

        //Un arreglo de java va de la posicion 0 a la n-1
//        Circulo[] circulos = new Circulo[10];
//        
//        for (int i = 0; i < circulos.length; i++) {
//            circulos[i] = new Circulo(i);
//            circulos[i].imprimirDatos();}
            
        Figuras[] figuras; //declaramos el arreglo, pero no lo hemos creado
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantas figuras quieres capturar?");
        int cant = sc.nextInt(); //capturamos la cantidad con el scanner
        figuras = new Figuras[cant]; //creamos el arreglo con la cantidad
        
        for (int i = 0; i < figuras.length; i++) {
            System.out.println("Captura el tipo de figura: ");
            System.out.println("1. Circulo");
            System.out.println("2. Triangulo");
            int figu = sc.nextInt();
            if (figu == 1) { // Circulo
                Circulo circu = new Circulo();
                System.out.println("Introduce el radio: ");
                circu.setRadio(sc.nextDouble());
                figuras[i] = circu;
            } else { //Triangulo
                Triangulo trian = new Triangulo();
                System.out.println("Introduce la base: ");
                trian.setBase(sc.nextDouble());
                System.out.println("Introduce la altura: ");
                trian.setAltura(sc.nextDouble());
                figuras[i] = trian;
            }
        }
        
        for (int i = 0; i < figuras.length; i++) {
            if (figuras[i] instanceof Circulo){
                //System.out.println("CIRCULO "+ (i+1));
                Circulo circu = (Circulo) figuras[i]; //casting
                circu.imprimirDatos();
            }else{
                //System.out.println("TRIANGULO "+ (i+1));
                Triangulo trian = (Triangulo) figuras[i]; //casting
                trian.imprimirDatos();
            }
                
            //System.out.println("Area: "+figuras[i].calcularArea());
            //System.out.println("Perimetro: "+figuras[i].calcularPeri());
            //System.out.println("");
        }
    }
    
}
