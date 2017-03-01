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
import javax.swing.JOptionPane;
import javax.swing.JTable;
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
    private CrearConsulta origen;
    private List<Paciente> pacientes;
    private List<Poblacion> poblaciones;
    private List<Categoria> categorias;
    private Categoria categoria;
    private boolean desactivado = true;
    
    
    private int mostrando;

    /**
     * Creates new form VentanaBusqueda
     */
    public VentanaBusqueda(int modo, CrearConsulta ori) {
        initComponents();
        DefinirTema();
        generarTabla(modo);
        origen = ori;
    }

    // <editor-fold desc=" Metodos con pacientes ">
    private void cargarPacientes(){
        try {
            accessPaciente = new ADPaciente();
            accessPoblacion = new ADPoblacion();
            pacientes = accessPaciente.ConsultarPacientesActivos();
            poblaciones = accessPoblacion.ConsultarPoblacion();

            if (pacientes.size() > 0) {
                for (Poblacion poblacion : poblaciones) {
                    boxClasificacion.addItem(poblacion.getNombre());
                }
                cargarTblPacientes(boxClasificacion.getSelectedItem().toString().trim());
                desactivado = false;
            }else{
                JOptionPane.showMessageDialog(this, "No hay pacientes agregados", "Lista vacia", 1);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(origen, "Existe un problema con los elementos a consultar.\n"
                    + "Revise que se hayan cargado con anterioridad.", "Problema al cargar elementos", 1);
        }
        
        
    }
    
    private void cargarTblPacientes(String idPob){
        try {
            tblGenerica.setModel(new DefaultTableModel());
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Identificación");
            model.addColumn("Nombre paciente");
            model.addColumn("Edad");
            model.addColumn("Carné");

            String[] fila = new String[4];
            for (Paciente paciente : pacientes) {
                if (paciente.getPoblacion().getNombre().equals(idPob) == true) {
                    fila[0] = paciente.getValorIdentificacion();
                    fila[1] = paciente.getNombre() + " " + paciente.getPrimerApellido();
                    fila[2] = paciente.getEdad() + "";
                    fila[3] = paciente.getCarne() + "";
                    model.addRow(fila);
                }
            }
            tblGenerica.setModel(model);
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }               
    }    
    // </editor-fold>
    
    
    // <editor-fold desc=" Metodos con Doctor ">
    
    private void cargarDoctores(){
        boxClasificacion.setEnabled(false);
        boxClasificacion.setVisible(false);
        accessDoctor = new ADDoctor();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id.");
        model.addColumn("Nombre");
        model.addColumn("Estado");
        tblGenerica.setModel(model);
        accessDoctor.consultarDoctor(tblGenerica, false);        
    }    
    // </editor-fold>
    
    
    // <editor-fold desc=" Metodos con Practicantes ">
    
    private void cargarPracticantes(){
        boxClasificacion.setEnabled(false);
        boxClasificacion.setVisible(false);
        accessPracticante = new ADPracticante();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id.");
        model.addColumn("Nombre");
        model.addColumn("Estado");
        tblGenerica.setModel(model);
        accessPracticante.consultarPracticante(tblGenerica, false);        
    }
    
    // </editor-fold>
    
    // <editor-fold desc=" Metodos con Practicantes ">
        private void cargarProcedimientos(){
            accessCategoria = new ADCategoria();
            categorias = accessCategoria.obtenerCategorias();
            categoria = new Categoria();
            for (Categoria cat : categorias) {
                boxClasificacion.addItem(cat.getNombre());
            }
            cargarTblProcedimientos();
            desactivado = false;
        }
        
        private void cargarTblProcedimientos() {
            categoria = categorias.get(boxClasificacion.getSelectedIndex());
            tblGenerica.setModel(new DefaultTableModel());
            String datos[] = new String[2];
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Nombre");
            model.addColumn("Precio");
            
            if (categoria.getProcedimientos() != null) {
                for (Procedimiento procedimiento : categoria.getProcedimientos()) {
                    datos[0] = procedimiento.getNombre();
                    datos[1] = "" + procedimiento.getPrecio();
                    model.addRow(datos);
                }
                tblGenerica.setModel(model);
            }
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
        tblGenerica = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false;
            }
        };
        boxClasificacion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Busqueda");
        setMaximumSize(new java.awt.Dimension(550, 550));
        setMinimumSize(null);
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

        jScrollPane1.setPreferredSize(new java.awt.Dimension(450, 400));

        tblGenerica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblGenerica.getTableHeader().setReorderingAllowed(false);
        tblGenerica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGenericaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGenerica);

        boxClasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxClasificacionActionPerformed(evt);
            }
        });

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

    private void boxClasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxClasificacionActionPerformed
        if (desactivado == false) {
            switch (mostrando) {
                case 0:
                    cargarTblPacientes(boxClasificacion.getSelectedItem().toString().trim());
                    break;
                    
                case 3://Procedimientos                    
                    cargarTblProcedimientos();
                    break;
                default:
                    break;
            }
        }
        
    }//GEN-LAST:event_boxClasificacionActionPerformed

    private void tblGenericaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGenericaMouseClicked
        int selected = tblGenerica.getSelectedRow();
        if (evt.getClickCount() == 2 && selected >= 0) {
            switch (mostrando) {
                case 0: //Paciente
                    Paciente pac = new Paciente();
                    for (Paciente p : pacientes) {
                        String concat = p.getNombre() + " " + p.getPrimerApellido();
                        if (concat.equals(tblGenerica.getValueAt(selected, 1).toString()) == true) {
                            pac = p;
                        }
                    }
                    origen.setPaciente(pac);
                    this.dispose();
                    break;
                case 1:
                    origen.setDoctor(new Doctor(Integer.parseInt(
                            tblGenerica.getValueAt(selected, 0).toString().trim()),
                            tblGenerica.getValueAt(selected, 1).toString(),
                            true));
                    this.dispose();
                    break;
                case 2:
                    origen.setPracticante(new Practicante(Integer.parseInt(
                            tblGenerica.getValueAt(selected, 0).toString().trim()),
                            tblGenerica.getValueAt(selected, 1).toString(),
                            true));
                    this.dispose();
                    break;
                case 3:
                    Categoria temp  = categorias.get(boxClasificacion.getSelectedIndex());
                    Procedimiento selecto = temp.getProcedimientos().get(tblGenerica.getSelectedRow());
                    origen.setProcedimiento(selecto);
                    this.dispose();                    

            }
        }
    }//GEN-LAST:event_tblGenericaMouseClicked
    
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
                cargarDoctores();
                break;
            case 2://practicante
                cargarPracticantes();
                break;
            case 3://Procedimientos
                cargarProcedimientos();
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
