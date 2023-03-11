package eva2_7_this;

public class EVA2_7_THIS {

    public static void main(String[] args) {
        // TODO code application logic here
        //imprimir();
        //this no se puede usar en un contexto estatico
    }
    
    public void imprimir(){
        //aqui tambien es visible this
        
    }

    //this es una referencia a una instancia de la clase
    //todos los objetos tienen this
    //pueden usar this en cualquier clase
    //this solo existe internamente dentro del objeto
    class Persona {

        private String nombre;

        public Persona(String nombre) {
            this.nombre = nombre;
            //this.nombre es el atributo de la clase
            //nombre es la variable(parametro) declarado en el método
        }

        
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void imprimirDatos() {
            System.out.println("El nombre es: " + this.nombre);
        }
    }
}
