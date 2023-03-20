package eva2_8_super;

public class EVA2_8_SUPER {

    public static void main(String[] args) {
        // TODO code application logic here

        Animal animal = new Animal("Jose", 10);
        Mamifero mamifero = new Mamifero("Cafe", "Juan", 10);
        Canes can = new Canes();
    }
}

class Animal {

    private String nombre;
    private int peso;

    public Animal() {
        System.out.println("Its alive!");
    }

    public Animal(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
        System.out.println("ITS ALIVE constructor 2");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void respirar() {
        System.out.println("Estoy respirando");
    }
}

class Mamifero extends Animal {

    private String colorPelo;

    public Mamifero() {
        //super--> apuntador a la superclase
        //lo primero a llamar en un constructor es llamar al constructor de la superclase
        super(); //llamada al constructor default
        System.out.println("Soy un mamifero");
    }

    public Mamifero(String colorPelo, String nombre, int peso) {
        super(nombre, peso); //llamda al constructor de la super clase
        this.colorPelo = colorPelo;
        System.out.println("Soy un mamifero constructor 2");
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

}

class Canes extends Mamifero {

    public Canes() {
        super();
        System.out.println("Soy un can!");
    }
}
