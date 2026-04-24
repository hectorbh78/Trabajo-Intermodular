package PuchamonGris;

// Clase Mundo (representa un mundo del juego)
public class Mundo{

    // Variables del mundo
    String NombreMundo; // Nombre del mundo
    int idMundo;        // ID del mundo
    String Region;      // Región a la que pertenece

    // Constructor (crea un mundo con datos)
    public Mundo(int idMundo, String NombreMundo, String Region) {
        this.idMundo = idMundo;
        this.NombreMundo = NombreMundo;
        this.Region = Region;
    }

    // GETTERS (para obtener valores)

    public String getNombreMundo() {
        return NombreMundo;
    }

    public int getidMundo() {
        return idMundo;
    }

    public String getRegion() {
        return Region;
    }

    // SETTERS (para modificar valores)

    public void setNombreMundo(String NombreMundo) {
        this.NombreMundo = NombreMundo;
    }

    // OJO: este setter está mal puesto en el código original,
    // porque debería llamarse setIdMundo y no setNombreMundo
    public void setNombreMundo(int idMundoo) {
        this.idMundo = idMundo; // también está mal porque usa la variable equivocada
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

}