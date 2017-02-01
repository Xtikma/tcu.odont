
package AccesoDatos;

import Entidades.TipoIdentificacion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
    
    public void ConsultarTipoIdentificacion(JTable tblTipoId) {
        try {
            ResultSet rsTipoId;
            
            DefaultTableModel model = (DefaultTableModel) tblTipoId.getModel();
            int a = model.getRowCount() - 1;
            for (int i = a; i >= 0; i--) {
                model.removeRow(i);
            }
            CallableStatement cs = conexion.prepareCall("{call consultar_tipoIdentificacion()}");
            rsTipoId = cs.executeQuery();
            
            while (rsTipoId.next()) {
                try {
                    model.addRow(new Object[]{rsTipoId.getString(1)});
                } catch (SQLException ex) {
                    System.out.println("Mensaje de Error"); //Poner mensaje de error real
                }
            }
            tblTipoId.setModel(model);
            conexion.close();
        } catch (SQLException ex) {
            System.out.println(ex.toString()); //Poner mensaje de error real
        }
    }
}