package PuchamonGris;
public class Inventario{
     int idEntrenador;
    int idObjeto;
    
    public Inventario(int idEntrenador, int idObjeto) {
        this.idEntrenador = idEntrenador;
        this.idObjeto = idObjeto;
    }
    
    //getters
    public int getIdEntrenador() {
        return idEntrenador;
    }
    public int getIdObjeto() {
        return idObjeto;
    }
    //setters
    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }
    public void setIdObjeto(int idObjeto) {
        this.idObjeto = idObjeto;
    }

    @Override
    public String toString() {
        return "Inventario [idEntrenador =" + idEntrenador + ", idObjeto =" + idObjeto + "]";
    }

    
    
    
}

     
    



   
