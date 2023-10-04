package Modelo;

public class Iphone extends Electronico{
    String modelo;
    String color;

    public Iphone(String modelo, String color, String fabricante, int precio) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecioVenta();
    }
}
