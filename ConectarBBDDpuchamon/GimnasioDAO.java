package ConectarBBDDpuchamon;
import PuchamonGris.*;
import java.sql.*;
import java.util.*;


public class GimnasioDAO{
    public List<Gimnasio> selectGimnasio (Connection pruebaConexion) {

        String consulta = "select * from gimnasio";

        List<Gimnasio> gimnasio = new ArrayList<>();

         try(Statement stmt = pruebaConexion.createStatement();
            ResultSet resultado = stmt.executeQuery(consulta)){

            //en el try se ha creado la sentencia y se ha ejecutado la query
            //si no se sale por el catch, es que ha ido bien, queda recorrer los resultados

            while(resultado.next()) {
                //next() se va desplazando por el conjunto de resultados que devuelve
                //el servidor y que se almacena en ResultSet
                //para obtener los datos se utilizan métodos get
                //obtenemos columna a columna
                int idGimnasio = resultado.getInt("idGimnasio");
                String nombre = resultado.getString("nombre");
                int NivelRecomendado = resultado.getInt("NivelRecomendado");
                int idMundo = resultado.getInt("idMundo");

                Gimnasio gym = new Gimnasio(idGimnasio,nombre,NivelRecomendado,idMundo);
                gimnasio.add(gym); //se añade el alumno a la lista
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    
    return gimnasio;
    }
}