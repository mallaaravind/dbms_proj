/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms_proj;

import java.awt.Component;
import java.awt.PopupMenu;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.ListModel;
import javax.swing.SwingUtilities;

/**
 *
 * @author R.VENKATESH
 */
public class page1_1 extends javax.swing.JFrame {

    String mobile;
    String custname;
    int balance;
    int companyid;
    String cname;
    int recharge;
    String[] list2g;
    String[] list3g;
    String[] listdth;
    String[] listtt;
    String s;
    int wallet;
    int i;
    Vector v;

    /**
     * Creates new form page1_1
     */
    public page1_1() {
        initComponents();
    }

    public page1_1(String mob, String name, int bal, int cid) {
        Vector v = new Vector();
        JList list = new JList(v);
        mobile = mob;
        custname = name;
        balance = bal;
        companyid = cid;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:local/local@localhost:1521/xe");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from company where c_id = " + companyid);

            while (rs.next()) {
                cname = rs.getString(2);
            }
            con.close();
            initComponents();
            Connection con5 = DriverManager.getConnection(
                    "jdbc:oracle:thin:local/local@localhost:1521/xe");
            Statement stmt5 = con5.createStatement();
            ResultSet rs5 = stmt5.executeQuery("select * from plan");
            while (rs5.next()) {

                System.out.println(rs5.getString(2));
                sel.addItem(rs5.getString(2));
            }
            con5.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pop = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        rec = new javax.swing.JDialog();
        jButton6 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        sel = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JList();
        remove = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        pop.setTitle("deletion");
        pop.setBounds(new java.awt.Rectangle(100, 100, 400, 400));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("YOUR ACCOUNT HAS BEEN SUCCESFULLY DELETED!!");
        jScrollPane2.setViewportView(jTextArea1);

