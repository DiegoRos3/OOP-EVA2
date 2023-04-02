/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_20_vehiculo;

/**
 *
 * @author Diego
 */
public abstract class Vehiculo {
    protected int velocidad;
    private String Marca;

    public Vehiculo() {
        this.velocidad = 0;
        this.Marca = "-----";
    }

    public Vehiculo(int velocidad, String Marca) {
        this.velocidad = velocidad;
        this.Marca = Marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }   
}
