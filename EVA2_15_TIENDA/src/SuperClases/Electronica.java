package SuperClases;

public abstract class Electronica extends Producto {

    private String fabricante;
    private String modelo;
    private int garantia; //dias de garantía

    public Electronica() {
        super();
        this.fabricante = "-----";
        this.modelo = "-----";
        this.garantia = 0;
    }

    public Electronica(String fabricante, String modelo, int garantia, String nombre, double precio, String unidad) {
        super(nombre, precio, unidad);
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.garantia = garantia;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        String cade = super.toString()
                + "Garantia: " + garantia + "\n"
                + "Modelo: " + modelo + "\n"
                + "Fabricante: " + fabricante + "\n";
        return cade;
    }

}
