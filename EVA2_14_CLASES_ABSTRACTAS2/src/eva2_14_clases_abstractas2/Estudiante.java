package eva2_14_clases_abstractas2;

public class Estudiante extends Persona{
    private int nControl;

    public Estudiante() {
        super();
        this.nControl = 00000;
    }

    public Estudiante(int nControl, String nombre, int edad) {
        super(nombre, edad);
        this.nControl = nControl;
    }

    public int getnControl() {
        return nControl;
    }

    public void setnControl(int nControl) {
        this.nControl = nControl;
    }        

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Edad: " + super.getEdad());
        System.out.println("Numero de control: " + this.nControl);
    }
    
}
