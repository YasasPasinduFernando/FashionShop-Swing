/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import controller.Controller;
import javax.swing.JOptionPane;
import model.Customer;

/**
 *
 * @author Yasas Pasindu
 */
public class StatusPopup extends javax.swing.JFrame {
    Customer customer;
    /**
     * Creates new form NewJFrame
     */
    public StatusPopup() {
        initComponents();
       setTitle("Select an Option");
        setLocationRelativeTo(null);
    }
    public StatusPopup(Customer customer) {
        this.customer=customer;
        initComponents();
        setTitle("Select an Option");
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        deliveringPannel = new javax.swing.JPanel();
        Deliveringbtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Deliverdbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/questionmark.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 73, -1));

        jLabel1.setFont(new java.awt.Font("Elephant", 0, 12)); // NOI18N
        jLabel1.setText("Please Select The Status ?");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 225, 31));

        Deliveringbtn.setText("Delivering");
        Deliveringbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeliveringbtnActionPerformed(evt);
            }
        });
        deliveringPannel.add(Deliveringbtn);

        getContentPane().add(deliveringPannel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 100, -1));

        Deliverdbtn.setText("Deliverd");
        Deliverdbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeliverdbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Deliverdbtn);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 130, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeliveringbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeliveringbtnActionPerformed
        boolean isChanged = Controller.ChangeStatus(customer, "Delivering");
        customer.setStatus("Delivering");
        JOptionPane.showMessageDialog(this,"Status Updated to Delivering");
        this.dispose();
         
    }//GEN-LAST:event_DeliveringbtnActionPerformed

    private void DeliverdbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeliverdbtnActionPerformed
         boolean isChanged =Controller.ChangeStatus(customer, "Deliverd");
        JOptionPane.showMessageDialog(this,"Status Updated to Deliverd");
        this.dispose();
        
    }//GEN-LAST:event_DeliverdbtnActionPerformed

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
            java.util.logging.Logger.getLogger(StatusPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatusPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatusPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatusPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new StatusPopup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deliverdbtn;
    private javax.swing.JButton Deliveringbtn;
    private javax.swing.JPanel deliveringPannel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
