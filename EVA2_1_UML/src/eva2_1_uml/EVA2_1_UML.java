package eva2_1_uml;
import MisClases.*;

public class EVA2_1_UML {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //Clase Persona
        Persona persona1 = new Persona();
        persona1.setNombre("Diego");
        persona1.setEdad(18);
        persona1.setId(321321);        
        persona1.imprimirDatos();
        
        System.out.println("//////////////////");
        
        //Clase Vehiculo
        Vehiculo veh1 = new Vehiculo();
        veh1.setMarca("Ford");
        veh1.setModelo("Fiesta");
        veh1.setAño(2004);
        veh1.imprimirDatos();
        
        System.out.println("//////////////////");
        
        //Clase Tv
        Tv ntv = new Tv();
        ntv.setCanal(361);
        ntv.setVolumen(15);
        ntv.setPower(true); //encendido == true
        ntv.imprimirDatos();
        
        
    }
    
}