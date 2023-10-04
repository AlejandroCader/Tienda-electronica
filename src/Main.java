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
            System.out.println(producto.toString());
        }

    }
}
// Arreglar la impresión