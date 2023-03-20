package eva2_8_super_2;

            //Docentes is-a Persona
public class Docentes extends Persona{
    private String plaza;

    public Docentes() {
        super(); //llamada al constructor default de la superclase
        this.plaza = "-----";
    }
   
   public Docentes(String nombre, String apellido, int edad, String plaza){
       super(nombre, apellido, edad); //llamada al constructor con argumentos
       this.plaza = plaza;
   }
   
    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Plaza: "+ plaza);        
    }
}
