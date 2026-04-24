package ConectarBBDDpuchamon;

import PuchamonGris.*;
import java.sql.*;
import java.util.*;

// DAO de Ataque (sirve para sacar datos de la base de datos)
public class AtaqueDAO {

    // Método que obtiene todos los ataques de la base de datos
    public List<Ataque> selectAtaque(Connection pruebaConexion) {

        // Consulta SQL para sacar todos los ataques
        String consulta = "SELECT * FROM Ataque";

        // Lista donde se guardan los ataques
        List<Ataque> ataque = new ArrayList<>();

        try(
            // Creamos la sentencia SQL
            Statement stmt = pruebaConexion.createStatement();

            // Ejecutamos la consulta y guardamos el resultado
            ResultSet resultado = stmt.executeQuery(consulta)
        ){

            // Recorremos todos los resultados de la base de datos
            while(resultado.next()) {

                // Sacamos los datos de cada columna
                int idAtaque = resultado.getInt("idAtaque");
                String nombre = resultado.getString("nombre");
                int daño = resultado.getInt("daño");
                String TipoDaño = resultado.getString("TipoDaño");

                // OJO: aquí estaba mal (ponía idAtaque otra vez)
                int idTipo = resultado.getInt("idTipo");

                // Creamos el objeto Ataque con los datos obtenidos
                Ataque atq = new Ataque(idAtaque, nombre, daño, TipoDaño, idTipo);

                // Lo añadimos a la lista
                ataque.add(atq);
            }

        } catch(SQLException e) {
            // Si hay error en la base de datos, lo muestra
            e.printStackTrace();
        }

        // Devolvemos la lista completa de ataques
        return ataque;
    }
}