package Presentacion;

//<editor-fold defaultstate="collapsed" desc="Importaciones">
import AccesoDatos.ADPaciente;
import AccesoDatos.ADPoblacion;
import AccesoDatos.ADTipoIdentificacion;
import Entidades.Paciente;
import Entidades.Poblacion;
import Entidades.TipoIdentificacion;
import java.awt.Component;
import java.awt.Font;
import java.util.Calendar;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import org.jvnet.substance.SubstanceLookAndFeel;
//</editor-fold>

public class VPaciente extends javax.swing.JDialog {

    //<editor-fold defaultstate="collapsed" desc="Declaración de variables">
    private ADPaciente adPaciente = new ADPaciente();
    private ADTipoIdentificacion adTipoId = new ADTipoIdentificacion();
    private ADPoblacion adPoblacion = new ADPoblacion();
    private boolean edicion = false;
    private int idPacienteModificar = 0;
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" Constructores ">
    /** VPaciente Agregar
     * Constructor para agregar un nuevo paciente
     * @param parent 
     * @param modal 
     */
    public VPaciente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        edicion = false;
        initComponents();
        cambiarTitulo("Nuevo Paciente");
        aplicarTema();
        buttonGroup.add(RbMasculino);
        buttonGroup.add(RbFemenino);

        RbMasculino.setSelected(true);
        RbFemenino.setSelected(false);
        
        PanelEstudiante.setVisible(false);

        List<TipoIdentificacion> listaTipoId = adTipoId.ConsultarTipoIdentificacion();
        CbTipoId.setModel(new DefaultComboBoxModel(listaTipoId.toArray()));

        List<Poblacion> listaPoblacion = adPoblacion.ConsultarPoblacion();
        CbPoblacion.setModel(new DefaultComboBoxModel(listaPoblacion.toArray()));

