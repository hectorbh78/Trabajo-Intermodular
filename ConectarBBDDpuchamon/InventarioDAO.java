package ConectarBBDDpuchamon;
import PuchamonGris.*;
import java.sql.*;
import java.util.*;
public class InventarioDAO{

     public List<Inventario> selectEntrenador (Connection pruebaConexion) {

        String consulta = "select * from inventario";

        List<Inventario> inventario = new ArrayList<>();

         try(Statement stmt = pruebaConexion.createStatement();
            ResultSet resultado = stmt.executeQuery(consulta)){

            //en el try se ha creado la sentencia y se ha ejecutado la query
            //si no se sale por el catch, es que ha ido bien, queda recorrer los resultados

            while(resultado.next()) {
                //next() se va desplazando por el conjunto de resultados que devuelve
                //el servidor y que se almacena en ResultSet
                //para obtener los datos se utilizan métodos get
                //obtenemos columna a columna
                int idEntrenador = resultado.getInt("idEntrenador");
                int idObjeto = resultado.getInt("idObjeto");


                Inventario invent = new Inventario(idEntrenador, idObjeto);
                inventario.add(invent); //se añade el alumno a la lista
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    
    return inventario;
    }}