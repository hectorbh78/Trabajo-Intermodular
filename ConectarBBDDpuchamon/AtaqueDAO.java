package ConectarBBDDpuchamon;
import PuchamonGris.*;
import java.sql.*;
import java.util.*;

public class AtaqueDAO{
    public List<Ataque> selectAtaque (Connection pruebaConexion) {

        String consulta = "select * from Ataque";

        List<Ataque> ataque = new ArrayList<>();

         try(Statement stmt = pruebaConexion.createStatement();
            ResultSet resultado = stmt.executeQuery(consulta)){

            //en el try se ha creado la sentencia y se ha ejecutado la query
            //si no se sale por el catch, es que ha ido bien, queda recorrer los resultados

            while(resultado.next()) {
                //next() se va desplazando por el conjunto de resultados que devuelve
                //el servidor y que se almacena en ResultSet
                //para obtener los datos se utilizan métodos get
                //obtenemos columna a columna
                int idAtaque = resultado.getInt("idAtaque");
                String nombre = resultado.getString("nombre");
                int daño = resultado.getInt("daño");
                String TipoDaño = resultado.getString("TipoDaño");
                int idTipo = resultado.getInt("idAtaque");


                Ataque atq = new Ataque(idAtaque, nombre,daño,TipoDaño,idTipo);
                ataque.add(atq); //se añade el alumno a la lista
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    
    return ataque;
    }
}