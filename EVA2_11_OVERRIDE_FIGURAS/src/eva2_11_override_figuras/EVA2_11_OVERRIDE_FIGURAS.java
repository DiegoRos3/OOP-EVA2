package eva2_11_override_figuras;

public class EVA2_11_OVERRIDE_FIGURAS {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Circulo circulo1 = new Circulo(15);
        System.out.println("Datos circulo: ");
        System.out.println("Area: " + circulo1.calcularArea());
        System.out.println("Perimetro :" + circulo1.calcularPeri());
        
        System.out.println("");
        
        Triangulo triangulo1 = new Triangulo(15,20);
        System.out.println("Datos triangulo: ");
        System.out.println("Area: " + triangulo1.calcularArea());
        System.out.println("Perimetro :" + triangulo1.calcularPeri());
    }
    
}
