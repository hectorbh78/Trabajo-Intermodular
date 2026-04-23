package PuchamonGris;
import java.util.*;
public class EntrenadorEnemigo {
    
    String NombreEntrenadorEnemigo; 
    int idEntrenadorEnemigo;

    public  EntrenadorEnemigo(int idEntrenadorEnemigo,String NombreEntrenadorEnemigo){
        this.idEntrenadorEnemigo = idEntrenadorEnemigo;
        this.NombreEntrenadorEnemigo = NombreEntrenadorEnemigo;

    }

    public String getNombreEntrenadorEnemigo(){
        return NombreEntrenadorEnemigo;
    }
    public int getidEntrenadorEnemigo(){
        return idEntrenadorEnemigo;
    }

    public void setNombreEntrenadorEnemigo(String NombreEntrenadorEnemigo){
        this.NombreEntrenadorEnemigo = NombreEntrenadorEnemigo;
    }

    public void setidEntrenadorEnemigo(int idEntrenadorEnemigo){
        this.idEntrenadorEnemigo = idEntrenadorEnemigo;
    }

}


