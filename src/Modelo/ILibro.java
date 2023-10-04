package Modelo;
import java.util.Date;

public interface ILibro {

    Date fecha = new Date();

    default Date getFechaPublicacion(){
        return fecha;
    }

    default String getAutor(){
        return "Autor";
    }

    default  String getTitulo(){
        return "Titulo";
    }

    default String getEditorial(){
        return "Editorial";
    }
}
