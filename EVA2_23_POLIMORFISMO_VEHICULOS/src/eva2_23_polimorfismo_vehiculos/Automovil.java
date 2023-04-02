/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_23_polimorfismo_vehiculos;

/**
 *
 * @author Diego
 */
public class Automovil extends Vehiculo implements DatosVehiculo{
    
    private String modelo;
    private int año;

    public Automovil() {
        super();
        this.modelo = "-----";
        this.año = 0;
    }

    public Automovil(String modelo, int año, int velocidad, String marca) {
        super(velocidad, marca);
        this.modelo = modelo;
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
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
        System.out.println("Velocidad del automovil: "+ velocidad);
    }

    
    
}
