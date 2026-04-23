package PuchamonGris;
import java.time.*;
public class Lucha {

    int idLucha;
    LocalDate fecha;
    String tipo;
    int idGimnasio;
    int idEntrenador;
    int idEntrenadorEnemigo;

    public Lucha(int idLucha, LocalDate fecha, String tipo, int idGimnasio, int idEntrenador, int idEntrenadorEnemigo){
        this.idLucha = idLucha;
        this.fecha = fecha; 
        this.tipo = tipo;
        this.idGimnasio = idGimnasio;
        this.idEntrenador = idEntrenador;
        this.idEntrenadorEnemigo = idEntrenadorEnemigo;

    }

    public int getIdLucha() {
        return idLucha;
    }

    public void setIdLucha(int idLucha) {
        this.idLucha = idLucha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getIdGimnasio() {
        return idGimnasio;
    }

    public void setIdGimnasio(int idGimnasio) {
        this.idGimnasio = idGimnasio;
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    public int getIdEntrenadorEnemigo() {
        return idEntrenadorEnemigo;
    }

    public void setIdEntrenadorEnemigo(int idEntrenadorEnemigo) {
        this.idEntrenadorEnemigo = idEntrenadorEnemigo;
    }



}
