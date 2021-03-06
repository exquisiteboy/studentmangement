/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shcoollearningmangementsystem;

import java.util.logging.Logger;
import javax.swing.JOptionPane;
import shcoollearningmangementsystem.DataBase.DBConnection;

/**
 *
 * @author HSS
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
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

        jPanel1 = new javax.swing.JPanel();
        USERNAME = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        LOGIN_BUTTON = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PASSWORD = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SCHOOL LMS");
        setBackground(new java.awt.Color(0, 153, 153));
        setForeground(new java.awt.Color(204, 0, 255));

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 255, 204)));

        USERNAME.setToolTipText("Enter UserName");
        USERNAME.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 51, 255)));
        USERNAME.setSelectionColor(new java.awt.Color(0, 255, 0));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Password");

        LOGIN_BUTTON.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.activeTitleGradient"));
        LOGIN_BUTTON.setForeground(javax.swing.UIManager.getDefaults().getColor("EditorPane.selectionBackground"));
        LOGIN_BUTTON.setText("Login");
        LOGIN_BUTTON.setToolTipText("Login");
        LOGIN_BUTTON.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, javax.swing.UIManager.getDefaults().getColor("Menu.selectionBackground")));
        LOGIN_BUTTON.setName(""); // NOI18N
        LOGIN_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGIN_BUTTONActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(9, 45, 217));
        jLabel1.setText("                   Learning Mangement System ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("UserName");

        PASSWORD.setToolTipText("Password");
        PASSWORD.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 255)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LOGIN_BUTTON, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                            .addComponent(USERNAME)
                            .addComponent(PASSWORD))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(USERNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(PASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(LOGIN_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LOGIN_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGIN_BUTTONActionPerformed
       String TypeOFAccount=null;
        int ERROR=JOptionPane.ERROR_MESSAGE;
        
       String userName = null;
       String Password = null;
        try{
         userName=USERNAME.getText();
         Password=PASSWORD.getText();
        }catch(Exception ex)
        {
          System.out.println("messege from "+ex.getMessage());
       }
        
        DBConnection db=new DBConnection();
        db.getConnection();
 
        TypeOFAccount= db.LoginAuthanticator(userName, Password);

    
    
        
    
            
    switch(TypeOFAccount){
    
        case "admin":
        case "Admin":
         JOptionPane.showMessageDialog(rootPane, "Welcome Admin");
            
        this.dispose();
       new AdminArea().setVisible(true);
    
       
       break;
       
        case "Accountant":
            
       JOptionPane.showMessageDialog(rootPane, "Welcome Accountant");
            
        this.dispose();
       new AccountantArea().setVisible(true);
      
       break;
        
        
       
    }
            
            
            
            
            
                  
        
    }//GEN-LAST:event_LOGIN_BUTTONActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LOGIN_BUTTON;
    private javax.swing.JTextField PASSWORD;
    private javax.swing.JTextField USERNAME;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
