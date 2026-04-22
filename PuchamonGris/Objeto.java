package PuchamonGris;
public class Objeto{

    int idObjeto;
    String nombreObjeto;
    String Efecto;
    int idMision;

    public Objeto(int idObjeto, String nombreObjeto, String Efecto, int idMision) {
        this.idObjeto = idObjeto;
        this.nombreObjeto = nombreObjeto;
        this.Efecto = Efecto;
        this.idMision = idMision;
    }

    //gettters

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

    //setters 

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