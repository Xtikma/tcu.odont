
package Modelo;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.exceptions.MySQLDataException;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

      /* ------------------------------------------------------------------------------------------------------------------------------ 
     NOMBRE:      Conexion
     DESCRIPCION: Método encargado de invocar la base de datos por medio de una libreria de Java. Invocando a un usuario de la base de datos en especifico. 
     --------------------------------------------------------------------------------------------------------------------------------*/
    public static Connection conexion() {
        Connection conexionDB = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String servidor = "jdbc:mysql://localhost:3306/sicoseo";
            String usuario = "root";
            String constrasena = "sicoseo";
            conexionDB = (Connection) DriverManager.getConnection(servidor, usuario, constrasena);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (MySQLDataException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            return conexionDB;
        }
    }
}