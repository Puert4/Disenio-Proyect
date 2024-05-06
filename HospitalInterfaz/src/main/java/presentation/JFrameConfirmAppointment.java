package presentation;

import appointment.system.IAppointmentManager;
import appointment.system.NewAppointmentDTO;
import factory.Factory;
import java.util.Calendar;
import patient.system.ExistentPatientDTO;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author daani
 */
public class JFrameConfirmAppointment extends javax.swing.JFrame {

//    private final IControl control;
//    private final Long idPatient;
    //   private ExistentPatientDTO paciente;
    private NewAppointmentDTO newAppointmentDTO;

    /**
     * Creates new form AgendarCita
     *
     * @param newAppointmentDTO
     */
    public JFrameConfirmAppointment(NewAppointmentDTO newAppointmentDTO) {

        this.newAppointmentDTO = newAppointmentDTO;
        initComponents();

        this.lblName.setText(newAppointmentDTO.getPatient().getName());
        this.lblDoctor.setText(newAppointmentDTO.getDoctor().getName());
        String dateString = "" + newAppointmentDTO.getAppointmentDate().get(Calendar.DATE) + "/" + newAppointmentDTO.getAppointmentDate().get(Calendar.MONTH) + "/" + newAppointmentDTO.getAppointmentDate().get(Calendar.YEAR);
        this.lblDate.setText(dateString);
        this.lblSpecialitazion.setText(newAppointmentDTO.getDoctor().getSpecialization().toString());
        this.lblNote.setText(newAppointmentDTO.getNote());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblDoctor = new javax.swing.JLabel();
        lblSpecialitazion = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblNote = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 382, 90, -1));

        jButton2.setText("Confirm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 382, 111, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Confirm Appointment");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 36, 277, 62));

        jLabel8.setText("Specialization");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 282, -1, 25));

        jLabel9.setText("Date");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 236, -1, -1));

        jLabel10.setText("Doctotor");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 183, -1, -1));

        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 126, 70, -1));
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 156, 26));
        getContentPane().add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 156, 26));
        getContentPane().add(lblDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 156, 26));
        getContentPane().add(lblSpecialitazion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 156, 26));

        jLabel11.setText("Note");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 326, -1, 25));
        getContentPane().add(lblNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 156, 26));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFrameRegisterAppointment register = new JFrameRegisterAppointment(newAppointmentDTO.getPatient());
        register.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        //    JFrameInitialPatient menu = new JFrameInitialPatient(control, idPatient);
        //     menu.setVisible(true);
        IAppointmentManager appointmentManager = Factory.getAppointmentManager();
        appointmentManager.createAppointment(newAppointmentDTO);

        JFrameInitialPatient frameInitialPatient = new JFrameInitialPatient(newAppointmentDTO.getPatient().getId());
        frameInitialPatient.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButton2ActionPerformed

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
//            java.util.logging.Logger.getLogger(JFrameRegisterAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(JFrameRegisterAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(JFrameRegisterAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(JFrameRegisterAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new JFrameRegisterAppointment().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNote;
    private javax.swing.JLabel lblSpecialitazion;
    // End of variables declaration//GEN-END:variables
}
