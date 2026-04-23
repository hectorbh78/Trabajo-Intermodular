package PuchamonGris;
public class Puchamon_Ataque {

    int idPuch;
    String ataque;
    String ataque2;

    public Puchamon_Ataque(int idPuch, String  ataque, String ataque2) {
        this.idPuch = idPuch;
        this.ataque = ataque;
        this.ataque2 = ataque2;
    }

    public int getIdPuch() {
        return idPuch;
    }

    public void setIdPuch(int idPuch) {
        this.idPuch = idPuch;
    }

    public String getAtaque() {
        return ataque;
    }

    public void setAtaque(String ataque) {
        this.ataque = ataque;
    }

    public String getAtaque2() {
        return ataque2;
    }

    public void setAtaque2(String ataque2) {
        this.ataque2 = ataque2;
    }
}

