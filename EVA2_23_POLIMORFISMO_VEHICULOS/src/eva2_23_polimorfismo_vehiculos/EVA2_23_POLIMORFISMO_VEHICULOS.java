package eva2_23_polimorfismo_vehiculos;

public class EVA2_23_POLIMORFISMO_VEHICULOS {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Automovil auto = new Automovil("TsuruXXL", 2022, 0, "Tesla");
        cambiarVel(auto, 20);
        Bicicleta bici = new Bicicleta("montaña", "XXX", 0, "Harley Davidson");
        cambiarVel(bici, 50);
        //clase objeto -->
        Object obj = auto;
    }
    
    public static void cambiarVel(DatosVehiculo vehi, int vel){
        vehi.acelerar(vel);
        vehi.tablero();
    }
}
