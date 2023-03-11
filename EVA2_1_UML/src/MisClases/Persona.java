package MisClases;

public class Persona {
  private int id;
  private String nombre;
  private int edad;
  
  public String getNombre() {
        return nombre;
    }

    public void setNombre(String valor) {
        nombre = valor;
    }
  
    public int getId() {
        return id;
    }

    public void setId(int valor) {
        id = valor;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int valor) {
        edad = valor;
    }    
    
    public void imprimirDatos(){
        System.out.println("Datos:");
        System.out.println("Nombre: "+nombre);
        System.out.println("ID: "+id);
        System.out.println("Edad: "+edad);
        
    }
}
