/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.TeamManagerRole;


import Sports.EcoSystem;
import Sports.Sport.Match;
import Sports.Sport.Sport;
import Sports.Sport.SportDirectory;
import Sports.Team.Team;
import Sports.User.UserAccount;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anveshvarma
 */
public class ViewMatchScheduleJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewMatchScheduleJPanel
     */
    JPanel container;
    EcoSystem ecosystem;
    UserAccount ua;
    Team team;
    SportDirectory sd;
    public ViewMatchScheduleJPanel(JPanel container,UserAccount ua,EcoSystem ecosystem) {
        initComponents();
        this.container = container;
        this.ua = ua;
        this.ecosystem = ecosystem;
        date.setText(" "+String.valueOf(LocalTime.now().getHour()) + ":"+String.valueOf(LocalTime.now().getMinute()));
        sd = ecosystem.getEnterpriseDirectory().getSportsDirectory();
        date.setText(" "+String.valueOf(LocalTime.now().getHour()) + ":"+String.valueOf(LocalTime.now().getMinute()));
        team = sd.getTeam(ua);
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
        tblViewSchedule = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        kGradientPanel1.setkEndColor(new java.awt.Color(138, 217, 243));
        kGradientPanel1.setkStartColor(new java.awt.Color(153, 51, 255));

        tblViewSchedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Opponent", "Venue", "Date", "Schedule Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblViewSchedule);

        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Avenir Next", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Scheduled Matches");

        date.setFont(new java.awt.Font("Avenir", 1, 24)); // NOI18N
        date.setForeground(java.awt.Color.orange);
        date.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        date.setText("<Date Time>");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(595, Short.MAX_VALUE))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(date)
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(date)
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"teamManager");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTable tblViewSchedule;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        Sport sport = sd.getSport(ua);
        DefaultTableModel df = (DefaultTableModel) tblViewSchedule.getModel();
        df.setRowCount(0);
        String date,venue;
        ArrayList<Match> matches = sport.getMatches();
        DateFormat datef = new SimpleDateFormat("dd-MMM-yyyy"); 
        for(Match m: matches)
        {
            if(m.getTeam1().equals(team))
            {
            if(m.getVenue() == null) venue = "TBD";
            else venue = m.getVenue().getVenueName();
            if(m.getDate() == null) date= "TBD";
            else date = datef.format(m.getDate());
                String[] row = {m.getTeam2().getTeamName(),venue,date,m.getVenueStatus()};
                df.addRow(row);
            }
            
            if(m.getTeam2().equals(team))
            {
            if(m.getVenue() == null) venue = "TBD";
            else venue = m.getVenue().getVenueName();
            if(m.getDate() == null) date= "TBD";
            else date = datef.format(m.getDate());
                String[] row = {m.getTeam1().getTeamName(),venue,date,m.getVenueStatus()};
                df.addRow(row);
            }
        }
        tblViewSchedule.setModel(df);
    }
}
