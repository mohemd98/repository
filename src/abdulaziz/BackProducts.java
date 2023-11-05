package abdulaziz;

import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

public class BackProducts extends javax.swing.JFrame {

    connect c = new connect();
    int t = 0;
    DefaultTableModel tblmodel;

    public BackProducts() {
        initComponents();
    
    }

 

    public void serch(String str) {
        tblmodel = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tblmodel);
        jTable1.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));

    }

    public void updet() { //للحذف
        String sgl = "select * from GetProducts";
        try {
            c.pd = c.con.prepareStatement(sgl);
            c.rs = c.pd.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(c.rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                c.rs.close();
                c.pd.close();
            } catch (Exception e) {
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        prodectText = new javax.swing.JLabel();
        CompanyText = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        numberProtectTooBack = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        forSerching = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("BackProducts");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nameUser", "product", "company", "datetime", "namber", "section", "recipient"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton3.setText("show");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        prodectText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        prodectText.setText("Prodect");

        CompanyText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CompanyText.setText("company");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("=");

        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        forSerching.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                forSerchingKeyReleased(evt);
            }
        });

        jButton5.setText("printPDF");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(92, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(forSerching, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5)
                                .addGap(127, 127, 127))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(205, 205, 205)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jButton3)
                        .addGap(145, 145, 145))))
            .addGroup(layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(prodectText, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(CompanyText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(numberProtectTooBack, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(forSerching, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CompanyText, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prodectText, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(numberProtectTooBack, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(214, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dashboard Dsh = new dashboard();
        Dsh.setLocationRelativeTo(Dsh);
        Dsh.setTitle("Dsh");
        Dsh.setVisible(true);
        Dsh.setSize(922, 722);
        Dsh.setLocation(220, 10);
        this.dispose();    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if (t == 0) {
            try {
                String sgl = "select * from GetProducts";
                c.rs = c.stmt.executeQuery(sgl);
                while (c.rs.next()) {
                    //   String id=String.valueOf(rs.getInt("id"));//للقيمه الي تكون انتجر
                    String id = c.rs.getString("id");
                    String NameMaterial = c.rs.getString("nameUser");
                    String Company = c.rs.getString("product");
                    String CyrilNumber = c.rs.getString("company");
                    String NumberMaterial = c.rs.getString("datetime");
                    String spd = c.rs.getString("namber");
                    String tpd = c.rs.getString("section");
                    String ps = c.rs.getString("recipient");

                    String tbData[] = {id, NameMaterial, Company, CyrilNumber, NumberMaterial,
                        spd, tpd, ps};
                    tblmodel = (DefaultTableModel) jTable1.getModel();
                    tblmodel.addRow(tbData);
                }

            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, "Error calling data");
            }

        }
        t = 1;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int numberForTextBut = Integer.parseInt(numberProtectTooBack.getText());
        int numbeprodect = 0;
        try {
            String sql = "SELECT * FROM Products WHERE NameMaterial='" + prodectText.getText() + "' AND Company='" + CompanyText.getText() + "'";
            c.rs = c.stmt.executeQuery(sql);
            while (c.rs.next()) {
                String NumberMaterialFROMPROd = c.rs.getString("NumberMaterial");
                numbeprodect = Integer.parseInt(NumberMaterialFROMPROd);
            }
        } catch (Exception e) {
        }

//        *************************************************************
        try {
            String sgl = "SELECT * FROM GetProducts WHERE product='" + prodectText.getText() + "' AND company='" + CompanyText.getText() + "'";
            c.rs = c.stmt.executeQuery(sgl);
            while (c.rs.next()) {
                String NumberMaterial = c.rs.getString("namber");
                int numberMaterialAffterBACK = Integer.parseInt(NumberMaterial);

                if (numberForTextBut == numberMaterialAffterBACK) {

                    int finalnumbertobackprod = numberForTextBut + numbeprodect;

                    String s3 = String.valueOf(finalnumbertobackprod);

                    try {
                        c.pd = c.con.prepareStatement("UPDATE Products SET   NumberMaterial=? WHERE NameMaterial='" + prodectText.getText() + "' AND Company='" + CompanyText.getText() + "'");
                        c.pd.setString(1, s3);
                        c.pd.execute();
                        try {
                            c.pd = c.con.prepareStatement("delete from  GetProducts WHERE product='" + prodectText.getText() + "' AND company='" + CompanyText.getText() + "'");
                            c.pd.executeUpdate();
                            updet();
                        } catch (Exception e) {
                        }
                    } catch (Exception e) {
                        System.out.println("Connection error");
                    } finally {
                        try {
                            c.pd.close();
                            c.rs.close();
                        } catch (Exception e) {
                        }
                    }

                } else if (numberForTextBut > numberMaterialAffterBACK) {
                    JOptionPane.showConfirmDialog(null, "ماماخذ هلكد غراض");
                } else if (numberForTextBut <= 0) {
                    JOptionPane.showConfirmDialog(null, "مايصير حبيبي");
                } else {
                    int finalnumbertobackprod = numberForTextBut + numbeprodect;
                    int minsnumbertobackprod = numberMaterialAffterBACK - numberForTextBut;

                    String s = String.valueOf(finalnumbertobackprod);
                    String s2 = String.valueOf(minsnumbertobackprod);

                    try {
                        c.pd = c.con.prepareStatement("UPDATE Products SET   NumberMaterial=? WHERE NameMaterial='" + prodectText.getText() + "' AND Company='" + CompanyText.getText() + "'");
                        c.pd.setString(1, s);
                        c.pd.execute();
                        updet();
                        System.out.println("ok");
                    } catch (Exception e) {
                        System.out.println("Connection error");
                    } finally {
                        try {
                            c.pd.close();
                            c.rs.close();
                        } catch (Exception e) {
                        }
                    }

//                    **************************
                    try {
                        c.pd = c.con.prepareStatement("UPDATE GetProducts SET   namber=? WHERE product='" + prodectText.getText() + "' AND company='" + CompanyText.getText() + "'");
                        c.pd.setString(1, s2);
                        c.pd.execute();
                        System.out.println("ok");
                        updet();
                    } catch (Exception e) {
                        System.out.println("Connection error");
                    } finally {
                        try {
                            c.pd.close();
                            c.rs.close();
                        } catch (Exception e) {
                        }
                    }

                }

            }
        } catch (Exception e) {
            System.out.println("roor");
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
//        int i = jTable1.getSelectedRow();
//        prodectText.setText(jTable1.getModel().getValueAt(i, 2).toString());
//        CompanyText.setText(jTable1.getModel().getValueAt(i, 3).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void forSerchingKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_forSerchingKeyReleased
        String serch = forSerching.getText();
        serch(serch);
    }//GEN-LAST:event_forSerchingKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        MessageFormat header = new MessageFormat("Employees");
        MessageFormat footer = new MessageFormat("page(1)");

        try {
            //   t2.print(t2.printMode.NORMAL,header,footer);
            jTable1.print(JTable.PrintMode.NORMAL, footer, footer);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
  int i = jTable1.getSelectedRow();
        prodectText.setText(jTable1.getModel().getValueAt(i, 2).toString());
        CompanyText.setText(jTable1.getModel().getValueAt(i, 3).toString());    }//GEN-LAST:event_jTable1MousePressed

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
            java.util.logging.Logger.getLogger(BackProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BackProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BackProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BackProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BackProducts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CompanyText;
    private javax.swing.JTextField forSerching;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField numberProtectTooBack;
    private javax.swing.JLabel prodectText;
    // End of variables declaration//GEN-END:variables
}
