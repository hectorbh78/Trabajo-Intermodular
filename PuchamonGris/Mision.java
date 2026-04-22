
package PuchamonGris;
public class Mision {

    int idMision;
    String descripcion;
    String recompensa;
    int idMundo;
    int idObjeto;

    
public Mision(int idMision, String descripcion, String recompensa, int idMundo, int idObjeto) {
        this.idObjeto = idObjeto;
        this.descripcion = descripcion;
        this.recompensa = recompensa;
        this.idMundo = idMundo;
        this.idObjeto = idObjeto;
    }

    ///setters 

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

    
    //getters 

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