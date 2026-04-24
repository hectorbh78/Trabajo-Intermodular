package PuchamonGris;

// Clase Puchamon_Ataque (relaciona un Puchamon con sus ataques)
public class Puchamon_Ataque {

    // Variables
    int idPuch;       // ID del Puchamon
    int ataque;    // Primer ataque
    int ataque2;   // Segundo ataque

    // Constructor (crea el objeto con sus datos)
    public Puchamon_Ataque(int idPuch, int ataque, int ataque2) {
        this.idPuch = idPuch;
        this.ataque = ataque;
        this.ataque2 = ataque2;
    }

    // GETTERS (para obtener valores)

    public int getIdPuch() {
        return idPuch;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getAtaque2() {
        return ataque2;
    }

    // SETTERS (para modificar valores)

    public void setIdPuch(int idPuch) {
        this.idPuch = idPuch;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setAtaque2(int ataque2) {
        this.ataque2 = ataque2;
    }
}