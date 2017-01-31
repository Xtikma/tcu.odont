
package AccesoDatos;

import Entidades.TipoIdentificacion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class ADTipoIdentificacion {
    
    private final Connection conexion = ConexionBD.conexion();
    
    public void InsertarTipoIdentificacion(TipoIdentificacion tipoId) {
        try {
            CallableStatement cs = conexion.prepareCall("{call insertar_tipoIdentificacion(?)}");
            cs.setString(1, tipoId.getNombre());
            cs.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void ModificarTipoIdentificacion(TipoIdentificacion tipoId) {
        try {
            CallableStatement cs = conexion.prepareCall("{call modificar_tipoIdentificacion(?,?)}");
            cs.setInt(1, tipoId.getId());
            cs.setString(2, tipoId.getNombre());
            cs.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void EliminarTipoIdentificacion(TipoIdentificacion tipoId) {
        try {
            CallableStatement cs = conexion.prepareCall("{call modificar_tipoIdentificacion(?)}");
            cs.setInt(1, tipoId.getId());
            cs.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public void ConsultarTipoIdentificacion() {
        
    }
}