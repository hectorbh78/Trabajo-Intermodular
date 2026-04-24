package ConectarBBDDpuchamon;

import PuchamonGris.*;
import java.sql.*;
import java.util.*;

// DAO de Mundo (lee los mundos desde la base de datos)
public class MundoDAO {

    // Método que devuelve todos los mundos de la BD
    public List<Mundo> selectMundo(Connection pruebaConexion) {

        // Consulta SQL para sacar todos los mundos
        String consulta = "SELECT * FROM mundo";

        // Lista donde se guardan los mundos
        List<Mundo> mundo = new ArrayList<>();

        try(
            // Creamos la sentencia SQL
            Statement stmt = pruebaConexion.createStatement();

            // Ejecutamos la consulta y guardamos el resultado
            ResultSet resultado = stmt.executeQuery(consulta)
        ){

            // Recorremos cada fila de la tabla mundo
            while(resultado.next()) {

                // Sacamos los datos de cada columna
                int idMundo = resultado.getInt("idMundo");
                String nombre = resultado.getString("nombre");
                String region = resultado.getString("region");

                // Creamos el objeto Mundo con los datos
                Mundo mund = new Mundo(idMundo, nombre, region);

                // Lo añadimos a la lista
                mundo.add(mund);
            }

        } catch(SQLException e) {
            // Si hay error en la base de datos lo mostramos
            e.printStackTrace();
        }

        // Devolvemos la lista completa de mundos
        return mundo;
    }
}