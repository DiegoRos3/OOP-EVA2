package MisClases;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String valor) {
        marca = valor;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String valor) {
        modelo = valor;
    }
    
    public int getAño() {
        return año;
    }

    public void setAño(int valor) {
        año = valor;
    }
    
    public void imprimirDatos(){
        System.out.println("Datos:");
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Año: "+año);
        
    }
}
