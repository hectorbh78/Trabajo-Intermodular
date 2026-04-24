package ConectarBBDDpuchamon;

import PuchamonGris.*;
import java.sql.*;
import java.util.*;

// DAO de Puchamon (lee los Puchamon desde la base de datos)
public class PuchamonDAO {

    // Método que devuelve la lista de Puchamon desde la BD
    public List<Puchamon> selectPucha(Connection pruebaConexion) {

        // Consulta SQL para obtener todos los Puchamon
        String consulta = "SELECT * FROM Puchamon";

        // Lista donde se guardan los Puchamon
        List<Puchamon> puchamon = new ArrayList<>();

        try(
            // Creamos la sentencia SQL
            Statement stmt = pruebaConexion.createStatement();

            // Ejecutamos la consulta y guardamos resultados
            ResultSet resultado = stmt.executeQuery(consulta)
        ){

            // Recorremos cada fila de la tabla
            while(resultado.next()) {

                // Sacamos los datos de cada columna
                int idPuch = resultado.getInt("idPuch");
                String nombre = resultado.getString("nombre");
                int nivel = resultado.getInt("Nivel");
                int vida = resultado.getInt("Vida");
                int idEntrenador = resultado.getInt("idEntrenador");

                // Creamos el objeto Puchamon con los datos
                // OJO: aquí hay un posible error de orden de parámetros
                Puchamon puch = new Puchamon(idPuch, nombre, vida, nivel, idEntrenador);

                // Lo añadimos a la lista
                puchamon.add(puch);
            }

        } catch(SQLException e) {
            // Si hay error en la BD lo muestra
            e.printStackTrace();
        }

        // Devolvemos la lista completa
        return puchamon;
    }
}