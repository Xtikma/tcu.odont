/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import javax.swing.JOptionPane;
import AccesoDatos.ADPassword;
import java.util.ArrayList;

/**
 *
 * @author Keylor
 */
public class Configuraciones extends javax.swing.JPanel {

private Menu menu = null;
    /**
     * Creates new form Configuraciones
     */
    public Configuraciones(Menu menu) {
        initComponents();
       this.menu = menu;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContrasena = new javax.swing.JPanel();
        lbPassOld = new javax.swing.JLabel();
        lbPassNew = new javax.swing.JLabel();
        lbPassConfirmed = new javax.swing.JLabel();
        passOld = new javax.swing.JPasswordField();
        passNew = new javax.swing.JPasswordField();
        passOldConfirm = new javax.swing.JPasswordField();
        btnAplicarPass = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Otros Ajustes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        setMaximumSize(new java.awt.Dimension(1000, 500));
        setMinimumSize(new java.awt.Dimension(1000, 500));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1000, 500));

        panelContrasena.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cambio de Contraseña", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N
        panelContrasena.setOpaque(false);

        lbPassOld.setText("Contraseña Actual:");

        lbPassNew.setText("Nueva Contraseña:");

        lbPassConfirmed.setText("Confirme Contraseña:");

        btnAplicarPass.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAplicarPass.setText("Aplicar cambios");
        btnAplicarPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelContrasenaLayout = new javax.swing.GroupLayout(panelContrasena);
        panelContrasena.setLayout(panelContrasenaLayout);
        panelContrasenaLayout.setHorizontalGroup(
            panelContrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContrasenaLayout.createSequentialGroup()
                .addGroup(panelContrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelContrasenaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelContrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelContrasenaLayout.createSequentialGroup()
                                .addComponent(lbPassOld, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passOld))
                            .addGroup(panelContrasenaLayout.createSequentialGroup()
                                .addComponent(lbPassNew, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passNew, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelContrasenaLayout.createSequentialGroup()
                                .addComponent(lbPassConfirmed, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passOldConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelContrasenaLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btnAplicarPass, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        panelContrasenaLayout.setVerticalGroup(
            panelContrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContrasenaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPassOld, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passOld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelContrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPassNew, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelContrasenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPassConfirmed, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passOldConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAplicarPass)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btnRegresar.setText("<< Regresar");
        btnRegresar.setMaximumSize(new java.awt.Dimension(100, 35));
        btnRegresar.setMinimumSize(new java.awt.Dimension(100, 35));
        btnRegresar.setPreferredSize(new java.awt.Dimension(100, 35));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(665, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        menu.intercambiarPaneles(0);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAplicarPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarPassActionPerformed
        String pass = "";
        String passConfirm = "";
        Boolean estado;
        char[] passwordOld = passOld.getPassword();
        for (int i = 0; i < passwordOld.length; i++) {
            pass += passwordOld[i];
        }

        if (pass.isEmpty() == false) {
            estado = consultarUltimaContrasena(pass);
            if (estado == true) {
                pass = "";
                char[] passwordNew = passNew.getPassword();
                for (int i = 0; i < passwordNew.length; i++) {
                    pass += passwordNew[i];
                }
                char[] passwordConfirm = passOldConfirm.getPassword();
                for (int i = 0; i < passwordConfirm.length; i++) {
                    passConfirm += passwordConfirm[i];
                }
                if (pass.isEmpty() == false && passConfirm.isEmpty() == false && pass.equals(passConfirm) == true ) {
                    if (consultarListaContrasena(passConfirm)== false) {
                        
                        ADPassword pw = new ADPassword();
                        pw.insertarPassword(pass);
                        JOptionPane.showMessageDialog(null, "Se ingreso correctamente",
                                "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                         JOptionPane.showMessageDialog(null, "La nueva contraseÃ±a debe ser distinta a cualquier contraseÃ±a anterior",
                            "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
                    }
                  
                } else {
                    JOptionPane.showMessageDialog(null, "La contraseÃ±a de confirmaciÃ³n debe ser igual ala nueva contraseÃ±a",
                            "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
                }

            } else {

                JOptionPane.showMessageDialog(null, "ContraseÃ±a Actual Incorrecta",
                        "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            }
        } else {

            JOptionPane.showMessageDialog(null, "Digite la ContraseÃ±a Actual",
                    "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAplicarPassActionPerformed

    public boolean consultarListaContrasena(String contrasena) {
        boolean password = false;
        ADPassword pw = new ADPassword();
        ArrayList<String> lista = pw.obtenerListaPassword();

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(contrasena)) {
                password = true;
            }

        }
        return password;

    }
    
       public boolean consultarUltimaContrasena(String contrasena) {
        String ultimaPass;
        boolean password = false;
        ADPassword pw = new ADPassword();
        ultimaPass = pw.obtenerPassword();

        if (ultimaPass.equals(contrasena)) {
            password = true;
        }
        return password;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAplicarPass;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel lbPassConfirmed;
    private javax.swing.JLabel lbPassNew;
    private javax.swing.JLabel lbPassOld;
    private javax.swing.JPanel panelContrasena;
    private javax.swing.JPasswordField passNew;
    private javax.swing.JPasswordField passOld;
    private javax.swing.JPasswordField passOldConfirm;
    // End of variables declaration//GEN-END:variables
}
