
package frame;

import classes.DB;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        jLabel_hide.setVisible(false);
        String cancelName = "cancel";
        InputMap inputMap = getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), cancelName);
        ActionMap actionMap = getRootPane().getActionMap();
        actionMap.put(cancelName, new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                    System.exit(0);
            }
        });
        String enetrName = "login";
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), enetrName);
        actionMap = getRootPane().getActionMap();
        actionMap.put(enetrName, new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                try{
                    login();
                }catch(Exception ex){
            
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_userName = new javax.swing.JTextField();
        jPasswordField_password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jButton_login = new javax.swing.JButton();
        jButton_cancel = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel_show = new javax.swing.JLabel();
        jLabel_hide = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 0, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 350));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 51));
        jLabel5.setText("X");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 3, 20, 50));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(394, 50));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, 30));

        jTextField_userName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_userName.setForeground(new java.awt.Color(51, 0, 153));
        jPanel1.add(jTextField_userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 210, 30));

        jPasswordField_password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField_password.setForeground(new java.awt.Color(51, 0, 153));
        jPanel1.add(jPasswordField_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 210, 30));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/login.png"))); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 80));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 130, 80));

        jButton_login.setBackground(new java.awt.Color(0, 102, 51));
        jButton_login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_login.setForeground(new java.awt.Color(255, 255, 255));
        jButton_login.setText("Login");
        jButton_login.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loginActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        jButton_cancel.setBackground(new java.awt.Color(204, 0, 51));
        jButton_cancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_cancel.setForeground(new java.awt.Color(255, 255, 255));
        jButton_cancel.setText("Cancel");
        jButton_cancel.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cancelActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("create a new acount");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 210, -1));

        jLabel_show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/showPass.png"))); // NOI18N
        jLabel_show.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel_show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_showMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel_show, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, 30));

        jLabel_hide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/hidePass.png"))); // NOI18N
        jLabel_hide.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel_hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_hideMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel_hide, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        if(evt.getModifiers() == MouseEvent.BUTTON1_MASK){
            try{
                this.dispose();
                Register.main(new String[]{});
            }catch(Exception e){

            }
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginActionPerformed
        login();
    }//GEN-LAST:event_jButton_loginActionPerformed

    private void jLabel_showMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_showMouseClicked
        jLabel_show.setVisible(false);
        jLabel_hide.setVisible(true);
        jPasswordField_password.setEchoChar((char)0);
    }//GEN-LAST:event_jLabel_showMouseClicked

    private void jLabel_hideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_hideMouseClicked
        jLabel_hide.setVisible(false);
        jLabel_show.setVisible(true);
        jPasswordField_password.setEchoChar('*');
    }//GEN-LAST:event_jLabel_hideMouseClicked

    private void jButton_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    private void login(){
        String userName = jTextField_userName.getText();
        String password = jPasswordField_password.getText();
        if(!(userName.isEmpty() || password.isEmpty())){
            String query = "SELECT * FROM `users` \n" +
                           "WHERE `user_name` = '"+userName+"'\n" +
                           "AND `password` = '"+password+"'";
            try {
                if(DB.RS(query).first()){
                    JOptionPane.showMessageDialog(null, "Successfully logged in", "Message", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Username or password is wrong", "Message", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "The username or password is empty", "Message", JOptionPane.WARNING_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_cancel;
    private javax.swing.JButton jButton_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_hide;
    private javax.swing.JLabel jLabel_show;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_password;
    private javax.swing.JTextField jTextField_userName;
    // End of variables declaration//GEN-END:variables
}
