/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalPages;

import config.db_configuration;
import java.awt.BasicStroke;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableModel;
import myapp.usersForm;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Mark
 */
public class userPage extends javax.swing.JInternalFrame {

    /**
     * Creates new form userPage
     */
    public userPage() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
      Color addb = new Color(255,204,204);
     Color addB = new Color(240,240,240);
     
     Color hover = new Color(153,153,255);
    Color defButton = new Color(0,204,204);
    
    Border empty = BorderFactory.createEmptyBorder();
    
    void buttonBorderAnimation(JPanel panel){
    panel.setBackground(hover);
    panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    panel.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
    
    }
    
    void buttonDefaultColor(JPanel panel){
    panel.setBackground(defButton);
    panel.setBorder(empty);
    }
    
    public void displayData(){
       
        try{
       
            db_configuration dbc = new db_configuration();
            ResultSet rs = dbc.getData("SELECT * FROM users");
            tbl_users.setModel(DbUtils.resultSetToTableModel(rs));
       
        }catch(SQLException ex){
            System.out.println("Error Message: "+ex);
       
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_users = new javax.swing.JTable();
        Add = new javax.swing.JPanel();
        jl5 = new javax.swing.JLabel();
        Edit = new javax.swing.JPanel();
        jl2 = new javax.swing.JLabel();
        Delete = new javax.swing.JPanel();
        jl3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Delete1 = new javax.swing.JPanel();
        jl4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(tbl_users);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 620, 470));

        Add.setBackground(new java.awt.Color(0, 204, 204));
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddMouseExited(evt);
            }
        });
        Add.setLayout(null);

        jl5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl5.setText("ADD");
        Add.add(jl5);
        jl5.setBounds(10, 0, 60, 30);

        jPanel1.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, 30));

        Edit.setBackground(new java.awt.Color(0, 204, 204));
        Edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EditMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EditMouseExited(evt);
            }
        });
        Edit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl2.setText("EDIT");
        Edit.add(jl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 40, 30));

        jPanel1.add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 80, -1));

        Delete.setBackground(new java.awt.Color(0, 204, 204));
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeleteMouseExited(evt);
            }
        });
        Delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl3.setText("PRINT");
        Delete.add(jl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 30));

        jPanel1.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 80, -1));

        jTextField1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 130, 30));

        search.setBackground(new java.awt.Color(69, 193, 255));
        search.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        search.setText("Search");
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchMouseEntered(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, -1, 30));

        jPanel6.setBackground(new java.awt.Color(0, 204, 204));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jLabel5.setText("USER's PAGE ");
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 180, 40));

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/icons8-update-left-rotation-24.png"))); // NOI18N
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 20));

        jPanel6.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 50, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsFolder/icons8-name-55.png"))); // NOI18N
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 50, 40));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 40));

        Delete1.setBackground(new java.awt.Color(0, 204, 204));
        Delete1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Delete1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Delete1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Delete1MouseExited(evt);
            }
        });
        Delete1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl4.setText(" DELETE");
        Delete1.add(jl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 30));

        jPanel1.add(Delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 80, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
         JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        mainFrame.dispose();
         usersForm uf = new  usersForm();      
     uf.setVisible(true);
     uf.action = "Add";
     uf.jl6.setText("Save");
       
    }//GEN-LAST:event_AddMouseClicked

    private void AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseEntered
        Add.setBackground(new Color(0,153,255));
        buttonBorderAnimation(Add);
    }//GEN-LAST:event_AddMouseEntered

    private void AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseExited
        Add.setBackground(new Color(69,193,255));
        buttonDefaultColor(Add);
    }//GEN-LAST:event_AddMouseExited

    private void EditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditMouseClicked
    usersForm uf = new usersForm();
        int rowindex = tbl_users.getSelectedRow();
        if(rowindex < 0){
            JOptionPane.showMessageDialog(null, "Please select a data first!");
        }else{
           uf.action = "Edit";
           uf.jl6.setText("Update");
           JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
           mainFrame.dispose();
           uf.setVisible(true);
           
           TableModel model = tbl_users.getModel();
           usersForm.userID.setText(""+model.getValueAt(rowindex, 0));
           usersForm.fname.setText(""+model.getValueAt(rowindex, 1));
           usersForm.lname.setText(""+model.getValueAt(rowindex, 2));
           usersForm.bdate.setText(""+model.getValueAt(rowindex, 3));
           usersForm.email.setText(""+model.getValueAt(rowindex, 4));
           usersForm.username.setText(""+model.getValueAt(rowindex, 5));
           usersForm.password.setText(""+model.getValueAt(rowindex, 6));
            
            }
    }//GEN-LAST:event_EditMouseClicked

    private void EditMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditMouseEntered
        Edit.setBackground(new Color(0,153,255));
        buttonBorderAnimation(Edit);
    }//GEN-LAST:event_EditMouseEntered

    private void EditMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditMouseExited
        Edit.setBackground(new Color(69,193,255));
        buttonDefaultColor(Edit);
    }//GEN-LAST:event_EditMouseExited

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        MessageFormat header = new MessageFormat("Data of Employees");
        MessageFormat footer = new MessageFormat("Page {0, number, integer}");

        try{
            tbl_users.print(JTable.PrintMode.NORMAL, header, footer);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_DeleteMouseClicked

    private void DeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseEntered
         Delete.setBackground(new Color(0,153,255));
        buttonBorderAnimation(Delete);
    }//GEN-LAST:event_DeleteMouseEntered

    private void DeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseExited
        Delete.setBackground(new Color(69,193,255));
        buttonDefaultColor(Delete);
    }//GEN-LAST:event_DeleteMouseExited

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
 
    }//GEN-LAST:event_jPanel4MouseClicked

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseEntered

    }//GEN-LAST:event_searchMouseEntered

    private void Delete1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Delete1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Delete1MouseClicked

    private void Delete1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Delete1MouseEntered
       buttonBorderAnimation(Delete1);
    }//GEN-LAST:event_Delete1MouseEntered

    private void Delete1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Delete1MouseExited
       buttonDefaultColor(Delete1);
    }//GEN-LAST:event_Delete1MouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel Add;
    public static javax.swing.JPanel Delete;
    public static javax.swing.JPanel Delete1;
    public static javax.swing.JPanel Edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JLabel jl2;
    public static javax.swing.JLabel jl3;
    public static javax.swing.JLabel jl4;
    public static javax.swing.JLabel jl5;
    private javax.swing.JButton search;
    public static javax.swing.JTable tbl_users;
    // End of variables declaration//GEN-END:variables
}