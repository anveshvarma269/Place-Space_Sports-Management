/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.TravelTransport;


import Sports.EcoSystem;
import Sports.Supplier.SupplierDirectory;
import Sports.TravelTransport.Request;
import Sports.TravelTransport.TravelTransport;
import Sports.User.UserAccount;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author anveshvarma
 */
public class ViewTravelBookingsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewTravelBookingsJPanel
     */
    JPanel container;
    EcoSystem ecosystem;
    UserAccount ua;
    SupplierDirectory sd;
    TravelTransport tt;
    public ViewTravelBookingsJPanel(JPanel container,UserAccount ua,EcoSystem ecosystem) {
        initComponents();
        this.container=container;
        this.ecosystem=ecosystem;
        this.ua = ua;
        date.setText(" "+String.valueOf(LocalTime.now().getHour()) + ":"+String.valueOf(LocalTime.now().getMinute()));
        sd = ecosystem.getEnterpriseDirectory().getSupplierDirectory();
        tt = sd.getTravelTransport(ua);
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

        jButton3 = new javax.swing.JButton();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        date = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewBooking = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("<< Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 153, 51));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 204, 255));

        date.setFont(new java.awt.Font("Avenir", 0, 24)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText("<Date Time>");

        jLabel1.setFont(new java.awt.Font("Avenir Next", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Bookings");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Accept Booking");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Decline Booking");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tblViewBooking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Team name", "Destination", "Pay", "Date", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblViewBooking);

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jButton1)
                        .addGap(47, 47, 47)
                        .addComponent(jButton2)
                        .addGap(0, 201, Short.MAX_VALUE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(date)
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(92, 92, 92))
        );

        add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 620));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
     CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"travelTransport");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel) tblViewBooking.getModel();
        int selectedRow = tblViewBooking.getSelectedRow();
        if(selectedRow == -1) {JOptionPane.showMessageDialog(this, "Select request and proceed");return;}
        String teamName = df.getValueAt(selectedRow,0).toString();
        String destination = df.getValueAt(selectedRow,1).toString();
        
        Request r = sd.getRequest(teamName, tt.getTransportName(), destination);
        r.setStatus("Accepted");
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel) tblViewBooking.getModel();
        int selectedRow = tblViewBooking.getSelectedRow();
        if(selectedRow == -1) {JOptionPane.showMessageDialog(this, "Select request and proceed");return;}
        String teamName = df.getValueAt(selectedRow,0).toString();
        String destination = df.getValueAt(selectedRow,1).toString();
        
        Request r = sd.getRequest(teamName, tt.getTransportName(), destination);
        r.setStatus("Declined");
        populateTable();
    }//GEN-LAST:event_jButton2ActionPerformed


 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private static javax.swing.JTable tblViewBooking;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel df = (DefaultTableModel) tblViewBooking.getModel();
        df.setRowCount(0);
        if(sd.getTravelRequests() == null) sd.setTravelRequests(new ArrayList<Request>());
        ArrayList<Request> requests = sd.getTravelRequests();
        
        DateFormat datef = new SimpleDateFormat("dd-MMM-yyyy");
        String date;
        for(Request r: requests)
        {
            
            if(r.getTravelTransport().equals(tt.getTransportName()))
            {
               date = datef.format(r.getDate());
                String[] row = {r.getTravelTeam(),r.getLocation(),String.valueOf(r.getTravelAmount()),date,r.getStatus()};
                df.addRow(row);
            }
        }
        tblViewBooking.setModel(df);
        
    }
}
