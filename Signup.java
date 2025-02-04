/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.*;

/**
 *
 * @author Admin
 */
public class Signup extends javax.swing.JFrame {
    

    /**
     * Creates new form Signup
     */
    public Signup() {
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

        jLabel11 = new javax.swing.JLabel();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        First_Name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Middle_Name = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Female = new javax.swing.JRadioButton();
        Male = new javax.swing.JRadioButton();
        Other = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        Age = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Role = new javax.swing.JComboBox<>();
        Create_Account = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        Log_In = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Password = new javax.swing.JPasswordField();
        Confirm_Password = new javax.swing.JPasswordField();
        Last_Name1 = new javax.swing.JTextField();

        jLabel11.setText("jLabel11");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign Up");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter Details");

        jLabel2.setText("First Name :");

        First_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                First_NameActionPerformed(evt);
            }
        });

        jLabel3.setText("Middle Name :");

        Middle_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Middle_NameActionPerformed(evt);
            }
        });

        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });

        jLabel4.setText("Last Name : ");

        jLabel5.setText("Gender :");

        jLabel6.setText("Email :");

        jLabel7.setText("Username :");

        Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UsernameFocusLost(evt);
            }
        });
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });

        jLabel8.setText("Password :");

        jLabel9.setText("Confirm Password :");

        Female.setText("Female");
        Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleActionPerformed(evt);
            }
        });

        Male.setText("Male");
        Male.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleActionPerformed(evt);
            }
        });

        Other.setText("Other");
        Other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtherActionPerformed(evt);
            }
        });

        jLabel10.setText("Age :");

        jLabel12.setText("Role ");

        Role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Receptionist", "Housekeeping" }));
        Role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoleActionPerformed(evt);
            }
        });

        Create_Account.setText("Create Account");
        Create_Account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Create_AccountMouseEntered(evt);
            }
        });
        Create_Account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Create_AccountActionPerformed(evt);
            }
        });

        jLabel13.setText("Already have an account ?");

        Log_In.setText("Log In");
        Log_In.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Log_InActionPerformed(evt);
            }
        });

        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });

        Confirm_Password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Confirm_PasswordFocusLost(evt);
            }
        });
        Confirm_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirm_PasswordActionPerformed(evt);
            }
        });

        Last_Name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Last_Name1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Middle_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(First_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Male)
                        .addGap(18, 18, 18)
                        .addComponent(Female)
                        .addGap(18, 18, 18)
                        .addComponent(Other)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Create_Account)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Confirm_Password))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Last_Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(Log_In)
                .addGap(91, 91, 91))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Female, Male, Other});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(First_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Middle_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Last_Name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Male)
                    .addComponent(Female)
                    .addComponent(Other)
                    .addComponent(jLabel10)
                    .addComponent(Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(Confirm_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Create_Account)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(Log_In))
                        .addContainerGap(38, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Back)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void First_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_First_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_First_NameActionPerformed

    private void Middle_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Middle_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Middle_NameActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed

    }//GEN-LAST:event_UsernameActionPerformed

    private void FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleActionPerformed
       if(Female.isSelected()){
           Male.setSelected(false);
           Other.setSelected(false);
       }
       else{
           Female.setSelected(true);
       }
    }//GEN-LAST:event_FemaleActionPerformed

    private void MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleActionPerformed
        if(Male.isSelected()){
           Female.setSelected(false);
           Other.setSelected(false);
       }
       else{
           Male.setSelected(true);
       }
    }//GEN-LAST:event_MaleActionPerformed

    private void OtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtherActionPerformed
        if(Other.isSelected()){
           Male.setSelected(false);
           Female.setSelected(false);
       }
       else{
           Other.setSelected(true);
       }
    }//GEN-LAST:event_OtherActionPerformed

    private void RoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoleActionPerformed

    private void Create_AccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Create_AccountActionPerformed
       String firstName=First_Name.getText();
       String middleName=Middle_Name.getText();
       String lastName=Email.getText();
       String gender;
       if(Male.isSelected())
           gender="Male";
       else if(Female.isSelected())
           gender="Female";
       else if(Other.isSelected())
           gender="Other";
       else
           gender="";
       int age;
       try {
           age=Integer.parseInt(Age.getText());
       }
        catch (NumberFormatException e){
           System.out.println("Age has not been entered ! ");
           age=0;
       }
        String email=Email.getText(); 
        String username=Username.getText();
        char password[]=Password.getPassword();
        String string_password=String.copyValueOf(password);
        char confirmPassword[]=Confirm_Password.getPassword();
        String string_confirmPassword=String.copyValueOf(confirmPassword);
        String role=String.valueOf(Role.getSelectedItem());
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish the connection
            String url = "jdbc:mysql://localhost:3306/NEC_Hotel";
            String user = "root";
            String pass = "root";
            connection = DriverManager.getConnection(url, user, pass);
            // Create a statement
            statement = connection.createStatement();
            // Execute a query
            String query = "Insert into User values ('" + firstName + "','" + middleName +
                    "','" + lastName +"','" + gender + "'," + age + ",'" + email + "','" + 
                    username + "','" + string_password + "','" + role + "');";
            System.out.println(query);
            int status;
            try{
            status = statement.executeUpdate(query);
            }
            catch(SQLIntegrityConstraintViolationException e){
                System.out.println("Username Already Exist ! ");
                JFrame UsernameAlreadyExistPopupMenu=new JFrame("Message");
                JOptionPane.showMessageDialog(UsernameAlreadyExistPopupMenu,"Usename already exists", "Message",JOptionPane.ERROR_MESSAGE);
                status = 0;
            }
            if(status==1){
                JFrame AccountCreatedPopupMenu=new JFrame("Message");
                JOptionPane.showMessageDialog(AccountCreatedPopupMenu,"Congratulations!! account has been created.", "Message",JOptionPane.CLOSED_OPTION);
            }
            else{
                JFrame AccountCreatedPopupMenu=new JFrame("Message");
                JOptionPane.showMessageDialog(AccountCreatedPopupMenu,"Opps!, something went wrong.", "Message",JOptionPane.ERROR_MESSAGE);
            }
        } 
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            // Close connections and resources in the reverse order of creation
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            }catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_Create_AccountActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void Confirm_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Confirm_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Confirm_PasswordActionPerformed

    private void Last_Name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Last_Name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Last_Name1ActionPerformed

    private void UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFocusLost
        String username=Username.getText(); 
        String query="Select * from User where Username='"+username+"';";
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish the connection
            String url = "jdbc:mysql://localhost:3306/NEC_Hotel";
            String user = "root";
            String pass = "root";
            connection = DriverManager.getConnection(url, user, pass);
            // Create a statement
            statement = connection.createStatement();
            // Execute a query

            resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                Password.setEnabled(false);
                Confirm_Password.setEnabled(false);
                Role.setEnabled(false);
                Create_Account.setEnabled(false);
                // Retrieve data by column name or index
                String data = resultSet.getString("username");
                // Process retrieved data
                System.out.println(data);
                JFrame UsernameAlreadyExistPopupMenu=new JFrame("Message");
                JOptionPane.showMessageDialog(UsernameAlreadyExistPopupMenu,"Usename already exists", "Message",JOptionPane.ERROR_MESSAGE);  
            }
            else{
                Password.setEnabled(true);
                Confirm_Password.setEnabled(true);
                Role.setEnabled(true);
                Create_Account.setEnabled(true);
            }
        }
        catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
        } finally {
            // Close connections and resources in the reverse order of creation
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            }
            catch (SQLException e) {
                e.printStackTrace();
            }
        }                                       

    }//GEN-LAST:event_UsernameFocusLost

    private void Confirm_PasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Confirm_PasswordFocusLost
       char password[]=Password.getPassword();
       String string_password=String.copyValueOf(password);
       char confirmPassword[]=Confirm_Password.getPassword();
       String string_confirmPassword=String.copyValueOf(confirmPassword);
       
       if(!string_password.equals(string_confirmPassword)){
           Create_Account.setEnabled(false);
           JFrame ConfirmPasswordPopupMenu=new JFrame("Message");
           JOptionPane.showMessageDialog(ConfirmPasswordPopupMenu,"Password do not match","Message",JOptionPane.ERROR_MESSAGE);
       }
       else{
           Create_Account.setEnabled(true);
       }
      
    }//GEN-LAST:event_Confirm_PasswordFocusLost

    private void Log_InActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Log_InActionPerformed
        Login login=new Login(); 
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Log_InActionPerformed

    private void Create_AccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Create_AccountMouseEntered
       String firstName=First_Name.getText();
       //String middleName=Middle_Name.getText();
       String lastName=Email.getText();
       String gender;
       if(Male.isSelected())
           gender="Male";
       else if(Female.isSelected())
           gender="Female";
       else if(Other.isSelected())
           gender="Other";
       else
           gender="";
       int age;
       try {
           age=Integer.parseInt(Age.getText());
       }
       catch (NumberFormatException e){
           //System.out.println("Age has not been entered ! ");
           age=0;
       }
       String email=Email.getText(); 
       String username=Username.getText();
       char password[]=Password.getPassword();
       String string_password=String.copyValueOf(password);
       char confirmPassword[]=Confirm_Password.getPassword();
       String string_confirmPassword=String.copyValueOf(confirmPassword);
       //String role=String.valueOf(Role.getSelectedItem());
       if((firstName.equals("")|| lastName.equals("")|| gender.equals("")|| 
               age==0 || email.equals("")|| username.equals("")||
               string_password.equals("")|| string_confirmPassword.equals(""))|| 
               !string_password.equals(string_confirmPassword)
               )
           Create_Account.setEnabled(false);
       else 
           Create_Account.setEnabled(true);
    }//GEN-LAST:event_Create_AccountMouseEntered

    private void UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFocusGained
        Password.setEnabled(true);
        Confirm_Password.setEnabled(true);
        Role.setEnabled(true);
        Create_Account.setEnabled(true);

    }//GEN-LAST:event_UsernameFocusGained

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        ManagerDashboard  managerDashboard=new ManagerDashboard(); 
        managerDashboard.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Age;
    private javax.swing.JButton Back;
    private javax.swing.JPasswordField Confirm_Password;
    private javax.swing.JButton Create_Account;
    private javax.swing.JTextField Email;
    private javax.swing.JRadioButton Female;
    private javax.swing.JTextField First_Name;
    private javax.swing.JTextField Last_Name1;
    private javax.swing.JButton Log_In;
    private javax.swing.JRadioButton Male;
    private javax.swing.JTextField Middle_Name;
    private javax.swing.JRadioButton Other;
    private javax.swing.JPasswordField Password;
    private javax.swing.JComboBox<String> Role;
    private javax.swing.JTextField Username;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
    
}
