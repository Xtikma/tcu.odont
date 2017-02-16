
package AccesoDatos;

import Entidades.TipoIdentificacion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ADTipoIdentificacion {
    
    private final Connection conexion = ConexionBD.conexion();
    
    public boolean InsertarTipoIdentificacion(TipoIdentificacion tipoId) {
        try {
            CallableStatement cs = conexion.prepareCall("{call insertar_tipoIdentificacion(?)}");
            cs.setString(1, tipoId.getNombre());
            int cambio = cs.executeUpdate();
            if (cambio > 0) {
                return true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n"+ex.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    public boolean ModificarTipoIdentificacion(TipoIdentificacion tipoId) {
        try {
            CallableStatement cs = conexion.prepareCall("{call modificar_tipoIdentificacion(?,?)}");
            cs.setInt(1, tipoId.getId());
            cs.setString(2, tipoId.getNombre());
            int cambio = cs.executeUpdate();
            if (cambio > 0) {
                return true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n"+ex.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    public boolean EliminarTipoIdentificacion(TipoIdentificacion tipoId) {
        try {
            CallableStatement cs = conexion.prepareCall("{call modificar_tipoIdentificacion(?)}");
            cs.setInt(1, tipoId.getId());
            int cambio = cs.executeUpdate();
            if (cambio > 0) {
                return true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n"+ex.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    public List<TipoIdentificacion> ConsultarTipoIdentificacion() {
        try {
            ResultSet rsTipoId = null;
            
            CallableStatement cs = conexion.prepareCall("{call consultar_tipoIdentificacion()}");
            rsTipoId = cs.executeQuery();
            List <TipoIdentificacion> listaTipoId = new ArrayList();
            while (rsTipoId.next()) {
                try {
                    listaTipoId.add(new TipoIdentificacion(rsTipoId.getInt(2), rsTipoId.getString(1)));
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n"+ex.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
            conexion.close();
            return listaTipoId;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n"+ex.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}