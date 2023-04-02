
package eva2_20_vehiculo;

public class Bicicleta extends Vehiculo implements ControlVelocidad{
    private String tipo;
    private String color;

    public Bicicleta() {
        this.tipo = "-----";
        this.color = "-----";
    }

    public Bicicleta(String tipo, String color, int velocidad, String Marca) {
        super(velocidad, Marca);
        this.tipo = tipo;
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int acelerar() {
        return velocidad += 1;  
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
