/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abdulaziz;

import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

public class AddControlling extends javax.swing.JFrame {

    connect c = new connect();
    int t = 0;
    DefaultTableModel dm;

    DefaultTableModel tblmodel;

    public AddControlling() {
        initComponents();
    }

//    public void filter(String qu) {
//        dm = (DefaultTableModel) jTable1.getModel();
//        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dm);
//        jTable1.setRowSorter(tr);
//        tr.setRowFilter(RowFilter.regexFilter(qu));
//    }
//
//    public void serch(String str) {
//        tblmodel = (DefaultTableModel) jTable1.getModel();
//        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(tblmodel);
//        jTable1.setRowSorter(trs);
//        trs.setRowFilter(RowFilter.regexFilter(""));
//        trs.setRowFilter(RowFilter.regexFilter(str));
//
//    }

    public void updet() { //للحذف
        String sgl = "select * from users";
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        FullName = new javax.swing.JTextField();
        PhoneNumber = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        IdentificationNumber = new javax.swing.JTextField();
        Member = new javax.swing.JRadioButton();
        Admin = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        age = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        ubdata = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        forSerching = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("AddControlling");

        PhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PhoneNumberKeyPressed(evt);
            }
        });

        IdentificationNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IdentificationNumberKeyPressed(evt);
            }
        });

        buttonGroup1.add(Member);
        Member.setText("Member");

        buttonGroup1.add(Admin);
        Admin.setText("Admin");
        Admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("username");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("email");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("password");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("age");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("FullName");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("phone number");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("address");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Identification Number");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("type");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
                "id", "username", "email", "password", "age", "fullname", "phonnumber", "addressl", "iden", "type"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setText("show");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Delete.setText("delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        ubdata.setText("edit");
        ubdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubdataActionPerformed(evt);
            }
        });

        jButton4.setText("saveubdata");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        forSerching.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forSerchingActionPerformed(evt);
            }
        });
        forSerching.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                forSerchingKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                forSerchingKeyReleased(evt);
            }
        });

        jButton5.setText("jButton5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel6)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(512, 512, 512)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(124, 124, 124)
                                                .addComponent(Admin)
                                                .addGap(50, 50, 50)
                                                .addComponent(Member)
                                                .addGap(58, 58, 58)
                                                .addComponent(jButton1)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(31, 31, 31)
                                                .addComponent(jButton4))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(FullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(51, 51, 51)
                                                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(67, 67, 67)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel1)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel9)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(IdentificationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel3)))))))
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(forSerching, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addComponent(Delete)
                        .addGap(95, 95, 95)
                        .addComponent(ubdata))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jButton5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {FullName, IdentificationNumber, PhoneNumber, email, password, username});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel2)))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(29, 29, 29)
                        .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(FullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(IdentificationNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(Admin)
                            .addComponent(Member)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ubdata, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(forSerching, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(jButton5)
                .addContainerGap(263, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {FullName, IdentificationNumber, PhoneNumber, address, email, password, username});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (age.getDate() == null) {
            JOptionPane.showMessageDialog(null, "مايصير فارغ تخلي");
        } else {
//      String timecreate =((JTextField)age.getDateEditor().getUiComponent()).getText();
//        jButton1.setText(timecreate);
            String user, ema, pass, FL, PN, ADD, ide, type;
            user = username.getText();
            ema = email.getText();
            pass = password.getText();
//        String timecreate = ((JTextField) age.getDateEditor().getUiComponent()).getText();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String timecreate = sdf.format(age.getDate());

            FL = FullName.getText();
            PN = PhoneNumber.getText();
            ADD = address.getText();
            ide = IdentificationNumber.getText();
            type = "";
            if (Admin.isSelected()) {
                type = Admin.getText();
            }
            if (Member.isSelected()) {
                type = Member.getText();
            }

            if (user == "" && ema == "" && pass == "" && FL == "" && PN == "" && ADD == "" && ide == "" && type == "") {
                try {
                    int a = c.stmt.executeUpdate("insert into users values"
                            + "('" + 0 + "','" + user + "','" + ema + "','" + pass + "','" + timecreate + "','" + FL + "','" + PN + "',"
                            + "'" + ADD + "','" + ide + "','" + type + "')");
                    if (a == 1) {
                        JOptionPane.showMessageDialog(null, "Information saved");
                        updet();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error");
                    }
                } catch (Exception e) {
                    System.out.println("Connection error");
                }
            } else {
                JOptionPane.showMessageDialog(null, "مايصير فارغ تخلي");
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dashboard Dsh = new dashboard();
        Dsh.setLocationRelativeTo(Dsh);
        Dsh.setTitle("Dsh");
        Dsh.setVisible(true);
        Dsh.setSize(922, 722);
        Dsh.setLocation(220, 10);
        this.dispose();    }//GEN-LAST:event_jButton2ActionPerformed

    private void PhoneNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PhoneNumberKeyPressed
        String numberOfCyrilNumber = PhoneNumber.getText();
        int lenght = numberOfCyrilNumber.length();
        char c = evt.getKeyChar();

        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (lenght < 10) {
                PhoneNumber.setEditable(true);
            } else {
                PhoneNumber.setEditable(false);
            }
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                PhoneNumber.setEditable(true);
            } else {
                PhoneNumber.setEditable(false);
            }

        }
    }//GEN-LAST:event_PhoneNumberKeyPressed

    private void IdentificationNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdentificationNumberKeyPressed
        String numberOfCyrilNumber = IdentificationNumber.getText();
        int lenght = numberOfCyrilNumber.length();
        char c = evt.getKeyChar();

        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            if (lenght < 10) {
                IdentificationNumber.setEditable(true);
            } else {
                IdentificationNumber.setEditable(false);
            }
        } else {
            if (evt.getExtendedKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode() == KeyEvent.VK_DELETE) {
                IdentificationNumber.setEditable(true);
            } else {
                IdentificationNumber.setEditable(false);
            }

        }    }//GEN-LAST:event_IdentificationNumberKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTable1.setModel(new DefaultTableModel(null, new String[]{"id", "username", "email", "password", "age", "fullname", "phonnamber", "addres", "iden", "type"}));
        if (t == 0) {

            try {

                String sgl = "select * from users";
                c.rs = c.stmt.executeQuery(sgl);
                while (c.rs.next()) {
                    String id = c.rs.getString("id");
                    String usn = c.rs.getString("username");
                    String em = c.rs.getString("email");
                    String pss = c.rs.getString("password");
                    String ag = c.rs.getString("age");
                    String full = c.rs.getString("FullName");
                    String pn = c.rs.getString("PhoneNumber");
                    String add = c.rs.getString("address");
                    String in = c.rs.getString("IdentificationNumber");
                    String type = c.rs.getString("type");

                    String tbData[] = {id, usn, em, pss, ag, full,
                        pn, add, in, type};
                    tblmodel = (DefaultTableModel) jTable1.getModel();
                    tblmodel.addRow(tbData);
                }

            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, "Error calling data");
            }

        }
