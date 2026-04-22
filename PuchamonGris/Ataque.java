package PuchamonGris;
import java.util.*;
public abstract class Ataque{

    int idAtaque;
    int daño;
    String nombre;
    String TipoDamage;
    int idTipo;

    public Ataque(int idAtaque,String nombre,  int daño, String TipoDamage, int idTipo){
        this.idAtaque=idAtaque;
        this.daño = daño;
        this.nombre = nombre;
        this.TipoDamage = TipoDamage;
        this.idTipo=idTipo;
    }

    public int getdamage() {
        return daño;
    }

    public String getnombre() {
        return nombre;
    }

    public String getTipoDamage() {
        return TipoDamage;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public int getIdAtaque() {
        return idAtaque;
    }

    public void setdamage(){
        this.daño=daño;
    }

    public void setNombre() {
        this.nombre = nombre;
    }

    public void setTipoDamage() {
        this.TipoDamage = TipoDamage;
    }

    public void setIdAtaque() {
        this.idAtaque=idAtaque;
    }

    public void setIdTipo() {
        this.idTipo=idTipo;
    }


    public abstract boolean CalcularCritico();

    public abstract String getDescripcion();

}