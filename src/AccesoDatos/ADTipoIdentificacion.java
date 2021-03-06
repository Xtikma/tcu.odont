package AccesoDatos;

//<editor-fold defaultstate="collapsed" desc="Importaciones">
import Entidades.TipoIdentificacion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
//</editor-fold>

public class ADTipoIdentificacion {

    private final Connection conexion = ConexionBD.conexion();

    /** InsertarTipoIdentificacion
     * Inserta en la base de datos un nuevo tipo de identificación
     * @param tipoId tipo de identificación a insertar
     * @return si se insertó o no
     */
    public boolean InsertarTipoIdentificacion(TipoIdentificacion tipoId) {
        try {
            CallableStatement cs = conexion.prepareCall("{call insertar_tipoIdentificacion(?)}");
            cs.setString(1, tipoId.getNombre());
            int cambio = cs.executeUpdate();
            if (cambio > 0) {
                return true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n" + ex.toString() + "\nen InsertarTipoIdentificacion en ADTipoIdentificacion", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    /** ModificarTipoIdentificacion
     * Modifica un tipo de id existente en la base de datos
     * @param tipoId tipo de id a modificar con los datos nuevos
     * @return si se modificó o no
     */
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
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n" + ex.toString() + "\nen ModificarTipoIdentificacion en ADTipoIdentificacion", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    /** EliminarTipoIdentificacion
     * Cambia de estado a eliminado un tipo de identificación existene en la base de datos
     * @param tipoId tipo de id a eliminar
     * @return si se eliminó o no
     */
    public boolean EliminarTipoIdentificacion(TipoIdentificacion tipoId) {
        try {
            CallableStatement cs = conexion.prepareCall("{call modificar_tipoIdentificacion(?)}");
            cs.setInt(1, tipoId.getId());
            int cambio = cs.executeUpdate();
            if (cambio > 0) {
                return true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n" + ex.toString() + "\nen EliminarTipoIdentificacion en ADTipoIdentificacion", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    /** ConsultarTipoIdentificacion
     * Consulta todos los tipos de identificación existentes en la base de datos
     * @return una lista con todos los tipos de identificación existentes
     */
    public List<TipoIdentificacion> ConsultarTipoIdentificacion() {
        try {
            ResultSet rsTipoId = null;

            CallableStatement cs = conexion.prepareCall("{call consultar_tipoIdentificacion()}");
            rsTipoId = cs.executeQuery();
            List<TipoIdentificacion> listaTipoId = new ArrayList();
            while (rsTipoId.next()) {
                try {
                    listaTipoId.add(new TipoIdentificacion(rsTipoId.getInt(2), rsTipoId.getString(1)));
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n" + ex.toString() + "\nen ConsultarTipoIdentificacion en ADTipoIdentificacion", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
            conexion.close();
            return listaTipoId;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n" + ex.toString() + "\nen ConsultarTipoIdentificacion en ADTipoIdentificacion", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    /** ConsultarTipoIdentificacion (JTable)
     * Consulta todos los tipos de identificación existentes en la base de datos
     * @param tblTipoId JTable donde se insertan los valores consultados
     */
    public void ConsultarTipoIdentificacion(JTable tblTipoId) {
        try {
            ResultSet rsTipoId = null;

            DefaultTableModel model = (DefaultTableModel) tblTipoId.getModel();
            int a = model.getRowCount() - 1;
            for (int i = a; i >= 0; i--) {
                model.removeRow(i);
            }

            CallableStatement cs = conexion.prepareCall("{call consultar_tipoIdentificacion()}");
            rsTipoId = cs.executeQuery();

            while (rsTipoId.next()) {
                try {
                    model.addRow(new Object[]{rsTipoId.getInt(2), rsTipoId.getString(1)});
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n" + ex.toString() + "\nen ConsultarTipoIdentificacion(JTable) en ADTipoIdentificacion", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n" + ex.toString() + "\nen ConsultarTipoIdentificacion(JTable) en ADTipoIdentificacion", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
}