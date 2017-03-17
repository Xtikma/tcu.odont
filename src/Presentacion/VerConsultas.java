/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Herramientas.Periodo;
import Herramientas.MetodosBusqueda;
import AccesoDatos.ADConsulta;
import Entidades.Consulta;
import com.toedter.calendar.JDateChooser;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alejandra
 */
public class VerConsultas extends javax.swing.JPanel {

    /**
     * Creates new form VerConsultas
     */
    private Date fechaActual;
    private String fechaDesde;
    private String fechaHasta;
    private Menu menu = null;

    private SimpleDateFormat Formato = new SimpleDateFormat("yyyy-MM-dd");
    private ArrayList<Consulta> lista;
    private CrearConsulta consulta = null;
    MetodosBusqueda search = new MetodosBusqueda();

    public VerConsultas(Menu menu) {
        initComponents();
        this.menu = menu;

        String[] semestre = new String[2];
        
        Periodo p = new Periodo();
        String fecha =Calendar.getInstance().get(Calendar.YEAR)+
                "-"+Calendar.getInstance().get(Calendar.MONTH)+
                "-"+Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        semestre = p.identificarSemestre(fecha);
        fechaDesde = semestre[0];
        fechaHasta = semestre[1];
        listarConsultas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBuscar = new javax.swing.JPanel();
        fechaInicio = new javax.swing.JLabel();
        fechaFin = new javax.swing.JLabel();
        jDate_Desde = new com.toedter.calendar.JDateChooser();
        jDate_Hasta = new com.toedter.calendar.JDateChooser();
        jText_Buscar = new javax.swing.JTextField();
        jBuscarPeriodo = new javax.swing.JButton();
        lbBusqueda = new javax.swing.JLabel();
        JPanel_ListaConsulta = new javax.swing.JPanel();
        jScroll_ListaConsultas = new javax.swing.JScrollPane();
        jT_ListarConsultas = new javax.swing.JTable() {
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        jBRegresar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Consultas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        setMaximumSize(new java.awt.Dimension(1000, 500));
        setMinimumSize(new java.awt.Dimension(1000, 500));
        setOpaque(false);

        PanelBuscar.setOpaque(false);

        fechaInicio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        fechaInicio.setText("Desde:");

        fechaFin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        fechaFin.setText("Hasta:");

        jDate_Desde.setDateFormatString("yyyy-MM-dd");
        jDate_Desde.setMaximumSize(new java.awt.Dimension(130, 35));
        jDate_Desde.setMinimumSize(new java.awt.Dimension(130, 35));
        jDate_Desde.setPreferredSize(new java.awt.Dimension(130, 35));

        jDate_Hasta.setDateFormatString("yyyy-MM-dd");
        jDate_Hasta.setMaximumSize(new java.awt.Dimension(130, 35));
        jDate_Hasta.setMinimumSize(new java.awt.Dimension(130, 35));
        jDate_Hasta.setPreferredSize(new java.awt.Dimension(130, 35));

        jText_Buscar.setMaximumSize(new java.awt.Dimension(250, 35));
        jText_Buscar.setMinimumSize(new java.awt.Dimension(250, 35));
        jText_Buscar.setPreferredSize(new java.awt.Dimension(250, 35));
        jText_Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jText_BuscarKeyReleased(evt);
            }
        });

        jBuscarPeriodo.setText("Buscar Período");
        jBuscarPeriodo.setMaximumSize(new java.awt.Dimension(120, 35));
        jBuscarPeriodo.setMinimumSize(new java.awt.Dimension(120, 35));
        jBuscarPeriodo.setPreferredSize(new java.awt.Dimension(120, 35));
        jBuscarPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarPeriodoActionPerformed(evt);
            }
        });

        lbBusqueda.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbBusqueda.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbBusqueda.setText("Busqueda:");

        javax.swing.GroupLayout PanelBuscarLayout = new javax.swing.GroupLayout(PanelBuscar);
        PanelBuscar.setLayout(PanelBuscarLayout);
        PanelBuscarLayout.setHorizontalGroup(
            PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarLayout.createSequentialGroup()
                .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBuscarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbBusqueda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jText_Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBuscarLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(fechaInicio)
                        .addGap(18, 18, 18)
                        .addComponent(jDate_Desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153)
                        .addComponent(fechaFin)
                        .addGap(18, 18, 18)
                        .addComponent(jDate_Hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(jBuscarPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        PanelBuscarLayout.setVerticalGroup(
            PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jDate_Hasta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBuscarPeriodo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDate_Desde, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fechaFin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        JPanel_ListaConsulta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista Consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        JPanel_ListaConsulta.setOpaque(false);

        jT_ListarConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Fecha Consulta", "Nombre Paciente", "Identificador ", "Carne", "Doctor", "Practicante", "Lugar", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jT_ListarConsultas.setOpaque(false);
        jT_ListarConsultas.getTableHeader().setReorderingAllowed(false);
        jScroll_ListaConsultas.setViewportView(jT_ListarConsultas);

        javax.swing.GroupLayout JPanel_ListaConsultaLayout = new javax.swing.GroupLayout(JPanel_ListaConsulta);
        JPanel_ListaConsulta.setLayout(JPanel_ListaConsultaLayout);
        JPanel_ListaConsultaLayout.setHorizontalGroup(
            JPanel_ListaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_ListaConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScroll_ListaConsultas)
                .addContainerGap())
        );
        JPanel_ListaConsultaLayout.setVerticalGroup(
            JPanel_ListaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_ListaConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScroll_ListaConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBRegresar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBRegresar.setForeground(new java.awt.Color(255, 0, 0));
        jBRegresar.setText("<< Regresar");
        jBRegresar.setMaximumSize(new java.awt.Dimension(135, 35));
        jBRegresar.setMinimumSize(new java.awt.Dimension(135, 35));
        jBRegresar.setPreferredSize(new java.awt.Dimension(135, 35));
        jBRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegresarActionPerformed(evt);
            }
        });

        jBModificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBModificar.setText("Modificar");
        jBModificar.setMaximumSize(new java.awt.Dimension(135, 35));
        jBModificar.setMinimumSize(new java.awt.Dimension(135, 35));
        jBModificar.setPreferredSize(new java.awt.Dimension(135, 35));
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.setMaximumSize(new java.awt.Dimension(135, 35));
        jBEliminar.setMinimumSize(new java.awt.Dimension(135, 35));
        jBEliminar.setPreferredSize(new java.awt.Dimension(135, 35));
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPanel_ListaConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jBRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(PanelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(JPanel_ListaConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBuscarPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarPeriodoActionPerformed
        // TODO add your handling code here:
        fechaDesde = getFecha(jDate_Desde);
        fechaHasta = getFecha(jDate_Hasta);

        listarConsultas();

    }//GEN-LAST:event_jBuscarPeriodoActionPerformed

    private void jBRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegresarActionPerformed
        menu.intercambiarPaneles(0);
    }//GEN-LAST:event_jBRegresarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        int indiceFila = jT_ListarConsultas.getSelectedRow();
        if (indiceFila >= 0) {          
            consulta = new CrearConsulta(lista.get(indiceFila), menu);
            consulta.setSize(1000, 500);
            consulta.setLocation(0, 0);
            consulta.setVisible(true);
            menu.insertarPanel(consulta);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una consulta.", "Advertencia", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        int indiceFila = jT_ListarConsultas.getSelectedRow();
        
        if (indiceFila >= 0) {
            ADConsulta bd = new ADConsulta();
            boolean resultado = bd.eliminarConsulta(lista.get(indiceFila).getIdConsulta());
            if (resultado == true) {
                JOptionPane.showMessageDialog(null, "Se ha eliminado la consulta requerida.", "Operación exitosa", JOptionPane.INFORMATION_MESSAGE);
                listarConsultas();
            }else{
                JOptionPane.showMessageDialog(null, "No se ha eliminado la consulta.", "Operación fallida", JOptionPane.ERROR_MESSAGE);
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una consulta.", "Advertencia", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jText_BuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jText_BuscarKeyReleased
        String criterio = jText_Buscar.getText().trim();
        if (criterio.length() == 0) {
            cargarLista(this.lista);
        }else{
            cargarLista(search.BuscarConsultas(criterio, this.lista));
        }
    }//GEN-LAST:event_jText_BuscarKeyReleased
    /**
     * Carga de manera inicial y al aplicar un filtro de fechas la lista
     */
    private void listarConsultas() {
        ADConsulta bd = new ADConsulta();
        lista = bd.listarConsultasArray(fechaDesde, fechaHasta);
        cargarLista(lista);
    }
    
    /**
     * Carga una lista recibida en la tabla de consultas (ya se una filtrada por
     * fechas o por busqueda)
     * @param lista consultas que coincidan con el filtro escogido
     */
    private void cargarLista(ArrayList<Consulta> lista){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Fecha");
        model.addColumn("Nombre Paciente");
        model.addColumn("Identificador");
        model.addColumn("Carne");
        model.addColumn("Doctor");
        model.addColumn("Practicante");
        model.addColumn("Lugar");
        model.addColumn("Total");
        String fila[] = new String[9];
        if (lista != null) {
            for (Consulta p : lista) {
                fila[0] = "" + p.getIdConsulta();
                fila[1] = "" + p.getFechaConsulta();
                fila[2] = "" + p.getPaciente().getNombre() + " "
                        + p.getPaciente().getPrimerApellido() + " "
                        + p.getPaciente().getSegundoApellido();
                fila[3] = "" + p.getPaciente().getValorIdentificacion();
                fila[4] = "" + p.getPaciente().getCarne();
                fila[5] = "" + p.getDoctor().getNombre();
                if (p.getPracticante() != null) {
                    fila[6] = "" + p.getPracticante().getNombre();
                }else{
                    fila[6] = "";
                }                
                fila[7] = "" + p.getLugar().getLugar();
                fila[8] = "" + p.getTotalConsulta();
                model.addRow(fila);
            }
            jT_ListarConsultas.setModel(model);

        }
        centrarColumans();
    }
        /** centrarColumnas
     * Centra el contenido de las celdas en la tabla
     */
    private void centrarColumans() {
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        jT_ListarConsultas.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jT_ListarConsultas.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        jT_ListarConsultas.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        jT_ListarConsultas.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        jT_ListarConsultas.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        jT_ListarConsultas.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
        jT_ListarConsultas.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);
        jT_ListarConsultas.getColumnModel().getColumn(7).setCellRenderer(centerRenderer);
    }

    public String getFecha(JDateChooser jd) {
        if (jd.getDate() != null) {
            return Formato.format(jd.getDate());
        } else {
            return null;
        }
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel_ListaConsulta;
    private javax.swing.JPanel PanelBuscar;
    private javax.swing.JLabel fechaFin;
    private javax.swing.JLabel fechaInicio;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBRegresar;
    private javax.swing.JButton jBuscarPeriodo;
    private com.toedter.calendar.JDateChooser jDate_Desde;
    private com.toedter.calendar.JDateChooser jDate_Hasta;
    private javax.swing.JScrollPane jScroll_ListaConsultas;
    private javax.swing.JTable jT_ListarConsultas;
    private javax.swing.JTextField jText_Buscar;
    private javax.swing.JLabel lbBusqueda;
    // End of variables declaration//GEN-END:variables
}
