package ConectarBBDDpuchamon;

import PuchamonGris.*;
import java.sql.*;
import java.util.*;
import java.time.*;

// DAO de Lucha (lee las batallas desde la base de datos)
public class LuchaDAO {

    // Método que devuelve la lista de luchas desde la BD
    public List<Lucha> selectLucha(Connection pruebaConexion) {

        // Consulta SQL para obtener todas las luchas
        String consulta = "SELECT * FROM lucha";

        // Lista donde se guardan las luchas
        List<Lucha> lucha = new ArrayList<>();

        try(
            // Creamos la sentencia SQL
            Statement stmt = pruebaConexion.createStatement();

            // Ejecutamos la consulta y guardamos resultados
            ResultSet resultado = stmt.executeQuery(consulta)
        ){

            // Recorremos cada fila de la tabla lucha
            while(resultado.next()) {

                // Sacamos los datos de cada columna
                int idLucha = resultado.getInt("idLucha");

                // Convertimos la fecha de SQL a LocalDate de Java
                LocalDate fecha = resultado.getDate("fecha").toLocalDate();

                String tipo = resultado.getString("tipo");
                int idEntrenador = resultado.getInt("idEntrenador");

                // OJO: posible error de escritura en BD (idGimansio)
                int idGimnasio = resultado.getInt("idGimnasio");

                int idEntrenadorEnemigo = resultado.getInt("idEntrenadorEnemigo");

                // Creamos el objeto Lucha con los datos obtenidos
                Lucha luch = new Lucha(
                    idLucha,
                    fecha,
                    tipo,
                    idGimnasio,
                    idEntrenador,
                    idEntrenadorEnemigo
                );

                // Añadimos la lucha a la lista
                lucha.add(luch);
            }

        } catch(SQLException e) {
            // Si hay error en la BD lo mostramos
            e.printStackTrace();
        }

        // Devolvemos la lista completa de luchas
        return lucha;
    }
}