//        t = 1;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        //  int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
        String id = model.getValueAt(selectedIndex, 0).toString();
        int dialogresult = JOptionPane.showConfirmDialog(null, "do you want delet", "waring", JOptionPane.YES_NO_OPTION);
        if (dialogresult == JOptionPane.YES_NO_OPTION) {
            try {
                c.pd = c.con.prepareStatement("delete from  users where id = ?");
                c.pd.setString(1, id);
                c.pd.executeUpdate();
                JOptionPane.showMessageDialog(this, "recor deleted");
                updet();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, " error");
            }
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void ubdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubdataActionPerformed

        int i = jTable1.getSelectedRow();
        id.setText(jTable1.getModel().getValueAt(i, 0).toString());
        username.setText(jTable1.getModel().getValueAt(i, 1).toString());
        email.setText(jTable1.getModel().getValueAt(i, 2).toString());
        password.setText(jTable1.getModel().getValueAt(i, 3).toString());
        try {
            Date timecreate = new SimpleDateFormat("yyyy-MM-dd").parse((String) jTable1.getValueAt(i, 4));
            age.setDate(timecreate);
        } catch (Exception e) {
        }

        FullName.setText(jTable1.getModel().getValueAt(i, 5).toString());
        PhoneNumber.setText(jTable1.getModel().getValueAt(i, 6).toString());
        address.setText(jTable1.getModel().getValueAt(i, 7).toString());
        IdentificationNumber.setText(jTable1.getModel().getValueAt(i, 8).toString());
        String sex = jTable1.getModel().getValueAt(i, 9).toString();
        if (sex.equals("Admin")) {
            Admin.setSelected(true);
        } else {
            Member.setSelected(true);
        }


    }//GEN-LAST:event_ubdataActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try {
            c.pd = c.con.prepareStatement("UPDATE users SET id=?, username=?, email=?, password=?, age=?, FullName=?, PhoneNumber=?, address=?, IdentificationNumber=?, type=?  WHERE id='" + id.getText() + "'");
            c.pd.setString(1, id.getText());
            c.pd.setString(2, username.getText());
            c.pd.setString(3, email.getText());
            c.pd.setString(4, password.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String timecreate = sdf.format(age.getDate());
            c.pd.setString(5, timecreate);
            c.pd.setString(6, FullName.getText());
            c.pd.setString(7, PhoneNumber.getText());
            c.pd.setString(8, address.getText());
            c.pd.setString(9, IdentificationNumber.getText());
            if (Admin.isSelected()) {
                c.pd.setString(10, Admin.getText());
            } else {
                c.pd.setString(10, Member.getText());
            }
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
    }//GEN-LAST:event_jButton4ActionPerformed

    private void forSerchingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forSerchingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forSerchingActionPerformed

    private void forSerchingKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_forSerchingKeyPressed
