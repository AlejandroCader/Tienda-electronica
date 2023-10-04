package Modelo;

abstract public class Producto implements IProducto{
    private int precio;

    public Producto(int precio) {
        super();
        this.precio = precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public int getPrecio() {
        return precio;
    }
}
