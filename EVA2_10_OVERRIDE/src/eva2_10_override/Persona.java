package eva2_10_override;

public class Persona {
    private String nombre;
    private int edad;

    public Persona() {
        this.nombre = "-----";
        this.edad = 0;
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
    
    @Override
    public String toString(){
        //No estamos invocando a metodo sobreescrito de la super clase
        //Aqui estamos remplazando el toString de la super clase
        String cade = "Datos: \n" +
                      "Nombre: " + nombre + "\n" +
                      "Edad: " + edad;
        return cade;
    }
}
