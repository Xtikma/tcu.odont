/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Herramientas.MetodosBusqueda;
import AccesoDatos.*;
import Entidades.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
    private final CrearConsulta origen;
    private List<Paciente> pacientes;
    private List<Poblacion> poblaciones;
    private List<Categoria> categorias;
    private List<Doctor> doctores;
    private List<Practicante> practicantes;
    private Categoria categoria;
    private boolean desactivado = true;
    private boolean busquedaActiva = false;
    
    
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
    
    private void cargarPacientesLista(ArrayList<Paciente> lista) {
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Identificación");
            model.addColumn("Nombre paciente");
            model.addColumn("Edad");
            model.addColumn("Carné");
            String fila[] = new String[4];
            if (lista != null) {
                for (Paciente p : lista) {
                    fila[0] = p.getValorIdentificacion();
                    fila[1] = "" + p.getNombre() + " " + p.getPrimerApellido();;
                    fila[2] = "" + p.getEdad();
                    fila[3] = "" + p.getCarne();
                    model.addRow(fila);
                }
                tblGenerica.setModel(model);
            }
        }
    
    // </editor-fold>  
    
    // <editor-fold desc=" Metodos con Doctor ">
    
    private void cargarDoctores() {
        boxClasificacion.setEnabled(false);
        boxClasificacion.setVisible(false);
        accessDoctor = new ADDoctor();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id.");
        model.addColumn("Nombre");
        model.addColumn("Estado");
        tblGenerica.setModel(model);
        accessDoctor.consultarDoctor(tblGenerica, false);
        crearListaDoctores();
    }

    private void crearListaDoctores() {
        int fin = tblGenerica.getRowCount();
        doctores = new ArrayList<Doctor>();
        for (int i = 0; i < fin; i++) {
            doctores.add(new Doctor(
                    Integer.parseInt(tblGenerica.getValueAt(i, 0).toString()),
                    tblGenerica.getValueAt(i, 1).toString(), false));
        }
        
    }
    
    private void cargarDoctoresLista(ArrayList<Doctor> lista) {

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id.");
        model.addColumn("Nombre");
        model.addColumn("Estado");

        String fila[] = new String[3];

        if (lista != null) {
            for (Doctor d : lista) {
                fila[0] = d.getIdDoctor() + "";
                fila[1] = "" + d.getNombre();
                fila[2] = "Activo";
                model.addRow(fila);
            }
            tblGenerica.setModel(model);
        }
    }
    // </editor-fold>
    
    // <editor-fold desc=" Metodos con Practicantes ">
    
    private void cargarPracticantes() {
        boxClasificacion.setEnabled(false);
        boxClasificacion.setVisible(false);
        accessPracticante = new ADPracticante();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id.");
        model.addColumn("Nombre");
        model.addColumn("Estado");
        tblGenerica.setModel(model);
        accessPracticante.consultarPracticante(tblGenerica, false);
        crearListaPracticantes();
    }

    private void crearListaPracticantes() {
        int fin = tblGenerica.getRowCount();
        practicantes = new ArrayList<Practicante>();
        for (int i = 0; i < fin; i++) {
            practicantes.add(new Practicante(
                    Integer.parseInt(tblGenerica.getValueAt(i, 0).toString()),
                    tblGenerica.getValueAt(i, 1).toString(), false));
        }
    }
    
    private void cargarPracticantesLista(ArrayList<Practicante> lista) {

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Id.");
        model.addColumn("Nombre");
        model.addColumn("Estado");

        String fila[] = new String[3];

        if (lista != null) {
            for (Practicante p : lista) {
                fila[0] = p.getIdPracticante() + "";
                fila[1] = "" + p.getNombre();
                fila[2] = "Activo";
                model.addRow(fila);
            }
            tblGenerica.setModel(model);
        }
    }
    // </editor-fold>
    
    // <editor-fold desc=" Metodos con Procedimientos ">
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
        int indCat = boxClasificacion.getSelectedIndex();
        if (indCat >= 0) {
            categoria = categorias.get(indCat);
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
    }
        
        private void cargarProcedimientosLista(ArrayList<Procedimiento> lista) {
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Nombre");
            model.addColumn("Precio");
            String fila[] = new String[2];
            if (lista != null) {
                for (Procedimiento p : lista) {
                    fila[0] = p.getNombre();
                    fila[1] = "" + p.getPrecio();
                    model.addRow(fila);
                }
                tblGenerica.setModel(model);
            }
        }
    
    // </editor-fold>
    
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
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

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

        boxClasificacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxClasificacionItemStateChanged(evt);
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

    // <editor-fold desc=" Metodos genericos ">
    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        MetodosBusqueda search = new MetodosBusqueda();
        String criterio = txtBuscar.getText().trim();
        switch(mostrando){
            case 0://Paciente
                if (txtBuscar.getText().length() > 0) {
                    cargarPacientesLista(search.BuscarPacientes(criterio, (ArrayList<Paciente>) pacientes)); 
                }
                if (txtBuscar.getText().length() == 0) {
                    cargarPacientesLista((ArrayList<Paciente>) pacientes);
                }
                break;
            case 1://Doctor
                if (txtBuscar.getText().length() > 0) {
                    cargarDoctoresLista(search.BuscarDoctores(criterio, (ArrayList<Doctor>)doctores));
                }
                if (txtBuscar.getText().length() == 0) {
                    cargarDoctoresLista((ArrayList<Doctor>) doctores);
                }
                break;
            case 2://practicante
                if (txtBuscar.getText().length() > 0) {
                    cargarPracticantesLista(search.BuscarPracticantes(criterio, (ArrayList<Practicante>)practicantes));
                }
                if (txtBuscar.getText().length() == 0) {
                    cargarPracticantesLista((ArrayList<Practicante>) practicantes);
                }
                break;
            case 3://Procedimientos
                
                if (txtBuscar.getText().length() > 0) {
                    cargarProcedimientosLista(search.BuscarProcedimientos(criterio, (ArrayList<Categoria>)categorias));
                    busquedaActiva = true;
                }
                if (txtBuscar.getText().length() == 0) {
                    cargarTblProcedimientos();
                    busquedaActiva = false;
                }
                break;
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

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
                    if (busquedaActiva == false) {
                        Categoria temp = categorias.get(boxClasificacion.getSelectedIndex());
                        Procedimiento selecto = temp.getProcedimientos().get(tblGenerica.getSelectedRow());
                        origen.setProcedimiento(selecto);
                        this.dispose();
                    }else{
                        for (Categoria ct : categorias) {
                            for (Procedimiento p : ct.getProcedimientos()) {
                                if (p.getNombre().equals(
                                        tblGenerica.getValueAt(selected, 0)) == true) {
                                    origen.setProcedimiento(p);
                                    this.dispose();
                                }
                            }
                        }
                        
                    }
                                       
            }
        }
    }//GEN-LAST:event_tblGenericaMouseClicked

    private void boxClasificacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxClasificacionItemStateChanged
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
    }//GEN-LAST:event_boxClasificacionItemStateChanged

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        origen.deslimitarVentanas();
    }//GEN-LAST:event_formWindowClosing
    
    private void DefinirTema(){
        try {
            JFrame.setDefaultLookAndFeelDecorated(true);
            SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.OfficeBlue2007Skin");
        } catch (Exception e) {
            Herramientas.InformeErrores.getInforme().escribirError(e, "VentanaBusqueda", "DefinirTema");
        }
    }
    
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
