/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import AccesoDatos.ADConsulta;
import java.sql.Date;
import java.text.DateFormat;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author Alejandra
 */
public class VerConsultas extends javax.swing.JPanel {

    /**
     * Creates new form VerConsultas
     */
    Date fechaActual;
    String fechaDesde ;
    String fechaHasta;
    DateFormat dt = DateFormat.getDateInstance();
      
    public VerConsultas() {   
        initComponents();
//        fechaDesde =  jDate_Desde.getDateFormatString();
//        fechaHasta = jDate_Hasta.getDateFormatString();
       
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
        jB_Buscar = new javax.swing.JButton();
        jBuscarPeriodo = new javax.swing.JButton();
        JPanel_ListaConsulta = new javax.swing.JPanel();
        jScroll_ListaConsultas = new javax.swing.JScrollPane();
        jT_ListarConsultas = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Consultas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        setMaximumSize(new java.awt.Dimension(1000, 500));
        setMinimumSize(new java.awt.Dimension(1000, 500));
        setOpaque(false);

        fechaInicio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        fechaInicio.setText("Desde:");

        fechaFin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        fechaFin.setText("Hasta:");

        jDate_Desde.setDateFormatString("yyyy-MM-dd");

        jDate_Hasta.setDateFormatString("yyyy-MM-dd");

        jB_Buscar.setText("Buscar");

        jBuscarPeriodo.setText("Buscar Período");
        jBuscarPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarPeriodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBuscarLayout = new javax.swing.GroupLayout(PanelBuscar);
        PanelBuscar.setLayout(PanelBuscarLayout);
        PanelBuscarLayout.setHorizontalGroup(
            PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBuscarLayout.createSequentialGroup()
                        .addComponent(fechaInicio)
                        .addGap(18, 18, 18)
                        .addComponent(jDate_Desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(156, 156, 156)
                        .addComponent(fechaFin)
                        .addGap(18, 18, 18)
                        .addComponent(jDate_Hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(jBuscarPeriodo)
                        .addContainerGap(294, Short.MAX_VALUE))
                    .addGroup(PanelBuscarLayout.createSequentialGroup()
                        .addComponent(jText_Buscar)
                        .addGap(18, 18, 18)
                        .addComponent(jB_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))))
        );
        PanelBuscarLayout.setVerticalGroup(
            PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Buscar))
                .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelBuscarLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jDate_Hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fechaFin))
                            .addGroup(PanelBuscarLayout.createSequentialGroup()
                                .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fechaInicio)
                                    .addComponent(jDate_Desde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1))))
                    .addGroup(PanelBuscarLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jBuscarPeriodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        JPanel_ListaConsulta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista Consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        jT_ListarConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Nombre Paciente", "Identificador ", "Doctor", "Practicante", "Lugar", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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
                .addComponent(jScroll_ListaConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPanel_ListaConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(PanelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JPanel_ListaConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBuscarPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarPeriodoActionPerformed
        // TODO add your handling code here:
        
         listarConsultas();
        
    }//GEN-LAST:event_jBuscarPeriodoActionPerformed
   private void listarConsultas() {
     fechaDesde = "2001-02-10";
     fechaHasta = "2001-03-10";
    
       ADConsulta bd = new ADConsulta();
        bd.listarConsultas(jT_ListarConsultas, fechaDesde,fechaHasta);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel_ListaConsulta;
    private javax.swing.JPanel PanelBuscar;
    private javax.swing.JLabel fechaFin;
    private javax.swing.JLabel fechaInicio;
    private javax.swing.JButton jB_Buscar;
    private javax.swing.JButton jBuscarPeriodo;
    private com.toedter.calendar.JDateChooser jDate_Desde;
    private com.toedter.calendar.JDateChooser jDate_Hasta;
    private javax.swing.JScrollPane jScroll_ListaConsultas;
    private javax.swing.JTable jT_ListarConsultas;
    private javax.swing.JTextField jText_Buscar;
    // End of variables declaration//GEN-END:variables
}
