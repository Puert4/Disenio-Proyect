package presentation;

import appointment.system.ExistentAppointmentDTO;
import appointment.system.IAppointmentManager;
import factory.Factory;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import patient.system.ExistentPatientDTO;
import patient.system.IPatientDAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author daani
 */
public class JFrameInitialPatient extends javax.swing.JFrame {

    private final Long idPatient;
    private ExistentPatientDTO paciente;

    /**
     * Creates new form InicioPaciente
     */
    public JFrameInitialPatient(Long idPatient) {
        this.idPatient = idPatient;
        
        DefaultTableModel tblModel = (DefaultTableModel) jTableAppointment.getModel();
        
        initComponents();
        IPatientDAO patientSystem = Factory.getPatientDAO();
        paciente = patientSystem.EntityToDto(patientSystem.serachPatientById(idPatient));
    }
    
      private void cargarCitasPaciente() {
        DefaultTableModel tblModel = (DefaultTableModel) jTableAppointment.getModel();
        tblModel.setRowCount(0); // Limpiar la tabla antes de cargar los nuevos datos
        
        // Obtener las citas asociadas al paciente por su ID
        IAppointmentManager appointmentManager = Factory.getAppointmentManager();
        
        List<ExistentAppointmentDTO> appointments = appointmentManager.findAppointmentsByPatientId(idPatient);
        
        // Llenar la tabla con los datos de las citas
        for (ExistentAppointmentDTO appointment : appointments) {
            tblModel.addRow(new Object[]{
                appointment.getAppointmentDate().getTime(),
                appointment.getDoctor().getName(), // Ajusta esto según la estructura de tu DoctorEntity
                appointment.getNote()
            });
        }
    }

    private void cargarDatosPaciente() {
        txtNombre.setText(paciente.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        btn_cancelAppointment = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAppointment = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnMiNombre = new javax.swing.JButton();
        txtCloseSesion = new javax.swing.JButton();
        btnCreateAppointment = new javax.swing.JButton();

        jButton2.setText("AgendarCita");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_cancelAppointment.setText("Cancel Appointment");
        btn_cancelAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelAppointmentActionPerformed(evt);
            }
        });

        jTableAppointment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Doctor", "Reason"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableAppointment);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Welcome");

        btnMiNombre.setText("Nombre");
        btnMiNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMiNombreActionPerformed(evt);
            }
        });

        txtCloseSesion.setText("Cerrar Sesion");
        txtCloseSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCloseSesionActionPerformed(evt);
            }
        });

        btnCreateAppointment.setText("Create Appointment");
        btnCreateAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAppointmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCreateAppointment)
                        .addGap(65, 65, 65)
                        .addComponent(btn_cancelAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txtCloseSesion)
                        .addGap(244, 244, 244)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(270, 270, 270)
                .addComponent(btnMiNombre)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCloseSesion)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnMiNombre)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelAppointment)
                    .addComponent(btnCreateAppointment))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_cancelAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelAppointmentActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "No se a seleccionado ninguna cita", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btn_cancelAppointmentActionPerformed

    private void btnMiNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiNombreActionPerformed
        // TODO add your handling code here:
        cargarDatosPaciente();
    }//GEN-LAST:event_btnMiNombreActionPerformed

    private void txtCloseSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCloseSesionActionPerformed
        // TODO add your handling code here:
        JFrameLogin frameLogin = new JFrameLogin();
        frameLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txtCloseSesionActionPerformed

    private void btnCreateAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAppointmentActionPerformed
        // TODO add your handling code here:
        JFrameRegisterAppointment register = new JFrameRegisterAppointment(paciente);
        register.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCreateAppointmentActionPerformed

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
//            java.util.logging.Logger.getLogger(JFInitialPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(JFInitialPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(JFInitialPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(JFInitialPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new JFInitialPatient().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateAppointment;
    private javax.swing.JButton btnMiNombre;
    private javax.swing.JButton btn_cancelAppointment;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAppointment;
    private javax.swing.JButton txtCloseSesion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
