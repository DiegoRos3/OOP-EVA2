package eva2_20_vehiculo;

public class EVA2_20_VEHICULO {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //Automovil
        Automovil auto = new Automovil("Fiesta", "AD52E", "2008", 0, "Ford");
        System.out.println("Automovil:");
        auto.acelerar();
        auto.acelerar();
        auto.detener();
        auto.acelerar();
        auto.acelerar();
        auto.acelerar();
        auto.imprimirVel();
        
        //bicicleta
        Bicicleta bici = new Bicicleta("De montaña", "Azul", 6, "Patito");
        System.out.println("Bicicleta:");
        bici.acelerar();
        bici.detener();
        bici.acelerar();
        bici.acelerar();
        bici.acelerar();
        bici.imprimirVel();
    }
    
}
