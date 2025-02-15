/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import com.mysql.jdbc.Connection;
import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
import home.home;
import java.awt.HeadlessException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author dasun
 */
public class Student extends javax.swing.JFrame {

    /**
     * Creates new form Student
     */
    public Student() {
        initComponents();
        homes.setOpaque(false);
        homes.setContentAreaFilled(false);
        homes.setBorderPainted(false);
        
        btnsearch.setOpaque(false);
        btnsearch.setContentAreaFilled(false);
        btnsearch.setBorderPainted(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        choice1 = new java.awt.Choice();
        jLabel10 = new javax.swing.JLabel();
        addstudent = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Add_std = new javax.swing.JButton();
        editstudent = new javax.swing.JButton();
        deletestd = new javax.swing.JButton();
        btn_viewDetails = new javax.swing.JButton();
        btn_std_Id = new javax.swing.JTextField();
        btn_std_Name = new javax.swing.JTextField();
        btnDOB = new javax.swing.JTextField();
        btn_intake = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btn_Address = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btn_mobileno = new javax.swing.JTextField();
        choice2 = new java.awt.Choice();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        selectdegree = new javax.swing.JComboBox<>();
        btnselectdate = new javax.swing.JButton();
        homes = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Student/26983.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addstudent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student ID :");
        addstudent.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Student Name :");
        addstudent.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date of Birth :");
        addstudent.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Intake :");
        addstudent.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, -1));

