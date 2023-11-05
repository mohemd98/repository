package abdulaziz;

import java.awt.event.KeyEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class AddProducts extends javax.swing.JFrame {

    connect c = new connect();
    ViewProducts s3 = new ViewProducts();

    public AddProducts() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NameMaterial = new javax.swing.JTextField();
        Company = new javax.swing.JTextField();
        CyrilNumber = new javax.swing.JTextField();
        NumberMaterial = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        SinglePriceInDinars = new javax.swing.JTextField();
        TotalPriceInDinars = new javax.swing.JTextField();
        PurchaseSource = new javax.swing.JTextField();
        VoucherNumber = new javax.swing.JTextField();
        BuyerPersonName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        forID = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("AddProduct");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("name  of material");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("company");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Cyril Number");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("number of material");

        CyrilNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CyrilNumberActionPerformed(evt);
            }
        });
        CyrilNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CyrilNumberKeyPressed(evt);
            }
        });

        NumberMaterial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NumberMaterialKeyPressed(evt);
            }
        });

        save.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        back.setText("back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Single price in dinars");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Total price in dinars");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Purchase source (store name)");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("voucher number");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Buyer person name");

        SinglePriceInDinars.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SinglePriceInDinarsKeyPressed(evt);
            }
        });

        TotalPriceInDinars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalPriceInDinarsActionPerformed(evt);
            }
        });
        TotalPriceInDinars.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TotalPriceInDinarsKeyPressed(evt);
            }
        });

        VoucherNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                VoucherNumberKeyPressed(evt);
            }
        });

        jButton1.setText("updata");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        forID.setText("forID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addGap(167, 167, 167)
                        .addComponent(forID)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TotalPriceInDinars)
                            .addComponent(SinglePriceInDinars)
                            .addComponent(NumberMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                            .addComponent(CyrilNumber)
                            .addComponent(Company)
                            .addComponent(NameMaterial)
                            .addComponent(PurchaseSource)
                            .addComponent(VoucherNumber)
                            .addComponent(BuyerPersonName))
                        .addGap(212, 212, 212))))
            .addGroup(layout.createSequentialGroup()
                .addGap(375, 375, 375)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(forID)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(NameMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Company, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3))
                                        .addGap(27, 27, 27)
                                        .addComponent(CyrilNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NumberMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addComponent(SinglePriceInDinars, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
                        .addGap(31, 31, 31)
                        .addComponent(TotalPriceInDinars, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PurchaseSource, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(VoucherNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BuyerPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(save, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CyrilNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CyrilNumberActionPerformed


    }//GEN-LAST:event_CyrilNumberActionPerformed

    private void CyrilNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CyrilNumberKeyPressed
        String numberOfCyrilNumber = CyrilNumber.getText();
        int lenght = numberOfCyrilNumber.length();
        char c = evt.getKeyChar();

        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (lenght < 10) {
                CyrilNumber.setEditable(true);
            } else {
                CyrilNumber.setEditable(false);
            }
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                CyrilNumber.setEditable(true);
            } else {
                CyrilNumber.setEditable(false);
            }

        }

    }//GEN-LAST:event_CyrilNumberKeyPressed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dashboard Dsh = new dashboard();
        Dsh.setLocationRelativeTo(Dsh);
        Dsh.setTitle("Dsh");
        Dsh.setVisible(true);
        Dsh.setSize(922, 722);
        Dsh.setLocation(220, 10);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

        String com, name, cm, nm, SPI, TI, PS, VN, BPN;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        name = NameMaterial.getText();
        com = Company.getText();
        cm = CyrilNumber.getText();
        nm = NumberMaterial.getText();
        SPI = SinglePriceInDinars.getText();
        TI = TotalPriceInDinars.getText();
        PS = PurchaseSource.getText();
        VN = VoucherNumber.getText();
        BPN = BuyerPersonName.getText();

     if(name.isEmpty() && com.isEmpty() && cm.isEmpty() && nm.isEmpty() && SPI.isEmpty() && 
             TI.isEmpty() && PS.isEmpty() && VN.isEmpty() && BPN.isEmpty() ){
         
         JOptionPane.showMessageDialog(null, "مايصير فارغ تخلي");
     }else{
            try {
            int a = c.stmt.executeUpdate("INSERT INTO Products VALUES"
                    + "('" + 0 + "','" + name + "','" + com + "','" + cm + "','" + nm + "'"
                    + ",'" + SPI + "','" + TI + "','" + PS + "','" + VN + "','" + BPN + "','"
                    + dtf.format(now) + "')");
            if (a == 1) {
                JOptionPane.showMessageDialog(null, "data saved");
                NameMaterial.setText("");
                Company.setText("");
                CyrilNumber.setText("");
                NumberMaterial.setText("");
                SinglePriceInDinars.setText("");
                TotalPriceInDinars.setText("");
                PurchaseSource.setText("");
                VoucherNumber.setText("");
                BuyerPersonName.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Error");
            }
        } catch (Exception e) {
            System.out.println("Connection error");
        }
     }


    }//GEN-LAST:event_saveActionPerformed

    private void TotalPriceInDinarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalPriceInDinarsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalPriceInDinarsActionPerformed

    private void NumberMaterialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NumberMaterialKeyPressed

        String numberOfCyrilNumber = NumberMaterial.getText();
        int lenght = numberOfCyrilNumber.length();
        char c = evt.getKeyChar();

        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (lenght < 10) {
                NumberMaterial.setEditable(true);
            } else {
                NumberMaterial.setEditable(false);
            }
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                NumberMaterial.setEditable(true);
            } else {
                NumberMaterial.setEditable(false);
            }

        }

    }//GEN-LAST:event_NumberMaterialKeyPressed

    private void SinglePriceInDinarsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SinglePriceInDinarsKeyPressed
        String numberOfCyrilNumber = SinglePriceInDinars.getText();
        int lenght = numberOfCyrilNumber.length();
        char c = evt.getKeyChar();

        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (lenght < 10) {
                SinglePriceInDinars.setEditable(true);
            } else {
                SinglePriceInDinars.setEditable(false);
            }
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                SinglePriceInDinars.setEditable(true);
            } else {
                SinglePriceInDinars.setEditable(false);
            }

        }
    }//GEN-LAST:event_SinglePriceInDinarsKeyPressed

    private void TotalPriceInDinarsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TotalPriceInDinarsKeyPressed
        String numberOfCyrilNumber = TotalPriceInDinars.getText();
        int lenght = numberOfCyrilNumber.length();
        char c = evt.getKeyChar();

        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (lenght < 10) {
                TotalPriceInDinars.setEditable(true);
            } else {
                TotalPriceInDinars.setEditable(false);
            }
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                TotalPriceInDinars.setEditable(true);
            } else {
                TotalPriceInDinars.setEditable(false);
            }

        }    }//GEN-LAST:event_TotalPriceInDinarsKeyPressed

    private void VoucherNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VoucherNumberKeyPressed
        String numberOfCyrilNumber = VoucherNumber.getText();
        int lenght = numberOfCyrilNumber.length();
        char c = evt.getKeyChar();

        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (lenght < 10) {
                VoucherNumber.setEditable(true);
            } else {
                VoucherNumber.setEditable(false);
            }
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                VoucherNumber.setEditable(true);
            } else {
                VoucherNumber.setEditable(false);
            }

        }    }//GEN-LAST:event_VoucherNumberKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            c.pd = c.con.prepareStatement("UPDATE Products SET id=?, NameMaterial=?, Company=?, CyrilNumber=?, NumberMaterial=?, SinglePriceInDinars=?, TotalPriceInDinars=?, PurchaseSource=?, VoucherNumber=?, BuyerPersonName=?  WHERE id='" + forID.getText() + "'");
            c.pd.setString(1, forID.getText());
            c.pd.setString(2, NameMaterial.getText());
            c.pd.setString(3, Company.getText());
            c.pd.setString(4, CyrilNumber.getText());
            c.pd.setString(5, NumberMaterial.getText());
            c.pd.setString(6, SinglePriceInDinars.getText());
            c.pd.setString(7, TotalPriceInDinars.getText());
            c.pd.setString(8, PurchaseSource.getText());
            c.pd.setString(9, VoucherNumber.getText());
            c.pd.setString(10, BuyerPersonName.getText());
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
        s3.updet();
        s3.setVisible(true);
        this.dispose();


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
            java.util.logging.Logger.getLogger(AddProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProducts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField BuyerPersonName;
    public javax.swing.JTextField Company;
    public javax.swing.JTextField CyrilNumber;
    public javax.swing.JTextField NameMaterial;
    public javax.swing.JTextField NumberMaterial;
    public javax.swing.JTextField PurchaseSource;
    public javax.swing.JTextField SinglePriceInDinars;
    public javax.swing.JTextField TotalPriceInDinars;
    public javax.swing.JTextField VoucherNumber;
    private javax.swing.JButton back;
    public javax.swing.JButton forID;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
