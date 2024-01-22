/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import View.MainMenu;
import controller.Controller;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Customer;

/**
 *
 * @author Yasas Pasindu
 */
public class SearchCustomer extends javax.swing.JFrame {
int phoneNumber;
    /**
     * Creates new form SearchCustomer
     */
    public SearchCustomer() {
        initComponents();
        setTitle("Search Customer");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        totAmount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        Searchbutton.setBackground(new java.awt.Color(255, 51, 51));
        Searchbutton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Searchbutton.setForeground(new java.awt.Color(255, 255, 255));
        Searchbutton.setText("Search");
        Searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchbuttonActionPerformed(evt);
            }
        });

        placeBack.setBackground(new java.awt.Color(0, 204, 153));
        placeBack.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        placeBack.setForeground(new java.awt.Color(255, 255, 255));
        placeBack.setText("Back");
        placeBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeBackActionPerformed(evt);
            }
        });

        textPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPhoneActionPerformed(evt);
            }
        });

        jLabel3.setText("Enter Customer ID :");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Size", "Qty", "Amount"
            }
        ));
        jScrollPane1.setViewportView(table);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Sub Total = ");

        totAmount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        totAmount.setText(".00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(placeBack)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel3)
                        .addGap(24, 24, 24)
                        .addComponent(textPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(Searchbutton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel2)
                        .addGap(245, 245, 245)
                        .addComponent(totAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(placeBack)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Searchbutton)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(textPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(totAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchbuttonActionPerformed
        try {
            phoneNumber = Integer.parseInt(textPhone.getText());
        } catch (Exception e) {
        }
         setData();
    }//GEN-LAST:event_SearchbuttonActionPerformed

    private void setData(){
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        
        Customer tempar[] = Controller.itemsByAmount();
        int amountSum = 0;
        
        for (int i = 0; i < tempar.length; i++) {
          if (tempar[i].getPhoneNumber()==phoneNumber)
			{
            for (int j = 0; j < tempar.length; j++) {

                if (tempar[i].getPhoneNumber() == phoneNumber) {
                    amountSum += tempar[j].getAmount();
                   model.addRow( new Object [] {tempar[j].getSize(),tempar[j].getQty(),tempar[j].getAmount()+".00"});
                }

            }

            break;
            }else if (i==tempar.length-1)
			{
                            JOptionPane.showMessageDialog(this, "This Phone Number Not Exits !");
			}
        }
        totAmount.setText(amountSum+".00");
    }
    
    private void placeBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeBackActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_placeBackActionPerformed

    private void textPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPhoneActionPerformed

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
            java.util.logging.Logger.getLogger(SearchCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Searchbutton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton placeBack;
    private javax.swing.JTable table;
    private javax.swing.JTextField textPhone;
    private javax.swing.JLabel totAmount;
    // End of variables declaration//GEN-END:variables
}