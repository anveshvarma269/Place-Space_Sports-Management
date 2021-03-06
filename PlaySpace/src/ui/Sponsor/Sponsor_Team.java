/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Sponsor;


import Sports.EcoSystem;
import Sports.Sponsor.Sponsor;
import Sports.Sponsor.SponsorDirectory;
import Sports.Sport.Sport;
import Sports.Sport.SportDirectory;
import Sports.Team.Team;
import Sports.User.UserAccount;
import java.awt.CardLayout;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anveshvarma.
 */
public class Sponsor_Team extends javax.swing.JPanel {

    /**
     * Creates new form Sponsor_Team
     */
    JPanel container;
    EcoSystem ecosystem;
    UserAccount ua;
    SportDirectory sd;
    SponsorDirectory spoD;
    public Sponsor_Team(JPanel container,UserAccount ua,EcoSystem ecosystem) {
        initComponents();
        date.setText(" "+String.valueOf(LocalTime.now().getHour()) + ":"+String.valueOf(LocalTime.now().getMinute()));
        this.container = container;
        this.ecosystem = ecosystem;
        this.ua = ua;
        sd = ecosystem.getEnterpriseDirectory().getSportsDirectory();
        spoD = ecosystem.getEnterpriseDirectory().getSponsorDirectory();
        populateSportSelect();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        date = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbSport = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSpn = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtSpnAmt = new javax.swing.JTextField();
        btnOffer = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("<< Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkGradientFocus(700);
        kGradientPanel1.setkStartColor(java.awt.Color.orange);

        date.setFont(new java.awt.Font("Avenir", 0, 24)); // NOI18N
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText("<Date Time>");

        jLabel3.setFont(new java.awt.Font("Avenir Next", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sponsor Teams");

        jLabel1.setFont(new java.awt.Font("Avenir Next", 1, 16)); // NOI18N
        jLabel1.setText("Select Sport:");

        cmbSport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSportActionPerformed(evt);
            }
        });

        tblSpn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Team Name", "Matches Played", "Matches Won", "Budget"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSpn);

        jLabel2.setFont(new java.awt.Font("Avenir Next", 1, 16)); // NOI18N
        jLabel2.setText("Enter sponsor amount:");

        txtSpnAmt.setForeground(new java.awt.Color(0, 102, 0));
        txtSpnAmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpnAmtActionPerformed(evt);
            }
        });

        btnOffer.setText("Offer");
        btnOffer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOfferActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbSport, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(55, 55, 55))
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSpnAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 594, Short.MAX_VALUE)))
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(date)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(55, 55, 55)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbSport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSpnAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btnOffer)
                .addContainerGap(237, Short.MAX_VALUE))
        );

        add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"sponsorHome");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cmbSportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSportActionPerformed
        // TODO add your handling code here:
        String sportName = (String) cmbSport.getSelectedItem();
        Sport sport = sd.getSport(sportName);
        DefaultTableModel df = (DefaultTableModel) tblSpn.getModel();
        df.setRowCount(0);
        ArrayList<Team> teams = sport.getTeamsOfSport();
        Collections.sort(teams, new Comparator<Team>() {
            @Override
            public int compare(Team t1, Team t2) {
                return t2.getMatchesWon()-t1.getMatchesWon();
            }
        });
        for(Team t: teams)
        {
            String[] row = {t.getTeamName(),String.valueOf(t.getMatchesPlayed()),String.valueOf(t.getMatchesWon()),String.valueOf(t.getBudget())};
            df.addRow(row);
        }
        tblSpn.setModel(df);
                
    }//GEN-LAST:event_cmbSportActionPerformed

    private void txtSpnAmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpnAmtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpnAmtActionPerformed

    private void btnOfferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOfferActionPerformed
        // TODO add your handling code here:
        String sportName = (String) cmbSport.getSelectedItem();
        Sport sport = sd.getSport(sportName);
        DefaultTableModel df = (DefaultTableModel) tblSpn.getModel();
        int selectedRow = tblSpn.getSelectedRow();
        if(selectedRow == -1) {JOptionPane.showMessageDialog(this, "Select team");return;}
        String teamName = df.getValueAt(selectedRow,0).toString();
        Team team = sd.getTeam(teamName,sportName);
        
        Sponsor sponsor = spoD.getSponsor(ua);
        spoD.offerToTeam(sponsor, team, Integer.parseInt(txtSpnAmt.getText()));
        txtSpnAmt.setText("");
    }//GEN-LAST:event_btnOfferActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOffer;
    private javax.swing.JComboBox<String> cmbSport;
    private javax.swing.JLabel date;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTable tblSpn;
    private javax.swing.JTextField txtSpnAmt;
    // End of variables declaration//GEN-END:variables

    private void populateSportSelect() {
       ArrayList<Sport> sports = sd.getSportsList();
        DefaultComboBoxModel df = new DefaultComboBoxModel();
        for(Sport s: sports)
        {
            df.addElement(s.getSportName());
        }
        cmbSport.setModel(df);
    }
}
