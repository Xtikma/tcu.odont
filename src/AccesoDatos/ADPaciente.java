package AccesoDatos;

//<editor-fold defaultstate="collapsed" desc="Importaciones">
import Entidades.Paciente;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
//</editor-fold>

public class ADPaciente {
    
    private final Connection conexion = ConexionBD.conexion();
    
    /** InsertarPaciente
     * Inserta un nuevo pacienete a la base de datos
     * @param paciente el paciente nuevo a insertar
     * @param idPoblacion identificación a la población que pertenece el paciente
     * @param idTipoId identificación del tipo de id que posee el paciente
     * @return incersión exitosa o no
     */
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
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n" + ex.toString() + "\nen InsertarPaciente en ADPaciente", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    /** ModificarPaciente
     * Modifica un paciente existente en la base de datos
     * @param paciente el paciente a modificar con los nuevos valores
     * @param idPoblacion identificación a la población que pertenece el paciente
     * @param idTipoId identificación del tipo de id que posee el paciente
     * @return incersión exitosa o no
     */
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
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n" + ex.toString() + "\nen ModificarPaciente en ADPaciente", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
   
    /** ActivarDesactivarPaciente
     * Activa o elimina un paciente existente en la base de datos
     * @param id identificación del paciente a activar o eliminar
     * @param estado el estado nuevo que va a tomar el paciente
     * @return incersión exitosa o no
     */
    public boolean ActivarDesactivarPaciente(int id, boolean estado) {
        try {
            CallableStatement cs = conexion.prepareCall("{call activar_desactivar_paciente(?,?)}");
            cs.setInt(1, id);
            cs.setBoolean(2, estado);
            int cambio = cs.executeUpdate();
            if (cambio > 0) {
                return true;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n" + ex.toString() + "\nen ActivarDesactivarPaciente en ADPaciente", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    /** ConsultarPacientePorId
     * Consulta a la base de datos por un paciente en específico
     * @param id identificación del paciente a consultar
     * @return el paciente correspondiente a la identificación
     */
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
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n" + ex.toString() + "\nen ConsultarPacientePorId en ADPaciente", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    
    /** ConsultarPacientesActivos
     * Consulta todos los pacientes activos existentes en la base de datos
     * @return una lista con todos los pacientes activos
     */
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
                    if (rsPaciente.getDate(5) == null) {
                        paciente.setFechaNacimiento("");
                    } else {
                        paciente.setFechaNacimiento(rsPaciente.getDate(5).toString());
                    }
                    paciente.setEdad(rsPaciente.getInt(6));
                    paciente.setValorIdentificacion(rsPaciente.getString(7));
                    paciente.setGenero(rsPaciente.getString(8));
                    paciente.setBeca(rsPaciente.getInt(9));
                    paciente.setCarne(rsPaciente.getString(10));
                    paciente.setPrimerIngreso(rsPaciente.getBoolean(11));
                    paciente.setEliminado(rsPaciente.getBoolean(12));
                    paciente.setPoblacion(rsPaciente.getInt(13), rsPaciente.getString(14)
                            , rsPaciente.getString(15), rsPaciente.getBoolean(16));
                    listaPaciente.add(paciente);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n" + ex.toString() + "\nen ConsultarPacientesActivos en ADPaciente", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
            conexion.close();
            return listaPaciente;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n" + ex.toString() + "\nen ConsultarPacientesActivos en ADPaciente", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    
    /** ConsultarPacientesEliminados
     * Consulta todos los pacientes eliminados existentes en la base de datos
     * @return una lista con todos los pacientes eliminados
     */
    public List<Paciente> ConsultarPacientesEliminados() {
        try {
            ResultSet rsPaciente = null;

            CallableStatement cs = conexion.prepareCall("{call consultar_pacientes_eliminados()}");
            rsPaciente = cs.executeQuery();
            List<Paciente> listaPaciente = new ArrayList();
            while (rsPaciente.next()) {
                try {
                    Paciente paciente = new Paciente();
                    paciente.setId(rsPaciente.getInt(1));
                    paciente.setNombre(rsPaciente.getString(2));
                    paciente.setPrimerApellido(rsPaciente.getString(3));
                    paciente.setSegundoApellido(rsPaciente.getString(4));
                    if (rsPaciente.getDate(5) == null) {
                        paciente.setFechaNacimiento("");
                    } else {
                        paciente.setFechaNacimiento(rsPaciente.getDate(5).toString());
                    }
                    paciente.setEdad(rsPaciente.getInt(6));
                    paciente.setValorIdentificacion(rsPaciente.getString(7));
                    paciente.setGenero(rsPaciente.getString(8));
                    paciente.setBeca(rsPaciente.getInt(9));
                    paciente.setCarne(rsPaciente.getString(10));
                    paciente.setPrimerIngreso(rsPaciente.getBoolean(11));
                    paciente.setEliminado(rsPaciente.getBoolean(12));
                    paciente.setPoblacion(rsPaciente.getInt(13), rsPaciente.getString(14)
                            , rsPaciente.getString(15), rsPaciente.getBoolean(16));
                    listaPaciente.add(paciente);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n" + ex.toString() + "\nen ConsultarPacientesEliminados en ADPaciente", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
            conexion.close();
            return listaPaciente;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error. Detalle:\n" + ex.toString() + "\nen ConsultarPacientesEliminados en ADPaciente", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}