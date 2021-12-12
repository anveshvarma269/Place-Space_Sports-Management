/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.TravelTransport;


import Sports.EcoSystem;
import Sports.Supplier.SupplierDirectory;
import Sports.TravelTransport.TravelTransport;
import Sports.TravelTransport.TravelTransportDirectory;
import Sports.User.UserAccount;
import java.awt.CardLayout;
import java.util.HashMap;
//import javax.mail.Transport;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author anveshvarma
 */
public class AddTransportJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddTransportJPanel
     */
    JPanel container;
    EcoSystem ecosystem;
    TravelTransportDirectory td;
    UserAccount ua;
    TravelTransport tt;
    SupplierDirectory sd;
    public AddTransportJPanel(JPanel container,UserAccount ua,EcoSystem ecosystem) {
        initComponents();
        this.container=container;
        this.ecosystem=ecosystem;
        this.ua = ua;
        sd = ecosystem.getEnterpriseDirectory().getSupplierDirectory();
        tt = sd.getTravelTransport(ua);
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

        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTransportType = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBookingCost = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransport = new javax.swing.JTable();
        btnTransport = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Avenir Next", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Transport");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 47, 710, -1));

        jButton2.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jButton2.setText("<< Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 153, 51));
        kGradientPanel1.setkStartColor(new java.awt.Color(102, 204, 255));

        jLabel2.setFont(new java.awt.Font("Avenir Next", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Transport Type:");

        txtTransportType.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Avenir Next", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Available Units:");

        txtBookingCost.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        txtBookingCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookingCostActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Available Transport:");

        tblTransport.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Transport", "Units"
            }
        ));
        jScrollPane1.setViewportView(tblTransport);

        btnTransport.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        btnTransport.setText("Add Transport");
        btnTransport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtTransportType))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTransport, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBookingCost, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        kGradientPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel3});

        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(jLabel4)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTransportType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtBookingCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTransport)))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 620));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"travelTransport");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnTransportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransportActionPerformed
        // TODO add your handling code here:
       tt.setTransportType(txtTransportType.getText());
       tt.setCost(Integer.parseInt(txtBookingCost.getText()));

       HashMap<String,Integer> travels = tt.getTransportTypes();
       travels.put(txtTransportType.getText(), Integer.parseInt(txtBookingCost.getText()));
       populateSelect();
       txtBookingCost.setText("");
       txtTransportType.setText("");
    }//GEN-LAST:event_btnTransportActionPerformed

    private void txtBookingCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookingCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookingCostActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTransport;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTable tblTransport;
    private javax.swing.JTextField txtBookingCost;
    private javax.swing.JTextField txtTransportType;
    // End of variables declaration//GEN-END:variables

    private void populateSelect() {
        DefaultTableModel df = (DefaultTableModel) tblTransport.getModel();
        df.setRowCount(0);
        if(tt.getTransportTypes() == null) tt.setTransportTypes(new HashMap<String,Integer>());
        HashMap<String,Integer> transport = tt.getTransportTypes();
        for(String s : transport.keySet())
        {
            String[] row = {s,String.valueOf(transport.get(s))};
            df.addRow(row);
        }
        tblTransport.setModel(df);
    
    }
}