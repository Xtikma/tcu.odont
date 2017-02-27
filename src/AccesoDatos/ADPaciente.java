
package AccesoDatos;

import Entidades.Paciente;
import Entidades.Poblacion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ADPaciente {
    
    private final Connection conexion = ConexionBD.conexion();
    
    public boolean InsertarPaciente(Paciente paciente, int idPoblacion, int idTipoId) {
        try {
            CallableStatement cs = conexion.prepareCall("{call insertar_paciente(?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setString(1, paciente.getFechaNacimiento());
            cs.setInt(2, paciente.getEdad());
            cs.setString(3, paciente.getNombre());
            cs.setString(4, paciente.getPrimerApellido());
            cs.setString(5, paciente.getSegundoApellido());
            cs.setString(6, paciente.getValorIdentificacion());
            cs.setString(7, paciente.getGenero());
            cs.setInt(8, paciente.getBeca());
            cs.setString(9, paciente.getCarne());
            cs.setBoolean(10, paciente.getPrimerIngreso());
            cs.setBoolean(11, paciente.getEliminado());
            cs.setInt(12, idPoblacion); //IdPoblacion
            cs.setInt(13, idTipoId); //IdTipoIndentificacion
            int cambio = cs.executeUpdate();
            if (cambio > 0) {
                return true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n"+ex.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    public boolean ModificarPaciente(Paciente paciente, int idPoblacion, int idTipoId) {
        try {
            CallableStatement cs = conexion.prepareCall("{call modificar_paciente(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setInt(1, paciente.getId());
            cs.setString(2, paciente.getFechaNacimiento());
            cs.setInt(3, paciente.getEdad());
            cs.setString(4, paciente.getNombre());
            cs.setString(5, paciente.getPrimerApellido());
            cs.setString(6, paciente.getSegundoApellido());
            cs.setString(7, paciente.getValorIdentificacion());
            cs.setString(8, paciente.getGenero());
            cs.setInt(9, paciente.getBeca());
            cs.setString(10, paciente.getCarne());
            cs.setBoolean(11, paciente.getPrimerIngreso());
            cs.setBoolean(12, paciente.getEliminado());
            cs.setInt(13, idPoblacion);
            cs.setInt(14, idTipoId);
            int cambio = cs.executeUpdate();
            if (cambio > 0) {
                return true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n"+ex.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    public boolean ActivarDesactivarPaciente(Paciente paciente) {
        try {
            CallableStatement cs = conexion.prepareCall("{call activar_desactivar_paciente(?,?)}");
            cs.setInt(1, paciente.getId());
            cs.setBoolean(2, paciente.getEliminado());
            int cambio = cs.executeUpdate();
            if (cambio > 0) {
                return true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n"+ex.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    public Paciente ConsultarPacientePorId(int id) {
        try {
            Paciente paciente = null;
            ResultSet rsPaciente = null;
            CallableStatement cs = conexion.prepareCall("{call consultar_paciente_por_id(?)}");
            cs.setInt(1, id);
            rsPaciente = cs.executeQuery();
            if (rsPaciente.first()) {
                paciente = new Paciente(rsPaciente.getInt(1), rsPaciente.getString(2), rsPaciente.getString(3), rsPaciente.getString(4), rsPaciente.getString(5),
                                rsPaciente.getString(6), rsPaciente.getString(7), rsPaciente.getInt(8), rsPaciente.getInt(9), rsPaciente.getString(10),
                                rsPaciente.getBoolean(11), rsPaciente.getBoolean(12));
            paciente.setNombreTipoId(rsPaciente.getString(13));
            paciente.setNombrePoblacion(rsPaciente.getString(14));
            }
            //conexion.close();
            return paciente;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n"+ex.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    
    public void ConsultarTodosPacientesActivos(JTable tblPacientes) {
        try {
            ResultSet rsPacientes;
            
            DefaultTableModel model = (DefaultTableModel) tblPacientes.getModel();
            int a = model.getRowCount() - 1;
            for (int i = a; i >= 0; i--) {
                model.removeRow(i);
            }
            CallableStatement cs = conexion.prepareCall("{call consultar_pacientes_activos()}");
            rsPacientes = cs.executeQuery();
            
            while (rsPacientes.next()) {
                try {
                    model.addRow(new Object[]{rsPacientes.getString(1), rsPacientes.getString(2), rsPacientes.getString(3), rsPacientes.getString(4),
                        rsPacientes.getInt(5), rsPacientes.getString(6), rsPacientes.getString(7),rsPacientes.getInt(8),rsPacientes.getString(9),
                        rsPacientes.getBoolean(10), rsPacientes.getBoolean(11), rsPacientes.getString(12), rsPacientes.getString(13), rsPacientes.getBoolean(14)});
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n"+ex.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
            tblPacientes.setModel(model);
            //conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n"+ex.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public List<Paciente> ConsultarPacientesActivos() {
        try {
            ResultSet rsPaciente = null;

            CallableStatement cs = conexion.prepareCall("{call consultar_pacientes_activos()}");
            rsPaciente = cs.executeQuery();
            List<Paciente> listaPaciente = new ArrayList();
            while (rsPaciente.next()) {
                try {
                    Paciente paciente = new Paciente();
                    paciente.setId(rsPaciente.getInt(1));
                    paciente.setNombre(rsPaciente.getString(2));
                    paciente.setPrimerApellido(rsPaciente.getString(3));
                    paciente.setSegundoApellido(rsPaciente.getString(4));
                    paciente.setFechaNacimiento(rsPaciente.getDate(5).toString());
                    paciente.setEdad(rsPaciente.getInt(6));
                    paciente.setValorIdentificacion(rsPaciente.getString(7));
                    paciente.setGenero(rsPaciente.getString(8));
                    paciente.setBeca(rsPaciente.getInt(9));
                    paciente.setPrimerIngreso(rsPaciente.getBoolean(10));
                    paciente.setEliminado(rsPaciente.getBoolean(11));
                    paciente.setPoblacion(rsPaciente.getInt(12), rsPaciente.getString(13)
                            , rsPaciente.getString(14), rsPaciente.getBoolean(15));
                    listaPaciente.add(paciente);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n" + ex.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
            conexion.close();
            return listaPaciente;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n" + ex.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}
