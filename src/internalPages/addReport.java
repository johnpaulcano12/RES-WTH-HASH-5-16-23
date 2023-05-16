/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internalPages;

import config.db_configuration;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Mark
 */
public class addReport extends javax.swing.JInternalFrame {

    /**
     * Creates new form dolphinList
     */
    public addReport() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
    
     int validateRegister(){
      int result;
      
      if(rep.getText().isEmpty() || addcom.getText().isEmpty() ||  status.getSelectedItem().equals("STATUS") ||  res_id.getSelectedItem().equals("RESIDENT ID")  ||  p_id.getSelectedItem().equals("PUROK ID")){
          Object message = "All fields are required!";
       JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
      result = 0;
      }else{
           
            result =1;
            }
    return result;
   
    }
       
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        addcom = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jl3 = new javax.swing.JLabel();
        jl4 = new javax.swing.JLabel();
        rep = new javax.swing.JTextField();
        status = new javax.swing.JComboBox<>();
        res_id = new javax.swing.JComboBox<>();
        p_id = new javax.swing.JComboBox<>();

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(null);

        jButton1.setBackground(new java.awt.Color(69, 193, 255));
        jButton1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(10, 460, 600, 30);

        addcom.setColumns(20);
        addcom.setRows(5);
        jScrollPane1.setViewportView(addcom);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 90, 600, 300);

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 16)); // NOI18N
        jLabel1.setText(" Add Complains : ");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 10, 170, 30);

        jTextField2.setBackground(new java.awt.Color(153, 255, 255));
        jTextField2.setForeground(new java.awt.Color(153, 255, 255));
        jTextField2.setBorder(null);
        jPanel2.add(jTextField2);
        jTextField2.setBounds(620, 0, 0, 14);

        jl3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jl3.setForeground(new java.awt.Color(148, 145, 145));
        jl3.setText(" Date");
        jPanel2.add(jl3);
        jl3.setBounds(10, 50, 100, 20);

        jl4.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jl4.setForeground(new java.awt.Color(148, 145, 145));
        jPanel2.add(jl4);
        jl4.setBounds(10, 40, 90, 20);

        rep.setFont(new java.awt.Font("Perpetua Titling MT", 1, 13)); // NOI18N
        rep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                repMouseClicked(evt);
            }
        });
        rep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                repKeyTyped(evt);
            }
        });
        jPanel2.add(rep);
        rep.setBounds(10, 40, 230, 40);

        status.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "STATUS", "Not Actioned" }));
        jPanel2.add(status);
        status.setBounds(440, 400, 170, 30);

        res_id.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        res_id.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RESIDENT ID", "1", "2", "3", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel2.add(res_id);
        res_id.setBounds(10, 400, 170, 30);

        p_id.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        p_id.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PUROK ID", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel2.add(p_id);
        p_id.setBounds(230, 400, 170, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          int check = validateRegister();
           
          if(check == 1){
        
        db_configuration dbc = new db_configuration();
        dbc.insertData("INSERT INTO reports(res_id, purok_id, report_date, report_desc, report_status)VALUES"
           + "('"+res_id.getSelectedItem().toString()+"','"+p_id.getSelectedItem().toString()
           +"','"+rep.getText()+"','"+addcom.getText()+"','"+status.getSelectedItem().toString()+"')");
        jl3.setText("  Date");
        jl4.setText("");
        rep.setText("");
        addcom.setText("");
        status.setSelectedIndex(0);
        JOptionPane.showMessageDialog(null, "Added Successfully"); 
          }else{
             System.out.println("Saving data failed!");
           }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void repMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repMouseClicked
         jl3.setText("");
        jl4.setText("  Date");
    }//GEN-LAST:event_repMouseClicked

    private void repKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_repKeyTyped
       jl3.setText("");
        jl4.setText("  Date");
    }//GEN-LAST:event_repKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextArea addcom;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    public static javax.swing.JLabel jl3;
    public static javax.swing.JLabel jl4;
    public static javax.swing.JComboBox<String> p_id;
    public static javax.swing.JTextField rep;
    public static javax.swing.JComboBox<String> res_id;
    public static javax.swing.JComboBox<String> status;
    // End of variables declaration//GEN-END:variables
}