package PuchamonGris;

public class Tipo {

    int idTipo;
    String nombre;

    public Tipo(int idTipo, String nombre) {
        this.idTipo = idTipo;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Tipo [idTipo=" + idTipo + ", nombre=" + nombre + "]";
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}