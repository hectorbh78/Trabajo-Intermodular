package ConectarBBDDpuchamon;
import PuchamonGris.*;
import java.sql.*;
import java.util.*;

public class TipoPuchamonDAO{
     public List<TIposPuchamon> selectTipoPuchamon (Connection pruebaConexion) {

        String consulta = "select * from tipoPuchamon";

        List<TIposPuchamon> tipoPuchamon = new ArrayList<>();

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
                int idTipo = resultado.getInt("idTipo");
                int idTipo2 = resultado.getInt("idTipo2");
                
                


                TIposPuchamon tipPuch = new TIposPuchamon(idPuch,idTipo,idTipo2);
                tipoPuchamon.add(tipPuch); //se añade el alumno a la lista
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    
    return tipoPuchamon;
    }
}