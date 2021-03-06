/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CDC;

import Business.EcoSystem;
import Business.Network.Network;
import Business.Patient.CounselorAssessmentReportEnum;
import Business.Patient.HighZoneConsumptionEnum;
import Business.Patient.LabAssessmentEnum;
import java.awt.Font;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Map;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Dipti
 */
public class HealthInspectorReportsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HealthInspectorReportsJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private Network network;

    public HealthInspectorReportsJPanel(JPanel userProcessContainer, EcoSystem system,Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = EcoSystem.getInstance();
        this.network = network;
        networkname.setText(network.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnZonesPieChart = new javax.swing.JButton();
        btnHighConsumptionPattern = new javax.swing.JButton();
        btnHighConsumptionPattern1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labAssessmentButton = new javax.swing.JButton();
        btnHighZonePatientsProgress = new javax.swing.JButton();
        btnQualitativeAnalysis = new javax.swing.JButton();
        btnPatientProgress = new javax.swing.JButton();
        btnAlcoholRelatedCrimes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        networkname = new javax.swing.JLabel();

        btnZonesPieChart.setText("Zones Pie Chart");
        btnZonesPieChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZonesPieChartActionPerformed(evt);
            }
        });

        btnHighConsumptionPattern.setText("Harmful Alcohol Use Pattern");
        btnHighConsumptionPattern.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHighConsumptionPatternActionPerformed(evt);
            }
        });

        btnHighConsumptionPattern1.setText("Alcohol Dependence ");
        btnHighConsumptionPattern1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHighConsumptionPattern1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alcohol Consumption Trends");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        labAssessmentButton.setText("Lab Assessment Report");
        labAssessmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labAssessmentButtonActionPerformed(evt);
            }
        });

        btnHighZonePatientsProgress.setText("High Zone Patients Progress");
        btnHighZonePatientsProgress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHighZonePatientsProgressActionPerformed(evt);
            }
        });

        btnQualitativeAnalysis.setText("Drinking Qualitative Reports");
        btnQualitativeAnalysis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQualitativeAnalysisActionPerformed(evt);
            }
        });

        btnPatientProgress.setText("All Zone Patients Progress");
        btnPatientProgress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientProgressActionPerformed(evt);
            }
        });

        btnAlcoholRelatedCrimes.setText("Alcohol Related Crimes");
        btnAlcoholRelatedCrimes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlcoholRelatedCrimesActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Network :");

        networkname.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(441, 441, 441)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnHighConsumptionPattern1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHighConsumptionPattern, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnZonesPieChart, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                            .addComponent(labAssessmentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(204, 204, 204)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPatientProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnQualitativeAnalysis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAlcoholRelatedCrimes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE))
                            .addComponent(btnHighZonePatientsProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(networkname)))
                .addGap(207, 207, 207))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(networkname))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnZonesPieChart, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPatientProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHighConsumptionPattern, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHighZonePatientsProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHighConsumptionPattern1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlcoholRelatedCrimes, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labAssessmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQualitativeAnalysis, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(124, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnZonesPieChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZonesPieChartActionPerformed
        // TODO add your handling code here:
        Map<String, Long> zoneConcentration = network.getZoneConcentration();
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        for (Map.Entry<String, Long> entry : zoneConcentration.entrySet()) {

            pieDataset.setValue(entry.getKey(), entry.getValue());

        }
        JFreeChart chart = ChartFactory.createPieChart("Zone Level Concentration001", pieDataset);
//       JFreeChart chart = ChartFactory.createPieChart("Zone Level Concentration001", pieDataset, true, true, Locale.ITALY);
        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setLabelFont(new Font("SansSerif", Font.BOLD, 20));
        plot.setNoDataMessage("No data available");
        plot.setCircular(false);
        plot.setLabelGap(0.02);
        PieSectionLabelGenerator gen = new StandardPieSectionLabelGenerator(
                "{0}: {1} ({2})", new DecimalFormat("0"), new DecimalFormat("0%"));
        plot.setLabelGenerator(gen);

        ChartFrame chartFrame = new ChartFrame("Pie Chart", chart);
        chartFrame.setVisible(true);
        chartFrame.setSize(1200, 1200);

    }//GEN-LAST:event_btnZonesPieChartActionPerformed

    private void btnHighConsumptionPatternActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHighConsumptionPatternActionPerformed
        // TODO add your handling code here:

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (Map.Entry<Integer, Long> entry : network.getHighZonePattern().entrySet()) {
            if (entry.getKey() <= 5) {
                continue;
            }
            int value = entry.getValue().intValue();

            dataset.setValue(value, "Pattern", HighZoneConsumptionEnum.getValueFromQuestion(entry.getKey()));
        }
        JFreeChart barChart = ChartFactory.createBarChart3D(
                "Harmful Alcohol Use",
                "Question Content",
                "Number of Patient",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);

        CategoryPlot categoryPlot = barChart.getCategoryPlot();
        // CategoryAxis domainAxis = categoryPlot.getDomainAxis();

        NumberAxis numberAxis = (NumberAxis) categoryPlot.getRangeAxis();
        numberAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        ChartFrame chartFrame = new ChartFrame("Bar Chart", barChart);
        chartFrame.setVisible(true);
        chartFrame.setSize(1200, 1200);
    }//GEN-LAST:event_btnHighConsumptionPatternActionPerformed

    private void btnHighConsumptionPattern1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHighConsumptionPattern1ActionPerformed
        // TODO add your handling code here:

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (Map.Entry<Integer, Long> entry : network.getHighZonePattern().entrySet()) {
            if (entry.getKey() > 5) {
                continue;
            }
            int value = entry.getValue().intValue();

            dataset.setValue(value, "Pattern", HighZoneConsumptionEnum.getValueFromQuestion(entry.getKey()));
            //dataset.setValue(value, "Pattern", HighZoneConsumptionEnum.getValueFromQuestion(entry.getKey()));
        }

        JFreeChart barChart = ChartFactory.createBarChart3D(
                "Alcohol Dependence Report",
                "Question Content",
                "Number of Patient",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);

        CategoryPlot categoryPlot = barChart.getCategoryPlot();
        // CategoryAxis domainAxis = categoryPlot.getDomainAxis();

        NumberAxis numberAxis = (NumberAxis) categoryPlot.getRangeAxis();
        numberAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        ChartFrame chartFrame = new ChartFrame("Bar Chart", barChart);
        chartFrame.setVisible(true);
        chartFrame.setSize(1200, 1200);
    }//GEN-LAST:event_btnHighConsumptionPattern1ActionPerformed

    private void labAssessmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labAssessmentButtonActionPerformed
        // TODO add your handling code here:
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        int count = network.getCountofLabTests(LabAssessmentEnum.AST);
        int count1 = network.getCountofLabTests(LabAssessmentEnum.CDT);
        int count2 = network.getCountofLabTests(LabAssessmentEnum.GGT);
        int count3 = network.getCountofLabTests(LabAssessmentEnum.MCV);

        dataset.setValue(count, "High", "AST Test");
        dataset.setValue(count1, "High", "CDT Test");
        dataset.setValue(count2, "High", "GGT Test");
        dataset.setValue(count3, "High", "MCV Test");
        
        
            //dataset.setValue(value, "Pattern", HighZoneConsumptionEnum.getValueFromQuestion(entry.getKey()));
        

        JFreeChart barChart = ChartFactory.createBarChart3D(
                "TESTS",
                "LEVEL",
                "Number of Patient",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);

        CategoryPlot categoryPlot = barChart.getCategoryPlot();
        // CategoryAxis domainAxis = categoryPlot.getDomainAxis();

        NumberAxis numberAxis = (NumberAxis) categoryPlot.getRangeAxis();
        numberAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        ChartFrame chartFrame = new ChartFrame("Bar Chart", barChart);
        chartFrame.setVisible(true);
        chartFrame.setSize(1200, 1200);

    }//GEN-LAST:event_labAssessmentButtonActionPerformed

    private void btnHighZonePatientsProgressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHighZonePatientsProgressActionPerformed
        // TODO add your handling code here:

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        Long count = network.getAllPatientsWithMin2Assessments().stream()
        .filter(p -> p.isFirstAssessmentHighZone())
        .count();

        int countHighZonePatient = count.intValue();

        Long countPositiveProgress = network.getAllPatientsWithMin2Assessments().stream()
        .filter(p -> p.isFirstAssessmentHighZone())
        .filter(p -> p.isProgressPositive())
        .count();

        dataset.setValue(countHighZonePatient, "Progress", "Number of Patient Before Treatment");
        dataset.setValue(countPositiveProgress.intValue(), "Progress", "Patient Showing Improvement");
        dataset.setValue(countHighZonePatient - countPositiveProgress.intValue(), "Progress", "Patient Relapsing");

        JFreeChart barChart = ChartFactory.createBarChart3D(
            "Zone 3 and Zone 4 Progress Report",
            "Progress",
            "Number of Patient",
            dataset,
            PlotOrientation.VERTICAL,
            true, true, false);

        CategoryPlot categoryPlot = barChart.getCategoryPlot();
        // CategoryAxis domainAxis = categoryPlot.getDomainAxis();

        NumberAxis numberAxis = (NumberAxis) categoryPlot.getRangeAxis();
        numberAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        ChartFrame chartFrame = new ChartFrame("Bar Chart", barChart);
        chartFrame.setVisible(true);
        chartFrame.setSize(1200, 1200);

    }//GEN-LAST:event_btnHighZonePatientsProgressActionPerformed

    private void btnQualitativeAnalysisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQualitativeAnalysisActionPerformed
        // TODO add your handling code here:
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        int countCope = network.getCountofFactor(CounselorAssessmentReportEnum.DRINKINGTOCOPE);
        int countEnhance = network.getCountofFactor(CounselorAssessmentReportEnum.DrinkingToEnhance);
        int countFamilySocialSupport = network.getCountofFactor(CounselorAssessmentReportEnum.FamilySocialSupport);
        int countFriendSocialSupport = network.getCountofFactor(CounselorAssessmentReportEnum.FriendSocialSupport);
        int countnegativeLifeEvents = network.getCountofFactor(CounselorAssessmentReportEnum.NegativeLifeEventsinLastYear);
        int countViolence = network.getCountofFactor(CounselorAssessmentReportEnum.Violence);

        dataset.setValue(countCope, "Factor", "Cope");
        dataset.setValue(countEnhance, "Factor", "Enhance");
        dataset.setValue(countFamilySocialSupport, "Factor", "No Family Support");
        dataset.setValue(countFriendSocialSupport, "Factor", "Social Disconnection");
        dataset.setValue(countnegativeLifeEvents, "Factor", "Negative Life Event");
        dataset.setValue(countViolence, "Factor", "Involved in violence");

        //dataset.setValue(value, "Pattern", HighZoneConsumptionEnum.getValueFromQuestion(entry.getKey()));
        JFreeChart barChart = ChartFactory.createBarChart3D(
            "Factors Contributing To Drinking",
            "Factors",
            "Number of Patient",
            dataset,
            PlotOrientation.VERTICAL,
            true, true, false);

        CategoryPlot categoryPlot = barChart.getCategoryPlot();
        // CategoryAxis domainAxis = categoryPlot.getDomainAxis();

        NumberAxis numberAxis = (NumberAxis) categoryPlot.getRangeAxis();
        numberAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        ChartFrame chartFrame = new ChartFrame("Bar Chart", barChart);
        chartFrame.setVisible(true);
        chartFrame.setSize(1200, 1200);

    }//GEN-LAST:event_btnQualitativeAnalysisActionPerformed

    private void btnPatientProgressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientProgressActionPerformed

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        Long count = network.getAllPatientsWithMin2Assessments().stream().count();

        int noofPatient = count.intValue();

        int countPositiveProgress = network.getPatientProgress(true);
        int countNegativeProgress = network.getPatientProgress(false);

        dataset.setValue(noofPatient, "Progress", "Number of Patient");
        dataset.setValue(countPositiveProgress, "Progress", "Patient Showing Improvement");
        dataset.setValue(countNegativeProgress, "Progress", "Patient Relapsing");

        JFreeChart barChart = ChartFactory.createBarChart3D(
            "Patient Progress chart",
            "Progress",
            "Number of Patient",
            dataset,
            PlotOrientation.VERTICAL,
            true, true, false);

        CategoryPlot categoryPlot = barChart.getCategoryPlot();
        // CategoryAxis domainAxis = categoryPlot.getDomainAxis();

        NumberAxis numberAxis = (NumberAxis) categoryPlot.getRangeAxis();
        numberAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        ChartFrame chartFrame = new ChartFrame("Bar Chart", barChart);
        chartFrame.setVisible(true);
        chartFrame.setSize(1200, 1200);
    }//GEN-LAST:event_btnPatientProgressActionPerformed

    private void btnAlcoholRelatedCrimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlcoholRelatedCrimesActionPerformed
        // TODO add your handling code here:

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        Map<String, Long> alcoholRelatedCrimeReport = network.getAlcoholRelatedCrimeReport();

        for (Map.Entry<String, Long> entry : alcoholRelatedCrimeReport.entrySet()) {

            int value = entry.getValue().intValue();
            dataset.setValue(value, "Pattern", entry.getKey());
        }

        JFreeChart barChart = ChartFactory.createBarChart3D(
            "Alcohol Related Crime Report",
            "Crime",
            "Number of Patient Involved",
            dataset,
            PlotOrientation.VERTICAL,
            true, true, false);

        CategoryPlot categoryPlot = barChart.getCategoryPlot();

        NumberAxis numberAxis = (NumberAxis) categoryPlot.getRangeAxis();
        numberAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        ChartFrame chartFrame = new ChartFrame("Bar Chart", barChart);
        chartFrame.setVisible(true);
        chartFrame.setSize(1200, 1200);
    }//GEN-LAST:event_btnAlcoholRelatedCrimesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlcoholRelatedCrimes;
    private javax.swing.JButton btnHighConsumptionPattern;
    private javax.swing.JButton btnHighConsumptionPattern1;
    private javax.swing.JButton btnHighZonePatientsProgress;
    private javax.swing.JButton btnPatientProgress;
    private javax.swing.JButton btnQualitativeAnalysis;
    private javax.swing.JButton btnZonesPieChart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton labAssessmentButton;
    private javax.swing.JLabel networkname;
    // End of variables declaration//GEN-END:variables
}
