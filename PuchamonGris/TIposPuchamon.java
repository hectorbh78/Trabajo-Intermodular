package PuchamonGris;

// Clase TIposPuchamon (relaciona un Puchamon con sus tipos)
public class TIposPuchamon {

    // Variables
    int idPuch;    // ID del Puchamon
    int idTipo;    // Primer tipo del Puchamon
    int idTipo2;   // Segundo tipo (si tiene doble tipo)

    // Constructor (crea la relación con datos)
    public TIposPuchamon(int idPuch, int idTipo, int idTipo2) {
        this.idPuch = idPuch;
        this.idTipo = idTipo;
        this.idTipo2 = idTipo2;
    }

    // GETTER del id del Puchamon
    public int getIdPuch() {
        return idPuch;
    }

    // SETTER del id del Puchamon
    public void setIdPuch(int idPuch) {
        this.idPuch = idPuch;
    }

    // GETTER del primer tipo
    public int getIdTipo() {
        return idTipo;
    }

    // SETTER del primer tipo
    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    // GETTER del segundo tipo
    public int getIdTipo2() {
        return idTipo2;
    }

    // SETTER del segundo tipo
    public void setIdTipo2(int idTipo2) {
        this.idTipo2 = idTipo2;
    }
}