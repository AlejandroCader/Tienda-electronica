package Modelo;

import java.util.Date;

public class Comics extends Libro{
    String personaje;


    public Comics(Date fechaPublicacion, String autor, String titulo, String editorial, String personaje,int precio) {
        super(fechaPublicacion, autor, titulo, editorial, precio);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecioVenta();
    }
}
