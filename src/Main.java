import Modelo.*;

import java.util.Date;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {



        Iphone iphone = new Iphone("Iphone 15", "Morado", "Apple", 250);
        TvLcd tv = new TvLcd(40, "LG", 350);
        Libro libro = new Libro(new Date(), "Homero","La iliada", "Norma", 17);
        Comics comic = new Comics( new Date(), "Scott Pilgrim", "Bob omb", "Panini", "Menganito", 20);

        Producto[] productos = new Producto[4];

        productos[0] = iphone;
        productos[1] = tv;
        productos[2] = libro;
        productos[3] = comic;

        for(Producto producto: productos){
            System.out.println(imprimir(producto));
        }

    }

    public static String imprimir(Producto producto) {
        StringBuilder detalle = new StringBuilder("------------------------\n");
        detalle.append("Tipo de: ").append(producto.getClass().getSimpleName()).append("\n");
        detalle.append("Precio: ").append(producto.getPrecio()).append("\n");
        detalle.append("Precio final: ").append(producto.getPrecioVenta()).append("\n");

        if (producto instanceof Electronico) {
            detalle.append(imprimirElectronico((Electronico) producto));
        } else if (producto instanceof Libro) {
            detalle.append(imprimirLibro((Libro) producto));
        }

        return detalle.toString();
    }

    private static String imprimirElectronico(Electronico electronico) {
        StringBuilder detalle = new StringBuilder("Fabricante: ").append(electronico.getFabricante()).append("\n");

        if (electronico instanceof Iphone) {
            detalle.append("Modelo: ").append(((Iphone) electronico).getModelo()).append("\n");
            detalle.append("Color: ").append(((Iphone) electronico).getColor()).append("\n");
        } else if (electronico instanceof TvLcd) {
            detalle.append("Pulgadas: ").append(((TvLcd) electronico).getPulgada()).append("\n");
        }

        return detalle.toString();
    }

    private static String imprimirLibro(Libro libro) {
        StringBuilder detalle = new StringBuilder("Fecha de publicación: ").append(libro.getFechaPublicacion()).append("\n");
        detalle.append("Autor: ").append(libro.getAutor()).append("\n");
        detalle.append("Titulo: ").append(libro.getTitulo()).append("\n");
        detalle.append("Editorial: ").append(libro.getEditorial()).append("\n");

        if (libro instanceof Comics) {
            detalle.append("Personaje: ").append(((Comics) libro).getPersonaje()).append("\n");
        }

        return detalle.toString();
    }

}
// Arreglar la impresión