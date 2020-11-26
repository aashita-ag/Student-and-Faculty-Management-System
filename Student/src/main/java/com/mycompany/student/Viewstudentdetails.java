/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aashita
 */
public class Viewstudentdetails extends javax.swing.JFrame {

    static Viewstudentdetails frame;
    public Viewstudentdetails() {
        initComponents();
    }
    
    int fid = 0;
    
    public Viewstudentdetails(int s) {
        initComponents();
        fid=s;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fname1 = new javax.swing.JTextField();
        lname1 = new javax.swing.JTextField();
        gender1 = new javax.swing.JTextField();
        email1 = new javax.swing.JTextField();
        sid1 = new javax.swing.JTextField();
        show1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        add1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        mno1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        show2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Noto Serif CJK JP", 1, 15)); // NOI18N
        jLabel2.setText("Enter Student ID :");

        jLabel3.setFont(new java.awt.Font("Noto Serif CJK JP", 1, 15)); // NOI18N
        jLabel3.setText("First Name :");

        jLabel4.setFont(new java.awt.Font("Noto Serif CJK JP", 1, 15)); // NOI18N
        jLabel4.setText("Last Name :");

        jLabel5.setFont(new java.awt.Font("Noto Serif CJK JP", 1, 15)); // NOI18N
        jLabel5.setText("Gender :");

        jLabel6.setFont(new java.awt.Font("Noto Serif CJK JP", 1, 15)); // NOI18N
        jLabel6.setText("Address :");

        jLabel8.setFont(new java.awt.Font("Noto Serif CJK JP", 1, 15)); // NOI18N
        jLabel8.setText("E-mail :");

        email1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email1ActionPerformed(evt);
            }
        });

        sid1.setOpaque(false);

        show1.setFont(new java.awt.Font("Noto Serif CJK JP", 1, 15)); // NOI18N
        show1.setText("Show Details");
        show1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show1ActionPerformed(evt);
            }
        });

        add1.setColumns(20);
        add1.setRows(5);
        jScrollPane1.setViewportView(add1);

        jLabel7.setFont(new java.awt.Font("Noto Serif CJK JP", 1, 15)); // NOI18N
        jLabel7.setText("Mobile Number :");

        mno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mno1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Noto Serif CJK JP", 1, 24)); // NOI18N
        jLabel9.setText("Student List");

        show2.setFont(new java.awt.Font("Noto Serif CJK JP", 1, 15)); // NOI18N
        show2.setText("Show List");
        show2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(gender1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sid1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(fname1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(email1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                            .addComponent(mno1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(show1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lname1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(74, 74, 74)
                        .addComponent(show2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sid1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(show1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fname1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(lname1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gender1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(email1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mno1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(show2))
                .addContainerGap())
        );

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "First Name", "Last Name", "Gender", "Address", "Phone Number", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table);

        jLabel1.setFont(new java.awt.Font("Noto Serif CJK JP", 1, 24)); // NOI18N
        jLabel1.setText("Students Detail");

        jButton1.setFont(new java.awt.Font("Noto Serif CJK JP", 1, 18)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 903, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1022, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(132, 132, 132))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void email1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email1ActionPerformed

    private void show1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show1ActionPerformed
        
        int sid = Integer.parseInt(sid1.getText());
        add1.setLineWrap(true);
        add1.setWrapStyleWord(true);
        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentManage","root","12345678");
            Statement stmt= (Statement) con.createStatement();
            String query="SELECT * FROM Students JOIN Marksheet ON Students.sid=Marksheet.sid WHERE Students.sid='"+sid+"' AND fid="+fid+";";
            ResultSet rs = stmt.executeQuery(query);
            if(rs.next())
            {
                fname1.setText(rs.getString("f_name"));
                lname1.setText(rs.getString("l_name"));
                gender1.setText(rs.getString("gender"));
                add1.setText(rs.getString("address"));
                mno1.setText(rs.getString("phone_no"));
                email1.setText(rs.getString("email"));
                
                fname1.setEditable(false);
                lname1.setEditable(false);
                gender1.setEditable(false);
                add1.setEditable(false);
                mno1.setEditable(false);
                email1.setEditable(false);
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Please enter valid Student ID or check if the student is taught by you.");
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_show1ActionPerformed

    private void show2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show2ActionPerformed
        
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0);
        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
            DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentManage","root","12345678");
            Statement stmt= (Statement) con.createStatement();
            
            String query="SELECT Students.sid,f_name,l_name,address,gender,email,phone_no FROM Students JOIN Marksheet ON Students.sid=Marksheet.sid WHERE fid="+fid+";";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                String s_id = rs.getString("Students.sid");
                String f_name = rs.getString("f_name");
                String l_name = rs.getString("l_name");
                String address = rs.getString("address");
                String phone_no = rs.getString("phone_no");
                String gender = rs.getString("gender");
                String email = rs.getString("email");
                model.addRow(new Object[] {s_id,f_name,l_name,gender,address,phone_no,email});
                
            }
            
        }
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_show2ActionPerformed

    private void mno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mno1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        // TODO add your handling code here:
        
        new Faculty(Integer.toString(fid)).setVisible(true);
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
            java.util.logging.Logger.getLogger(Viewstudentdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Viewstudentdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Viewstudentdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Viewstudentdetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Viewstudentdetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea add1;
    private javax.swing.JTextField email1;
    private javax.swing.JTextField fname1;
    private javax.swing.JTextField gender1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lname1;
    private javax.swing.JTextField mno1;
    private javax.swing.JButton show1;
    private javax.swing.JButton show2;
    private javax.swing.JTextField sid1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}