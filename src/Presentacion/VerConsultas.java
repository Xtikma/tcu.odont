/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import AccesoDatos.ADConsulta;
import Entidades.Consulta;
import com.toedter.calendar.JDateChooser;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alejandra
 */
public class VerConsultas extends javax.swing.JPanel {

    /**
     * Creates new form VerConsultas
     */
    Date fechaActual;
    String fechaDesde;
    String fechaHasta;
    private Menu menu = null;

    SimpleDateFormat Formato = new SimpleDateFormat("yyyy-MM-dd");
    private ArrayList<Consulta> lista;
    private CrearConsulta consulta = null;

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

    public VerConsultas() {
        initComponents();
        this.menu = menu;

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
        jBRegresar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();

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
                        .addGap(153, 153, 153)
                        .addComponent(fechaFin)
                        .addGap(18, 18, 18)
                        .addComponent(jDate_Hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(jBuscarPeriodo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelBuscarLayout.createSequentialGroup()
                        .addComponent(jText_Buscar)
                        .addGap(18, 18, 18)
                        .addComponent(jB_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))))
        );
        PanelBuscarLayout.setVerticalGroup(
            PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jText_Buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_Buscar))
                .addGap(15, 15, 15)
                .addGroup(PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fechaInicio, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDate_Desde, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(fechaFin)
                        .addComponent(jDate_Hasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jBuscarPeriodo, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(35, Short.MAX_VALUE))
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
                .addComponent(jScroll_ListaConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, 936, Short.MAX_VALUE)
                .addContainerGap())
        );
        JPanel_ListaConsultaLayout.setVerticalGroup(
            JPanel_ListaConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_ListaConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScroll_ListaConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jBRegresar.setText("<< Regresar");
        jBRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegresarActionPerformed(evt);
            }
        });

        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JPanel_ListaConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PanelBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jBRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBModificar)
                        .addGap(86, 86, 86))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(PanelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBRegresar)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
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
            consulta = new CrearConsulta(lista.get(indiceFila));
            consulta.setSize(1000, 500);
            consulta.setLocation(0, 0);
            consulta.setVisible(true);
            menu.insertarPanel(consulta);

        }


    }//GEN-LAST:event_jBModificarActionPerformed
    private void listarConsultas() {
        ADConsulta bd = new ADConsulta();
        lista = bd.listarConsultasArray(fechaDesde, fechaHasta);
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
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBRegresar;
    private javax.swing.JButton jB_Buscar;
    private javax.swing.JButton jBuscarPeriodo;
    private com.toedter.calendar.JDateChooser jDate_Desde;
    private com.toedter.calendar.JDateChooser jDate_Hasta;
    private javax.swing.JScrollPane jScroll_ListaConsultas;
    private javax.swing.JTable jT_ListarConsultas;
    private javax.swing.JTextField jText_Buscar;
    // End of variables declaration//GEN-END:variables
}
