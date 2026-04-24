package ConectarBBDDpuchamon;

import PuchamonGris.*;
import java.sql.*;
import java.util.*;

// DAO de Puchamon_Ataque (relación entre Puchamon y sus ataques)
public class Puchamon_AtaqueDAO {

    // Método que obtiene la relación Puchamon - Ataques desde la BD
    public List<Puchamon_Ataque> selectPuchamon_Ataque(Connection pruebaConexion) {

        // Consulta SQL para sacar la tabla intermedia
        String consulta = "SELECT * FROM Puchamon_Ataque";

        // Lista donde se guardan los registros
        List<Puchamon_Ataque> puchamonAtaque = new ArrayList<>();

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

                // OJO: estos deberían ser INT si son IDs, no String
                int idAtaque = resultado.getInt("idAtaque");
                int idAtaque2 = resultado.getInt("idAtaque2");

                // Creamos el objeto con los datos
                Puchamon_Ataque puchAtaq = new Puchamon_Ataque(idPuch, idAtaque, idAtaque2);

                // Lo añadimos a la lista
                puchamonAtaque.add(puchAtaq);
            }

        } catch(SQLException e) {
            // Si hay error en la BD lo mostramos
            e.printStackTrace();
        }

        // Devolvemos la lista completa
        return puchamonAtaque;
    }
}