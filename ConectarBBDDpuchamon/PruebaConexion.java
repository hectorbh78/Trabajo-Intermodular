package ConectarBBDDpuchamon;
import java.sql.Connection;
import java.sql.DriverManager;

public class PruebaConexion {
    public static Connection getConnection() throws Exception {
        // Datos de tu base de datos local
       

        try {

            String url = "jdbc:mysql://localhost:3306/DBPuchamon"; 
            String user = "root";
            String pass = "mysql";

        
            return DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            throw (e);
        }
    }
} 


/*0
//EJEMPLO UPDATE
public boolean actualizaJefeDpto (Connection conexion, DepartamentoVO departamento) {

String update = "UPDATE departamento SET dni = ? WHERE coddep = ?";

try(PreparedStatement stmt = conexion. prepareStatement(update) ){
//se asignan los valores al update (sentencia preparada)

stmt.setString(1,departamento.getDni());
stmt.setInt(2,departamento.getCodDep());

//la sentencia UPDATE se ejecuta con executeUpdate
return stmt.executeUpdate()>0?true:false;

catch(SQLException e) {
e.printStackTrace();
return false;

}
}
} */