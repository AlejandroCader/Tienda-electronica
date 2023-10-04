package Modelo;

public interface IElectronico {
    default String getFabricante(){
        return "Fabricante";
    }
}
