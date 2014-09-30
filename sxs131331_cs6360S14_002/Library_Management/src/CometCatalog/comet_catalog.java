

package CometCatalog;
import java.math.BigDecimal;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AttributeSet;
import javax.swing.text.*;



 class LengthRestrictedDocument extends PlainDocument {

  private final int limit;

  public LengthRestrictedDocument(int limit) {
    this.limit = limit;
  }

  @Override
  public void insertString(int offs, String str, AttributeSet a)
      throws BadLocationException {
    if (str == null)
      return;

    if ((getLength() + str.length()) <= limit) {
      super.insertString(offs, str, a);
    }
  }
}

 
public class comet_catalog extends javax.swing.JFrame {
    static Connection conn = null;

    public comet_catalog() {
        initComponents();
        jTextField1.setDocument(new LengthRestrictedDocument(10));
        jTextField2.setDocument(new LengthRestrictedDocument(50));
        jTextField3.setDocument(new LengthRestrictedDocument(25));
        jTextField4.setDocument(new LengthRestrictedDocument(25));
        jTextField5.setDocument(new LengthRestrictedDocument(25));
        
    }

    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Comet Library");

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Search Here!"));

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("BOOK ID");

        jLabel2.setText("TITLE");
        jLabel2.setToolTipText("");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel3.setText("AUTHOR NAME");
        jLabel3.setToolTipText("");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel4.setText("first name");
        jLabel4.setToolTipText("");

        jLabel5.setText("middle name");
        jLabel5.setToolTipText("");

        jLabel6.setText("last name");
        jLabel6.setToolTipText("");

        jRadioButton1.setText("Search on full author name concatenated in the order provided");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField2))
                                .addGap(100, 100, 100)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(121, 121, 121)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(30, 30, 30)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel5)
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13)
                                        .addComponent(jTextField4)))))
                        .addGap(22, 22, 22))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jRadioButton1)
                .addContainerGap())
        );

        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Catalog"));
        jPanel2.setFont(new java.awt.Font("Arial Black", 2, 18)); // NOI18N

        jTable1.setBackground(new java.awt.Color(255, 153, 153));
        jTable1.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "TITLE", "AUTHOR", "BRANCH", "AVAILABLE COPIES", "IN PLACE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );

        jButton4.setText("Issue Selected  Item");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Return Item");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Add new Borrower");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Fine List");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Find a Borrower");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(58, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(32, 32, 32)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton3)))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton8))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton6))
                        .addGap(42, 42, 42)
                        .addComponent(jButton7))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
