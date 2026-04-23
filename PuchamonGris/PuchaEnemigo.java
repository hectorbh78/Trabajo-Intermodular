package PuchamonGris;
import java.util.*;

public class PuchaEnemigo{

    String NombrePuchaEnemigo; 
    int vidaPuchaEnemigo;
    int idPuchaEnemigo;

    public PuchaEnemigo(int idPuchaEnemigo, int vidaPuchaEnemigo, String NombrePuchaEnemigo){
        this.idPuchaEnemigo = idPuchaEnemigo;
        this.NombrePuchaEnemigo = NombrePuchaEnemigo;
        this.vidaPuchaEnemigo = vidaPuchaEnemigo;
    }

    //setters

    public String getNombrePuchaEnemigo(){
        return NombrePuchaEnemigo;
    }

    public int getVidaPuchaEnemigo() {
        return vidaPuchaEnemigo;
    }

    public int getidPuchaEnemigo(){
        return idPuchaEnemigo;
    }
 
    //getters
    
    public void setNombrePuchaEnemigo(String NombreEnemigo){
        this.NombrePuchaEnemigo = NombrePuchaEnemigo;
    }
    
    public void setVidaPuchaEnemigo(int vidaPuchaEnemigo) {
        this.vidaPuchaEnemigo = vidaPuchaEnemigo;
    }

    public void setidPuchaEnemigo(int idEnemigo){
        this.idPuchaEnemigo = idPuchaEnemigo;
    }

}

