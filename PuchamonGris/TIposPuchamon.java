package PuchamonGris;

public class TIposPuchamon {
    int idPuch;
    int idTipo;
    int idTipo2;

    public TIposPuchamon(int idPuch, int idTipo, int idTipo2) {
        this.idPuch = idPuch;
        this.idTipo = idTipo;
        this.idTipo2 = idTipo2;

    }

    public int getIdPuch() {
        return idPuch;
    }

    public void setIdPuch(int idPuch) {
        this.idPuch = idPuch;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public int getIdTipo2() {
        return idTipo2;
    }

    public void setIdTipo2(int idTipo2) {
        this.idTipo2 = idTipo2;
    }
    
}