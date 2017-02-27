/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import AccesoDatos.ADDoctor;
import AccesoDatos.ADLugarAtencion;
import AccesoDatos.ADPoblacion;
import AccesoDatos.ADPracticante;
import AccesoDatos.ADTipoIdentificacion;
import Entidades.Doctor;
import Entidades.LugarAtencion;
import Entidades.Poblacion;
import Entidades.Practicante;
import Entidades.TipoIdentificacion;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author doliv
 */
public class PanelGenerico extends javax.swing.JPanel {

    private int tipoVentana = 0;
    private int accion = 0; //agregar(1) y modificar(2)
    private boolean eliminado = false;
    private boolean primeraVez = true;
    
    /**
     * Creates new form PanelGenerico
     */
    public PanelGenerico(int tipoVentana) {//Si la ventana es para TipoId(1), Doctor(2), Practicante(3), Población(4) o Lugar de Atención(5)
        initComponents();
        this.tipoVentana = tipoVentana;
        centrarColumans();
        panelDatos.setVisible(false);
        TitledBorder border = null;
        switch (tipoVentana) {
            case 1: //TIpo id
                border = BorderFactory.createTitledBorder("Tipo de Identificación");
                border.setTitleFont(new Font("Dialog", Font.BOLD, 14));
                this.setBorder(border);
                btnCargarEliminados.setVisible(false);
                consultarTodosTipoId();
                break;
            case 2: //Doctor
                border = BorderFactory.createTitledBorder("Doctor");
                border.setTitleFont(new Font("Dialog", Font.BOLD, 14));
                this.setBorder(border);
                //btnDesactivar.setVisible(true);
                btnCargarEliminados.setVisible(true);
                consultarDoctoresActivos();
                break;
            case 3: //Practicante
                border = BorderFactory.createTitledBorder("Practicante");
                border.setTitleFont(new Font("Dialog", Font.BOLD, 14));
                this.setBorder(border);
                btnCargarEliminados.setVisible(true);
                consultarPracticantesActivos();
                break;
            case 4: //Población
                border = BorderFactory.createTitledBorder("Población");
                border.setTitleFont(new Font("Dialog", Font.BOLD, 14));
                this.setBorder(border);
                btnCargarEliminados.setVisible(false);
                consultarPoblaciones();
                break;
            case 5: //Lugar Atención
                border = BorderFactory.createTitledBorder("Lugar de Atención");
                border.setTitleFont(new Font("Dialog", Font.BOLD, 14));
                this.setBorder(border);
                btnCargarEliminados.setVisible(true);
                consultarLugaresActivos();
                break;
            default:
                break;
        }
        primeraVez = false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCargarEliminados = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblGenerica = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        panelDatos = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblVariable = new javax.swing.JLabel();
        txtVariable = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnDesactivar = new javax.swing.JButton();
        rbBecado = new javax.swing.JRadioButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "titulo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        setOpaque(false);

        btnCargarEliminados.setText("Cargar Eliminados");
        btnCargarEliminados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarEliminadosActionPerformed(evt);
            }
        });

        TblGenerica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Title 3", "Title4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblGenerica.getTableHeader().setReorderingAllowed(false);
        TblGenerica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblGenericaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblGenerica);

        btnAgregar.setText("Agregar Nuevo");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        panelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N
        panelDatos.setOpaque(false);

        lblNombre.setText("Nombre:");

        lblVariable.setText("Institución:");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnDesactivar.setText("Desactivar");
        btnDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesactivarActionPerformed(evt);
            }
        });

        rbBecado.setText("Becado");

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(lblVariable))
                .addGap(51, 51, 51)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                            .addComponent(txtVariable))
                        .addGap(0, 40, Short.MAX_VALUE))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(rbBecado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDesactivar)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar)))
                .addContainerGap())
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVariable)
                    .addComponent(txtVariable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDesactivar)
                            .addComponent(btnGuardar)))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(rbBecado)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCargarEliminados, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnCargarEliminados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TblGenericaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblGenericaMouseClicked
        accion = 2;
        TitledBorder border = null;
        int indiceFila = TblGenerica.getSelectedRow();
        String texto = (TblGenerica.getValueAt(indiceFila, 1)).toString();
        panelDatos.setVisible(true);
        txtNombre.setText(texto);
        switch (tipoVentana) {
            case 1: //tipo id
                rbBecado.setVisible(false);
                btnDesactivar.setVisible(false);
                lblVariable.setVisible(false);
                txtVariable.setVisible(false);
                border = BorderFactory.createTitledBorder("Modificar Tipo de Identificación");
                border.setTitleFont(new Font("Dialog", Font.BOLD, 12));
                panelDatos.setBorder(border);
                break;
            case 2: //doctor
                rbBecado.setVisible(false);
                lblVariable.setVisible(false);
                txtVariable.setVisible(false);
                border = BorderFactory.createTitledBorder("Modificar Doctor");
                border.setTitleFont(new Font("Dialog", Font.BOLD, 12));
                panelDatos.setBorder(border);
                btnDesactivar.setVisible(true);
                break;
            case 3: //practicante
                rbBecado.setVisible(false);
                lblVariable.setVisible(false);
                txtVariable.setVisible(false);
                border = BorderFactory.createTitledBorder("Modificar Practicante");
                border.setTitleFont(new Font("Dialog", Font.BOLD, 12));
                panelDatos.setBorder(border);
                btnDesactivar.setVisible(true);
                break;
            case 4: //población
                rbBecado.setVisible(true);
                lblVariable.setVisible(true);
                txtVariable.setVisible(true);
                border = BorderFactory.createTitledBorder("Modificar Población");
                border.setTitleFont(new Font("Dialog", Font.BOLD, 12));
                panelDatos.setBorder(border);
                btnDesactivar.setVisible(false);
                txtVariable.setText((TblGenerica.getValueAt(indiceFila, 2)).toString());
                rbBecado.setSelected(false);
                if (((TblGenerica.getValueAt(indiceFila, 3)).toString()).equals("Si")) {
                    rbBecado.setSelected(true);
                }
                break;
            case 5: //lugar atención
                rbBecado.setVisible(false);
                lblVariable.setVisible(false);
                txtVariable.setVisible(false);
                border = BorderFactory.createTitledBorder("Modificar Lugar de Atención");
                border.setTitleFont(new Font("Dialog", Font.BOLD, 12));
                panelDatos.setBorder(border);
                btnDesactivar.setVisible(true);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_TblGenericaMouseClicked

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        switch (tipoVentana) {
            case 1:
                //<editor-fold defaultstate="collapsed" desc="Tipo Id">
                ADTipoIdentificacion bdTipoId = new ADTipoIdentificacion();
                if (accion == 1) {//agregar
                    String nombre = txtNombre.getText();
                    if (nombre.equals("") || nombre.equals(" ")) {
                        JOptionPane.showMessageDialog(null, "No puede dejar el nombre en blanco.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    } else {
                        bdTipoId.InsertarTipoIdentificacion(new TipoIdentificacion(0, nombre));
                    }
                } else if (accion == 2) {//modificar
                    int indiceFila = TblGenerica.getSelectedRow();
                    if (indiceFila >= 0) {
                        int num = (int) TblGenerica.getValueAt(indiceFila, 0);
                        bdTipoId.ModificarTipoIdentificacion(new TipoIdentificacion(num, txtNombre.getText()));
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe seleccionar un item.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                }
                bdTipoId.ConsultarTipoIdentificacion(TblGenerica);
                break;
                //</editor-fold>
            case 2:
                //<editor-fold defaultstate="collapsed" desc="Doctor">
                ADDoctor bdDoctor = new ADDoctor();
                if (accion == 1) {//agregar
                    String nombre = txtNombre.getText();
                    if (nombre.equals("") || nombre.equals(" ")) {
                        JOptionPane.showMessageDialog(null, "No puede dejar el nombre en blanco.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    } else {
                        bdDoctor.insertarDoctor(new Doctor(0, nombre, false));
                    }
                } else if (accion == 2) {//modificar
                    int indiceFila = TblGenerica.getSelectedRow();
                    if (indiceFila >= 0) {
                        int num = (int) TblGenerica.getValueAt(indiceFila, 0);
                        boolean estado = false;
                        if ((TblGenerica.getValueAt(indiceFila, 2).equals("Inactivo"))) {
                            estado = true;
                        }
                        bdDoctor.ModificarDoctor(new Doctor(num, txtNombre.getText(), estado));
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe seleccionar un item.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                }
                if (eliminado) {
                    bdDoctor.consultarDoctor(TblGenerica, true);
                } else {
                    bdDoctor.consultarDoctor(TblGenerica, false);
                }
                break;
                //</editor-fold>
            case 3:
                //<editor-fold defaultstate="collapsed" desc="Practicante">
                ADPracticante bdPracticante = new ADPracticante();
                if (accion == 1) {//agregar
                    String nombre = txtNombre.getText();
                    if (nombre.equals("") || nombre.equals(" ")) {
                        JOptionPane.showMessageDialog(null, "No puede dejar el nombre en blanco.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    } else {
                        bdPracticante.insertaPracticante(new Practicante(0, nombre, false));
                    }
                } else if (accion == 2) {//modificar
                    int indiceFila = TblGenerica.getSelectedRow();
                    if (indiceFila >= 0) {
                        int num = (int) TblGenerica.getValueAt(indiceFila, 0);
                        boolean estado = false;
                        if ((TblGenerica.getValueAt(indiceFila, 2).equals("Inactivo"))) {
                            estado = true;
                        }
                        bdPracticante.ModificarPracticante(new Practicante(num, txtNombre.getText(), estado));
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe seleccionar un item.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                }
                if (eliminado) {
                    bdPracticante.consultarPracticante(TblGenerica, true);
                } else {
                    bdPracticante.consultarPracticante(TblGenerica, false);
                }
                break;
                //</editor-fold>
            case 4:
                //<editor-fold defaultstate="collapsed" desc="Población">
                ADPoblacion bdPoblacion = new ADPoblacion();
                if (accion == 1) {//agregar
                    String nombre = txtNombre.getText();
                    String institucion = txtVariable.getText();
                    if (nombre.equals("") || nombre.equals(" ") || institucion.equals("") || institucion.equals(" ")) {
                        JOptionPane.showMessageDialog(null, "No puede dejar espacios en blanco.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    } else {
                        bdPoblacion.InsertarPoblacion(new Poblacion(0, nombre, institucion, rbBecado.isSelected()));
                    }
                } else if (accion == 2) {//modificar
                    int indiceFila = TblGenerica.getSelectedRow();
                    if (indiceFila >= 0) {
                        int num = (int) TblGenerica.getValueAt(indiceFila, 0);
                        String nombre = txtNombre.getText();
                        String institucion = txtVariable.getText();
                        boolean becado = false;
                        if (nombre.equals("") || nombre.equals(" ") || institucion.equals("") || institucion.equals(" ")) {
                            JOptionPane.showMessageDialog(null, "No puede dejar espacios en blanco.", "ERROR", JOptionPane.ERROR_MESSAGE);
                        } else {
                            if ((TblGenerica.getValueAt(indiceFila, 3).toString()).equals("Si")) {
                                becado = true;
                            }
                            bdPoblacion.ModificarPoblacion(new Poblacion(num, nombre, institucion, becado));
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe seleccionar un item.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                }
                bdPoblacion.consultarPoblacion(TblGenerica);
                break;
                //</editor-fold>
            case 5:
                //<editor-fold defaultstate="collapsed" desc="Lugar Atención">
                ADLugarAtencion bdLugar = new ADLugarAtencion();
                if (accion == 1) {//agregar
                    String nombre = txtNombre.getText();
                    if (nombre.equals("") || nombre.equals(" ")) {
                        JOptionPane.showMessageDialog(null, "No puede dejar el nombre en blanco.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    } else {
                        bdLugar.insertarLugarAtencion(new LugarAtencion(0, nombre, false));
                    }
                } else if (accion == 2) {//modificar
                    int indiceFila = TblGenerica.getSelectedRow();
                    if (indiceFila >= 0) {
                        int num = (int) TblGenerica.getValueAt(indiceFila, 0);
                        boolean estado = false;
                        if ((TblGenerica.getValueAt(indiceFila, 2).equals("Inactivo"))) {
                            estado = true;
                        }
                        bdLugar.ModificarLugarAtencion(new LugarAtencion(num, txtNombre.getText(), estado));
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe seleccionar un item.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                }
                if (eliminado) {
                    bdLugar.ConsultarLugaresAtención(TblGenerica, true);
                } else {
                    bdLugar.ConsultarLugaresAtención(TblGenerica, false);
                }
                break;
                //</editor-fold>
            default:
                break;
        }
        txtNombre.setText("");
        panelDatos.setVisible(false);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        accion = 1;
        TblGenerica.clearSelection();
        TitledBorder border = null;
        switch (tipoVentana) {
            case 1: //tipo id
                panelDatos.setVisible(true);
                lblVariable.setVisible(false);
                txtVariable.setVisible(false);
                btnDesactivar.setVisible(false);
                txtNombre.setText("");
                border = BorderFactory.createTitledBorder("Nuevo Tipo de Identificación");
                border.setTitleFont(new Font("Dialog", Font.BOLD, 12));
                panelDatos.setBorder(border);
                rbBecado.setSelected(false);
                break;
            case 2: //doctor
                panelDatos.setVisible(true);
                lblVariable.setVisible(false);
                txtVariable.setVisible(false);
                txtNombre.setText("");
                border = BorderFactory.createTitledBorder("Doctor Nuevo");
                border.setTitleFont(new Font("Dialog", Font.BOLD, 12));
                panelDatos.setBorder(border);
                btnDesactivar.setVisible(false);
                rbBecado.setSelected(false);
                break;
            case 3: //practicante
                panelDatos.setVisible(true);
                lblVariable.setVisible(false);
                txtVariable.setVisible(false);
                txtNombre.setText("");
                border = BorderFactory.createTitledBorder("Practicante Nuevo");
                border.setTitleFont(new Font("Dialog", Font.BOLD, 12));
                panelDatos.setBorder(border);
                btnDesactivar.setVisible(false);
                rbBecado.setSelected(false);
                break;
            case 4: //poblacion
                panelDatos.setVisible(true);
                lblVariable.setVisible(true);
                txtVariable.setVisible(true);
                txtNombre.setText("");
                txtVariable.setText("");
                border = BorderFactory.createTitledBorder("Población Nueva");
                border.setTitleFont(new Font("Dialog", Font.BOLD, 12));
                panelDatos.setBorder(border);
                btnDesactivar.setVisible(false);
                rbBecado.setSelected(false);
                break;
            case 5: //lugar atención
                panelDatos.setVisible(true);
                lblVariable.setVisible(false);
                txtVariable.setVisible(false);
                txtNombre.setText("");
                border = BorderFactory.createTitledBorder("Lugar de Atención Nuevo");
                border.setTitleFont(new Font("Dialog", Font.BOLD, 12));
                panelDatos.setBorder(border);
                btnDesactivar.setVisible(false);
                rbBecado.setSelected(false);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesactivarActionPerformed
        // TODO add your handling code here:
        switch(tipoVentana) {
            case 1: //Tipo id
                //nada
                break;
            case 2: //Doctor
                ADDoctor bdDoctor = new ADDoctor();
                if (eliminado) {
                    int indiceFila = TblGenerica.getSelectedRow();
                    if (indiceFila >= 0) {
                        int num = (int) TblGenerica.getValueAt(indiceFila, 0);
                        bdDoctor.ModificarDoctor(new Doctor(num, txtNombre.getText(), false));
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe seleccionar un item.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                    //bdDoctor.consultarDoctoresEliminados(TblGenerica);
                    bdDoctor.consultarDoctor(TblGenerica, true);
                } else {
                    int indiceFila = TblGenerica.getSelectedRow();
                    if (indiceFila >= 0) {
                        int num = (int) TblGenerica.getValueAt(indiceFila, 0);
                        bdDoctor.ModificarDoctor(new Doctor(num, txtNombre.getText(), true));
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe seleccionar un item.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                    //bdDoctor.consultarDoctoresActivos(TblGenerica);
                    bdDoctor.consultarDoctor(TblGenerica, false);
                }
                break;
            case 3: // practicante
                ADPracticante bdPracticante = new ADPracticante();
                if (eliminado) {
                    int indiceFila = TblGenerica.getSelectedRow();
                    if (indiceFila >= 0) {
                        int num = (int) TblGenerica.getValueAt(indiceFila, 0);
                        bdPracticante.ModificarPracticante(new Practicante(num, txtNombre.getText(), false));
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe seleccionar un item.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                    bdPracticante.consultarPracticante(TblGenerica, true);
                } else {
                    int indiceFila = TblGenerica.getSelectedRow();
                    if (indiceFila >= 0) {
                        int num = (int) TblGenerica.getValueAt(indiceFila, 0);
                        bdPracticante.ModificarPracticante(new Practicante(num, txtNombre.getText(), true));
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe seleccionar un item.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                    bdPracticante.consultarPracticante(TblGenerica, false);
                }
                break;
            case 4: //población
                //nada
                break;
            case 5: //lugar atención
                ADLugarAtencion bdLugar = new ADLugarAtencion();
                if (eliminado) {
                    int indiceFila = TblGenerica.getSelectedRow();
                    if (indiceFila >= 0) {
                        int num = (int) TblGenerica.getValueAt(indiceFila, 0);
                        bdLugar.ModificarLugarAtencion(new LugarAtencion(num, txtNombre.getText(), false));
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe seleccionar un item.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                    //bdDoctor.consultarDoctoresEliminados(TblGenerica);
                    bdLugar.ConsultarLugaresAtención(TblGenerica, true);
                } else {
                    int indiceFila = TblGenerica.getSelectedRow();
                    if (indiceFila >= 0) {
                        int num = (int) TblGenerica.getValueAt(indiceFila, 0);
                        bdLugar.ModificarLugarAtencion(new LugarAtencion(num, txtNombre.getText(), true));
                    } else {
                        JOptionPane.showMessageDialog(null, "Debe seleccionar un item.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                    //bdDoctor.consultarDoctoresActivos(TblGenerica);
                    bdLugar.ConsultarLugaresAtención(TblGenerica, false);
                }
                break;
            default:
                break;
        }
        panelDatos.setVisible(false);
    }//GEN-LAST:event_btnDesactivarActionPerformed

    private void btnCargarEliminadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarEliminadosActionPerformed
        // TODO add your handling code here:
        switch(tipoVentana) {
            case 1: //Tipo id
                //nada
                break;
            case 2: //Doctor
                if (eliminado) {
                    consultarDoctoresActivos();
                    btnCargarEliminados.setText("Cargar Eliminados");
                    txtNombre.setText("");
                } else {
                    consultarDoctoresEliminados();
                    btnCargarEliminados.setText("Cargar Activos");
                    txtNombre.setText("");
                }
                break;
            case 3: // Practicante
                if (eliminado) {
                    consultarPracticantesActivos();
                    btnCargarEliminados.setText("Cargar Eliminados");
                    txtNombre.setText("");
                } else {
                    consultarPracticantesEliminados();
                    btnCargarEliminados.setText("Cargar Activos");
                    txtNombre.setText("");
                }
                break;
            case 4: // Población
                //nada
                break;
            case 5: // Lugar de Atención
                if (eliminado) {
                    consultarLugaresActivos();
                    btnCargarEliminados.setText("Cargar Eliminados");
                    txtNombre.setText("");
                } else {
                    consultarLugaresEliminados();
                    btnCargarEliminados.setText("Cargar Activos");
                    txtNombre.setText("");
                }
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnCargarEliminadosActionPerformed

    private void consultarTodosTipoId() {
        TableColumn column = TblGenerica.getColumn("Title 3");
        TblGenerica.removeColumn(column);
        TableColumn column2 = TblGenerica.getColumn("Title4");
        TblGenerica.removeColumn(column2);
        ADTipoIdentificacion bd = new ADTipoIdentificacion();
        bd.ConsultarTipoIdentificacion(TblGenerica);
    }
    
    private void consultarDoctoresActivos() {
        if (primeraVez) {
            TableColumn column = TblGenerica.getColumn("Title 3");
            TblGenerica.removeColumn(column);
            column.setHeaderValue("Estado");//Eliminado
            TblGenerica.addColumn(column);
            TableColumn column2 = TblGenerica.getColumn("Title4");
            TblGenerica.removeColumn(column2);
        }
        ADDoctor bd = new ADDoctor();
        //bd.consultarDoctoresActivos(TblGenerica);
        bd.consultarDoctor(TblGenerica, false);
        eliminado = false;
        btnDesactivar.setText("Eliminar");
    }
    
    private void consultarDoctoresEliminados() {
        ADDoctor bd = new ADDoctor();
        //bd.consultarDoctoresEliminados(TblGenerica);
        bd.consultarDoctor(TblGenerica, true);
        eliminado = true;
        btnDesactivar.setText("Activar");
    }
    
    private void consultarPracticantesActivos() {
        if (primeraVez) {
            TableColumn column = TblGenerica.getColumn("Title 3");
            TblGenerica.removeColumn(column);
            column.setHeaderValue("Estado");//Eliminado
            TblGenerica.addColumn(column);
            TableColumn column2 = TblGenerica.getColumn("Title4");
            TblGenerica.removeColumn(column2);
        }
        ADPracticante bd = new ADPracticante();
        //bd.consultarDoctoresActivos(TblGenerica);
        bd.consultarPracticante(TblGenerica, false);
        eliminado = false;
        btnDesactivar.setText("Eliminar");
    }
    
    private void consultarPracticantesEliminados() {
        ADPracticante bd = new ADPracticante();
        bd.consultarPracticante(TblGenerica, true);
        eliminado = true;
        btnDesactivar.setText("Activar");
        //bd.consultarPracticante(TblGenerica);
    }
    
    private void consultarPoblaciones() {
        TableColumn column = TblGenerica.getColumn("Title 3");
        TblGenerica.removeColumn(column);
        column.setHeaderValue("Institución");
        TblGenerica.addColumn(column);
        
        TableColumn column2 = TblGenerica.getColumn("Title4");
        TblGenerica.removeColumn(column2);
        column2.setHeaderValue("Becado");//Ver si es necesario incluirlo en la tabla
        TblGenerica.addColumn(column2);
        
        ADPoblacion bd = new ADPoblacion();
        bd.consultarPoblacion(TblGenerica);
    }
    
    private void consultarLugaresActivos() {
        if (primeraVez) {
            TableColumn column = TblGenerica.getColumn("Title 3");
            TblGenerica.removeColumn(column);
            column.setHeaderValue("Estado");//Eliminado
            TblGenerica.addColumn(column);
            TableColumn column2 = TblGenerica.getColumn("Title4");
            TblGenerica.removeColumn(column2);
        }
        ADLugarAtencion bd = new ADLugarAtencion();
        //bd.consultarDoctoresActivos(TblGenerica);
        bd.ConsultarLugaresAtención(TblGenerica, false);
        eliminado = false;
        btnDesactivar.setText("Eliminar");
    }
    
    private void consultarLugaresEliminados() {
        ADLugarAtencion bd = new ADLugarAtencion();
        //bd.consultarDoctoresEliminados(TblGenerica);
        bd.ConsultarLugaresAtención(TblGenerica, true);
        eliminado = true;
        btnDesactivar.setText("Activar");
    }
    
//    private void consultarLugaresAtencion() {
//        TableColumn column = TblGenerica.getColumn("Title 3");
//        TblGenerica.removeColumn(column);
//        column.setHeaderValue("Descripción");//Ver si es necesario incluirlo en la tabla
//        TblGenerica.addColumn(column);
//        
//        TableColumn column2 = new TableColumn();
//        column2.setHeaderValue("Eliminado");
//        TblGenerica.addColumn(column2);
//        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
//        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
//        TblGenerica.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
//        
//        ADLugarAtencion bd = new ADLugarAtencion();
//        //bd.consultarLugarAtencion(TblGenerica);
//    }
    
    private void centrarColumans() {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        TblGenerica.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        TblGenerica.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        TblGenerica.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        TblGenerica.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblGenerica;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCargarEliminados;
    private javax.swing.JButton btnDesactivar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblVariable;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JRadioButton rbBecado;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtVariable;
    // End of variables declaration//GEN-END:variables
}
