package ConectarBBDDpuchamon;
import PuchamonGris.*;
import java.sql.*;
import java.util.*;

public class MisionDAO{
    public List<Mision> selectMision (Connection pruebaConexion) {

        String consulta = "select * from mision";

        List<Mision> mision = new ArrayList<>();

         try(Statement stmt = pruebaConexion.createStatement();
            ResultSet resultado = stmt.executeQuery(consulta)){

            //en el try se ha creado la sentencia y se ha ejecutado la query
            //si no se sale por el catch, es que ha ido bien, queda recorrer los resultados

            while(resultado.next()) {
                //next() se va desplazando por el conjunto de resultados que devuelve
                //el servidor y que se almacena en ResultSet
                //para obtener los datos se utilizan métodos get
                //obtenemos columna a columna
                int idMision = resultado.getInt("idMision");
                String descripcion = resultado.getString("descripcion");
                String recompensa = resultado.getString("recompensa");
                int idMundo = resultado.getInt("idMundo");
                int idObjeto = resultado.getInt("idObjeto");


                Mision mis = new Mision(idMision, descripcion, recompensa, idMundo, idObjeto);
                mision.add(mis); //se añade el alumno a la lista
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    
    return mision;
}
}