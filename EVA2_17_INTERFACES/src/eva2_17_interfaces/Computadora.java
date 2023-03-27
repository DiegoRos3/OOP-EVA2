package eva2_17_interfaces;

public class Computadora extends Producto implements MostrarDatos{
    private int memoria;
    private String procesador;

    public Computadora() {
    }

    public Computadora(int memoria, String procesador) {
        this.memoria = memoria;
        this.procesador = procesador;
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

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: "+ getNombre());
        System.out.println("Precio: "+ getPrecio());
        System.out.println("Procesador: "+ procesador);
        System.out.println("Memoria: "+ memoria);
        
    }
    
    
    
}
