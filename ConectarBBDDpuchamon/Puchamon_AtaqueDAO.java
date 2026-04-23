package ConectarBBDDpuchamon;
import PuchamonGris.*;
import java.sql.*;
import java.util.*;

public class Puchamon_AtaqueDAO{
    public List<Puchamon_Ataque> selectPuchamon_Ataque (Connection pruebaConexion) {

        String consulta = "select * from Puchamon_Ataque";

        List<Puchamon_Ataque> puchamonAtaque = new ArrayList<>();

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
                String idAtaque = resultado.getString("idAtaque");
                String idAtaque2 = resultado.getString("idAtaque2");


                Puchamon_Ataque puchAtaq = new Puchamon_Ataque(idPuch, idAtaque, idAtaque2);
                puchamonAtaque.add(puchAtaq); //se añade el alumno a la lista
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    
    return puchamonAtaque;
    }   
}