        Add_std.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        Add_std.setText("Add Student");
        Add_std.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_stdActionPerformed(evt);
            }
        });
        addstudent.add(Add_std, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 710, -1, -1));

        editstudent.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        editstudent.setText("Edit Student details");
        editstudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editstudentActionPerformed(evt);
            }
        });
        addstudent.add(editstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 710, -1, -1));

        deletestd.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        deletestd.setText("Delete ");
        deletestd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletestdActionPerformed(evt);
            }
        });
        addstudent.add(deletestd, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 710, -1, -1));

        btn_viewDetails.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btn_viewDetails.setText("View details");
        btn_viewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewDetailsActionPerformed(evt);
            }
        });
        addstudent.add(btn_viewDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 710, -1, -1));

        btn_std_Id.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_std_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_std_IdActionPerformed(evt);
            }
        });
        addstudent.add(btn_std_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 390, -1));

        btn_std_Name.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        addstudent.add(btn_std_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 390, -1));

        btnDOB.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        addstudent.add(btnDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 390, -1));

        btn_intake.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_intake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_intakeActionPerformed(evt);
            }
        });
        addstudent.add(btn_intake, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 390, -1));

        btnsearch.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        btnsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Student/3.png"))); // NOI18N
        btnsearch.setText(" Search here");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        addstudent.add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 170, -1, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address :");
        addstudent.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, -1, -1));

        btn_Address.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        addstudent.add(btn_Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 390, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Mobile Number :");
        addstudent.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, -1, -1));

        btn_mobileno.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_mobileno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mobilenoActionPerformed(evt);
            }
        });
        addstudent.add(btn_mobileno, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 520, 390, -1));
        addstudent.add(choice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Degree Program :");
        addstudent.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 580, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Gender :");
        addstudent.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, -1, -1));

        male.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        male.setText("Male");
        addstudent.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, -1, -1));

        female.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        female.setText("Female");
        addstudent.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, -1, -1));

        selectdegree.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        selectdegree.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select the Degree programme", "Bachelor of Science in Information Technology (BSIT)", "Bachelor of Science in Computer Science (BSCS)", "Bachelor of Science in Information Systems (BSIS)", "Bachelor of Science in Software Engineering (BSSE)", "Bachelor of Science in Cybersecurity", "Bachelor of Science in Network Administration", "Bachelor of Science in Data Science", "Bachelor of Science in Artificial Intelligence", "Bachelor of Science in Computer Engineering", "Bachelor of Science in Web Development", " " }));
        selectdegree.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                selectdegreeComponentAdded(evt);
            }
        });
        selectdegree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectdegreeActionPerformed(evt);
            }
        });
        addstudent.add(selectdegree, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 580, 480, -1));

        btnselectdate.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnselectdate.setText("Select Date");
        btnselectdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselectdateActionPerformed(evt);
            }
        });
        addstudent.add(btnselectdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, -1, -1));

        homes.setBackground(new java.awt.Color(255, 102, 102));
        homes.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        homes.setForeground(new java.awt.Color(255, 255, 255));
        homes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Student/home-icon-silhouette.png"))); // NOI18N
        homes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homesActionPerformed(evt);
            }
        });
        addstudent.add(homes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(" System ");
        addstudent.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Student Management  ");
        addstudent.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Student/147899.jpg"))); // NOI18N
        addstudent.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 840));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addstudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(addstudent, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Add_stdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_stdActionPerformed
        try{
        String Student_ID = btn_std_Id.getText();
        String Student_Name = btn_std_Name.getText();
        String DOB = btnDOB.getText();
        String Intake = btn_intake.getText();
        String Address = btn_Address.getText();
        String Mobile_number = btn_mobileno.getText();
        String Degree_program = (String) selectdegree.getSelectedItem();
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/lms", "root", "");
        PreparedStatement ps = conn.prepareStatement("INSERT INTO student (Student_ID, Student_Name, DOB, Gender,Intake,Address,Mobile_number,Degree_program) VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
        ps.setString(1, Student_ID);
        ps.setString(2, Student_Name);
        ps.setString(3, DOB);
        if (male.isSelected()) {
            ps.setString(4, male.getText());
        } else {
            ps.setString(4, female.getText());
        }
         
            ps.setString(5, Intake);
            ps.setString(6, Address);
            ps.setString(7, Mobile_number);
            ps.setString(8, Degree_program);
            
            
        
        ps.executeUpdate();
        JOptionPane.showMessageDialog(this, "Insert Successfully!");
    } catch (HeadlessException | ClassNotFoundException | SQLException ex) {
        LOGGER.log(Level.SEVERE, null, ex);
        }
        
       
        
    }//GEN-LAST:event_Add_stdActionPerformed

    private void editstudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editstudentActionPerformed
        try{
        String Student_ID = btn_std_Id.getText();
        String Student_Name = btn_std_Name.getText();
        String DOB = btnDOB.getText();
        String Intake = btn_intake.getText();
        String Address = btn_Address.getText();
        String Mobile_number = btn_mobileno.getText();
        String Degree_program = (String) selectdegree.getSelectedItem();
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/lms", "root", "");
        PreparedStatement ps = conn.prepareStatement("UPDATE student SET Student_Name=?, DOB=?, Gender=?,Intake=?,Address=?,Mobile_number=?,Degree_program=? WHERE Student_ID=?");
        ps.setString(1, Student_ID);
        ps.setString(2, Student_Name);
        ps.setString(3, DOB);
        if (male.isSelected()) {
            ps.setString(4, male.getText());
        } else {
            ps.setString(4, female.getText());
        }
         
            ps.setString(5, Intake);
            ps.setString(6, Address);
            ps.setString(7, Mobile_number);
            ps.setString(8, Degree_program);
            
            
        
        ps.executeUpdate();
        JOptionPane.showMessageDialog(this, "Update Successfully!");
    } catch (HeadlessException | ClassNotFoundException | SQLException ex) {
        LOGGER.log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_editstudentActionPerformed

    private void btn_std_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_std_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_std_IdActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        String Student_ID = btn_std_Id.getText().trim();
        

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/lms", "root", "");
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM student WHERE Student_ID = ?");
            ps.setString(1, Student_ID);
            
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                btn_std_Name.setText(rs.getString("Student_Name"));
                btnDOB.setText(rs.getString("DOB"));
                if ("Male".equals(rs.getString("Gender"))) {
                    male.setSelected(true);
                } else {
                    female.setSelected(true);
                }
                btn_intake.setText(rs.getString("Intake"));
                btn_Address.setText(rs.getString("Address"));
                btn_mobileno.setText(rs.getString("Mobile_number"));
                selectdegree.setSelectedItem(rs.getString("Degree_program"));
            } else {
                JOptionPane.showMessageDialog(this, "Student not found", "Error", JOptionPane.ERROR_MESSAGE);
                // Clear the fields if student not found
               btn_std_Name.setText("");
                btnDOB.setText("");
                male.setText("");
                female.setText("");
                btn_intake.setText("");
                btn_Address.setText("");
                btn_mobileno.setText("");
                selectdegree.setSelectedIndex(0);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            LOGGER.log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error retrieving student details", "Error", JOptionPane.ERROR_MESSAGE);
        }
    
        
           
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btn_mobilenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mobilenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_mobilenoActionPerformed

    private void selectdegreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectdegreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectdegreeActionPerformed

    private void btnselectdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselectdateActionPerformed
        DatePicker datePicker = new DatePicker(this);
        String selectedDate = datePicker.setPickedDate();
        if (!selectedDate.equals("")) {
            btnDOB.setText(selectedDate);
        }
        
    }//GEN-LAST:event_btnselectdateActionPerformed

    private void deletestdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletestdActionPerformed
        try{
        String Student_ID = btn_std_Id.getText();
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/lms", "root", "");
        PreparedStatement ps = conn.prepareStatement("DELETE FROM student WHERE Student_ID=?");
        ps.setString(1, Student_ID);
        
            
        int rowsAffected = ps.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "Student deleted successfully!");
        } else {
            JOptionPane.showMessageDialog(this, "No student found with the provided ID.");
        }
    } catch (HeadlessException | ClassNotFoundException | SQLException ex) {
        LOGGER.log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_deletestdActionPerformed

    private void btn_viewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewDetailsActionPerformed
                                                    
    try {
       Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/lms", "root", "");
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM student");
            ResultSet rs = ps.executeQuery();
            
            DefaultTableModel model = new DefaultTableModel(new String[]{"Student_ID", "Student_Name", "DOB", "Gender", "Intake", "Address", "Mobile_number", "Degree_program"}, 0);
            while (rs.next()) {
                String Student_ID = rs.getString("Student_ID");
                String Student_Name = rs.getString("Student_Name");
                String DOB = rs.getString("DOB");
                String Gender = rs.getString("Gender");
                String Intake = rs.getString("Intake");
                String Address = rs.getString("Address");
                String Mobile_number = rs.getString("Mobile_number");
                String Degree_program = rs.getString("Degree_program");
                
                if("0000-00-00".equals(DOB)){
                    DOB = "N/A";
                }
                
                model.addRow(new Object[]{Student_ID, Student_Name, DOB, Gender, Intake, Address, Mobile_number, Degree_program});
            }
            
            rs.close();
            ps.close();
            conn.close();
            
            JTable table = new JTable(model);
            JScrollPane scrollPane = new JScrollPane(table);
            JOptionPane.showMessageDialog(this, scrollPane, "Student Details", JOptionPane.INFORMATION_MESSAGE);
        } catch (ClassNotFoundException | SQLException ex) {
            LOGGER.log(Level.SEVERE, null, ex);
}

    }//GEN-LAST:event_btn_viewDetailsActionPerformed

    private void homesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homesActionPerformed
        new home().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_homesActionPerformed

    private void btn_intakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_intakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_intakeActionPerformed

    private void selectdegreeComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_selectdegreeComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_selectdegreeComponentAdded

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
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_std;
    private javax.swing.JPanel addstudent;
    private javax.swing.JTextField btnDOB;
    private javax.swing.JTextField btn_Address;
    private javax.swing.JTextField btn_intake;
    private javax.swing.JTextField btn_mobileno;
    private javax.swing.JTextField btn_std_Id;
    private javax.swing.JTextField btn_std_Name;
    private javax.swing.JButton btn_viewDetails;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnselectdate;
    private java.awt.Choice choice1;
    private java.awt.Choice choice2;
    private javax.swing.JButton deletestd;
    private javax.swing.JButton editstudent;
    private javax.swing.JRadioButton female;
    private javax.swing.JButton homes;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton male;
    private javax.swing.JComboBox<String> selectdegree;
    // End of variables declaration//GEN-END:variables
}
