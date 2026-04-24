package PuchamonGris;

// Clase Puchamon (representa el personaje principal o los Pokémon del juego)
public class Puchamon{

    // Variables del Puchamon
    int idPuch;              // ID del Puchamon
    String NombrePuchamon;   // Nombre del Puchamon
    int Vida;                // Vida del Puchamon
    int nivelPuchamon;       // Nivel del Puchamon
    int idEntrenador;        // ID del entrenador dueño

    // Constructor (crea un Puchamon con datos)
    public Puchamon(int idPuch, String NombrePuchamon, int Vida, int nivelPuchamon, int idEntrenador) {
        this.idPuch = idPuch;
        this.NombrePuchamon = NombrePuchamon;
        this.Vida = Vida;
        this.nivelPuchamon = nivelPuchamon;
        this.idEntrenador = idEntrenador;
    }

    // GETTERS (para obtener valores)

    public int getIdPuch() {
        return idPuch;
    }

    public String getNombrePuchamon() {
        return NombrePuchamon;
    }

    public int getVida() {
        return Vida;
    }

    public int getNivelPuchamon() {
        return nivelPuchamon;
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    // SETTERS (para modificar valores)

    public void setIdPuch(int idPuch) {
        this.idPuch = idPuch;
    }

    public void setNombrePuchamon(String nombrePuchamon) {
        NombrePuchamon = nombrePuchamon;
    }

    public void setVida(int vida) {
        this.Vida = vida;
    }

    public void setNivelPuchamon(int nivelPuchamon) {
        this.nivelPuchamon = nivelPuchamon;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    // Método que comprueba si el Puchamon está derrotado
    public boolean esDerrotado() {
        return Vida <= 0;
    }

    // Método que convierte el objeto a texto (para imprimirlo en pantalla)
    @Override
    public String toString() {
        return "Puchamon [idPuch = " + idPuch + ", Nombre = " + NombrePuchamon + ", Vida = " + Vida
                + ", Nivel = " + nivelPuchamon + ", idEntrenador = " + idEntrenador + "]";
    }

}