        definirTamanoVentana();
    }

    /** VPaciente Modificar
     * Constructor para modificar o mostrar información de un paciente existente
     * @param parent
     * @param modal
     * @param idPaciente id del paciente a modificar
     * @param editar identificador para saber si se debe modificar o sólo mostrar la información
     */
    public VPaciente(java.awt.Frame parent, boolean modal, int idPaciente, boolean editar) {
        super(parent, modal);
        edicion = true;
        idPacienteModificar = idPaciente;
        initComponents();
        cambiarTitulo("Modificar Paciente");
        aplicarTema();
        buttonGroup.add(RbMasculino);
        buttonGroup.add(RbFemenino);

        //llenar combobox TipoIdentificación
        List<TipoIdentificacion> listaTipoId = adTipoId.ConsultarTipoIdentificacion();
        CbTipoId.setModel(new DefaultComboBoxModel(listaTipoId.toArray()));
        //llenar combobox Población
        List<Poblacion> listaPoblacion = adPoblacion.ConsultarPoblacion();
        CbPoblacion.setModel(new DefaultComboBoxModel(listaPoblacion.toArray()));

        Paciente paciente = adPaciente.ConsultarPacientePorId(idPaciente);
        if (paciente == null) {
            JOptionPane.showMessageDialog(null, "No hay ningún paciente registrado.", "ERROR", JOptionPane.ERROR_MESSAGE);
            edicion = false;
            this.setTitle("Ingresar Nuevo Paciente");
            lblTitulo.setText("Nuevo Paciente");
        } else {
            //llenar campos de texto
            TxtNombre.setText(paciente.getNombre());
            TxtPApellido.setText(paciente.getPrimerApellido());
            TxtsApellido.setText(paciente.getSegundoApellido());
            TxtIdentificacion.setText(paciente.getValorIdentificacion());
            TxtEdad.setText(paciente.getEdad() + "");
            TxtCarne.setText(paciente.getCarne());
            //llenar la fecha de nacimiento
            String texto = paciente.getFechaNacimiento();
            if (texto == null) {
                TxtFechaNacimiento.setEnabled(false);
                RbNoFecha.setSelected(true);
            } else if (texto.matches("\\d\\d\\d\\d-\\d\\d-\\d\\d")) {
                String[] temp = texto.split("-");
                TxtFechaNacimiento.setText(temp[2] + "-" + temp[1] + "-" + temp[0]);
            }
            //seleccionar el tipo de identificación
            TipoIdentificacion tipoId = null;
            for (TipoIdentificacion x : listaTipoId) {
                if (paciente.getNombreTipoId().equals(x.getNombre())) {
                    tipoId = x;
                }
            }
            CbTipoId.setSelectedItem(tipoId);
            //seleccionar la población
            Poblacion poblacion = null;
            for (Poblacion x : listaPoblacion) {
                if (paciente.getNombrePoblacion().equals(x.getNombre())) {
                    poblacion = x;
                }
            }
            CbPoblacion.setSelectedItem(poblacion);
            //seleccionar el sexo
            if ((paciente.getGenero()).equals("Masculino")) {
                RbMasculino.setSelected(true);
                RbFemenino.setSelected(false);
            } else {
                RbMasculino.setSelected(false);
                RbFemenino.setSelected(true);
            }
            //marcar si es becado o no
            if (paciente.getPrimerIngreso()) {
                RbPrimerIngreso.setSelected(true);
            } else {
                RbPrimerIngreso.setSelected(false);
            }
            //seleccionar la beca
            CbBeca.setSelectedIndex(paciente.getBeca());
        }
        definirTamanoVentana();
        if (!editar) {
            bloquearEdicion();
            cambiarTitulo("Paciente");
        }
    }
    //</editor-fold>
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jScrollBar1 = new javax.swing.JScrollBar();
        LblNombre = new javax.swing.JLabel();
        LblPApellido = new javax.swing.JLabel();
        LblSApellido = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        TxtPApellido = new javax.swing.JTextField();
        TxtsApellido = new javax.swing.JTextField();
        CbTipoId = new javax.swing.JComboBox<>();
        TxtIdentificacion = new javax.swing.JTextField();
        RbFemenino = new javax.swing.JRadioButton();
        TxtFechaNacimiento = new javax.swing.JFormattedTextField();
        TxtEdad = new javax.swing.JTextField();
        CbPoblacion = new javax.swing.JComboBox<>();
        RbNoFecha = new javax.swing.JRadioButton();
        PanelEstudiante = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        RbPrimerIngreso = new javax.swing.JRadioButton();
        TxtCarne = new javax.swing.JTextField();
        CbBeca = new javax.swing.JComboBox<>();
        BtnCancelar = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        RbMasculino = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        LblNombre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        LblNombre.setText("Nombre:");

        LblPApellido.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        LblPApellido.setText("Primer Apellido:");

        LblSApellido.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        LblSApellido.setText("Segundo Apellido");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("Tipo de Identificación:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setText("Identificación:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setText("Genero:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setText("Fecha de Nacimiento:");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel11.setText("Edad:");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel13.setText("Población:");

        CbTipoId.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        CbTipoId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        RbFemenino.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        RbFemenino.setText("Femenino");

        try {
            TxtFechaNacimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxtFechaNacimiento.setToolTipText("dd-mm-aaaa");

        CbPoblacion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        CbPoblacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CbPoblacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbPoblacionItemStateChanged(evt);
            }
        });

        RbNoFecha.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        RbNoFecha.setText("No disponible");
        RbNoFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RbNoFechaMouseClicked(evt);
            }
        });

        PanelEstudiante.setBackground(new java.awt.Color(235, 235, 235));
        PanelEstudiante.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estudiante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        PanelEstudiante.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("Carné:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Beca:");

        RbPrimerIngreso.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        RbPrimerIngreso.setText("Primer Ingreso");

        CbBeca.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        CbBeca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));

        javax.swing.GroupLayout PanelEstudianteLayout = new javax.swing.GroupLayout(PanelEstudiante);
        PanelEstudiante.setLayout(PanelEstudianteLayout);
        PanelEstudianteLayout.setHorizontalGroup(
            PanelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEstudianteLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(PanelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEstudianteLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(TxtCarne, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(RbPrimerIngreso))
                    .addGroup(PanelEstudianteLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(CbBeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelEstudianteLayout.setVerticalGroup(
            PanelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEstudianteLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(PanelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtCarne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RbPrimerIngreso))
                .addGap(18, 18, 18)
                .addGroup(PanelEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CbBeca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BtnCancelar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        BtnGuardar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        RbMasculino.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        RbMasculino.setText("Masculino");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setText("Ej: 31-12-2017");

        jLabel3.setText("*");

        jLabel8.setText("*");

        lblTitulo.setText("jLabel10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblPApellido)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(RbMasculino)
                                .addGap(18, 18, 18)
                                .addComponent(RbFemenino))
                            .addComponent(LblSApellido))
                        .addGap(116, 116, 116))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblNombre)
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TxtsApellido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtPApellido)
                            .addComponent(TxtNombre))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(CbPoblacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TxtFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RbNoFecha))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnCancelar)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(265, 265, 265))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(132, 132, 132)))
                            .addComponent(jLabel13))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtIdentificacion, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(TxtEdad)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CbTipoId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblNombre)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LblPApellido)
                        .addComponent(TxtPApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblSApellido)
                    .addComponent(TxtsApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CbTipoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TxtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TxtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(RbFemenino)
                    .addComponent(RbMasculino))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(RbNoFecha)
                    .addComponent(TxtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(CbPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(PanelEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardar)
                    .addComponent(BtnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /** BtnGuardarActionPerformed
     * Guarda los datos ingresados, ya sea un paciente nuevo o una modificación de uno existente
     * @param evt evento
     */
    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        if (validarRequeridos()) {
            //<editor-fold defaultstate="collapsed" desc="Definición del genero">
            String genero = "";
            if (RbFemenino.isSelected()) {
                genero = "Femenino";
            } else if (RbMasculino.isSelected()) {
                genero = "Masculino";
            } else {
                genero = "Desconocido";
            }
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Definición del tipo de beca, primer ingreso y carné">
            Component[] datosPanel = PanelEstudiante.getComponents();
            int beca = 0;
            boolean primerIngreso = false;
            String carne = "";
            for (Component x : datosPanel) {
                if (x instanceof JComboBox) {
                    beca = ((JComboBox) x).getSelectedIndex();
                } else if (x instanceof JRadioButton) {
                    primerIngreso = ((JRadioButton) x).isSelected();
                } else if (x instanceof JTextField) {
                    carne = ((JTextField) x).getText();
                }
            }
            //</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Definición de la edad">
            int edad = 0;
            try {
                if (TxtEdad.getText().equals("") || TxtEdad.getText().equals(" ")) {
                    edad = 0;
                } else {
                    edad = Integer.parseInt(TxtEdad.getText());
                }
            } catch (NumberFormatException numEx) {
                TxtEdad.setText("");
                JOptionPane.showMessageDialog(null, "La edad debe ser ingresada con números", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Definición de la fecha de nacimiento">
            String fecha = "";
            String texto = TxtFechaNacimiento.getText().trim();
            if (RbNoFecha.isSelected()) {
                fecha = null;
            } else if (texto.matches("\\d\\d-\\d\\d-\\d\\d\\d\\d")) {
                String[] temp = texto.split("-");
                fecha = temp[2] + "-" + temp[1] + "-" + temp[0];
            } else {
                JOptionPane.showMessageDialog(null, "Debe ingresar una fecha válida o seleccionar \"No disponible\"", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
            }
            //</editor-fold>
            
            Paciente paciente = new Paciente(idPacienteModificar, fecha, TxtNombre.getText().trim(), TxtPApellido.getText().trim(), TxtsApellido.getText().trim(), TxtIdentificacion.getText().trim(),
                    genero, beca, edad, TxtCarne.getText().trim(), primerIngreso, false);

            int idPoblacion = ((Poblacion) CbPoblacion.getSelectedItem()).getId();
            int idTipoId = ((TipoIdentificacion) CbTipoId.getSelectedItem()).getId();

            //<editor-fold defaultstate="collapsed" desc="Guardar nuevo paciente o modificaciones del paciente">
            if (edicion) {
                if (adPaciente.ModificarPaciente(paciente, idPoblacion, idTipoId)) {
                    JOptionPane.showMessageDialog(null, "Paciente Modificado con Éxito");
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Paciente no Modificado", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                if ((TxtEdad.getText().trim()).equals("") && !RbNoFecha.isSelected()) {
                    int edad2 = calcularEdad(texto);
                    paciente.setEdad(edad2);
                }
                if (adPaciente.InsertarPaciente(paciente, idPoblacion, idTipoId)) {
                    JOptionPane.showMessageDialog(null, "Paciente Registrado con Éxito");
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Paciente no Registrado", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
            //</editor-fold>
        } else {
            JOptionPane.showMessageDialog(null, "Los espacios marcados (*) no deben estar vacíos.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    /** CbPoblacionItemStateChanged
     * Cambia el tamaño de la ventana según la población seleccionada
     * @param evt evento
     */
    private void CbPoblacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbPoblacionItemStateChanged
        definirTamanoVentana();
    }//GEN-LAST:event_CbPoblacionItemStateChanged

    /** BtnCancelarActionPerformed
     * Cierra la ventana al ser presionado el botón
     * @param evt evento
     */
    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    /** RbNoFechaMouseClicked
     * Indica que no se va a ingresar ninguna fecha de nacimiento
     * @param evt evento
     */
    private void RbNoFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RbNoFechaMouseClicked
        if (RbNoFecha.isSelected()) {
            TxtFechaNacimiento.setEnabled(false);
        } else {
            TxtFechaNacimiento.setEnabled(true);
        }
    }//GEN-LAST:event_RbNoFechaMouseClicked

    //<editor-fold defaultstate="collapsed" desc="Mis métodos">
    
    /** validarRequeridos
     * Valida que los espacios requeridos no se queden vacíos
     * @return si los espacios están vacíos o no
     */
    private boolean validarRequeridos() {
        if (TxtNombre.getText().equals("") || TxtNombre.getText().equals(" ")) {
            TxtNombre.setText("");
            return false;
        }
        if (TxtPApellido.getText().equals("") || TxtPApellido.getText().equals(" ")) {
            TxtPApellido.setText("");
            return false;
        }
        return true;
    }
    
    /** definirTamanoVentana
     * Define el tamaño de la ventana según el tipo de población
     */
    private void definirTamanoVentana() {
        try {
            boolean becado = ((Poblacion) CbPoblacion.getSelectedItem()).getBecado();
            if (becado) {
                PanelEstudiante.setVisible(true);
                this.setSize(405, 595);
            } else {
                PanelEstudiante.setVisible(false);
                this.setSize(405, 485);
            }
        } catch (Exception ex) {
            PanelEstudiante.setVisible(false);
            this.setSize(375, 485);
            JOptionPane.showMessageDialog(null, "Debe ingresar una población y un tipo de identificación primero.", "ERROR", JOptionPane.ERROR_MESSAGE);
            BtnGuardar.setEnabled(false);
            bloquearEdicion();
        }
    }
    
    /** calcularEdad
     * Calcula la edad del paciente según su fecha de nacimiento
     * @param fechaNacimiento fecha de nacimiento del paciente
     * @return la edad del paciente
     */
    private int calcularEdad(String fechaNacimiento) {
        String[] temp = fechaNacimiento.split("-");
        int anno = Integer.parseInt(temp[2]);
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return year - anno;
    }
    
    /** bloquearEdicion
     * Bloquea la edición de los componentes de la ventana para sólo mostrar la información del paciente
     */
    private void bloquearEdicion() {
        TxtNombre.setEditable(false);
        TxtPApellido.setEditable(false);
        TxtsApellido.setEditable(false);
        TxtCarne.setEditable(false);
        TxtEdad.setEditable(false);
        TxtFechaNacimiento.setEditable(false);
        TxtIdentificacion.setEditable(false);
        RbFemenino.setEnabled(false);
        RbMasculino.setEnabled(false);
        RbNoFecha.setEnabled(false);
        RbPrimerIngreso.setEnabled(false);
        CbBeca.setEnabled(false);
        CbPoblacion.setEnabled(false);
        CbTipoId.setEnabled(false);
        BtnGuardar.setVisible(false);
        BtnCancelar.setText("Cerrar");
    }
    
    /** cambiarTitulo
     * Cambia el título de la ventana
     * @param titulo nuevo título de la ventana
     */
    private void cambiarTitulo(String titulo) {
        this.setTitle(titulo);
        lblTitulo.setText(titulo);
        lblTitulo.setFont(new Font("Dialog", Font.BOLD, 14));
    }
    
    /** aplicarTema
     * Aplica el tema definiado para el programa a la ventana
     */
    private void aplicarTema() {
        setLocationRelativeTo(null);
        JFrame.setDefaultLookAndFeelDecorated(true);
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.OfficeBlue2007Skin");
    }
    
    //</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JComboBox<String> CbBeca;
    private javax.swing.JComboBox<String> CbPoblacion;
    private javax.swing.JComboBox<String> CbTipoId;
    private javax.swing.JLabel LblNombre;
    private javax.swing.JLabel LblPApellido;
    private javax.swing.JLabel LblSApellido;
    private javax.swing.JPanel PanelEstudiante;
    private javax.swing.JRadioButton RbFemenino;
    private javax.swing.JRadioButton RbMasculino;
    private javax.swing.JRadioButton RbNoFecha;
    private javax.swing.JRadioButton RbPrimerIngreso;
    private javax.swing.JTextField TxtCarne;
    private javax.swing.JTextField TxtEdad;
    private javax.swing.JFormattedTextField TxtFechaNacimiento;
    private javax.swing.JTextField TxtIdentificacion;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtPApellido;
    private javax.swing.JTextField TxtsApellido;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}