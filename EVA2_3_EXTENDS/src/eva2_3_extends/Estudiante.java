package eva2_3_extends;

            //Clase derivada extends clase base
            //Subclase extends Supercclase
            //Hijo extends Padre
            //Estudiante is-a Persona
public class Estudiante extends Persona {
   private String noControl;

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
}
