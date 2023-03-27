package SuperClases;

public abstract class Producto {
    private String nombre;
    protected double precio;
    private String unidad;

    public Producto() {
        this.nombre = "-----";
        this.precio = 0;
        this.unidad = "-----";
    }

    public Producto(String nombre, double precio, String unidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.unidad = unidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    
    public abstract double precioVenta(int cant);
    
    public String toString() {
        String cade = "Datos: \n"
                + "Nombre: " + nombre + "\n"
                + "Precio: " + precio + "\n"
                + "Unidad: " + unidad + "\n";
        return cade;
    }
}
