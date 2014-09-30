/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CometCatalog;
import java.math.BigDecimal;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AttributeSet;
import javax.swing.text.*;

public class comet_fines extends javax.swing.JFrame {
    static Connection conn = null;
  
    public comet_fines() {
         initComponents();
        try{
         Class.forName("com.mysql.jdbc.Driver");    
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management", "root", "welcome6" );        
         java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
         
         String s = "select * from fines ";
         PreparedStatement ps = conn.prepareStatement(s);
       
         ResultSet rs = ps.executeQuery();
         
          ResultSetMetaData meta = rs.getMetaData();
         int numberOfColumns = meta.getColumnCount();
         
         
           if (!rs.next()){
               
          JOptionPane.showMessageDialog(this, "None of the loans have any fine!");
          jTable1.repaint();
         return;
}
           
         
              while (jTable1.getRowCount() > 0) {
            ((DefaultTableModel) jTable1.getModel()).removeRow(0);
        }
             
        rs.previous();
         while (rs.next()) {
               Object [] rowData = new Object[numberOfColumns]; 
                   
                
                    rowData[0] = rs.getInt(1); 
                    rowData[1] = rs.getFloat(2);
                    rowData[2] = rs.getBoolean(3);
                   
             ((DefaultTableModel) jTable1.getModel()).insertRow(rs.getRow() - 1,rowData); 
            
         }
          jTable1.setCellSelectionEnabled(false); 
          jTable1.setRowSelectionAllowed(true);    
        jTable1.setRowSelectionAllowed(true);
         
         
        conn.close();
        }
         catch(SQLException ex) {
			System.out.println("Error in connection: " + ex.getMessage());
		}
        catch (ClassNotFoundException ex)
        {
            System.out.println("Class not found:" + ex.getMessage());
        } 
          
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Comet Library");

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));

        jTable1.setBackground(new java.awt.Color(255, 153, 153));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "LOAN ID", "FINE ($)", "PAID(y/n)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Float.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jButton1.setText("PAY");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("FINE TABLE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      if (jTable1.getSelectedRow()==-1)
        {
            JOptionPane.showMessageDialog(this, "Select a search item to check out");
            return;
        }
        if (jTable1.getSelectedRowCount() > 1)
        {
         JOptionPane.showMessageDialog(this, "Error. Multiple items selected");
            return;
        }
        int row = jTable1.getSelectedRow();
        
        if(jTable1.getValueAt(row, 0)== null) {
          JOptionPane.showMessageDialog(this, "Select a search item to check out");
            return;       
        }
        
        
         
         
        //when paid already
        if((boolean)jTable1.getValueAt(row, 2) == true )
                { JOptionPane.showMessageDialog(this, "Already paid"); return;   } 
         
        //when not paid
        else
        {
            try{
         Class.forName("com.mysql.jdbc.Driver");    
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management", "root", "welcome6" );
         
         String s = "select date_in from book_loans where loan_id =?";
         
        PreparedStatement ps1 = conn.prepareStatement(s);
        ps1.setInt(1, Integer.parseInt(jTable1.getValueAt(row,0).toString()));
        
        ResultSet rs1 = ps1.executeQuery(); 
        
        while (rs1.next())
        {
            //if book not returned
            if(rs1.getObject(1)==null)
            {
                JOptionPane.showMessageDialog(this, "Item not returned back yet");
                return;          
            }
            
            //if book returned
            else
            {
                
                     s = "update fines set paid = true where loan_id=?";
                     PreparedStatement ps2 = conn.prepareStatement(s);
                     ps2.setInt( 1 ,Integer.parseInt(jTable1.getValueAt(row,0).toString()) );
                    int x= ps2.executeUpdate();  
                    
                    if(x==1) { 
                     JOptionPane.showMessageDialog(this, "Successfully updated");
                     jTable1.setValueAt(true, row, 2);
                        
                    }
             
            }
            }
            
           
         
          conn.close();
         }
          catch(SQLException ex) {
			System.out.println("Error in connection: " + ex.getMessage());
		}
        catch (ClassNotFoundException ex)
        {
            System.out.println("Class not found:" + ex.getMessage());
        } 
                 
        
            }
    
            
            
           
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(comet_fines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(comet_fines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(comet_fines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(comet_fines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new comet_fines().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
