package PuchamonGris;

import java.time.*; // Para usar fechas (LocalDate)

// Clase Lucha (representa una batalla en el juego)
public class Lucha {

    // Variables de la lucha
    int idLucha;                 // ID de la lucha
    LocalDate fecha;             // Fecha de la lucha
    String tipo;                 // Tipo de lucha (ej: gimnasio, salvaje, etc)
    int idGimnasio;              // ID del gimnasio donde ocurre
    int idEntrenador;            // ID del entrenador jugador
    int idEntrenadorEnemigo;     // ID del entrenador enemigo

    // Constructor (para crear una lucha con datos)
    public Lucha(int idLucha, LocalDate fecha, String tipo, int idGimnasio, int idEntrenador, int idEntrenadorEnemigo){
        this.idLucha = idLucha;
        this.fecha = fecha; 
        this.tipo = tipo;
        this.idGimnasio = idGimnasio;
        this.idEntrenador = idEntrenador;
        this.idEntrenadorEnemigo = idEntrenadorEnemigo;
    }

    // GETTERS (para obtener valores)

    public int getIdLucha() {
        return idLucha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public int getIdGimnasio() {
        return idGimnasio;
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public int getIdEntrenadorEnemigo() {
        return idEntrenadorEnemigo;
    }

    // SETTERS (para modificar valores)

    public void setIdLucha(int idLucha) {
        this.idLucha = idLucha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setIdGimnasio(int idGimnasio) {
        this.idGimnasio = idGimnasio;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    public void setIdEntrenadorEnemigo(int idEntrenadorEnemigo) {
        this.idEntrenadorEnemigo = idEntrenadorEnemigo;
    }
}