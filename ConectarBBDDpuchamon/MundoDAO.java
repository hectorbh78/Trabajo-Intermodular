package ConectarBBDDpuchamon;
import PuchamonGris.*;
import java.sql.*;
import java.util.*;

public class MundoDAO{
    public List<Mundo> selectEntrenador (Connection pruebaConexion) {

        String consulta = "select * from mundo";

        List<Mundo> mundo = new ArrayList<>();

         try(Statement stmt = pruebaConexion.createStatement();
            ResultSet resultado = stmt.executeQuery(consulta)){

            //en el try se ha creado la sentencia y se ha ejecutado la query
            //si no se sale por el catch, es que ha ido bien, queda recorrer los resultados

            while(resultado.next()) {
                //next() se va desplazando por el conjunto de resultados que devuelve
                //el servidor y que se almacena en ResultSet
                //para obtener los datos se utilizan métodos get
                //obtenemos columna a columna
                int idMundo = resultado.getInt("idMundo");
                String nombre = resultado.getString("nombre");
                String region = resultado.getString("region");


                Mundo mund = new Mundo(idMundo,nombre,region);
                mundo.add(mund); //se añade el alumno a la lista
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    
    return mundo;
    }
}