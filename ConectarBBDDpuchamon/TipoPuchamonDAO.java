package ConectarBBDDpuchamon;

import PuchamonGris.*;
import java.sql.*;
import java.util.*;

// DAO de TipoPuchamon (relación entre Puchamon y sus tipos)
public class TipoPuchamonDAO {

    // Método que devuelve la lista de tipos asignados a cada Puchamon
    public List<TIposPuchamon> selectTipoPuchamon(Connection pruebaConexion) {

        // Consulta SQL para obtener la tabla de relación
        String consulta = "SELECT * FROM tipoPuchamon";

        // Lista donde se guardan los registros
        List<TIposPuchamon> tipoPuchamon = new ArrayList<>();

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
                int idTipo = resultado.getInt("idTipo");
                int idTipo2 = resultado.getInt("idTipo2");

                // Creamos el objeto relación Puchamon - Tipo
                TIposPuchamon tipPuch = new TIposPuchamon(idPuch, idTipo, idTipo2);

                // Lo añadimos a la lista
                tipoPuchamon.add(tipPuch);
            }

        } catch(SQLException e) {
            // Si hay error en la base de datos lo muestra
            e.printStackTrace();
        }

        // Devolvemos la lista completa
        return tipoPuchamon;
    }
}