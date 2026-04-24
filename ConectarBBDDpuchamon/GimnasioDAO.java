package ConectarBBDDpuchamon;

import PuchamonGris.*;
import java.sql.*;
import java.util.*;

// DAO de Gimnasio (lee gimnasios desde la base de datos)
public class GimnasioDAO {

    // Método que devuelve la lista de gimnasios de la BD
    public List<Gimnasio> selectGimnasio(Connection pruebaConexion) {

        // Consulta SQL para obtener todos los gimnasios
        String consulta = "SELECT * FROM gimnasio";

        // Lista donde se guardan los gimnasios
        List<Gimnasio> gimnasio = new ArrayList<>();

        try(
            // Creamos la sentencia SQL
            Statement stmt = pruebaConexion.createStatement();

            // Ejecutamos la consulta y guardamos el resultado
            ResultSet resultado = stmt.executeQuery(consulta)
        ){

            // Recorremos cada fila de la tabla gimnasio
            while(resultado.next()) {

                // Obtenemos los datos de cada columna
                int idGimnasio = resultado.getInt("idGimnasio");
                String nombre = resultado.getString("nombre");
                int NivelRecomendado = resultado.getInt("NivelRecomendado");
                int idMundo = resultado.getInt("idMundo");

                // Creamos el objeto Gimnasio con los datos
                Gimnasio gym = new Gimnasio(idGimnasio, nombre, NivelRecomendado, idMundo);

                // Añadimos el gimnasio a la lista
                gimnasio.add(gym);
            }

        } catch(SQLException e) {
            // Si hay error en la BD lo mostramos
            e.printStackTrace();
        }

        // Devolvemos la lista completa de gimnasios
        return gimnasio;
    }
}