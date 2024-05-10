package presentation;

import factory.Factory;
import javax.swing.JOptionPane;
import user.system.IUserDAO;
import user.system.NewUserDTO;

public class JFrameCreateUser extends javax.swing.JFrame {

    private NewUserDTO userDTOAdmin;

    /**
     * Creates new form JFrameCreateUser
     */
    public JFrameCreateUser() {
        initComponents();

    }

    public JFrameCreateUser(NewUserDTO userDTOAdmin) {

        initComponents();
        this.userDTOAdmin = userDTOAdmin;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoPanel = new javax.swing.JPanel();
        Iniciar_Sesion = new javax.swing.JLabel();
        FondoAzul = new javax.swing.JPanel();
        Hospital_General = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        Usuario4 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        Usuario = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FondoPanel.setBackground(new java.awt.Color(255, 255, 255));
        FondoPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Iniciar_Sesion.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Iniciar_Sesion.setText("Register User");

        FondoAzul.setBackground(new java.awt.Color(0, 153, 255));
        FondoAzul.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        Hospital_General.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Hospital_General.setText("General Hospital");

        javax.swing.GroupLayout FondoAzulLayout = new javax.swing.GroupLayout(FondoAzul);
        FondoAzul.setLayout(FondoAzulLayout);
        FondoAzulLayout.setHorizontalGroup(
            FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoAzulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Hospital_General, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(596, Short.MAX_VALUE))
        );
        FondoAzulLayout.setVerticalGroup(
            FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoAzulLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Hospital_General, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnAceptar.setBackground(new java.awt.Color(0, 0, 0));
        btnAceptar.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Register");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        Usuario4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Usuario4.setText("Password");

        Usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Usuario.setText("Username");

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoPanelLayout = new javax.swing.GroupLayout(FondoPanel);
        FondoPanel.setLayout(FondoPanelLayout);
        FondoPanelLayout.setHorizontalGroup(
            FondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(FondoPanelLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(Usuario))
            .addGroup(FondoPanelLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(FondoPanelLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(Usuario4))
            .addGroup(FondoPanelLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(FondoPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnCancel)
                .addGap(85, 85, 85)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(FondoPanelLayout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addComponent(Iniciar_Sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        FondoPanelLayout.setVerticalGroup(
            FondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoPanelLayout.createSequentialGroup()
                .addComponent(FondoAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Iniciar_Sesion)
                .addGap(79, 79, 79)
                .addComponent(Usuario)
                .addGap(1, 1, 1)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(Usuario4)
                .addGap(11, 11, 11)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(FondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(FondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(FondoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:

        if (txtUserName.getText().isEmpty() || txtPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "The username or password can't be in blank");

        } else {

            NewUserDTO userDTO = new NewUserDTO();
            userDTO.setUser(txtUserName.getText());
            userDTO.setPassword(txtPassword.getText());

            IUserDAO userDAO = Factory.getUserDAO();
            if (userDAO.userExist(userDTO.getUser())) {

                JOptionPane.showMessageDialog(this, "The username is already in use");

            } else {

                if (userDTOAdmin == null) {

                    JFrameRegisterPatient frameRegisterPatient = new JFrameRegisterPatient(userDTO);
                    frameRegisterPatient.setVisible(true);
                    this.dispose();

                } else {
                    JFrameRegisterPatient frameRegisterPatient = new JFrameRegisterPatient(userDTO, userDTOAdmin);
                    frameRegisterPatient.setVisible(true);
                    this.dispose();
                }
            }

        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        if (userDTOAdmin == null) {
            JFrameLogin login = new JFrameLogin();
            login.setVisible(true);
            this.dispose();
        } else {
            JFrameAdministrator frameAdministrator = new JFrameAdministrator(userDTOAdmin.getUser(), userDTOAdmin.getPassword());
            frameAdministrator.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(JFrameCreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(JFrameCreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(JFrameCreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(JFrameCreateUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new JFrameCreateUser().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FondoAzul;
    private javax.swing.JPanel FondoPanel;
    private javax.swing.JLabel Hospital_General;
    private javax.swing.JLabel Iniciar_Sesion;
    private javax.swing.JLabel Usuario;
    private javax.swing.JLabel Usuario4;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancel;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
