package Productos;

import SuperClases.Electronica;

public final class Computadora extends Electronica {

    private double tamaño;
    private int memoria;
    private String procesador;
    private String DD;

    public Computadora() {
        super();
        this.tamaño = 0;
        this.memoria = 0;
        this.procesador = "-----";
        this.DD = "-----";
    }

    public Computadora(double tamaño, int memoria, String procesador, String DD, String fabricante, String modelo, int garantia, String nombre, double precio, String unidad) {
        super(fabricante, modelo, garantia, nombre, precio, unidad);
        this.tamaño = tamaño;
        this.memoria = memoria;
        this.procesador = procesador;
        this.DD = DD;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getDD() {
        return DD;
    }

    public void setDD(String DD) {
        this.DD = DD;
    }

    @Override
    public double precioVenta(int cant) {
        //10 cantidades --> precio de 80%
        if (cant < 10) {
            return precio * cant;
        } else {
            return (precio * 0.8) * cant;
        }
    }

    @Override
    public String toString() {
        String cade = super.toString()
                + "Tamaño: " + tamaño + "\n"
                + "Memoria: " + memoria + "\n"
                + "Procesador: " + procesador + "\n"
                + "Disco duro: " + DD;
        return cade;
    }
}

// Computadora es una clase final, ya no se puede crear herencia a traves de ella
// final limita la herencia
// class Laptop extends Computadora{

// }
