package PuchamonGris;

import java.util.*;

public class Mundo{

    String NombreMundo;
    int idMundo;
    String Region;

    public Mundo(int idMundo, String NombreMundo, String Region) {
        this.idMundo = idMundo;
        this.NombreMundo = NombreMundo;
        this.Region = Region;
    }

    public String getNombreMundo() {
        return NombreMundo;
    }

    public void setNombreMundo(String NombreMundo) {
        this.NombreMundo = NombreMundo;
    }
     public int getidMundo() {
        return idMundo;
    }

    public void setNombreMundo(int idMundoo) {
        this.idMundo = idMundo;
    }

    public String getRegion() {
        return Region;
    }
    
    public void setRegion(String Region) {
        this.Region = Region;
    }

}