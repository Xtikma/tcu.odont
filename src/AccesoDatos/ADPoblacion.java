
package AccesoDatos;

import Entidades.Poblacion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class ADPoblacion {
    
    private final Connection conexion = ConexionBD.conexion();
    
    public boolean InsertarPoblacion(Poblacion poblacion) {
        try {
            CallableStatement cs = conexion.prepareCall("{call insertar_poblacion(?,?,?)}");
            cs.setString(1, poblacion.getNombre());
            cs.setString(2, poblacion.getInstitucion());
            cs.setBoolean(3, poblacion.getBecado());
            int cambio = cs.executeUpdate();
            if (cambio > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return false;
    }
    
    public boolean ModificarPoblacion(Poblacion poblacion) {
        try {
            CallableStatement cs = conexion.prepareCall("{call modificar_poblacion(?,?,?,?)}");
            cs.setInt(1, poblacion.getId());
            cs.setString(2, poblacion.getNombre());
            cs.setString(3, poblacion.getInstitucion());
            cs.setBoolean(4, poblacion.getBecado());
            int cambio = cs.executeUpdate();
            if (cambio > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return false;
    }
    
    public boolean EliminarPoblacion(Poblacion poblacion) {
        try {
            CallableStatement cs = conexion.prepareCall("{call eliminar_poblacion(?)}");
            cs.setInt(1, poblacion.getId());
            int cambio = cs.executeUpdate();
            if (cambio > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return false;
    }
    
    public void ConsultarPoblacion() {
        
    }
}