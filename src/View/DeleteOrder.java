/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import FashionShop.*;
import controller.Controller;
import javax.swing.JOptionPane;
import model.Customer;

/**
 *
 * @author Yasas Pasindu
 */
public class DeleteOrder extends javax.swing.JFrame {

    /**
     * Creates new form SearchCustomer
     */
    public static boolean isvalid;
    public String temporyIdHolder;
    public DeleteOrder() {
        initComponents();
         setTitle("Delete Order");
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Searchbutton = new javax.swing.JButton();
        placeBack = new javax.swing.JButton();
        textPhone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbId = new javax.swing.JLabel();
        lbAmount = new javax.swing.JLabel();
        lbIdQty = new javax.swing.JLabel();
        lbCusid = new javax.swing.JLabel();
        lbSize = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();
        deletebtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Searchbutton.setBackground(new java.awt.Color(255, 51, 51));
        Searchbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Searchbutton.setForeground(new java.awt.Color(255, 255, 255));
        Searchbutton.setText("Search");
        Searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(Searchbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, -1, -1));

        placeBack.setBackground(new java.awt.Color(0, 204, 153));
        placeBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        placeBack.setForeground(new java.awt.Color(255, 255, 255));
        placeBack.setText("Back");
        placeBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeBackActionPerformed(evt);
            }
        });
        getContentPane().add(placeBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(textPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 200, -1));

        jLabel3.setText("Order ID :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel4.setText("Customer ID :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jLabel5.setText("Size :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jLabel6.setText("QTY :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        jLabel7.setText("Amount :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));
        getContentPane().add(lbId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 210, 30));
        getContentPane().add(lbAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 210, 30));
        getContentPane().add(lbIdQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 210, 30));
        getContentPane().add(lbCusid, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 210, 30));
        getContentPane().add(lbSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 210, 30));

        jLabel1.setText("Status :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));
        getContentPane().add(lbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 220, 30));

        deletebtn.setBackground(new java.awt.Color(102, 102, 255));
        deletebtn.setForeground(new java.awt.Color(255, 255, 255));
        deletebtn.setText("Delete Order");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });
        getContentPane().add(deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Enter Order ID :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchbuttonActionPerformed
     String id = textPhone.getText();
     temporyIdHolder=id;
     Customer search = Controller.searchCustomer(id);
        try {
            lbId.setText(search.getId());
            lbCusid.setText(search.getPhoneNumber()+"");
            lbIdQty.setText(search.getQty()+"");
            lbAmount.setText(search.getAmount()+"");
            lbSize.setText(search.getSize());
            lbStatus.setText(search.getStatus());
            isvalid=true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"invalid Input ");
        }
      
    }//GEN-LAST:event_SearchbuttonActionPerformed

    private void placeBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeBackActionPerformed

        this.dispose();
    }//GEN-LAST:event_placeBackActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
       DeletePopup dp = new DeletePopup(temporyIdHolder);
       dp.setVisible(true);
    }//GEN-LAST:event_deletebtnActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Searchbutton;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbAmount;
    private javax.swing.JLabel lbCusid;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbIdQty;
    private javax.swing.JLabel lbSize;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JButton placeBack;
    private javax.swing.JTextField textPhone;
    // End of variables declaration//GEN-END:variables
}
