package PuchamonGris;

// Clase EntrenadorEnemigo (representa un enemigo del juego)
public class EntrenadorEnemigo {
    
    // Variables del entrenador enemigo
    String NombreEntrenadorEnemigo; // Nombre del enemigo
    int idEntrenadorEnemigo;        // ID del enemigo

    // Constructor (para crear un enemigo con datos)
    public  EntrenadorEnemigo(int idEntrenadorEnemigo,String NombreEntrenadorEnemigo){
        this.idEntrenadorEnemigo = idEntrenadorEnemigo;
        this.NombreEntrenadorEnemigo = NombreEntrenadorEnemigo;
    }

    // Getter para obtener el nombre del enemigo
    public String getNombreEntrenadorEnemigo(){
        return NombreEntrenadorEnemigo;
    }

    // Getter para obtener el id del enemigo
    public int getidEntrenadorEnemigo(){
        return idEntrenadorEnemigo;
    }

    // Setter para cambiar el nombre del enemigo
    public void setNombreEntrenadorEnemigo(String NombreEntrenadorEnemigo){
        this.NombreEntrenadorEnemigo = NombreEntrenadorEnemigo;
    }

    // Setter para cambiar el id del enemigo
    public void setidEntrenadorEnemigo(int idEntrenadorEnemigo){
        this.idEntrenadorEnemigo = idEntrenadorEnemigo;
    }

}