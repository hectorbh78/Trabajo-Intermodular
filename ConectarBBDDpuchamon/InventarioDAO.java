package ConectarBBDDpuchamon;

import PuchamonGris.*;
import java.sql.*;
import java.util.*;

// DAO de Inventario (lee los objetos que tiene cada entrenador)
public class InventarioDAO {

    // Método que devuelve la lista del inventario desde la BD
    public List<Inventario> selectInventario(Connection pruebaConexion) {

        // Consulta SQL para sacar todos los registros del inventario
        String consulta = "SELECT * FROM inventario";

        // Lista donde se guardan los objetos del inventario
        List<Inventario> inventario = new ArrayList<>();

        try(
            // Creamos la sentencia SQL
            Statement stmt = pruebaConexion.createStatement();

            // Ejecutamos la consulta y guardamos resultados
            ResultSet resultado = stmt.executeQuery(consulta)
        ){

            // Recorremos cada fila del resultado
            while(resultado.next()) {

                // Sacamos los datos de cada columna
                int idEntrenador = resultado.getInt("idEntrenador");
                int idObjeto = resultado.getInt("idObjeto");
                int numObjetos = resultado.getInt("numObjetos");

                // Creamos el objeto Inventario
                Inventario invent = new Inventario(idEntrenador, idObjeto, numObjetos);

                // Lo añadimos a la lista
                inventario.add(invent);
            }

        } catch(SQLException e) {
            // Si hay error en la base de datos lo mostramos
            e.printStackTrace();
        }

        // Devolvemos la lista completa del inventario
        return inventario;
    }

    public void insertarInventario(Connection con, int idEntrenador, int idObjeto) {

    String sql = "UPDATE inventario SET numObjetos = numObjetos + 1 WHERE idEntrenador = ? AND idObjeto = ?";

    try (PreparedStatement stmt = con.prepareStatement(sql)) {

        stmt.setInt(1, idEntrenador);
        stmt.setInt(2, idObjeto);

        stmt.executeUpdate();

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
public void eliminiarInventario(Connection con, int idEntrenador, int idObjeto) {

    String sql = "UPDATE inventario SET numObjetos = numObjetos - 1 WHERE idEntrenador = ? AND idObjeto = ?";

    try (PreparedStatement stmt = con.prepareStatement(sql)) {

        stmt.setInt(1, idEntrenador);
        stmt.setInt(2, idObjeto);

        stmt.executeUpdate();

    } catch (SQLException e) {
        e.printStackTrace();
    }
}


public void inventarioACero(Connection con) {

    String sql = "UPDATE inventario SET numObjetos = 0";

    try (PreparedStatement stmt = con.prepareStatement(sql)) {

        stmt.executeUpdate();

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
}