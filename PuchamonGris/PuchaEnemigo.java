package PuchamonGris;

// Clase PuchaEnemigo (representa un Puchamon enemigo del juego)
public class PuchaEnemigo{

    // Variables del enemigo
    String NombrePuchaEnemigo; // Nombre del enemigo
    int vidaPuchaEnemigo;      // Vida del enemigo
    int idPuchaEnemigo;        // ID del enemigo

    // Constructor (crea un enemigo con datos)
    public PuchaEnemigo(int idPuchaEnemigo, int vidaPuchaEnemigo, String NombrePuchaEnemigo){
        this.idPuchaEnemigo = idPuchaEnemigo;
        this.NombrePuchaEnemigo = NombrePuchaEnemigo;
        this.vidaPuchaEnemigo = vidaPuchaEnemigo;
    }

    // GETTERS (para obtener valores)

    public String getNombrePuchaEnemigo(){
        return NombrePuchaEnemigo;
    }

    public int getVidaPuchaEnemigo() {
        return vidaPuchaEnemigo;
    }

    public int getidPuchaEnemigo(){
        return idPuchaEnemigo;
    }

    // SETTERS (para modificar valores)
    
    public void setNombrePuchaEnemigo(String NombreEnemigo){
        this.NombrePuchaEnemigo = NombrePuchaEnemigo; // OJO: aquí hay un pequeño fallo de variable
    }
    
    public void setVidaPuchaEnemigo(int vidaPuchaEnemigo) {
        this.vidaPuchaEnemigo = vidaPuchaEnemigo;
    }

    public void setidPuchaEnemigo(int idEnemigo){
        this.idPuchaEnemigo = idPuchaEnemigo;
    }

}