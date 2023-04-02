/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_23_polimorfismo_vehiculos;

/**
 *
 * @author Diego
 */
public class Bicicleta extends Vehiculo implements DatosVehiculo{
    private String tipo;
    private String rodada;

    public Bicicleta() {
        super();
        this.tipo = "-----";
        this.rodada = "-----";
    }

    public Bicicleta(String tipo, String rodada, int velocidad, String marca) {
        super(velocidad, marca);
        this.tipo = tipo;
        this.rodada = rodada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRodada() {
        return rodada;
    }

    public void setRodada(String rodada) {
        this.rodada = rodada;
    }

        @Override
    public void acelerar(int cambio) {
        int cambioVel = velocidad + cambio;
        if (cambioVel >= 0) { //cambio nomás acepta velocidad positiva o de 0
            velocidad += cambioVel; //acumulador
        }
        
    }

    @Override
    public void tablero() {
        System.out.println("Velocidad de la bicicleta: "+ velocidad);
    }
    
}
