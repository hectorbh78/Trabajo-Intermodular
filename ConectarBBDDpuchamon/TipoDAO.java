package ConectarBBDDpuchamon;

import PuchamonGris.*;
import java.sql.*;
import java.util.*;

// DAO de Tipo (lee los tipos de Puchamon desde la base de datos)
public class TipoDAO {

    // Método que devuelve la lista de tipos desde la BD
    public List<Tipo> selectTipo(Connection pruebaConexion) {

        // Consulta SQL para obtener todos los tipos
        String consulta = "SELECT * FROM tipo";

        // Lista donde se guardan los tipos
        List<Tipo> tipo = new ArrayList<>();

        try(
            // Creamos la sentencia SQL
            Statement stmt = pruebaConexion.createStatement();

            // Ejecutamos la consulta y guardamos resultados
            ResultSet resultado = stmt.executeQuery(consulta)
        ){

            // Recorremos cada fila de la tabla tipo
            while(resultado.next()) {

                // Sacamos los datos de cada columna
                int idTipo = resultado.getInt("idTipo");
                String nombre = resultado.getString("nombre");

                // Creamos el objeto Tipo con los datos
                Tipo tip = new Tipo(idTipo, nombre);

                // Lo añadimos a la lista
                tipo.add(tip);
            }

        } catch(SQLException e) {
            // Si hay error en la BD lo muestra
            e.printStackTrace();
        }

        // Devolvemos la lista completa de tipos
        return tipo;
    }
}