/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.SystemAdminRole;

import Sports.EcoSystem;
import Sports.User.UserAccount;
import Sports.User.UserAccountDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.rmi.CORBA.Util; 
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Sports.Util.Util1;

/**
 *
 * @author anveshvarma
 */
public class ManageUsersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUsersJPanel
     */
    JPanel container;
    EcoSystem ecosystem;
    UserAccountDirectory ud;
    UserAccount user;
    public ManageUsersJPanel(JPanel container,EcoSystem ecosystem) {
        initComponents();
        this.container = container;
        this.ecosystem = ecosystem;
        ud = ecosystem.getUserAccountDirectory();
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

        btnBack = new javax.swing.JButton();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageUser = new javax.swing.JTable();
        btnGrantAccess = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        kGradientPanel1.setkEndColor(new java.awt.Color(204, 255, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 153, 153));

        tblManageUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Username", "Email-ID", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblManageUser);
        if (tblManageUser.getColumnModel().getColumnCount() > 0) {
            tblManageUser.getColumnModel().getColumn(0).setPreferredWidth(70);
            tblManageUser.getColumnModel().getColumn(2).setPreferredWidth(150);
        }

        btnGrantAccess.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGrantAccess.setText("Grant Access");
        btnGrantAccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrantAccessActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Avenir Next", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage User Requests");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(btnGrantAccess))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(598, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 256, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(btnGrantAccess)
                .addGap(59, 59, 59))
        );

        add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"Sysadmin");
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnGrantAccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrantAccessActionPerformed
        // TODO add your handling code here:
         String passcode = Util1 .generatePassword();  
        DefaultTableModel df = (DefaultTableModel) tblManageUser.getModel();
        int selectedRow = tblManageUser.getSelectedRow();
        if(selectedRow == -1) {JOptionPane.showMessageDialog(this, "Select user to grant access");return;}
          String username = df.getValueAt(selectedRow,1).toString();
          user = ud.getUserToGrantAccess(username);
          user.setPasscode(passcode);
          user.setPassword(passcode);
          System.out.println(passcode);
         // Util1.SendEmail(user.getUsername(), passcode, user.getEmail());
          ud.provideAccess(username);
          populateTable();
    }//GEN-LAST:event_btnGrantAccessActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGrantAccess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTable tblManageUser;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel dt = (DefaultTableModel) tblManageUser.getModel();
        dt.setRowCount(0);
        ArrayList<UserAccount> accessUsersList = ud.getUserAccountList();
        
        for(UserAccount ua : accessUsersList)
        {
            if(ua.getUsername().equals("sysadmin") || ua.getRole().toString().equals("Business.Role.TeamManagerRole")) continue;
            if(ua.getAccountStatus().equals("Access requested"))
            {
            String[] row = {ua.getEmployee().getName(),ua.getUsername(),ua.getEmail(),ua.getRole().getClass().toString()};
            dt.addRow(row);
            }
        }
        tblManageUser.setModel(dt);
    }
}
