/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productos;

import SuperClases.Ropa;

/**
 *
 * @author Diego
 */
public class Playera extends Ropa{
    private String talla;
    private String tipo;

    public Playera() {
        super();
        this.talla = "-----";
        this.tipo = "-----";
    }

    public Playera(String talla, String tipo, String marca, String color, String nombre, double precio, String unidad) {
        super(marca, color, nombre, precio, unidad);
        this.talla = talla;
        this.tipo = tipo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public double precioVenta(int cant) {
        return getPrecio() * cant;
    }
    
        public String toString() {
        String cade = super.toString()
                + "Talla: " + talla + "\n"
                + "Tipo: " + tipo + "\n";
        return cade;
    }
}
