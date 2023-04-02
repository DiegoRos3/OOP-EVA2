package eva2_20_vehiculo;

public class Automovil extends Vehiculo implements ControlVelocidad{
    private String modelo;
    private String placa;
    private String año;

    public Automovil() {
        super();
        this.modelo = "-----";
        this.placa = "-----";
        this.año = "-----";
    }

    public Automovil(String modelo, String placa, String año, int velocidad, String Marca) {
        super(velocidad, Marca);
        this.modelo = modelo;
        this.placa = placa;
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    @Override
    public int acelerar() {
        return velocidad += 5;
    }

    @Override
    public int detener() {
        velocidad = 0;
        return velocidad;
    }

    @Override
    public void imprimirVel() {
        System.out.println("La velocidad actual es de: " + velocidad);
    }
    
    
    
    
    
}