public static BigDecimal round(float d, int decimalPlace) {
        BigDecimal bd = new BigDecimal(Float.toString(d));
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);       
        return bd;
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         jTextField1.setText("");
         jTextField2.setText("");  
         jTextField3.setText("");
         jTextField4.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                    
                        String search_id;
                        String search_title;
                        String search_author_name;
                        String fname;
                        String lname;
                        String minit;
                        
                        String search;
                      
                   
                        search_id=jTextField1.getText();
                        search_title=jTextField2.getText();
                        fname=jTextField3.getText();
                        lname=jTextField4.getText();
                        minit=jTextField5.getText();
                        
                        String[] option ={fname, minit, lname};
                        search_author_name="";
                        int i;
                        
                        for(i=0;i<3;i++)
                        {
                           if (!option[i].isEmpty() && !search_author_name.isEmpty())
                           {
                              
                             search_author_name=search_author_name + "\t" + option[i];
                           }
                           
                           if (!option[i].isEmpty() && search_author_name.isEmpty())
                           {
                              
                             search_author_name=option[i];
                           }
                        
                        }
                        
                
               System.out.println(search_author_name);         
               if(search_id.isEmpty() && search_title.isEmpty() && fname.isEmpty() && lname.isEmpty() && minit.isEmpty())
                        {
                         JOptionPane.showMessageDialog(this, "Enter at least one value");
                         return;   
                        }
			
     
        try{
         Class.forName("com.mysql.jdbc.Driver");    
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management", "root", "welcome6" );
     
         PreparedStatement pst;
         if(jRadioButton1.isSelected())
         {
         search = "SELECT book.book_id as A, title,GROUP_CONCAT(author_name), branch_id as B, no_of_copies, no_of_copies - (select count(*) from book_loans where book_id=A and branch_id=B and date_in IS NULL ) FROM book, book_authors, book_copies WHERE book.book_id=book_authors.book_id AND book_copies.book_id=book.book_id AND book.book_id LIKE ? AND title LIKE ? AND author_name LIKE ? GROUP BY book.book_id, branch_id;";
         
         pst = conn.prepareStatement( search );
         pst.setString(1, "%" + search_id +"%");
         pst.setString(2, "%" + search_title + "%");
         pst.setString(3, "%" + search_author_name + "%");
         }
         else
         {
             search = "SELECT book.book_id as A, title,GROUP_CONCAT(author_name), branch_id as B, no_of_copies, no_of_copies - (select count(*) from book_loans where book_id=A and branch_id=B and date_in IS NULL ) FROM book, book_authors, book_copies WHERE book.book_id=book_authors.book_id AND book_copies.book_id=book.book_id AND book.book_id LIKE ? AND title LIKE ? AND fname LIKE ? AND minit LIKE ? AND lname LIKE ? GROUP BY book.book_id, branch_id;";
         
         pst = conn.prepareStatement( search );
         pst.setString(1, "%" + search_id +"%");
         pst.setString(2, "%" + search_title + "%");
         pst.setString(3, "%" + fname + "%");
         pst.setString(4, "%" + minit + "%");
         pst.setString(5, "%" + lname + "%");
             
             
         }
        
         ResultSet rs = pst.executeQuery();
                             
         ResultSetMetaData meta = rs.getMetaData();
         int numberOfColumns = meta.getColumnCount();
         
         
           if (!rs.next()){
               
          JOptionPane.showMessageDialog(this, "No item found");
          jTable1.repaint();
         return;
}
           
         
              while (jTable1.getRowCount() > 0) {
            ((DefaultTableModel) jTable1.getModel()).removeRow(0);
        }
             
        
        jTable1.setRowSelectionAllowed(true);
        
        
        rs.previous();
         while (rs.next()) {
               Object [] rowData = new Object[numberOfColumns]; 
                   for (i = 0; i < rowData.length; ++i)
                {
                    rowData[i] = rs.getObject(i+1);
                }
                   
             ((DefaultTableModel) jTable1.getModel()).insertRow(rs.getRow() - 1,rowData); 
            
         }
          jTable1.setCellSelectionEnabled(false); 
          jTable1.setRowSelectionAllowed(true);
        
        
  
        rs.close();
	conn.close();// End while(rs.next())
        
       
        
        
        }
        catch(SQLException ex) {
			System.out.println("Error in connection: " + ex.getMessage());
		}
        catch (ClassNotFoundException ex)
        {
            System.out.println("Class not found:" + ex.getMessage());
        } 
                
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
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
        
       
        if (Integer.parseInt( jTable1.getValueAt(row, 5).toString())== 0)
        {
            JOptionPane.showMessageDialog(this, "No available copies. Check later");
            return; 
            
        }
        String[] options = {"OK"};
       JPanel panel = new JPanel();
       JLabel lbl = new JLabel("Enter Card Number: ");
       JTextField txt = new JTextField(10);
       panel.add(lbl);
       panel.add(txt);
       int selectedOption = JOptionPane.showOptionDialog(null, panel, "COMET CARD", JOptionPane.NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options , options[0]);
       String card_no;
