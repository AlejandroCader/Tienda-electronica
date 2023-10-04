package Modelo;

public interface IProducto {
    default double getPrecioVenta(){
        return 2;
    }
    default int getPrecio(){
        return 1;
    }
}
