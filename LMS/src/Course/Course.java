/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Course;

import com.mysql.jdbc.Connection;
import home.home;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author dasun
 */
public class Course extends javax.swing.JFrame {

    /**
     * Creates new form Course
     */
    public Course() {
        initComponents();
        clickhome.setOpaque(false);
        clickhome.setContentAreaFilled(false);
        clickhome.setBorderPainted(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        courseidbtn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        creditsbtn = new javax.swing.JTextField();
        instructbtn = new javax.swing.JTextField();
        serchbtn = new javax.swing.JButton();
        clickhome = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        assesmentbtn = new javax.swing.JTextField();
        schedulebtn = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        locationbtn = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        descriptionbtn = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        prereqbtn = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        coursebtn = new javax.swing.JComboBox<>();
        departmentbtn = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 65)); // NOI18N
        jLabel1.setText("Courses");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("List of Courses");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Course ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        courseidbtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(courseidbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 610, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Course name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Credits");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Instructor");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, -1, -1));

        creditsbtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(creditsbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 610, -1));

        instructbtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(instructbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 610, -1));

        serchbtn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        serchbtn.setText("Search");
        serchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serchbtnActionPerformed(evt);
            }
        });
        jPanel1.add(serchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 200, -1, -1));

        clickhome.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        clickhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Course/home-icon-silhouette.png"))); // NOI18N
        clickhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickhomeActionPerformed(evt);
            }
        });
        jPanel1.add(clickhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Assesment method");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, -1, -1));

        assesmentbtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(assesmentbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 610, -1));

        schedulebtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(schedulebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, 610, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Schedule");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, -1, -1));

        locationbtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(locationbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 620, 610, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Location");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 620, -1, -1));

        descriptionbtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        descriptionbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionbtnActionPerformed(evt);
            }
        });
        jPanel1.add(descriptionbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 670, 610, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Description");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 670, -1, -1));

        prereqbtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(prereqbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 730, 610, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("Prerequisites");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 730, -1, -1));

        coursebtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        coursebtn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select here", "Bachelor of Science in Information Technology", "Bachelor of Science in Computer Science", "Bachelor of Science in Information Systems", "Bachelor of Science in Software Engineering", "Bachelor of Science in Cybersecurity", "Bachelor of Science in Network Administration", "Bachelor of Science in Data Science", "Bachelor of Science in Artificial Intelligence", "Bachelor of Science in Computer Engineering", "Bachelor of Science in Web Development", " ", " " }));
        jPanel1.add(coursebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 610, -1));

        departmentbtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(departmentbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 610, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("Department");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Course/cheerful-student-with-book.jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 910));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clickhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickhomeActionPerformed
        new home().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_clickhomeActionPerformed

    private void serchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serchbtnActionPerformed
        String coursename = ((String)coursebtn.getSelectedItem()).trim();
        try {
            try {
                Class<?> forName = Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
            }
                Connection conn = null;
            try {
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/lms", "root", "");
            } catch (SQLException ex) {
                Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
            }
                PreparedStatement ps = null;
            try {
                ps = conn.prepareStatement("SELECT * FROM courses WHERE coursename = ?");
            } catch (SQLException ex) {
                Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                ps.setString(1, coursename);
            } catch (SQLException ex) {
                Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
            }
                ResultSet rs = null;
            try {
                rs = ps.executeQuery();
            } catch (SQLException ex) {
                Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            try {
                if (rs.next()) {
                    courseidbtn.setText(rs.getString("courseid"));
                    creditsbtn.setText(rs.getString("credit"));
                    departmentbtn.setText(rs.getString("department"));
                    instructbtn.setText(rs.getString("instructor"));
                    assesmentbtn.setText(rs.getString("assesmentmethod"));
                    schedulebtn.setText(rs.getString("schedule"));
                    locationbtn.setText(rs.getString("location"));
                    descriptionbtn.setText(rs.getString("description"));
                    prereqbtn.setText(rs.getString("prerequisites"));
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Course not found", "Error", JOptionPane.ERROR_MESSAGE);
                    // Clear the fields if student not found
                    courseidbtn.setText("");
                    creditsbtn.setText("");
                    departmentbtn.setText("");
                    instructbtn.setText("");
                    assesmentbtn.setText("");
                    schedulebtn.setText("");
                    locationbtn.setText("");
                    descriptionbtn.setText("");
                    prereqbtn.setText("");
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(Course.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_serchbtnActionPerformed

    private void descriptionbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descriptionbtnActionPerformed
            
       
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
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Course.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Course().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField assesmentbtn;
    private javax.swing.JButton clickhome;
    private javax.swing.JComboBox<String> coursebtn;
    private javax.swing.JTextField courseidbtn;
    private javax.swing.JTextField creditsbtn;
    private javax.swing.JTextField departmentbtn;
    private javax.swing.JTextField descriptionbtn;
    private javax.swing.JTextField instructbtn;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField locationbtn;
    private javax.swing.JTextField prereqbtn;
    private javax.swing.JTextField schedulebtn;
    private javax.swing.JButton serchbtn;
    // End of variables declaration//GEN-END:variables
}
