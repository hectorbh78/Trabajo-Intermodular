package PuchamonGris;

// Clase Mision (representa una misión dentro del juego)
public class Mision {

    // Variables de la misión
    int idMision;        // ID de la misión
    String descripcion;   // Qué hay que hacer en la misión
    String recompensa;    // Recompensa al completarla
    int idMundo;          // Mundo donde está la misión
    int idObjeto;         // Objeto relacionado con la misión

    // Constructor (para crear una misión con datos)
    public Mision(int idMision, String descripcion, String recompensa, int idMundo, int idObjeto) {
        this.idMision = idMision;
        this.descripcion = descripcion;
        this.recompensa = recompensa;
        this.idMundo = idMundo;
        this.idObjeto = idObjeto;
    }

    // SETTERS (para modificar valores)

    public void setIdMision(int idMision) {
        this.idMision = idMision;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setRecompensa(String recompensa) {
        this.recompensa = recompensa;
    }

    public void setIdMundo(int idMundo) {
        this.idMundo = idMundo;
    }

    public void setIdObjeto(int idObjeto) {
        this.idObjeto = idObjeto;
    }

    // GETTERS (para obtener valores)

    public int getIdMision() {
        return idMision;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getRecompensa() {
        return recompensa;
    }

    public int getIdMundo() {
        return idMundo;
    }

    public int getIdObjeto() {
        return idObjeto;
    }
}