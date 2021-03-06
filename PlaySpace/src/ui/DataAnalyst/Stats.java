/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.DataAnalyst;


import static com.db4o.qlin.QLinSupport.p;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;


import Sports.EcoSystem;
import Sports.Sport.Match;
import Sports.Sport.Sport;
import Sports.Sport.SportDirectory;
import Sports.Team.Team;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
/*
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.ScatterChart;
*/
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author anveshvarma
 */
public class Stats extends javax.swing.JPanel {

    /**
     * Creates new form Stats
     */
    JPanel container;
    EcoSystem ecosystem;
    SportDirectory sd;
    Sport sport;
    
    public Stats(JPanel container,Sport sport,EcoSystem ecosystem) {
        initComponents();
        this.container = container;
        this.ecosystem = ecosystem;
        this.sport =sport;
        
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

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbLocation = new javax.swing.JComboBox<>();
        btnPie = new javax.swing.JButton();
        btnBar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cmbTeams = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cmbTeam2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Avenir Next", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Dashboard");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 41, 720, -1));

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 102, 102));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Wins (by Percentage)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir Next", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        jLabel1.setText("Location:");

        cmbLocation.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        cmbLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLocationActionPerformed(evt);
            }
        });

        btnPie.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        btnPie.setText("Pie analysis");
        btnPie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPieActionPerformed(evt);
            }
        });

        btnBar.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        btnBar.setText("Bar chart");
        btnBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(9, 9, 9)
                        .addComponent(cmbLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(btnBar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPie)
                    .addComponent(btnBar))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Match Win Percentage", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Avenir Next", 1, 14))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        jLabel5.setText("Team 1:");

        cmbTeams.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Avenir Next", 1, 14)); // NOI18N
        jLabel6.setText("Team 2:");

        cmbTeam2.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N

        jButton2.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        jButton2.setText("Compare stats");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbTeams, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbTeam2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmbTeam2, cmbTeams});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(cmbTeams, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTeam2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(759, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159))))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(357, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );

        add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 800));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) container.getLayout();
            crdLyt.show(container,"analyst");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLocationActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_cmbLocationActionPerformed

    private void btnPieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPieActionPerformed
        // TODO add your handling code here:
        String location = (String) cmbLocation.getSelectedItem();
        DefaultPieDataset pie = new DefaultPieDataset();
        HashMap<String,Integer> stats = sport.winByLocation(location);
        for(String s: stats.keySet())
        {
            pie.setValue(s, stats.get(s));
        }
        JFreeChart chart = ChartFactory.createPieChart("Win by location", pie);
        PiePlot p =  (PiePlot) chart.getPlot();
        //p.setForegroundAlpha(TOP);
        ChartFrame frame = new ChartFrame("Pie Chart",chart);
        frame.setVisible(true);
        frame.setSize(450, 500);
    }//GEN-LAST:event_btnPieActionPerformed

    private void btnBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        String location = (String) cmbLocation.getSelectedItem();
        DefaultCategoryDataset bar = new DefaultCategoryDataset();
        HashMap<String,Integer> stats = sport.winByLocation(location);
        for(String s: stats.keySet())
        {
            bar.setValue(stats.get(s), location, s);
        }
        JFreeChart chart = ChartFactory.createBarChart3D("Win by location","Team","Location", bar);
        chart.setBackgroundPaint(Color.black);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.red);
        
        //p.setForegroundAlpha(TOP);
        ChartFrame frame = new ChartFrame("Bar Chart",chart);
        frame.setVisible(true);
        frame.setSize(450, 500);
    }//GEN-LAST:event_btnBarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String teamName =(String) cmbTeams.getSelectedItem();
        String team2Name = (String) cmbTeam2.getSelectedItem();
        ArrayList<Match> matches = sport.getMatches();
        ArrayList<Team> teams = sport.getTeamsOfSport();
        XYSeriesCollection dataset = new XYSeriesCollection();  
        XYSeries series1 = new XYSeries("Plyaed"); 
        XYSeries series2 = new XYSeries("Won");
        
        for(Team t: teams)
        {
            if(t.getTeamName().equals(teamName))
            {
                series1.add( t.getMatchesPlayed(), t.getMatchesWon());
             }
            if(t.getTeamName().equals(team2Name))
            {
                series2.add( t.getMatchesPlayed(), t.getMatchesWon());
             }
        }
        dataset.addSeries(series1);
        dataset.addSeries(series2);
        
         JFreeChart chart = ChartFactory.createScatterPlot(  
        "Played vs Won",   
        "X-Axis", "Y-Axis", dataset);  
         XYPlot plot = (XYPlot)chart.getPlot();  
         plot.setBackgroundPaint(new Color(255,228,196));  
      
        ChartFrame frame = new ChartFrame("Analysis",chart);
        frame.setVisible(true);
        frame.setSize(450, 500);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBar;
    private javax.swing.JButton btnPie;
    private javax.swing.JComboBox<String> cmbLocation;
    private javax.swing.JComboBox<String> cmbTeam2;
    private javax.swing.JComboBox<String> cmbTeams;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private keeptoo.KGradientPanel kGradientPanel1;
    // End of variables declaration//GEN-END:variables

    private void populateSelect() {
        ArrayList<Match> matches = sport.getMatches();
        ArrayList<Team> teams = sport.getTeamsOfSport();
        DefaultComboBoxModel df = new DefaultComboBoxModel();
         DefaultComboBoxModel dx = new DefaultComboBoxModel();
        
        for(Match m : matches)
        {
            if(m.getVenue() == null) continue;
            else
                df.addElement(m.getVenue().getLocation());
        }
        cmbLocation.setModel(df);
        
        for(Team t: teams)
        {
            dx.addElement(t.getTeamName());
        }
        cmbTeams.setModel(dx);
        cmbTeam2.setModel(dx);
    }
}
