package presentation;

import Tools.Pintar;
import factory.Factory;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import loginManager.ILogIn;
import user.system.IUserDAO;

/**
 *
 * @author TeLesheo
 */
public class JFrameLogin extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public JFrameLogin() {
        initComponents();
        this.setTitle("Login");
        // Configurar la Foto
        Pintar imagen = new Pintar();
        imagen.PintarImagen(ImagenLogo, "src/main/java/Fotos/FondoLogin.jpg");

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
        FondoAzul = new javax.swing.JPanel();
        Hospital_General = new javax.swing.JLabel();
        ImagenLogo = new javax.swing.JLabel();
        FondoInicio = new javax.swing.JPanel();
        Iniciar_Sesion = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        Usuario = new javax.swing.JLabel();
        Contraseña = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        No_Tienes_Cuenta = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jlbCreateAccount = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FondoPanel.setBackground(new java.awt.Color(255, 255, 255));
        FondoPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        FondoAzul.setBackground(new java.awt.Color(0, 153, 255));
        FondoAzul.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        Hospital_General.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        Hospital_General.setText("Hospital General");

        javax.swing.GroupLayout FondoAzulLayout = new javax.swing.GroupLayout(FondoAzul);
        FondoAzul.setLayout(FondoAzulLayout);
        FondoAzulLayout.setHorizontalGroup(
            FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoAzulLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Hospital_General, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(426, Short.MAX_VALUE))
        );
        FondoAzulLayout.setVerticalGroup(
            FondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FondoAzulLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Hospital_General, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        FondoInicio.setBackground(new java.awt.Color(255, 255, 255));
        FondoInicio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Iniciar_Sesion.setFont(new java.awt.Font("Roboto", 2, 24)); // NOI18N
        Iniciar_Sesion.setText("LogIn");

        Usuario.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        Usuario.setText("Username");

        Contraseña.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        Contraseña.setText("Password");

        btnAceptar.setBackground(new java.awt.Color(0, 0, 0));
        btnAceptar.setFont(new java.awt.Font("Roboto", 2, 12)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Login");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        No_Tienes_Cuenta.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        No_Tienes_Cuenta.setText("New?");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        jlbCreateAccount.setForeground(new java.awt.Color(51, 204, 255));
        jlbCreateAccount.setText("Register");
        jlbCreateAccount.setBorder(null);
        jlbCreateAccount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jlbCreateAccountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jlbCreateAccountFocusLost(evt);
            }
        });
        jlbCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlbCreateAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FondoInicioLayout = new javax.swing.GroupLayout(FondoInicio);
        FondoInicio.setLayout(FondoInicioLayout);
        FondoInicioLayout.setHorizontalGroup(
            FondoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoInicioLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(FondoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoInicioLayout.createSequentialGroup()
                        .addComponent(No_Tienes_Cuenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlbCreateAccount))
                    .addGroup(FondoInicioLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnAceptar))
                    .addComponent(Contraseña)
                    .addGroup(FondoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtUser)
                        .addComponent(Iniciar_Sesion, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        FondoInicioLayout.setVerticalGroup(
            FondoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoInicioLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Iniciar_Sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(Usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FondoInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(No_Tienes_Cuenta)
                    .addComponent(jlbCreateAccount))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout FondoPanelLayout = new javax.swing.GroupLayout(FondoPanel);
        FondoPanel.setLayout(FondoPanelLayout);
        FondoPanelLayout.setHorizontalGroup(
            FondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoAzul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(FondoPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(FondoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(ImagenLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        FondoPanelLayout.setVerticalGroup(
            FondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoPanelLayout.createSequentialGroup()
                .addComponent(FondoAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(FondoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FondoPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(FondoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ImagenLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void jlbCreateAccountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jlbCreateAccountFocusGained
        // TODO add your handling code here:

        jlbCreateAccount.setForeground(Color.MAGENTA);
    }//GEN-LAST:event_jlbCreateAccountFocusGained

    private void jlbCreateAccountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jlbCreateAccountFocusLost
        // TODO add your handling code here:

        Color color = new Color(51, 204, 255);
        jlbCreateAccount.setForeground(color);
    }//GEN-LAST:event_jlbCreateAccountFocusLost

    private void jlbCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlbCreateAccountActionPerformed
        // TODO add your handling code here:



        JFrameCreateUser frameCreateUser = new JFrameCreateUser();
        frameCreateUser.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jlbCreateAccountActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        String user = txtUser.getText();
        String password = txtPassword.getText();

        IUserDAO userSystem = Factory.getUserDAO();
        ILogIn loginSystem = Factory.getLogIn();

        String userType = userSystem.getUserTypeByUserAndPassword(user, password);

        if (userType != null) {
            switch (userType) {
                case "admin":

                    JFrameAdministrator frameAdministrator = new JFrameAdministrator();
                    frameAdministrator.setVisible(true);
                    this.dispose();
                    break;
                case "patient":
                    Long idPatient = loginSystem.validateUser(user, password);
                    JFrameInitialPatient frameInitialPatient = new JFrameInitialPatient(idPatient);
                    frameInitialPatient.setVisible(true);
                    this.dispose();
                    break;

                default:

                    break;
            }
        } else {

            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnAceptarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contraseña;
    private javax.swing.JPanel FondoAzul;
    private javax.swing.JPanel FondoInicio;
    private javax.swing.JPanel FondoPanel;
    private javax.swing.JLabel Hospital_General;
    private javax.swing.JLabel ImagenLogo;
    private javax.swing.JLabel Iniciar_Sesion;
    private javax.swing.JLabel No_Tienes_Cuenta;
    private javax.swing.JLabel Usuario;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton jlbCreateAccount;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
