/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package household.services.system.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author tomdp
 */
public class AdminLogin extends javax.swing.JFrame {

    /**
     * Creates new form AdminLogin
     */
    public AdminLogin() {
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

        minimize = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        minimize.setBackground(new java.awt.Color(255, 255, 255));
        minimize.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jLabel41.setFont(new java.awt.Font("Segoe UI Semibold", 0, 29)); // NOI18N
        jLabel41.setText("Welceome to");

        jLabel42.setFont(new java.awt.Font("Segoe UI Semibold", 0, 29)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 70, 0));
        jLabel42.setText("HSS");

        login.setBackground(new java.awt.Color(255, 70, 0));
        login.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("login");
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginjButton2ActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(32, 32, 32));
        jLabel43.setText("Username");

        name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel44.setFont(new java.awt.Font("Segoe UI Semibold", 0, 16)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(32, 32, 32));
        jLabel44.setText("Password");

        password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel45.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 70, 0));
        jLabel45.setText("back");
        jLabel45.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel45MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout minimizeLayout = new javax.swing.GroupLayout(minimize);
        minimize.setLayout(minimizeLayout);
        minimizeLayout.setHorizontalGroup(
            minimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(minimizeLayout.createSequentialGroup()
                .addContainerGap(213, Short.MAX_VALUE)
                .addGroup(minimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, minimizeLayout.createSequentialGroup()
                        .addGroup(minimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43)
                            .addComponent(jLabel44))
                        .addGap(31, 31, 31)
                        .addGroup(minimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(login))
                        .addGap(191, 191, 191))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, minimizeLayout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel42)
                        .addGap(276, 276, 276))))
            .addGroup(minimizeLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel45)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        minimizeLayout.setVerticalGroup(
            minimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(minimizeLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(minimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42))
                .addGap(58, 58, 58)
                .addGroup(minimizeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(minimizeLayout.createSequentialGroup()
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(minimizeLayout.createSequentialGroup()
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(minimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(minimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginjButton2ActionPerformed
        // TODO add your handling code here:
        Connection con = databaseConnection.getConnection();
        PreparedStatement ps;
        ResultSet rs;
        String query = "SELECT * FROM `admin` WHERE `name` =? AND `password` =?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1,name.getText());
            ps.setString(2,password.getText());
            rs = ps.executeQuery();

            if(rs.next()){
                AdminDashboard cd = new AdminDashboard();
                cd.setVisible(true);
                cd.pack();
                cd.setLocationRelativeTo(null);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null,"Login error");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loginjButton2ActionPerformed

    private void jLabel45MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel45MouseClicked
        // TODO add your handling code here:
        FirstPage jump = new FirstPage();
        jump.setVisible(true);
        jump.pack();
        jump.setLocationRelativeTo(null);
        jump.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel45MouseClicked

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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JButton login;
    private javax.swing.JPanel minimize;
    private javax.swing.JTextField name;
    private javax.swing.JTextField password;
    // End of variables declaration//GEN-END:variables
}
