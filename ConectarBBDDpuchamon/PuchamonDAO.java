package ConectarBBDDpuchamon;
import PuchamonGris.*;
import java.sql.*;
import java.util.*;

public class PuchamonDAO {

    public List<Puchamon> selectPucha (Connection pruebaConexion) {

        String consulta = "select * from Puchamon";

        List<Puchamon> puchamon = new ArrayList<>();

        try(Statement stmt = pruebaConexion.createStatement();
            ResultSet resultado = stmt.executeQuery(consulta)){

            //en el try se ha creado la sentencia y se ha ejecutado la query
            //si no se sale por el catch, es que ha ido bien, queda recorrer los resultados

            while(resultado.next()) {
                //next() se va desplazando por el conjunto de resultados que devuelve
                //el servidor y que se almacena en ResultSet
                //para obtener los datos se utilizan métodos get
                //obtenemos columna a columna
                int idPuch = resultado.getInt("idPuch");
                String nombre = resultado.getString("nombre");
                int nivel = resultado.getInt("Nivel");
                int vida = resultado.getInt("Vida");
                int idEntrenador = resultado.getInt("idEntrenador");

                Puchamon puch = new Puchamon(idPuch, nombre, nivel, vida, idEntrenador);
                puchamon.add(puch); //se añade el alumno a la lista
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    
    return puchamon;
    }
}