//  String serch = forSerching.getText();
//        serch(serch);        // TODO add your handling code here:

//        try {
//            String sql = "select * from users where username = ?";
//            
//            c.pd=c.con.prepareStatement(sql);
//            c.pd.setString(1, forSerching.getText());
//            c.rs=c.pd.executeQuery();
//            jTable1.setModel(DbUtils.resultSetToTableModel(c.rs));
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
//        finally{
//            try {
//                c.rs.close();
//                c.pd.close();
//            } catch (Exception e) {
//            }
//        }
//String qu = forSerching.getText().toLowerCase();
//filter(qu);
    }//GEN-LAST:event_forSerchingKeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
//             try {
//            String sql = "select * from users where username = ?";
//            
//            c.pd=c.con.prepareStatement(sql);
//            c.pd.setString(1, forSerching.getText());
//            c.rs=c.pd.executeQuery();
//            jTable1.setModel(DbUtils.resultSetToTableModel(c.rs));
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
//        finally{
//            try {
//                c.rs.close();
//                c.pd.close();
//            } catch (Exception e) {
//            }
//        }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void forSerchingKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_forSerchingKeyReleased
//             try {
//            String sql = "select * from users where username = ? ";
//            
//            c.pd=c.con.prepareStatement(sql);
//            c.pd.setString(1, forSerching.getText());
//            c.rs=c.pd.executeQuery();
//            jTable1.setModel(DbUtils.resultSetToTableModel(c.rs));
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
//        finally{
//            try {
//                c.rs.close();
//                c.pd.close();
//            } catch (Exception e) {
//            }
//        }

//         ********** عااااااااااااااااااااش
        jTable1.setModel(new DefaultTableModel(null, new String[]{"id", "username", "email", "password", "age", "fullname", "phonnamber", "addres", "iden", "type"}));
        if (t == 0) {

            try {

                String sql = "select * from users where concat(username,type) like '%" + forSerching.getText() + "%' ";
                c.rs = c.stmt.executeQuery(sql);
                while (c.rs.next()) {
                    String id = c.rs.getString("id");
                    String usn = c.rs.getString("username");
                    String em = c.rs.getString("email");
                    String pss = c.rs.getString("password");
                    String ag = c.rs.getString("age");
                    String full = c.rs.getString("FullName");
                    String pn = c.rs.getString("PhoneNumber");
                    String add = c.rs.getString("address");
                    String in = c.rs.getString("IdentificationNumber");
                    String type = c.rs.getString("type");

                    String tbData[] = {id, usn, em, pss, ag, full,
                        pn, add, in, type};
                    tblmodel = (DefaultTableModel) jTable1.getModel();
                    tblmodel.addRow(tbData);
                }

            } catch (Exception e) {
                JOptionPane.showConfirmDialog(null, "Error calling data");
            }

        }

    }//GEN-LAST:event_forSerchingKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, usernamehe default look and feel.
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
            java.util.logging.Logger.getLogger(AddControlling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddControlling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddControlling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddControlling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddControlling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Admin;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField FullName;
    private javax.swing.JTextField IdentificationNumber;
    private javax.swing.JRadioButton Member;
    private javax.swing.JTextField PhoneNumber;
    private javax.swing.JTextField address;
    private com.toedter.calendar.JDateChooser age;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField email;
    private javax.swing.JTextField forSerching;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField password;
    private javax.swing.JButton ubdata;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
