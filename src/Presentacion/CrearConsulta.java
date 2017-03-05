/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import AccesoDatos.*;
import Entidades.*;
import com.toedter.calendar.JDateChooser;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Keylor
 */

public class CrearConsulta extends javax.swing.JPanel{

    //Variables para proteger modificación de Chooser
    private boolean consume = false;
    private Practicante practicante;
    private Doctor doctor;
    private Paciente paciente;
    private LugarAtencion lugar;
    private ArrayList<LugarAtencion> lugares;
    private Consulta consulta;
    private ProcedimientoConsulta detalle;
    private double total;
    private boolean isNuevo = false;
    private ADConsulta acceso;
    
    
    
    
    /**
     * Creates new form CrearConsulta
     */
    public CrearConsulta() {
        initComponents();
        consulta = new Consulta();
        cargarLugares();
        isNuevo = true;
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDatePickerUtil1 = new org.jdatepicker.util.JDatePickerUtil();
        panelEncabezado = new javax.swing.JPanel();
        lblPaciente = new javax.swing.JLabel();
        btnPaciente = new javax.swing.JButton();
        lblDoctor = new javax.swing.JLabel();
        btnDoctor = new javax.swing.JButton();
        lblPracticante = new javax.swing.JLabel();
        btnPracticante = new javax.swing.JButton();
        lblPaciente1 = new javax.swing.JLabel();
        boxLugar = new javax.swing.JComboBox<>();
        lblFecha = new javax.swing.JLabel();
        fechaConsulta = new com.toedter.calendar.JDateChooser();
        lblFecha1 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        panelProcedimientos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProcedimientos = new javax.swing.JTable();
        panelDetalle = new javax.swing.JPanel();
        lblProcedimiento = new javax.swing.JLabel();
        btnProcedimiento = new javax.swing.JButton();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardarCambios = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        setMaximumSize(new java.awt.Dimension(1000, 500));
        setMinimumSize(new java.awt.Dimension(1000, 500));
        setOpaque(false);

        panelEncabezado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Encabezado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        panelEncabezado.setOpaque(false);

        lblPaciente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblPaciente.setText("Paciente");

        btnPaciente.setBackground(new java.awt.Color(255, 255, 255));
        btnPaciente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPaciente.setForeground(new java.awt.Color(0, 0, 0));
        btnPaciente.setText("Seleccionar");
        btnPaciente.setMaximumSize(new java.awt.Dimension(200, 30));
        btnPaciente.setMinimumSize(new java.awt.Dimension(200, 30));
        btnPaciente.setPreferredSize(new java.awt.Dimension(200, 30));
        btnPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacienteActionPerformed(evt);
            }
        });

        lblDoctor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblDoctor.setText("Doctor");

        btnDoctor.setBackground(new java.awt.Color(255, 255, 255));
        btnDoctor.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnDoctor.setForeground(new java.awt.Color(0, 0, 0));
        btnDoctor.setText("Seleccionar");
        btnDoctor.setMaximumSize(new java.awt.Dimension(200, 30));
        btnDoctor.setMinimumSize(new java.awt.Dimension(200, 30));
        btnDoctor.setPreferredSize(new java.awt.Dimension(200, 30));
        btnDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorActionPerformed(evt);
            }
        });

        lblPracticante.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblPracticante.setText("Practicante");

        btnPracticante.setBackground(new java.awt.Color(255, 255, 255));
        btnPracticante.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPracticante.setForeground(new java.awt.Color(0, 0, 0));
        btnPracticante.setText("Seleccionar");
        btnPracticante.setMaximumSize(new java.awt.Dimension(200, 30));
        btnPracticante.setMinimumSize(new java.awt.Dimension(200, 30));
        btnPracticante.setPreferredSize(new java.awt.Dimension(200, 30));
        btnPracticante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPracticanteActionPerformed(evt);
            }
        });

        lblPaciente1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblPaciente1.setText("Lugar");

        boxLugar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        boxLugar.setMaximumSize(new java.awt.Dimension(200, 30));
        boxLugar.setMinimumSize(new java.awt.Dimension(200, 30));
        boxLugar.setPreferredSize(new java.awt.Dimension(200, 30));
        boxLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxLugarActionPerformed(evt);
            }
        });

        lblFecha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblFecha.setText("Fecha");

        fechaConsulta.setToolTipText("");
        fechaConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fechaConsultaKeyTyped(evt);
            }
        });

        lblFecha1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblFecha1.setText("Total:");

        txtTotal.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotal.setToolTipText("Total de la consulta.");
        txtTotal.setEnabled(false);
        txtTotal.setMaximumSize(new java.awt.Dimension(200, 30));
        txtTotal.setMinimumSize(new java.awt.Dimension(200, 30));
        txtTotal.setPreferredSize(new java.awt.Dimension(200, 30));

        javax.swing.GroupLayout panelEncabezadoLayout = new javax.swing.GroupLayout(panelEncabezado);
        panelEncabezado.setLayout(panelEncabezadoLayout);
        panelEncabezadoLayout.setHorizontalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelEncabezadoLayout.createSequentialGroup()
                        .addComponent(lblPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(lblPracticante)
                        .addGap(6, 6, 6)
                        .addComponent(btnPracticante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEncabezadoLayout.createSequentialGroup()
                        .addComponent(lblDoctor)
                        .addGap(6, 6, 6)
                        .addComponent(btnDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(lblPaciente1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(89, 89, 89)
                .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEncabezadoLayout.createSequentialGroup()
                        .addComponent(lblFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelEncabezadoLayout.createSequentialGroup()
                        .addComponent(lblFecha1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelEncabezadoLayout.setVerticalGroup(
            panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEncabezadoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPracticante)
                            .addComponent(btnPracticante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPaciente)
                            .addComponent(btnPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblFecha)
                        .addComponent(fechaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEncabezadoLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblDoctor))
                    .addGroup(panelEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(boxLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPaciente1)
                        .addComponent(lblFecha1)
                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelProcedimientos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Procedimientos en consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        panelProcedimientos.setOpaque(false);

        tblProcedimientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Procedimiento", "Precio Unit.", "Cantidad", "SubTotal"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tblProcedimientos.setToolTipText("");
        tblProcedimientos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblProcedimientos);
        if (tblProcedimientos.getColumnModel().getColumnCount() > 0) {
            tblProcedimientos.getColumnModel().getColumn(0).setResizable(false);
            tblProcedimientos.getColumnModel().getColumn(1).setResizable(false);
            tblProcedimientos.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout panelProcedimientosLayout = new javax.swing.GroupLayout(panelProcedimientos);
        panelProcedimientos.setLayout(panelProcedimientosLayout);
        panelProcedimientosLayout.setHorizontalGroup(
            panelProcedimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProcedimientosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelProcedimientosLayout.setVerticalGroup(
            panelProcedimientosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProcedimientosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelDetalle.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle de consulta", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        panelDetalle.setOpaque(false);

        lblProcedimiento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblProcedimiento.setText("Agregar procedimiento:");

        btnProcedimiento.setBackground(new java.awt.Color(255, 255, 255));
        btnProcedimiento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnProcedimiento.setForeground(new java.awt.Color(0, 0, 0));
        btnProcedimiento.setText("Seleccionar");
        btnProcedimiento.setMaximumSize(new java.awt.Dimension(200, 30));
        btnProcedimiento.setMinimumSize(new java.awt.Dimension(200, 30));
        btnProcedimiento.setPreferredSize(new java.awt.Dimension(200, 30));
        btnProcedimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcedimientoActionPerformed(evt);
            }
        });

        lblCantidad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblCantidad.setText("Cantidad:");

        txtCantidad.setToolTipText("Ingrese el número de procedimientos realizado");
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDetalleLayout = new javax.swing.GroupLayout(panelDetalle);
        panelDetalle.setLayout(panelDetalleLayout);
        panelDetalleLayout.setHorizontalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDetalleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDetalleLayout.createSequentialGroup()
                        .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCantidad)
                            .addComponent(lblProcedimiento))
                        .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDetalleLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnProcedimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDetalleLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelDetalleLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        panelDetalleLayout.setVerticalGroup(
            panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDetalleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcedimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblProcedimiento))
                .addGap(14, 14, 14)
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCantidad))
                .addGap(18, 18, 18)
                .addGroup(panelDetalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnEliminar))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        btnGuardarCambios.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGuardarCambios.setText("Guardar Cambios");
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(panelEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelProcedimientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelDetalle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarCambios)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarCambios, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelProcedimientos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fechaConsultaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaConsultaKeyTyped
        if (consume == false) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_fechaConsultaKeyTyped

    private void btnPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacienteActionPerformed
        VentanaBusqueda search = new VentanaBusqueda(0, this);
        search.setLocationRelativeTo(this);
        search.setVisible(true);        
    }//GEN-LAST:event_btnPacienteActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorActionPerformed
        VentanaBusqueda searchPaciente = new VentanaBusqueda(1, this);
        searchPaciente.setLocationRelativeTo(this);
        searchPaciente.setVisible(true);  
    }//GEN-LAST:event_btnDoctorActionPerformed

    private void btnPracticanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPracticanteActionPerformed
        VentanaBusqueda search = new VentanaBusqueda(2, this);
        search.setLocationRelativeTo(this);
        search.setVisible(true);
    }//GEN-LAST:event_btnPracticanteActionPerformed

    private void boxLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxLugarActionPerformed
        int selected = boxLugar.getSelectedIndex();
        this.lugar = lugares.get(selected);
    }//GEN-LAST:event_boxLugarActionPerformed

    private void btnProcedimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcedimientoActionPerformed
        VentanaBusqueda search = new VentanaBusqueda(3, this);
        search.setLocationRelativeTo(this);
        search.setVisible(true); 
    }//GEN-LAST:event_btnProcedimientoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            String cantidad = txtCantidad.getText().trim();
            if (cantidad.length() != 0) {
                boolean existe = false;
                for (int i = 0; i < consulta.getListaProcedimientos().size(); i++) {
                    if (consulta.getListaProcedimientos().get(i).getProcedimiento()
                            .getNombre().equals(detalle.getProcedimiento().getNombre())) {
                        consulta.getListaProcedimientos().get(i).setCantidad(
                                consulta.getListaProcedimientos().get(i).getCantidad() 
                                + Integer.parseInt(cantidad));
                        existe = true;
                    }
                }
                if (existe == false) {
                    detalle.setPrecioHistorico(detalle.getProcedimiento().getPrecio());
                    detalle.setCantidad(Integer.parseInt(cantidad));                
                    consulta.agregarProcedimiento(detalle);
                }                
                cargarDetalles();
                sumarTotal();
                detalle = new ProcedimientoConsulta();
                btnProcedimiento.setText("Seleccionar");
                txtCantidad.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Existe un problema con la información ingresada.", "Error en información ingresada", 1);
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLetter(c)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        try {
            if (fechaConsulta.getDate() != null) {
                Date fecha = fechaConsulta.getDate();
                if (practicante != null && doctor != null && lugar != null
                        && consulta.getListaProcedimientos().size() > 0 && fecha != null) {
                    consulta.setPaciente(paciente);
                    consulta.setDoctor(doctor);
                    consulta.setLugar(lugar);
                    consulta.setFechaConsulta(fecha);

                    if (practicante != null) {
                        consulta.setPracticante(practicante);
                    } else {
                        consulta.setPracticante(null);
                    }

                    acceso = new ADConsulta();
                    boolean exito = acceso.almacenarConsulta(consulta);
                    if (exito == true) {
                        JOptionPane.showMessageDialog(null, "Se ha almacenado con exito la consulta.", "Exito!", JOptionPane.INFORMATION_MESSAGE);
                        limpiarCampos();
                    }
                }
            }else{
                getToolkit().beep();
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha fallado al almacenar la consulta.", "Fallido!", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    public void setPracticante(Practicante prac) {
        this.practicante = prac;
        consulta.setPracticante(practicante);
        btnPracticante.setText(prac.getNombre());
    }

    public void setDoctor(Doctor doc) {
        this.doctor = doc;
        consulta.setDoctor(doctor);
        btnDoctor.setText(doc.getNombre());
    }

    public void setPaciente(Paciente pac) {
        this.paciente = pac;
        consulta.setPaciente(paciente);
        btnPaciente.setText(pac.getNombre() + " " + pac.getPrimerApellido());
    }

    private void cargarLugares(){
        ADLugarAtencion access = new ADLugarAtencion();
        lugares = access.ConsultarLugares(false);
        for (LugarAtencion lu : lugares) {
            boxLugar.addItem(lu.getLugar());
        }
    }
    
    public void setProcedimiento(Procedimiento p){
        detalle = new ProcedimientoConsulta();
        detalle.setProcedimiento(p);
        btnProcedimiento.setText(detalle.getProcedimiento().getNombre());
    }
    
    private void sumarTotal(){
        total = 0;
        for (ProcedimientoConsulta p : consulta.getListaProcedimientos()) {
            total+= (p.getPrecioHistorico() * p.getCantidad());
        }
        txtTotal.setText("₡ " + total);
    }
    
    private void cargarDetalles(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Procedimiento");
        model.addColumn("Precio Unit.");
        model.addColumn("Cantidad");
        model.addColumn("SubTotal");
        String[] fila = new String[4];        
        for (ProcedimientoConsulta detalle : consulta.getListaProcedimientos()) {
            fila[0] = detalle.getProcedimiento().getNombre();
            fila[1] = "₡ " + detalle.getPrecioHistorico();
            fila[2] = "" + detalle.getCantidad();
            fila[3] = "₡ " + detalle.getPrecioHistorico() * detalle.getCantidad();
            model.addRow(fila);
        }
        tblProcedimientos.setModel(model);        
    }
    
    private void limpiarCampos() {
        lugar = null;
        practicante = null;
        paciente = null;
        doctor = null;
        consulta = new Consulta();
        btnDoctor.setText("Seleccionar");
        btnPaciente.setText("Seleccionar");
        btnPracticante.setText("Seleccionar");
        txtTotal.setText("");
        DefaultTableModel model = new DefaultTableModel();
        tblProcedimientos.setModel(model);
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxLugar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnDoctor;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JButton btnPaciente;
    private javax.swing.JButton btnPracticante;
    private javax.swing.JButton btnProcedimiento;
    private com.toedter.calendar.JDateChooser fechaConsulta;
    private org.jdatepicker.util.JDatePickerUtil jDatePickerUtil1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFecha1;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JLabel lblPaciente1;
    private javax.swing.JLabel lblPracticante;
    private javax.swing.JLabel lblProcedimiento;
    private javax.swing.JPanel panelDetalle;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel panelProcedimientos;
    private javax.swing.JTable tblProcedimientos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
