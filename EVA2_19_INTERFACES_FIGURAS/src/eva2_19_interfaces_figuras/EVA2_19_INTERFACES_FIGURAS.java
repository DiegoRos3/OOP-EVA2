package eva2_19_interfaces_figuras;

public class EVA2_19_INTERFACES_FIGURAS {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //no se pueden crear objetos de interfaces ya que son astractas
        //Figuras fig = new Figuras();
        //MostrarDatos md = new MostrarDatos();
        
        Triangulo triangulo = new Triangulo(3, 5);
        triangulo.imprimirDatos();
        
        Circulo circ = new Circulo(4);
        circ.imprimirDatos();
    }
    
}
