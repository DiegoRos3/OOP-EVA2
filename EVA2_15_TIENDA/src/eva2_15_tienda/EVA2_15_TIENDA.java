package eva2_15_tienda;

import Productos.Computadora;
import Productos.Playera;

public class EVA2_15_TIENDA {

    public static void main(String[] args) {
        // TODO code application logic here
        Computadora pc1 = new Computadora();
        System.out.println("PC");
        System.out.println(pc1);
        System.out.println("");
        
        Playera playera1 = new Playera();
        System.out.println("PLAYERA");
        System.out.println(playera1);
        System.out.println("");
        
        Computadora pc2 = new Computadora(15.6, 16, "i5-6700", "500GB", "Dell", "Latitude", 16, "Jose", 6400, "Una");
        System.out.println("PC 2");
        System.out.println(pc2);
        System.out.println("");
        
        Playera playera2 = new Playera("L", "Polo", "Patito", "Azul", "Juan", 400, "Una");
        System.out.println("PLAYERA 2");
        System.out.println(playera2);
    }
    
}
