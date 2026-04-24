package PuchamonGris;

// Clase Entrenador (representa un jugador o NPC del juego)
public class Entrenador{

    // Variables del entrenador
    String NombreEntrenador; // Nombre del entrenador
    int idEntrenador;        // ID del entrenador

    // Constructor (sirve para crear un entrenador con datos)
    public Entrenador(int idEntrenador,String NombreEntrenador){
        this.idEntrenador = idEntrenador;
        this.NombreEntrenador = NombreEntrenador;
    }

    // Getter para obtener el nombre del entrenador
    public String getNombreEntrenador(){
        return NombreEntrenador;
    }

    // Getter para obtener el id del entrenador
    public int getidEntrenador(){
        return idEntrenador;
    }

    // Setter para cambiar el nombre del entrenador
    public void setNombreEntrenador(String NombreEntrenador){
        this.NombreEntrenador = NombreEntrenador;
    }

    // Setter para cambiar el id del entrenador
    public void setidEntrenador(int idEntrenador){
        this.idEntrenador = idEntrenador;
    }

}