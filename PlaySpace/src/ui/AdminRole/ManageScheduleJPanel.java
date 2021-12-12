/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.AdminRole;


import Sports.EcoSystem;
import Sports.Sport.Match;
import Sports.Sport.Sport;
import Sports.Sport.SportDirectory;
import Sports.Venue.Venue;
import Sports.Venue.VenueDirectory;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anveshvarma
 */
public class ManageScheduleJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageScheduleJPanel
     */
    JPanel container;
    EcoSystem ecosystem;
    SportDirectory sd;
    VenueDirectory vd;
    public ManageScheduleJPanel(JPanel container,EcoSystem ecosystem) {
        initComponents();
        this.container = container;
        this.ecosystem = ecosystem;
        sd = ecosystem.getEnterpriseDirectory().getSportsDirectory();
        vd = ecosystem.getEnterpriseDirectory().getVenueDirectory();
        populateSelect();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblSchedule = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbMatches = new javax.swing.JComboBox<>();
        cmbSportSchedule = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtMatchTeams = new javax.swing.JTextField();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        btnGetVenues = new javax.swing.JButton();
        txtDate = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstVeues = new javax.swing.JList<>();
        btnSchMatch = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblSchedule.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        tblSchedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Match Number", "Team1", "Team2", "Venue", "Date", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSchedule);
        if (tblSchedule.getColumnModel().getColumnCount() > 0) {
            tblSchedule.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblSchedule.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 374, 660, 222));

        jLabel1.setFont(new java.awt.Font("Avenir Next", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Schedule");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 47, 710, -1));

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 153, 153));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Date:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 151, 96, -1));

        jLabel7.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Match Number:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 69, -1, -1));

        jLabel2.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Sport:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 29, 96, -1));

        cmbMatches.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        cmbMatches.setToolTipText("Select a match number");
        cmbMatches.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMatchesActionPerformed(evt);
            }
        });
        jPanel1.add(cmbMatches, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 65, 124, -1));

        cmbSportSchedule.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        cmbSportSchedule.setToolTipText("Please select a sport");
        cmbSportSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSportScheduleActionPerformed(evt);
            }
        });
        jPanel1.add(cmbSportSchedule, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 26, 124, -1));

        jLabel3.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Match:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 109, 96, -1));

        txtMatchTeams.setEditable(false);
        txtMatchTeams.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jPanel1.add(txtMatchTeams, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 104, 185, -1));

        kGradientPanel2.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 153, 153));

        btnGetVenues.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        btnGetVenues.setText("Get Venues");
        btnGetVenues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetVenuesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(btnGetVenues)
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105))))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGetVenues)
                .addContainerGap())
        );

        jPanel1.add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 220));

        jLabel5.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Venues:");

        lstVeues.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        lstVeues.setToolTipText("Available venues");
        jScrollPane2.setViewportView(lstVeues);

        btnSchMatch.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        btnSchMatch.setText("Schedule Match");
        btnSchMatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSchMatchActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jButton2.setText("<< Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(btnSchMatch, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(96, 96, 96)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSchMatch))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(269, Short.MAX_VALUE))
        );

        add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 620));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSchMatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSchMatchActionPerformed
        // TODO add your handling code here:
        if(lstVeues.getSelectedIndex() == -1) 
        {
            JOptionPane.showMessageDialog(this, "No venue selected");
            return;
        }
        Match match = sd.getMatch(String.valueOf(cmbMatches.getSelectedItem()),String.valueOf(cmbSportSchedule.getSelectedItem()));
        match.setVenueStatus("Requested");
        vd.requestVenue(String.valueOf(lstVeues.getSelectedValue()), match, txtDate.getDate());
        populateTable();
        txtMatchTeams.setText("");
        txtDate.setDate(null);
    }//GEN-LAST:event_btnSchMatchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"adminWorkspace");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmbSportScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSportScheduleActionPerformed
        // TODO add your handling code here:
        String sportName = (String) cmbSportSchedule.getSelectedItem();
        Sport sport = sd.getSport(sportName);
        ArrayList<Match> matches = sport.getMatches();
        DefaultComboBoxModel df = new DefaultComboBoxModel();
        for(Match m: matches)
        {
            df.addElement(m.getMatchNo());
        }
        cmbMatches.setModel(df);
         populateTable();
    }//GEN-LAST:event_cmbSportScheduleActionPerformed

    private void cmbMatchesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMatchesActionPerformed
        // TODO add your handling code here:
        String sportName = (String) cmbSportSchedule.getSelectedItem();
        String matchNo = String.valueOf(cmbMatches.getSelectedItem());
        Match match = sd.getMatch(matchNo,sportName);
        String team1 = match.getTeam1().getTeamName();
        String team2 = match.getTeam2().getTeamName();
        txtMatchTeams.setText(""+team1+" vs "+team2);
    }//GEN-LAST:event_cmbMatchesActionPerformed

    private void btnGetVenuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetVenuesActionPerformed
        // TODO add your handling code here:
        if(txtDate.getDate() == null) return;
        ArrayList<Venue> venues = new ArrayList<Venue>();
        try {
            venues = vd.getAvailbleVenues(txtDate.getDate());
        } catch(ParseException ex) {
            Logger.getLogger(ManageScheduleJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
      //  DefaultComboBoxModel df = new DefaultComboBoxModel();
        DefaultListModel dl = new DefaultListModel();
          
        for(Venue v: venues)
        {
            dl.addElement(v.getVenueName());
        }
        
        lstVeues.setModel(dl);
    }//GEN-LAST:event_btnGetVenuesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGetVenues;
    private javax.swing.JButton btnSchMatch;
    private javax.swing.JComboBox<String> cmbMatches;
    private javax.swing.JComboBox<String> cmbSportSchedule;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private javax.swing.JList<String> lstVeues;
    private javax.swing.JTable tblSchedule;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtMatchTeams;
    // End of variables declaration//GEN-END:variables

    private void populateSelect() {
        ArrayList<Sport> sports = sd.getSportsList();
        DefaultComboBoxModel df = new DefaultComboBoxModel();
        
        for(Sport s: sports)
        {
            df.addElement(s.getSportName());
        }
        cmbSportSchedule.setModel(df);
    }

    private void populateTable() {
        String sportName = (String) cmbSportSchedule.getSelectedItem();
        Sport sport = sd.getSport(sportName);
        String venueName,scStatus,date;
        ArrayList<Match> matches = sport.getMatches();
        DefaultTableModel df = (DefaultTableModel) tblSchedule.getModel();
        df.setRowCount(0);
        DateFormat datef = new SimpleDateFormat("dd-MMM-yyyy"); 
               
        for(Match m: matches)
        {
            if(m.getVenueStatus() == null) m.setVenueStatus("TBD");
            scStatus = m.getVenueStatus();
           if(m.getVenue() == null) 
           {venueName = "TBD"; date = "TBD";}
           else {
               venueName = m.getVenue().getVenueName();
               
               date = datef.format(m.getDate());
           }
           
            String[] row = {String.valueOf(m.getMatchNo()),m.getTeam1().getTeamName(),m.getTeam2().getTeamName(),venueName,date,scStatus};
            df.addRow(row);
        }
        tblSchedule.setModel(df);
    }
}