package abdulaziz;

import java.awt.event.KeyEvent;
//import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GetProducts extends javax.swing.JFrame {

    connect c = new connect();

    String comboBox1text;

    public GetProducts() {
        initComponents();
        getNameMaterial();
        getnameUser();
        product.setSelectedItem(null);
    }

    public void getNameMaterial() {
        String sgl = "select  NameMaterial from Products ";
        try {
            c.rs = c.stmt.executeQuery(sgl);
            while (c.rs.next()) {
                String pat = c.rs.getString("NameMaterial");
                product.addItem(pat);
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error calling data");
        }
    }

    public void getnameUser() {
        String sgl = "select * from users ";
        try {
            c.rs = c.stmt.executeQuery(sgl);
            while (c.rs.next()) {
                String pat = c.rs.getString("username");
                userinter.addItem(pat);
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error calling data");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        datatime = new com.toedter.calendar.JDateChooser();
        section = new javax.swing.JTextField();
        product = new javax.swing.JComboBox<>();
        Recipient = new javax.swing.JTextField();
        namber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        company = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        userinter = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("GetProducts");

        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        product.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                productItemStateChanged(evt);
            }
        });
        product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                productMouseEntered(evt);
            }
        });
        product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productActionPerformed(evt);
            }
        });

        namber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                namberKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Company");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Date");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("namber");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("section");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Recipient");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Prodect");

        company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("username");

        jButton3.setText("NUMBER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jButton1)
                        .addGap(286, 286, 286)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(182, 182, 182)
                        .addComponent(Recipient, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(164, 164, 164)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(section)
                            .addComponent(product, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(datatime, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(namber)
                            .addComponent(company, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userinter, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addComponent(jButton3)))
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(338, 338, 338)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userinter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48))
                            .addComponent(jLabel8)))
                    .addComponent(product, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(company, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel4)
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(datatime, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(namber, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(section, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Recipient, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dashboard Dsh = new dashboard();
        Dsh.setLocationRelativeTo(Dsh);
        Dsh.setTitle("Dsh");
        Dsh.setVisible(true);
        Dsh.setSize(922, 722);
        Dsh.setLocation(220, 10);
        this.dispose();    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (datatime.getDate() == null) {
            JOptionPane.showMessageDialog(null, "مايصير فارغ تخلي");
        } else {
            if (userinter.getSelectedItem() == null && company.getSelectedItem() == null && product.getSelectedItem() == null) {
                JOptionPane.showMessageDialog(null, "مايصير فارغ تخلي");
            } else {
                String UN, pro, com, nb, sec, rec;
                UN = userinter.getSelectedItem().toString();
                pro = product.getSelectedItem().toString();
                com = company.getSelectedItem().toString();
                String timecreate = ((JTextField) datatime.getDateEditor().getUiComponent()).getText();
                nb = namber.getText();
                sec = section.getText();
                rec = Recipient.getText();
                if (nb.isEmpty() && sec.isEmpty() && rec.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "مايصير فارغ تخلي");
                } else {
                    try {
                        String sgl = "SELECT * FROM Products WHERE NameMaterial='" + pro + "' AND Company='" + com + "'";
                        c.rs = c.stmt.executeQuery(sgl);
                        while (c.rs.next()) {
                            String NumberMaterial = c.rs.getString("NumberMaterial");
                            int numberMaterialAffter = Integer.parseInt(NumberMaterial);
                            int numbetyouwnt = Integer.parseInt(namber.getText());
                            if (numbetyouwnt > numberMaterialAffter) {
                                System.out.println("انجب");
                                JOptionPane.showConfirmDialog(null, "انجب");
                            } else {
                                try {
                                    int a = c.stmt.executeUpdate("insert into GetProducts values"
                                            + "('" + 0 + "','" + UN + "','" + pro + "','" + com + "','" + timecreate + "','" + nb + "',"
                                            + "'" + sec + "','" + rec + "')");
                                    int finalaftter = numberMaterialAffter - numbetyouwnt;
                                    String s = String.valueOf(finalaftter);
                                    System.out.println(s);
                                    System.out.println(finalaftter);
                                    try {
                                        c.pd = c.con.prepareStatement("UPDATE Products SET   NumberMaterial=? WHERE NameMaterial='" + pro + "' AND Company='" + com + "'");
                                        c.pd.setString(1, s);
                                        c.pd.execute();
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
                                    if (a == 1) {
                                        JOptionPane.showMessageDialog(null, "Information saved");
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Error");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Connection error");
                                }
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("roor");
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void companyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyActionPerformed


    }//GEN-LAST:event_companyActionPerformed

    private void productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productActionPerformed

    }//GEN-LAST:event_productActionPerformed

    private void productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productMouseClicked

    }//GEN-LAST:event_productMouseClicked

    private void productMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productMouseEntered

        int itemCount = company.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            company.removeItemAt(0);
        }
        comboBox1text = String.valueOf(product.getSelectedItem());
        if (!comboBox1text.isEmpty() || comboBox1text != null) {
            try {
                String sql
                        = "SELECT Distinct Company FROM Products WHERE NameMaterial = '"
                        + comboBox1text + "' ";
                c.pd = c.con.prepareStatement(sql);
                c.rs = c.pd.executeQuery();
                while (c.rs.next()) {
                    String BItems = c.rs.getString("Company");
                    company.addItem(BItems);
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_productMouseEntered

    private void namberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namberKeyPressed
        String numberOfCyrilNumber = namber.getText();
        int lenght = numberOfCyrilNumber.length();
        char c = evt.getKeyChar();

        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (lenght < 10) {
                namber.setEditable(true);
            } else {
                namber.setEditable(false);
            }
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                namber.setEditable(true);
            } else {
                namber.setEditable(false);
            }

        }
    }//GEN-LAST:event_namberKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String pro = product.getSelectedItem().toString();
        String com = company.getSelectedItem().toString();

        try {
            String sgl = "SELECT * FROM Products WHERE NameMaterial='" + pro + "' AND Company='" + com + "'";
            c.rs = c.stmt.executeQuery(sgl);
            while (c.rs.next()) {
                String NumberMaterial = c.rs.getString("NumberMaterial");
                jButton3.setText(NumberMaterial);
            }

        } catch (Exception e) {
            System.out.println("roor");

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void productItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_productItemStateChanged
//        int itemCount = company.getItemCount();
//        for (int i = 0; i < itemCount; i++) {
//            company.removeItemAt(0);
//        }
//        comboBox1text = String.valueOf(product.getSelectedItem());
//        if (!comboBox1text.isEmpty() || comboBox1text != null) {
//            try {
//                String sql
//                        = "SELECT Distinct Company FROM Products WHERE NameMaterial = '"
//                        + comboBox1text + "' ";
//                c.pd = c.con.prepareStatement(sql);
//                c.rs = c.pd.executeQuery();
//                while (c.rs.next()) {
//                    String BItems = c.rs.getString("Company");
//                    company.addItem(BItems);
//                }
//            } catch (Exception ex) {
//                JOptionPane.showMessageDialog(null, ex.getMessage());
//            }
//        }
    }//GEN-LAST:event_productItemStateChanged

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
            java.util.logging.Logger.getLogger(GetProducts.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GetProducts.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GetProducts.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GetProducts.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GetProducts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Recipient;
    private javax.swing.JComboBox<String> company;
    private com.toedter.calendar.JDateChooser datatime;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField namber;
    private javax.swing.JComboBox<String> product;
    private javax.swing.JTextField section;
    private javax.swing.JComboBox<String> userinter;
    // End of variables declaration//GEN-END:variables

}
