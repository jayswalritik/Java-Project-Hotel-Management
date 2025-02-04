/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel.management.system;

/**
 *
 * @author Admin
 */
public class HousekeepingDashboard extends javax.swing.JFrame {

    /**
     * Creates new form HousekeepingDashboard
     */
    public HousekeepingDashboard() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Logout = new javax.swing.JButton();
        Cleaning_Schedule = new javax.swing.JButton();
        Reporting = new javax.swing.JButton();
        Cleaning_Status = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome To Your Dashboard");

        Logout.setText("Log Out");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        Cleaning_Schedule.setText("Cleaning Schedule");
        Cleaning_Schedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cleaning_ScheduleActionPerformed(evt);
            }
        });

        Reporting.setText("Reporting");
        Reporting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportingActionPerformed(evt);
            }
        });

        Cleaning_Status.setText("Cleaning Status");
        Cleaning_Status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cleaning_StatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Reporting, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(Logout))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(Cleaning_Status))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(Cleaning_Schedule)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Cleaning_Schedule)
                .addGap(18, 18, 18)
                .addComponent(Cleaning_Status)
                .addGap(18, 18, 18)
                .addComponent(Reporting)
                .addGap(18, 18, 18)
                .addComponent(Logout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        Login login=new Login(); 
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_LogoutActionPerformed

    private void Cleaning_ScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cleaning_ScheduleActionPerformed
         Cleaning_Schedule cleaningSchedule=new Cleaning_Schedule(); 
         cleaningSchedule.setVisible(true);
         this.setVisible(false); 
    }//GEN-LAST:event_Cleaning_ScheduleActionPerformed

    private void Cleaning_StatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cleaning_StatusActionPerformed
        Cleaning_Status cleaningStatus=new Cleaning_Status(); 
        cleaningStatus.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Cleaning_StatusActionPerformed

    private void ReportingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportingActionPerformed
        Housekeeping_Reporting housekeepingReporting=new Housekeeping_Reporting(); 
        housekeepingReporting.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ReportingActionPerformed

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
            java.util.logging.Logger.getLogger(HousekeepingDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HousekeepingDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HousekeepingDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HousekeepingDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HousekeepingDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cleaning_Schedule;
    private javax.swing.JButton Cleaning_Status;
    private javax.swing.JButton Logout;
    private javax.swing.JButton Reporting;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