        jButton1.setText("Go Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout popLayout = new javax.swing.GroupLayout(pop.getContentPane());
        pop.getContentPane().setLayout(popLayout);
        popLayout.setHorizontalGroup(
            popLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(79, 79, 79))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, popLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        popLayout.setVerticalGroup(
            popLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(popLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addGroup(popLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        rec.setBounds(new java.awt.Rectangle(0, 0, 400, 400));

        jButton6.setText("Recharge Amount");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Check Wallet");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Go Home");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout recLayout = new javax.swing.GroupLayout(rec.getContentPane());
        rec.getContentPane().setLayout(recLayout);
        recLayout.setHorizontalGroup(
            recLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recLayout.createSequentialGroup()
                .addGroup(recLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(recLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jButton6)
                        .addGap(48, 48, 48)
                        .addGroup(recLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(recLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(recLayout.createSequentialGroup()
                .addGroup(recLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(recLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jButton7))
                    .addGroup(recLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jButton8)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        recLayout.setVerticalGroup(
            recLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(recLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton8)
                .addGap(59, 59, 59)
                .addGroup(recLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(recLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Hi, "+custname);

        jLabel2.setText(cname+" plans");

        sel.setSelectedItem(null);
        sel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(list);

        remove.setText("Click to Delete");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        jLabel3.setText("remove account ?");

        jButton3.setText("confirm");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Wallet Balance");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("recharge wallet");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton9.setText("Exit");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(sel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(506, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jButton3)
                .addGap(161, 161, 161))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(remove, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton5))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(sel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton3)))
                .addGap(2, 2, 2)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(remove)
                    .addComponent(jLabel3)
                    .addComponent(jButton9))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selActionPerformed
        try {

            // TODO add your handling code here:
            //list.add((PopupMenu) sel.getSelectedItem());
            sleep(100);
            s = sel.getSelectedItem().toString();

            System.out.println(s);
        } catch (InterruptedException ex) {
            Logger.getLogger(page1_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            DefaultListModel dlm = new DefaultListModel();
            Connection con1 = DriverManager.getConnection(
                    "jdbc:oracle:thin:local/local@localhost:1521/xe");
            Statement stmt1 = con1.createStatement();
            int x;
            ResultSet rs1 = stmt1.executeQuery("select plan_no from plan where plan_name=" + "'" + s + "'");
            while (rs1.next()) {
                System.out.println(rs1.getInt(1));
                //dlm.addElement(rs1.getInt(1));
                x = rs1.getInt(1);
                //System.out.println(v);
                if (x == 1) {
                    ResultSet rs2 = stmt1.executeQuery("select * from table3g where c_id=" + companyid);

                    while (rs2.next()) {
                        dlm.addElement(rs2.getString(2) + ":" + rs2.getInt(3));
                        list.setModel(dlm);
                    }
                }
                if (x == 2) {
                    ResultSet rs2 = stmt1.executeQuery("select * from table2g where c_id=" + companyid);
                    while (rs2.next()) {
                        dlm.addElement(rs2.getString(2) + ":" + rs2.getInt(3));
                        list.setModel(dlm);
                    }
                }
                if (x == 3) {
                    ResultSet rs2 = stmt1.executeQuery("select * from tabledth where c_id=" + companyid);
                    while (rs2.next()) {
                        dlm.addElement(rs2.getString(2) + ":" + rs2.getInt(3));
                        list.setModel(dlm);
                    }
                }
                if (x == 4) {
                    ResultSet rs2 = stmt1.executeQuery("select * from tablett where c_id=" + companyid);
                    while (rs2.next()) {
                        dlm.addElement(rs2.getString(2) + ":" + rs2.getInt(3));
                        list.setModel(dlm);
                    }
                }

//sel.addItem(rs1.getString(2));
            }/*
             */
            con1.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_selActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        // TODO add your handling code here:
        try {
            int id;
            Connection con2 = DriverManager.getConnection(
                    "jdbc:oracle:thin:local/local@localhost:1521/xe");
            Statement stmt1 = con2.createStatement();
            Statement stmt2 = con2.createStatement();
            Statement stmt3 = con2.createStatement();
            ResultSet rs2 = stmt2.executeQuery("select * from customer where phone_no=" + mobile);
            stmt1.executeQuery("delete from customer where phone_no=" + mobile);
            while (rs2.next()) {
                stmt3.executeQuery("update customer set cust_id=cust_id-1 where cust_id >" + rs2.getInt(1));
            }

            //list.setModel((ListModel) v);
            //sel.addItem(rs1.getString(2));
            pop.setVisible(true);

            this.dispose();
            con2.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_removeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Component component = (Component) evt.getSource();
        JDialog dialog = (JDialog) SwingUtilities.getRoot(component);
        dialog.dispose();
        new page1().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(page1_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        try {
            String x1 = list.getSelectedValue().toString();
            System.out.println(x1);
            String x2 = null;
            int z = 0;
            for (int k1 = 0; k1 < x1.length(); k1++) {
                if (x1.charAt(k1) == ':') {
                    x2 = x1.substring(k1 + 1);
                    System.out.println(x2);
                    z = Integer.parseInt(x2);
                    System.out.println(z);
                }

            }
            int flag = 0;
            Connection con2 = DriverManager.getConnection(
                    "jdbc:oracle:thin:local/local@localhost:1521/xe");
            Statement stmt1 = con2.createStatement();
            ResultSet rs1 = stmt1.executeQuery("select balance from customer where phone_no=" + mobile);
            while (rs1.next()) {
                if (rs1.getInt(1) < z) {
                    jLabel4.setText("not enough amount in the wallet");
                    flag = 1;
                }
            }
            if (flag == 0) {
                stmt1.executeQuery("update customer set balance=balance-" + z + " where phone_no=" + mobile);
                //stmt1.executeQuery("update customer set wallet=wallet-"+z+" where phone_no="+mobile);
                jLabel4.setText("Your balance has been recharged!");
            }

            con2.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:local/local@localhost:1521/xe");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select balance from customer where phone_no = " + mobile);
            while (rs.next()) {
                int x = 0;
                x = rs.getInt(1);
                String z = null;
                z = Integer.toString(x);

                jLabel5.setText(z);

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        rec.setVisible(true);

        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:local/local@localhost:1521/xe");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("update customer set balance=balance+" + Integer.parseInt(jTextField1.getText())
                    + "where phone_no=" + mobile);

            con.close();
            jLabel6.setText("amount recharged successfully!");
        } catch (Exception e) {
            System.out.println(e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection(
                    "jdbc:oracle:thin:local/local@localhost:1521/xe");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select balance from customer where phone_no = " + mobile);
            while (rs.next()) {
                int x = 0;
                x = rs.getInt(1);
                String z = null;
                z = Integer.toString(x);

                jLabel7.setText(z);

            }
        } catch (Exception e) {
            System.out.println(e);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Component component = (Component) evt.getSource();
        JDialog dialog = (JDialog) SwingUtilities.getRoot(component);
        dialog.dispose();
        new page1_1(this.mobile, this.custname, this.balance, this.companyid).setVisible(true);
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        new page1().setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(page1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(page1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(page1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(page1_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new page1_1().setVisible(true);

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
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JList list;
    private javax.swing.JDialog pop;
    private javax.swing.JDialog rec;
    private javax.swing.JButton remove;
    private javax.swing.JComboBox sel;
    // End of variables declaration//GEN-END:variables
}
