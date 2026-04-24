package PuchamonGris;

// Clase Gimnasio (representa un gimnasio dentro del juego)
public class Gimnasio {

    // Variables del gimnasio
    int idGimnasio;          // ID del gimnasio
    String NombreGimnasio;   // Nombre del gimnasio
    int NivelRecomendado;    // Nivel recomendado para entrar
    int idMundo;             // A qué mundo pertenece

    // Constructor (para crear un gimnasio con datos)
    public Gimnasio(int idGimnasio, String NombreGimnasio, int NivelRecomendado, int idMundo) {
        this.idGimnasio = idGimnasio;
        this.NombreGimnasio = NombreGimnasio;
        this.NivelRecomendado = NivelRecomendado;
        this.idMundo = idMundo;
    }

    // SETTERS (para modificar valores)

    public void setIdGimnasio(int idGimnasio) {
        this.idGimnasio = idGimnasio;
    }

    public void setNombreGimnasio(String NombreGimnasio) {
        this.NombreGimnasio = NombreGimnasio;
    }

    public void setNivelRecomendado(int NivelRecomendado) {
        this.NivelRecomendado = NivelRecomendado;
    }

    public void setIdMundo(int idMundo) {
        this.idMundo = idMundo;
    }

    // GETTERS (para obtener valores)

    public int getIdGimnasio() {
        return idGimnasio;
    }

    public String getNombreGimnasio() {
        return NombreGimnasio;
    }

    public int getNivelRecomendado() {
        return NivelRecomendado;
    }

    public int getIdMundo() {
        return idMundo;
    }
}