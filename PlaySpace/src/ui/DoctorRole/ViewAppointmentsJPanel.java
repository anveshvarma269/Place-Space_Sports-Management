/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.DoctorRole;


import Sports.Doctor.Doctor;
import Sports.Doctor.DoctorDirectory;
import Sports.EcoSystem;
import Sports.Team.Team;
import Sports.User.UserAccount;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vishnuteja
 */
public class ViewAppointmentsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewAppointmentsJPanel
     */
    JPanel container;
    EcoSystem ecosystem;
    UserAccount ua;
    DoctorDirectory dd;
    Doctor d;
    public ViewAppointmentsJPanel(JPanel container, UserAccount ua, EcoSystem ecosystem) {
        initComponents();
        this.container = container;
        this.ua = ua;
        this.ecosystem = ecosystem;
        dd=ecosystem.getEnterpriseDirectory().getDoctorDirectory();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        appTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 204, 255));

        appTable.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        appTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Team Manager", "Team", "Date", "Time"
            }
        ));
        jScrollPane1.setViewportView(appTable);

        jButton2.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Avenir Next", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Appointment Requests");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 620));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"doctorWorkspace");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         populateTable();
    }//GEN-LAST:event_jButton2ActionPerformed

 private void populateTable() {
        ArrayList<Doctor> doctors = dd.getDoctors();
        DefaultTableModel df = (DefaultTableModel) appTable.getModel();
        df.setRowCount(0);
        for(Doctor d : doctors)
        {
            if(d.getUa().equals(ua))
            {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm");
                for(Team t : d.getTeamMapping().keySet())
                {
                    String teamManager = t.getTeamManager();
                    String teamName = t.getTeamName();
                        for(Date dt :d.getTeamMapping().get(t).keySet())
                        {
                            String date = sdf.format(dt);
                            for(Date ti : d.getTeamMapping().get(t).get(dt))
                            {
                                String time = sdf1.format(ti);
                                String[] row ={teamManager,teamName,date,time};
                                df.addRow(row);
                            }
                                  
                        }
                        
                }
                             
            }
           
        }
       appTable.setModel(df);
 }
                  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable appTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables
}
