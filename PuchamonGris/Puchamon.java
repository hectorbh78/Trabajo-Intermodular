package PuchamonGris;
import java.util.*;
import java.util.Scanner;


public class Puchamon{
    int idPuch;
    String NombrePuchamon;
    int Vida;
    int nivelPuchamon;
    int idEntrenador;

    public Puchamon(int idPuch, String  NombrePuchamon, int Vida, int nivelPuchamon, int idEntrenador) {
        this.idPuch=idPuch;
        this.NombrePuchamon = NombrePuchamon;
        this.Vida = Vida;
        this.nivelPuchamon = nivelPuchamon;
        this.idEntrenador = idEntrenador;
    }

    public int getIdPuch() {
        return idPuch;
    }

    public void setIdPuch(int idPuch) {
        this.idPuch = idPuch;
    }

    public String getNombrePuchamon() {
        return NombrePuchamon;
    }

    public void setNombrePuchamon(String nombrePuchamon) {
        NombrePuchamon = nombrePuchamon;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        this.Vida = vida;
    }

    public int getNivelPuchamon() {
        return nivelPuchamon;
    }

    public void setNivelPuchamon(int nivelPuchamon) {
        this.nivelPuchamon = nivelPuchamon;
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    public boolean esDerrotado() {
        return Vida  <= 0;
    }

    @Override
    public String toString() {
        return "Puchamon [idPuch = " + idPuch + ", Nombre Puchamon = " + NombrePuchamon + ", Vida = " + Vida
                + ", Nivel Puchamon = " + nivelPuchamon + ", id Entrenador = " + idEntrenador + "]";
    }

    
    
}