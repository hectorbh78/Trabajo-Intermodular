package ConectarBBDDpuchamon;
import PuchamonGris.*;
import java.sql.*;
import java.util.*;
import java.time.*;



public class LuchaDAO{
    public List<Lucha> selectLucha (Connection pruebaConexion) {

        String consulta = "select * from lucha";

        List<Lucha> lucha = new ArrayList<>();

        try(Statement stmt = pruebaConexion.createStatement();
            ResultSet resultado = stmt.executeQuery(consulta)){

            //en el try se ha creado la sentencia y se ha ejecutado la query
            //si no se sale por el catch, es que ha ido bien, queda recorrer los resultados

            while(resultado.next()) {
                //next() se va desplazando por el conjunto de resultados que devuelve
                //el servidor y que se almacena en ResultSet
                //para obtener los datos se utilizan métodos get
                //obtenemos columna a columna
                int idLucha = resultado.getInt("idLucha");
                LocalDate fecha = resultado.getDate("fecha").toLocalDate();
                String tipo = resultado.getString("tipo");
                int idEntrenador = resultado.getInt("idEntrenador");
                int idGimnasio = resultado.getInt("idGimansio");
                int idEntrenadorEnemigo = resultado.getInt("idEntrenadorEnemigo");


                Lucha luch = new Lucha(idLucha, fecha, tipo, idGimnasio, idEntrenador, idEntrenadorEnemigo);
                lucha.add(luch); //se añade el alumno a la lista
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
    
    return lucha;
}
}