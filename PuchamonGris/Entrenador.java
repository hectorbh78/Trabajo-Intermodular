package PuchamonGris;
import java.util.*;

public class Entrenador{

    String NombreEntrenador; 
    int idEntrenador;

    public Entrenador(int idEntrenador,String NombreEntrenador){
        this.idEntrenador = idEntrenador;
        this.NombreEntrenador = NombreEntrenador;

    }

    public String getNombreEntrenador(){
        return NombreEntrenador;
    }
    public int getidEntrenador(){
        return idEntrenador;
    }

    public void setNombreEntrenador(String NombreEntrenador){
        this.NombreEntrenador = NombreEntrenador;
    }

    public void setidEntrenador(int idEntrenador){
        this.idEntrenador = idEntrenador;
    }

}

