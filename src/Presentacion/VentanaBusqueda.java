/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import AccesoDatos.*;
import Entidades.*;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author Keylor
 */
public class VentanaBusqueda extends javax.swing.JFrame {
    private ADPaciente accessPaciente;
    private ADDoctor accessDoctor;
    private ADPracticante accessPracticante;
    private ADCategoria accessCategoria;
    private ADPoblacion accessPoblacion;
    private int idCategoria;
    private CrearConsulta origen;
    private List<Paciente> pacientes;
    private List<Poblacion> poblaciones;
    
    private int mostrando;

    /**
     * Creates new form VentanaBusqueda
     */
    public VentanaBusqueda(int modo, int idCat, CrearConsulta ori) {
        initComponents();
        DefinirTema();
        generarTabla(modo);
        idCategoria = idCat;
        origen = ori;
    }

    // <editor-fold desc=" Metodos con pacientes ">
    private void cargarPacientes(){
        accessPaciente = new ADPaciente();
        accessPoblacion = new ADPoblacion();
        pacientes = accessPaciente.ConsultarPacientesActivos();
        poblaciones = accessPoblacion.ConsultarPoblacion();
        
        for (Poblacion poblacion : poblaciones) {
            boxClasificacion.addItem(poblacion.getNombre());
        }
        cargarTblPacientes(boxClasificacion.getSelectedItem().toString().trim());
    }
    
    private void cargarTblPacientes(String idPob){
        tblGenerica.setModel(new DefaultTableModel());
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Identificación");
        model.addColumn("Nombre paciente");
        model.addColumn("Edad");
        model.addColumn("Carné");
        
        String[] fila = new String[4];
        for (Paciente paciente : pacientes) {
            if (paciente.getNombrePoblacion().equals(idPob) == true) {
                fila[0] = paciente.getValorIdentificacion();
                fila[1] = paciente.getNombre() + " " + paciente.getPrimerApellido();
                fila[3] = paciente.getEdad() + "";
                fila[4] = paciente.getCarne() + "";
            }
        }
        tblGenerica.setModel(model);       
    }    
    // </editor-fold>
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTexto = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGenerica = new javax.swing.JTable();
        boxClasificacion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Busqueda");
        setMaximumSize(new java.awt.Dimension(550, 550));
        setMinimumSize(new java.awt.Dimension(550, 550));
        setPreferredSize(new java.awt.Dimension(550, 550));

        lblTexto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTexto.setText("Buscar:");

        txtBuscar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtBuscar.setToolTipText("Ingrese texto que coincida con algun elemento de la lista.");
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        tblGenerica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblGenerica);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTexto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxClasificacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTexto)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        //realiza la busqueda
    }//GEN-LAST:event_txtBuscarKeyReleased
    
    private void DefinirTema(){
        try {
            JFrame.setDefaultLookAndFeelDecorated(true);
            SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.OfficeBlue2007Skin");
        } catch (Exception e) {
            System.out.println("->" + e.getMessage());
        }
    }
    
    
    // <editor-fold desc=" Metodos genericos ">
    private void generarTabla(int modo){
        mostrando = modo;
        
        switch(modo){
            case 0://Paciente
                cargarPacientes();
                break;
            case 1://Doctor
                break;
            case 2://practicante
                break;
            case 3://Procedimientos
                break;              
            
        }
    }
    
    
    // </editor-fold>
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxClasificacion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JTable tblGenerica;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
