package eva2_14_clases_abstractas2;

public abstract class Persona {
    private String nombre;
    private int edad;

    public Persona() {
        this.nombre = "-----";
        this.edad = -1;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //los metodos abstractos pueden coexistir con metodos normales
    public abstract void imprimirDatos();
}
