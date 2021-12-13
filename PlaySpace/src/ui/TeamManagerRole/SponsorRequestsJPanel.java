/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.TeamManagerRole;


import Sports.EcoSystem;
import Sports.Sponsor.Sponsor;
import Sports.Sponsor.SponsorDirectory;
import Sports.Sport.SportDirectory;
import Sports.Team.Team;
import Sports.User.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anveshvarma
 */
public class SponsorRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SponsorRequestsJPanel
     */
    JPanel container;
    EcoSystem ecosystem;
    UserAccount ua;
    SponsorDirectory spoD;
    Team team;
    SportDirectory sd;
    public SponsorRequestsJPanel(JPanel container, UserAccount ua, EcoSystem ecosystem) {
        initComponents();
        this.container = container;
        this.ua = ua;
        this.ecosystem = ecosystem;
        sd = ecosystem.getEnterpriseDirectory().getSportsDirectory();
        spoD = ecosystem.getEnterpriseDirectory().getSponsorDirectory();
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
        btnAcceptSponsor = new javax.swing.JButton();
        btnDeclineSponsor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSponsorRequests = new javax.swing.JTable();
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

        kGradientPanel1.setkEndColor(new java.awt.Color(138, 217, 243));
        kGradientPanel1.setkStartColor(new java.awt.Color(153, 51, 255));

        btnAcceptSponsor.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        btnAcceptSponsor.setText("Accept Sponsor");
        btnAcceptSponsor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptSponsorActionPerformed(evt);
            }
        });

        btnDeclineSponsor.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        btnDeclineSponsor.setForeground(new java.awt.Color(255, 0, 51));
        btnDeclineSponsor.setText("Decline Sponsor");
        btnDeclineSponsor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeclineSponsorActionPerformed(evt);
            }
        });

        tblSponsorRequests.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        tblSponsorRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Sponsor", "Capital Offered"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSponsorRequests);

        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Avenir Next", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sponsorship Requests");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btnAcceptSponsor)
                        .addGap(148, 148, 148)
                        .addComponent(btnDeclineSponsor))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(338, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(346, 346, 346))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(56, 56, 56))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(232, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAcceptSponsor)
                    .addComponent(btnDeclineSponsor))
                .addGap(76, 76, 76))
        );

        add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"teamManager");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAcceptSponsorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptSponsorActionPerformed
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel) tblSponsorRequests.getModel();
        int selectedRow = tblSponsorRequests.getSelectedRow();
        if(selectedRow == -1) {JOptionPane.showMessageDialog(this, "Select and proceed");return;}
        String sponsorName = df.getValueAt(selectedRow,0).toString();
         int budget = Integer.parseInt(df.getValueAt(selectedRow,1).toString());
         spoD.sponsorToTeam(sponsorName, budget, team);
         team.addBudget(budget);
         populateTable();
    }//GEN-LAST:event_btnAcceptSponsorActionPerformed

    private void btnDeclineSponsorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeclineSponsorActionPerformed
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel) tblSponsorRequests.getModel();
        int selectedRow = tblSponsorRequests.getSelectedRow();
        if(selectedRow == -1) {JOptionPane.showMessageDialog(this, "Select and proceed");return;}
        String sponsorName = df.getValueAt(selectedRow,0).toString();
        Sponsor sponsor = spoD.getSponsor(sponsorName);
        HashMap<Team,String> offerStatus = sponsor.getOfferStatus();
        offerStatus.put(team, "Declined");
         populateTable();
    }//GEN-LAST:event_btnDeclineSponsorActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceptSponsor;
    private javax.swing.JButton btnDeclineSponsor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTable tblSponsorRequests;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel df = (DefaultTableModel) tblSponsorRequests.getModel();
        df.setRowCount(0);
        ArrayList<Sponsor> sponsors = spoD.getSponsorsDirectory();
        HashMap<Team,Integer> offer;
        HashMap<Team,String> offerStatus;
        for(Sponsor s:sponsors)
        {
             offer = s.getSponsoredRequests();
             offerStatus = s.getOfferStatus();
             for(Team t : offer.keySet())
             {
                 if(t.equals(team) && offerStatus.get(t).equals("Requested"))
                 {
                     String[] row = {s.getSponsorName(),String.valueOf(offer.get(t))};
                     df.addRow(row);
                 }
             }
        }
        
        tblSponsorRequests.setModel(df);
    }
}
