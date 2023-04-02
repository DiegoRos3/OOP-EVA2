package eva2_21_polimorfismo;

            //Clase derivada extends clase base
            //Subclase extends Supercclase
            //Hijo extends Padre
            //Estudiante is-a Persona
public class Estudiante extends Persona {
   private String noControl;

   //incluimos un constructor default
    public Estudiante() {
        super(); //llamada al constructor default de la superclase
        this.noControl = "-----";
    }
   
   public Estudiante(String nombre, String apellido, int edad, String noControl){
       super(nombre, apellido, edad); //llamada al constructor con argumentos
       this.noControl = noControl;
   }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    //Override: reemplaza el metodo (con la misma firma) en la superclase
    //en este caso reemplaza a imprimirDatos() de la superclase
   @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Numero de control: "+ noControl);        
    }
}
