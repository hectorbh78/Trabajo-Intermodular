package ConectarBBDDpuchamon;

import PuchamonGris.*;
import java.sql.*;
import java.util.*;

// DAO de Misión (lee las misiones desde la base de datos)
public class MisionDAO {

    // Método que devuelve todas las misiones de la BD
    public List<Mision> selectMision(Connection pruebaConexion) {

        // Consulta SQL para sacar todas las misiones
        String consulta = "SELECT * FROM mision";

        // Lista donde se guardan las misiones
        List<Mision> mision = new ArrayList<>();

        try(
            // Creamos la sentencia SQL
            Statement stmt = pruebaConexion.createStatement();

            // Ejecutamos la consulta y guardamos el resultado
            ResultSet resultado = stmt.executeQuery(consulta)
        ){

            // Recorremos cada fila de la tabla mision
            while(resultado.next()) {

                // Sacamos los datos de cada columna
                int idMision = resultado.getInt("idMision");
                String descripcion = resultado.getString("descripcion");
                String recompensa = resultado.getString("recompensa");
                int idMundo = resultado.getInt("idMundo");
                int idObjeto = resultado.getInt("idObjeto");

                // Creamos el objeto Mision con los datos obtenidos
                Mision mis = new Mision(idMision, descripcion, recompensa, idMundo, idObjeto);

                // Lo añadimos a la lista
                mision.add(mis);
            }

        } catch(SQLException e) {
            // Si hay error en la base de datos lo mostramos
            e.printStackTrace();
        }

        // Devolvemos la lista completa de misiones
        return mision;
    }
}