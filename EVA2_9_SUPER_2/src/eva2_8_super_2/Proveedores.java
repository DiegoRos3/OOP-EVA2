package eva2_8_super_2;

            //Proveedores is-a Persona
public class Proveedores extends Persona {
    private String rfc;

    public Proveedores() {
        super(); //llamada al constructor default de la superclase
        this.rfc = "-----";
    }
   
   public Proveedores(String nombre, String apellido, int edad, String rfc){
       super(nombre, apellido, edad); //llamada al constructor con argumentos
       this.rfc = rfc;
   }
   
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("RFC: "+ rfc);        
    }
}
