package PuchamonGris;
import java.util.*;

public class Ataque {

    // Variables
    int idAtaque;
    int daño;
    String nombre;
    String tipoDamage;
    int idTipo;

    // Constructor
    public Ataque(int idAtaque, String nombre, int daño, String tipoDamage, int idTipo){
        this.idAtaque = idAtaque;
        this.daño = daño;
        this.nombre = nombre;
        this.tipoDamage = tipoDamage;
        this.idTipo = idTipo;
    }

    // Getters
    public int getDamage() {
        return daño;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoDamage() {
        return tipoDamage;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public int getIdAtaque() {
        return idAtaque;
    }

    // Setters
    public void setDamage(int daño){
        this.daño = daño;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoDamage(String tipoDamage) {
        this.tipoDamage = tipoDamage;
    }

    public void setIdAtaque(int idAtaque) {
        this.idAtaque = idAtaque;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    // Probabilidad del 10% para crítico especial
    public boolean CalcularCriticoEspecial(){
        Random rand = new Random();
        return rand.nextDouble() < 0.1;
    }

    // Probabilidad del 20% para crítico normal
    public boolean CalcularCriticoNormal(){
        Random rand = new Random();
        return rand.nextDouble() < 0.2;
    }
}