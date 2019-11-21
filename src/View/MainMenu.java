/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controllers.*;
import Model.*;
/**
 *
 * @author jimmy
 */
public class MainMenu extends javax.swing.JFrame {

   
    
    private static LoginCΟΝ cLogin;
    private static User user;
    private static ChangePassCON pas;
    
    public MainMenu() {
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

        loginbutton = new javax.swing.JButton();
        menubutton = new javax.swing.JButton();
        logoutbutton = new javax.swing.JButton();
        changepassbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginbutton.setText("Log-in");
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });

        menubutton.setText("Menu");
        menubutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menubuttonActionPerformed(evt);
            }
        });

        logoutbutton.setText("Log-out");
        logoutbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbuttonActionPerformed(evt);
            }
        });

        changepassbutton.setText("change pass");
        changepassbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changepassbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loginbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menubutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutbutton)
                    .addComponent(changepassbutton))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginbutton)
                    .addComponent(changepassbutton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menubutton)
                    .addComponent(logoutbutton))
                .addContainerGap(164, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed
        // TODO add your handling code here:
        if(cLogin==null){
        cLogin = new LoginCΟΝ();
        user=cLogin.getUser();
        }
        
        
        
    }//GEN-LAST:event_loginbuttonActionPerformed

    private void menubuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menubuttonActionPerformed
        // TODO add your handling code here:
        user=cLogin.getUser();        
        if (user instanceof Grammateia){         
            grammateia.setVisible(true);           
            }
        else if (user instanceof Foititis){            
            mathitis=new MathitisUI((Foititis)user);
            mathitis.setVisible(true);
        }
        else if (user instanceof Kathigitis){
            kath=new KathigitisUI((Kathigitis)user);
            kath.setVisible(true);
        }
    }//GEN-LAST:event_menubuttonActionPerformed

    private void logoutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbuttonActionPerformed
        user=null;
        cLogin=null;
    }//GEN-LAST:event_logoutbuttonActionPerformed

    private void changepassbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changepassbuttonActionPerformed
        // TODO add your handling code here:        
        user=cLogin.getUser();
        if(user!=null){
        pas= new ChangePassCON(user);
        }
    }//GEN-LAST:event_changepassbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }
    
    GrammateiaUI grammateia = new GrammateiaUI();
    MathitisUI mathitis;
    KathigitisUI kath;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changepassbutton;
    private javax.swing.JButton loginbutton;
    private javax.swing.JButton logoutbutton;
    private javax.swing.JButton menubutton;
    // End of variables declaration//GEN-END:variables
}
