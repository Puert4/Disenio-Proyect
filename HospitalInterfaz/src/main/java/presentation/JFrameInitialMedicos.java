package presentation;

import appointment.system.ExistentAppointmentDTO;
import appointment.system.IAppointmentManager;
import doctor.system.ExistentDoctorDTO;
import doctor.system.IDoctorDAO;
import factory.Factory;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class JFrameInitialMedicos extends javax.swing.JFrame {

    private Long idDoctor;
    private ExistentDoctorDTO existentDoctor;
    private ArrayList<Long> listaDeLongs = new ArrayList<>();

    /**
     * Creates new form InicioPaciente
     */
    public JFrameInitialMedicos(Long idDoctor) {
        this.idDoctor = idDoctor;
        initComponents();

        IDoctorDAO doctorDAO = Factory.getDoctorDAO();
        existentDoctor = doctorDAO.EntityToDTO(doctorDAO.serachById(idDoctor));
        cargarCitasPaciente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    private void cargarCitasPaciente() {
        DefaultTableModel tblModel = (DefaultTableModel) jTableAppointment.getModel();
        tblModel.setRowCount(0); // Limpiar la tabla antes de cargar los nuevos datos

        IAppointmentManager appointmentManager = Factory.getAppointmentManager();

        List<ExistentAppointmentDTO> appointments = appointmentManager.findAppointmentsByDoctorId(idDoctor);

        for (ExistentAppointmentDTO appointment : appointments) {
            String dateFormat = appointment.getAppointmentDate().get(Calendar.DAY_OF_MONTH) + "/" + (appointment.getAppointmentDate().get(Calendar.MONTH) + 1) + "/" + appointment.getAppointmentDate().get(Calendar.YEAR) + " " + appointment.getAppointmentDate().get(Calendar.HOUR_OF_DAY) + ":00";
            tblModel.addRow(new Object[]{
                dateFormat,
                appointment.getPatient().getName(),
                appointment.getNote(),
                appointment.getStatus()
            });
            listaDeLongs.add(appointment.getId());
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoPanel = new javax.swing.JPanel();
        FondoAzul = new javax.swing.JPanel();
        Hospital_General = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAppointment = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FondoPanel.setBackground(new java.awt.Color(255, 255, 255));
        FondoPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        FondoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FondoAzul.setBackground(new java.awt.Color(0, 153, 255));
        FondoAzul.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        FondoAzul.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Hospital_General.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Hospital_General.setText("General Hospital");
        FondoAzul.add(Hospital_General, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 1, 870, 39));

        FondoPanel.add(FondoAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, -1, -1));

        jButton3.setText("Cancel Appointment");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        FondoPanel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, 145, -1));

        jButton1.setText("Signout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        FondoPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 54, -1, -1));

        jTableAppointment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Date", "Name", "Note", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableAppointment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAppointmentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAppointment);

        FondoPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 138, 812, 330));

        jButton2.setText("Create Appointment");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        FondoPanel.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 145, -1));

        getContentPane().add(FondoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 880, 490));
        FondoPanel.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTableAppointmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAppointmentMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableAppointmentMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            JFrameRegisterAppointment frameRegisterAppointment = new JFrameRegisterAppointment(existentDoctor);
            frameRegisterAppointment.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        IAppointmentManager appointmentManager = Factory.getAppointmentManager();
        int selectedIndex = jTableAppointment.getSelectedRow();

        if (selectedIndex >= 0 && selectedIndex < listaDeLongs.size()) {
            Long valorCorrespondiente = listaDeLongs.get(selectedIndex);

            if(appointmentManager.cancelAppointment(valorCorrespondiente)){
                
                JOptionPane.showMessageDialog(this, "The appointment has been Successfully removed", "Success", JOptionPane.INFORMATION_MESSAGE);
                cargarCitasPaciente();
                
            }

        } else {
            JOptionPane.showMessageDialog(null, "Index not valid", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFrameLogin frameLogin = new JFrameLogin();
        frameLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
//            java.util.logging.Logger.getLogger(InicioPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(InicioPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(InicioPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(InicioPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new InicioPaciente().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FondoAzul;
    private javax.swing.JPanel FondoPanel;
    private javax.swing.JLabel Hospital_General;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAppointment;
    // End of variables declaration//GEN-END:variables
}
