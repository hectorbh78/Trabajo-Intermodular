package PuchamonGris;

// Clase Objeto (representa objetos del juego)
public class Objeto{

    // Variables del objeto
    int idObjeto;        // ID del objeto
    String nombreObjeto;  // Nombre del objeto
    String Efecto;       // Qué hace el objeto (efecto)
    int idMision;        // Misión relacionada

    // Constructor (crea un objeto con datos)
    public Objeto(int idObjeto, String nombreObjeto, String Efecto, int idMision) {
        this.idObjeto = idObjeto;
        this.nombreObjeto = nombreObjeto;
        this.Efecto = Efecto;
        this.idMision = idMision;
    }

    // GETTERS (para obtener valores)

    public int getIdObjeto() {
        return idObjeto;
    }

    public String getnombreObjeto() {
        return nombreObjeto;
    }

    public String getEfecto() {
        return Efecto;
    }

    public int getIdMision() {
        return idMision;
    }

    // SETTERS (para modificar valores)

    public void setIdObjeto(int idObjeto) {
        this.idObjeto = idObjeto;
    }

    public void setnombreObjeto(String nombreObjeto) {
        this.nombreObjeto = nombreObjeto;
    }

    public void setEfecto(String Efecto) {
        this.Efecto = Efecto;
    }

    public void setIdMision(int idMision) {
        this.idMision = idMision;
    }
}