if(selectedOption == 0)
{
    card_no = txt.getText();
    
}
else
{
    JOptionPane.showMessageDialog(this, "Check out cancelled");
    return;
}

        try{
         Class.forName("com.mysql.jdbc.Driver");    
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management", "root", "welcome6" );
         String s1 = "select card_no from borrower where card_no=?";
         PreparedStatement pst1 = conn.prepareStatement( s1 );
         
         
         pst1.setString(1, card_no);
         ResultSet rs1 = pst1.executeQuery();
                      
         if (!rs1.next())
         {
          JOptionPane.showMessageDialog(this, "Not a valid card number","", JOptionPane.DEFAULT_OPTION, null);
          return;
         }
         
         String s2 = "select count(card_no) from book_loans where card_no=? AND date_in IS NOT null";
          PreparedStatement pst2 = conn.prepareStatement( s2 );
         pst2.setString(1, card_no);
         ResultSet rs2 = pst2.executeQuery();
         
         while(rs2.next()){
           
        if (Integer.parseInt( rs2.getObject(1).toString())== 3)
        {
         JOptionPane.showMessageDialog(this, "Borrower has reached the limit. Cannot check out any more books.");
          return;
        }   
        
        String insert_new_loan = "insert into book_loans(book_id, branch_id, card_no, date_out, date_due) values(?,?,?,?,?)";
        PreparedStatement pst3 = conn.prepareStatement( insert_new_loan );
        
        String book_id = jTable1.getValueAt(row, 0).toString();
        pst3.setString(1,book_id );
        String branch_id = jTable1.getValueAt(row, 3).toString();
        pst3.setString(2, branch_id);
        
        int card = Integer.parseInt(card_no);
        pst3.setInt(3,card);
        
        java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
        java.sql.Timestamp due_date = new java.sql.Timestamp(new java.util.Date().getTime() + (14* 1000 * 60 * 60 * 24));
        pst3.setTimestamp(4, date);
        pst3.setTimestamp(5, due_date);
        
        
         
       int x = pst3.executeUpdate();
       if(x==1)
       {
           JOptionPane.showMessageDialog(this, "Successfully Checked out");
            jButton2.doClick();
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
                            
      
          
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     comet_check_in c = new comet_check_in(); 
    c.setDefaultCloseOperation(c.DISPOSE_ON_CLOSE);
   c.setVisible(true);        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      comet_borrower c = new comet_borrower();
      c.setDefaultCloseOperation(c.DISPOSE_ON_CLOSE);
      c.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
         
         
        try{
         Class.forName("com.mysql.jdbc.Driver");    
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management", "root", "welcome6" );
        
         String s1 = "select loan_id from book_loans where (date_in IS NULL and date_due < ?) or (date_in IS NOT NULL and date_due < date_in )";
         PreparedStatement ps1 = conn.prepareStatement( s1 );
         
         java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
         
         ps1.setTimestamp(1, date);
         ResultSet rs1 = ps1.executeQuery();
         
         
         
         while(rs1.next())
         {
         
             int loan =Integer.parseInt(rs1.getObject(1).toString());
             
             String s0 = "select * from fines where loan_id=?";
             PreparedStatement ps0 =conn.prepareStatement(s0);
             
             ps0.setInt(1, loan);
             ResultSet rs0 = ps0.executeQuery();
             
            
             
           String s2 = "select date_in, date_due from book_loans where loan_id=?" ;
           PreparedStatement ps3 = conn.prepareStatement(s2);
           ps3.setInt(1, loan);
           ResultSet rs3 = ps3.executeQuery();
           
           
           rs3.next();
           java.sql.Timestamp date_in = rs3.getTimestamp(1);    
           float fine; 
           BigDecimal rounded_fine;
           
           java.sql.Timestamp date_due = rs3.getTimestamp(2);
       
             
             //not available already
            if(!rs0.next())
             {
                 s2 ="insert into fines values(?,?,?)";
                 PreparedStatement ps4 = conn.prepareStatement(s2);
                 ps4.setInt(1, loan);
                 
                 //not checked in
                 if (date_in ==null)
                 {
                   int diff = (int)(date.getTime() - date_due.getTime());  
                  fine = (float)diff /(float)(1000*60*60*24);
                   fine = fine * ((float)(1)/(float)(4)); 
                   if (fine<0.25) {fine = (float)0.25; }
                   rounded_fine = round(fine, 2);
                 }
                 //checked in
                 else
                 {
                     int diff = (int)(date_in.getTime() - date_due.getTime());  
                   fine = (float)diff /(float)(1000*60*60*24);
                   fine = fine * ((float)(1)/(float)(4)); 
                   if (fine<0.25) {fine = (float)0.25; }
                    rounded_fine = round(fine, 2);
                 }       
                 ps4.setBigDecimal(2, rounded_fine);
                 ps4.setBoolean(3, false);
                 ps4.executeUpdate();
                 }
                                       
             //already in loans; update fine if not paid
             else
             {
              s1 = "select paid from fines where loan_id=?";
             PreparedStatement ps2 = conn.prepareStatement(s1);
             
             ps2.setInt(1, loan);             
             ResultSet rs2 = ps2.executeQuery();
             
             while(rs2.next())
             {
                String pay_status = rs2.getObject(1).toString();
                
                if(pay_status == "true" )
                {
                }
                else
                {
                  s2 ="update fines set fine_amount=? where loan_id=?";
                 PreparedStatement ps4 = conn.prepareStatement(s2);
                 ps4.setInt(2, loan);
                 
                 //not checked in
                 if (date_in ==null)
                 {  
                   int diff = (int)(date.getTime() - date_due.getTime());  
                   fine = (float)diff /(float)(1000*60*60*24);
                   fine = fine * ((float)(1)/(float)(4)); 
                   if (fine<0.25) {fine = (float)0.25; }
                    rounded_fine = round(fine, 2);
                 }
                 //checked in
                 else
                 {
                     
                   int diff = (int)(date_in.getTime() - date_due.getTime());  
                   fine = (float)diff /(float)(1000*60*60*24);
                   fine = fine * ((float)(1)/(float)(4));
                   if (fine<0.25) {fine = (float)0.25; }
                    rounded_fine = round(fine, 2); 
                 }       
                 ps4.setBigDecimal(1, rounded_fine);
                 ps4.executeUpdate();  
                 
                }
    
             } 
              
             }
                              
             
         }
             
          comet_fines c = new comet_fines();
          c.setDefaultCloseOperation(1);
          c.setVisible(true);
             
        conn.close();
        }
         catch(SQLException ex) {
            
			System.out.println("Error in connection: " + ex.getMessage());
		}
        catch (ClassNotFoundException ex)
            
        {
            
            System.out.println("Class not found:" + ex.getMessage());
        } 
               
        
        
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        comet_view_borrower c = new comet_view_borrower();
        c.setDefaultCloseOperation(c.DISPOSE_ON_CLOSE);
        c.setVisible(true);
        
        
        
    }//GEN-LAST:event_jButton8ActionPerformed

   
    public static void main(String args[]) {
      
        
        
       
           
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new comet_catalog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
