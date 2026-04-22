package PuchamonGris;
public class Gimnasio {

    int idGimnasio;
    String NombreGimnasio;
    int NivelRecomendado;
    int idMundo;

    public Gimnasio(int idGimnasio, String NombreGimnasio, int NivelRecomendado, int idMundo) {
        this.idGimnasio = idGimnasio;
        this.NombreGimnasio = NombreGimnasio;
        this.NivelRecomendado = NivelRecomendado;
        this.idMundo = idMundo;
    }

    //setters
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
    //getters

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