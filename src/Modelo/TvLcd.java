package Modelo;

public class TvLcd extends Electronico{
    int pulgada;

    public TvLcd(int pulgada, String fabricante, int precio) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }

    public int getPulgada() {
        return pulgada;
    }

    public void setPulgada(int pulgada) {
        this.pulgada = pulgada;
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecioVenta();
    }
}
