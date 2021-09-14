
package frame;

import classes.DB;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.regex.*;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
        jDateChooser_bDate.setDate(new java.util.Date());
        String cancelName = "cancel";
        InputMap inputMap = getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), cancelName);
        ActionMap actionMap = getRootPane().getActionMap();
        actionMap.put(cancelName, new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                    try{
                        dispose();
                        Login.main(new String[]{});
                    }catch(Exception e1){

                    }
            }
        });
        
        String enetrName = "create";
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0), enetrName);
        actionMap = getRootPane().getActionMap();
        actionMap.put(enetrName, new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                try{
                    create();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField_firstName = new javax.swing.JTextField();
        jTextField_lastName = new javax.swing.JTextField();
        jTextField_userName = new javax.swing.JTextField();
        jPasswordField_rePassword = new javax.swing.JPasswordField();
        jPasswordField_password = new javax.swing.JPasswordField();
        jDateChooser_bDate = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_address = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(400, 600));

        jPanel1.setBackground(new java.awt.Color(51, 0, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 600));
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
        jLabel1.setText("Register");
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(394, 50));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Address:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("First name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Last name:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Username:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Retype pass:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Birth date:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, 30));

        jTextField_firstName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_firstName.setForeground(new java.awt.Color(51, 0, 153));
        jPanel1.add(jTextField_firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 210, 30));

        jTextField_lastName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_lastName.setForeground(new java.awt.Color(51, 0, 153));
        jPanel1.add(jTextField_lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 210, 30));

        jTextField_userName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_userName.setForeground(new java.awt.Color(51, 0, 153));
        jPanel1.add(jTextField_userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 210, 30));

        jPasswordField_rePassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField_rePassword.setForeground(new java.awt.Color(51, 0, 153));
        jPanel1.add(jPasswordField_rePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 210, 30));

        jPasswordField_password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField_password.setForeground(new java.awt.Color(51, 0, 153));
        jPanel1.add(jPasswordField_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 210, 30));
        jPanel1.add(jDateChooser_bDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 160, 30));

        jTextArea_address.setColumns(20);
        jTextArea_address.setRows(5);
        jScrollPane1.setViewportView(jTextArea_address);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 250, -1));

        jButton1.setBackground(new java.awt.Color(204, 0, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cancel");
        jButton1.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 102, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Create");
        jButton2.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, -1, -1));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/png/login.png"))); // NOI18N
        jLabel11.setPreferredSize(new java.awt.Dimension(100, 80));
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 400, 80));

        jLabel12.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("back to login");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 560, 220, -1));

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

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        if(evt.getModifiers() == MouseEvent.BUTTON1_MASK){
            try{
                this.dispose();
                Login.main(new String[]{});
            }catch(Exception e){

            }
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        create();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
                this.dispose();
                Login.main(new String[]{});
            }catch(Exception e){

            }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }
    
    private void create(){
        String fName = jTextField_firstName.getText();
        String lName = jTextField_lastName.getText();
        String uName = jTextField_userName.getText();
        String pass = jPasswordField_password.getText();
        String rPass = jPasswordField_rePassword.getText();
        Date bDate = null;
        try{
            bDate = new Date(jDateChooser_bDate.getDate().getTime());
        }catch(Exception e){
            
        }
        String address = jTextArea_address.getText();
        if(validateFName(fName) && validateLName(lName) && validateUName(uName) &&
                validatePass(pass) && validateDate(bDate) && validateAddress(address)){
            if(pass.equals(rPass)){
                if(authenticity(uName)){
                    String query = "INSERT INTO `users`(`first_name`, `last_name`, `user_name`, `password`, `b_date`, `address`) "
                            + "VALUES ('"+fName+"', '"+lName+"', '"+uName+"', '"+pass+"', '"+bDate+"', '"+address+"')";
                    if(DB.insertUpdateDelete(query)){
                        JOptionPane.showMessageDialog(null, "Data is successful stored", "Message", JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null,"Something is wrong", "Message", JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Username already exists", "Message", JOptionPane.WARNING_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Passwords is not same", "Message", JOptionPane.WARNING_MESSAGE);
            }
        }
              
    }
    
    private boolean validateFName(String firstName){
        String fName = firstName;
        if(fName.isEmpty()){
            JOptionPane.showMessageDialog(null, "The first name is empty", "Message", JOptionPane.WARNING_MESSAGE);
            return false;
        }else if(fName.length() > 15){
            JOptionPane.showMessageDialog(null, "The first name is long", "Message", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    
    private boolean validateLName(String lastName){
        String lName = lastName;
        if(lName.isEmpty()){
            JOptionPane.showMessageDialog(null, "The last name is empty", "Message", JOptionPane.WARNING_MESSAGE);
            return false;
        }else if(lName.length() > 20){
            JOptionPane.showMessageDialog(null, "The last name is long", "Message", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    
    private boolean validateUName(String userName){
        String uName = userName;
        if(uName.trim().isEmpty()){
            return false;
        }
        String regex = "^[A-Za-z]\\w{5,29}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(uName);
        if(!m.matches()){
            JOptionPane.showMessageDialog(null, "The username format is invalid", "Message", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    
    private boolean validatePass(String password){
        String pass = password;
        if(pass.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "The password is empty", "Message", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,30}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(pass);
        if(!m.matches()){
            JOptionPane.showMessageDialog(null, "Your password needs to be between 8 and 30 characters long, and contain one uppercase letter, one symbol, and a number", "Message", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    
    private boolean validateDate(Date date){   
        Date d = date;
        if(d == null){
            JOptionPane.showMessageDialog(null, "The date is invalid", "Message", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        if(d.after(new java.util.Date())){
            JOptionPane.showMessageDialog(null, "The date is invalid", "Message", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    
    private boolean validateAddress(String address){
        String add = address;
        if(add.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "The address is empty", "Message", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    
    private boolean authenticity(String userName){
        String query = "SELECT * FROM `users` \n" +
                       "WHERE `user_name` = '"+userName+"'";
        
        try {
            if(DB.RS(query).next()){
                return false;
            }
        } catch (SQLException ex) {
            return false;
        }
        return true;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser_bDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_password;
    private javax.swing.JPasswordField jPasswordField_rePassword;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_address;
    private javax.swing.JTextField jTextField_firstName;
    private javax.swing.JTextField jTextField_lastName;
    private javax.swing.JTextField jTextField_userName;
    // End of variables declaration//GEN-END:variables
}
