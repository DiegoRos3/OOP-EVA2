package eva2_8_super_2;

public class EVA2_8_SUPER_2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estudiante = new Estudiante("Diego","Rose", 18, "22550309");
        estudiante.imprimirDatos();
        
        System.out.println("");
        
        Docentes docente = new Docentes("Juan", "Perez", 46, "ASDF1");
        docente.imprimirDatos();
        
        System.out.println("");
        
        Proveedores proveedor = new Proveedores("Ernesto", "De la cruz", 36, "DLCE040396RC1");
        proveedor.imprimirDatos();
    }
    
}
