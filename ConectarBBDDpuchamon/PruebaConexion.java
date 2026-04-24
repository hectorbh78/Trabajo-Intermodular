package ConectarBBDDpuchamon;

import java.sql.Connection;
import java.sql.DriverManager;

// Clase para crear la conexión con la base de datos
public class PruebaConexion {

    // Método que devuelve la conexión a la BD
    public static Connection getConnection() throws Exception {

        try {

            // URL de conexión a MySQL (localhost y nombre de la BD)
            String url = "jdbc:mysql://localhost:3306/DBPuchamon";

            // Usuario de la base de datos
            String user = "root";

            // Contraseña de la base de datos
            String pass = "mysql";

            // Se crea y devuelve la conexión
            return DriverManager.getConnection(url, user, pass);

        } catch (Exception e) {
            // Si falla la conexión, se lanza la excepción
            throw e;
        }
    }
}