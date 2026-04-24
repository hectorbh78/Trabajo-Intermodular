package ConectarBBDDpuchamon;

import PuchamonGris.*;
import java.sql.*;
import java.util.*;

// DAO de Objeto (lee objetos desde la base de datos)
public class ObjetoDAO {

    // Método que devuelve todos los objetos de la BD
    public List<Objeto> selectObjeto(Connection pruebaConexion) {

        // Consulta SQL para sacar todos los objetos
        String consulta = "SELECT * FROM objeto";

        // Lista donde se guardan los objetos
        List<Objeto> objeto = new ArrayList<>();

        try(
            // Creamos la sentencia SQL
            Statement stmt = pruebaConexion.createStatement();

            // Ejecutamos la consulta y guardamos el resultado
            ResultSet resultado = stmt.executeQuery(consulta)
        ){

            // Recorremos cada fila de la tabla objeto
            while(resultado.next()) {

                // Sacamos los datos de cada columna
                int idObjeto = resultado.getInt("idObjeto");
                String nombre = resultado.getString("nombre");
                String efecto = resultado.getString("efecto");
                int idMision = resultado.getInt("idMision");

                // Creamos el objeto Objeto con los datos
                Objeto obtj = new Objeto(idObjeto, nombre, efecto, idMision);

                // Lo añadimos a la lista
                objeto.add(obtj);
            }

        } catch(SQLException e) {
            // Si hay error en la BD lo mostramos
            e.printStackTrace();
        }

        // Devolvemos la lista completa de objetos
        return objeto;
    }
}