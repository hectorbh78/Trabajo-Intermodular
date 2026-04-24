package ConectarBBDDpuchamon;

import PuchamonGris.*;
import java.sql.*;
import java.util.*;

// DAO de Entrenador (sirve para leer entrenadores de la base de datos)
public class EntrenadorDAO {

    // Método que devuelve todos los entrenadores de la BD
    public List<Entrenador> selectEntrenador(Connection pruebaConexion) {

        // Consulta SQL para sacar todos los entrenadores
        String consulta = "SELECT * FROM entrenador";

        // Lista donde se guardan los entrenadores
        List<Entrenador> entrenador = new ArrayList<>();

        try(
            // Creamos la sentencia SQL
            Statement stmt = pruebaConexion.createStatement();

            // Ejecutamos la consulta y guardamos el resultado
            ResultSet resultado = stmt.executeQuery(consulta)
        ){

            // Recorremos todos los registros de la base de datos
            while(resultado.next()) {

                // Sacamos los datos de cada fila
                int idEntrenador = resultado.getInt("idEntrenador");
                String nombre = resultado.getString("nombre");

                // Creamos el objeto Entrenador con los datos
                Entrenador entre = new Entrenador(idEntrenador, nombre);

                // Lo añadimos a la lista
                entrenador.add(entre);
            }

        } catch(SQLException e) {
            // Si hay error en la base de datos lo muestra
            e.printStackTrace();
        }

        // Devolvemos la lista completa
        return entrenador;
    }
}