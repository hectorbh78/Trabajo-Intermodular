package PuchamonGris;

// Clase Tipo (representa el tipo de un Puchamon, como fuego, agua, etc.)
public class Tipo {

    // Variables del tipo
    int idTipo;     // ID del tipo
    String nombre;  // Nombre del tipo

    // Constructor (crea un tipo con datos)
    public Tipo(int idTipo, String nombre) {
        this.idTipo = idTipo;
        this.nombre = nombre;
    }

    // GETTER (para obtener el id del tipo)
    public int getIdTipo() {
        return idTipo;
    }

    // SETTER (para cambiar el id del tipo)
    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    // GETTER (para obtener el nombre del tipo)
    public String getNombre() {
        return nombre;
    }

    // SETTER (para cambiar el nombre del tipo)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para mostrar el objeto como texto
    @Override
    public String toString() {
        return "Tipo [idTipo=" + idTipo + ", nombre=" + nombre + "]";
    }
}