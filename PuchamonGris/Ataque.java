package PuchamonGris;

import java.util.*; // Para usar Random

// Clase Ataque (representa un ataque de un Puchamon)
public class Ataque {

    // Variables (atributos del ataque)
    int idAtaque;      // ID del ataque
    int daño;          // Daño que hace el ataque
    String nombre;     // Nombre del ataque
    String tipoDaño; // Tipo de daño (ej: fuego, agua, etc)
    int idTipo;        // ID del tipo

    // Constructor (sirve para crear un ataque con valores)
    public Ataque(int idAtaque, String nombre, int daño, String tipoDaño, int idTipo){
        this.idAtaque = idAtaque;
        this.daño = daño;
        this.nombre = nombre;
        this.tipoDaño = tipoDaño;
        this.idTipo = idTipo;
    }

    // Getters (para obtener valores)

    public int getDamage() {
        return daño;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoDamage() {
        return tipoDaño;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public int getIdAtaque() {
        return idAtaque;
    }

    // Setters (para modificar valores)

    public void setDamage(int daño){
        this.daño = daño;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoDamage(String tipoDamage) {
        this.tipoDaño = tipoDamage;
    }

    public void setIdAtaque(int idAtaque) {
        this.idAtaque = idAtaque;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    // Método que calcula si hay crítico especial (10% probabilidad)
    public boolean CalcularCriticoEspecial(){
        Random rand = new Random(); // Genera número aleatorio
        return rand.nextDouble() < 0.1; // 10% de probabilidad
    }

    // Método que calcula si hay crítico normal (20% probabilidad)
    public boolean CalcularCriticoNormal(){
        Random rand = new Random();
        return rand.nextDouble() < 0.2; // 20% de probabilidad
    }
}