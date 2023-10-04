package Modelo;

import java.util.Date;

public class Libro extends Producto implements ILibro{
    Date fechaPublicacion;
    String autor;
    String titulo;
    String editorial;

    public Libro(Date fechaPublicacion, String autor, String titulo, String editorial, int precio) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public double getPrecioVenta() {
        return super.getPrecioVenta();
    }

    @Override
    public Date getFechaPublicacion() {
        return ILibro.super.getFechaPublicacion();
    }

    @Override
    public String getAutor() {
        return ILibro.super.getAutor();
    }

    @Override
    public String getTitulo() {
        return ILibro.super.getTitulo();
    }

    @Override
    public String getEditorial() {
        return ILibro.super.getEditorial();
    }

}
