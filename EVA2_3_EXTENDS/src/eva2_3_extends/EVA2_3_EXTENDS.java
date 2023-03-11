package eva2_3_extends;

/**
 *
 * @author Diego
 */
public class EVA2_3_EXTENDS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudiante estu = new Estudiante();
        //estu.
        estu.setNombre("Diego");
        estu.setApellido("Rose");
        estu.setEdad(18);
        estu.setNoControl("22550309");
        System.out.println("Imprimir datos estudiante:");
        System.out.println("Nombre: "+estu.getNombre());
        System.out.println("Apellido: "+estu.getApellido());
        System.out.println("Edad: "+estu.getEdad());
        System.out.println("Numero de control: "+estu.getNoControl());
        
        Proveedores prov = new Proveedores();
        prov.setNombre("Jean");
        prov.setApellido("Lopez");
        prov.setEdad(18);
        prov.setRfc("LOLJ040726GN7");
        System.out.println("Imprimir datos proveedor:");
        System.out.println("Nombre: "+prov.getNombre());
        System.out.println("Apellido: "+prov.getApellido());
        System.out.println("Edad: "+prov.getEdad());
        System.out.println("RFC: "+prov.getRfc());
    }
    
}
