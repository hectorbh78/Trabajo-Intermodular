package PuchamonGris;

// Clase Inventario (relaciona un entrenador con un objeto)
public class Inventario {

    // Variables del inventario
    int idEntrenador; // ID del entrenador que tiene el objeto
    int idObjeto;     // ID del objeto que tiene el entrenador
    int numObjetos;   // numero de objetos del entrenador
    
    // Constructor (crea un registro de inventario)
    public Inventario(int idEntrenador, int idObjeto, int numObjetos) {
        this.idEntrenador = idEntrenador;
        this.idObjeto = idObjeto;
        this.numObjetos=numObjetos;
    }
    
    // GETTERS (para obtener datos)
    public int getIdEntrenador() {
        return idEntrenador;
    }

    public int getIdObjeto() {
        return idObjeto;
    }

    public int getNumObjetos() {
        return numObjetos;
    }

    // SETTERS (para modificar datos)
    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    public void setIdObjeto(int idObjeto) {
        this.idObjeto = idObjeto;
    }

    public void setNumObjetos(int numObjetos) {
        this.numObjetos = numObjetos;
    }

    // Método que convierte el objeto a texto (para imprimirlo)
    @Override
    public String toString() {
        return "Inventario [idEntrenador =" + idEntrenador + ", idObjeto =" + idObjeto + ", numObjetos =" + numObjetos +"]";
    }
}