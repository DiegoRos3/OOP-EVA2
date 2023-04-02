/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_23_polimorfismo_vehiculos;

/**
 *
 * @author Diego
 */
public class Vehiculo {
    protected int velocidad;
    private String marca;

    public Vehiculo() {
        this.velocidad = 0 ;
        this.marca = "-----";
    }

    public Vehiculo(int velocidad, String marca) {
        this.velocidad = velocidad; //se modifica con acelerar
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}
