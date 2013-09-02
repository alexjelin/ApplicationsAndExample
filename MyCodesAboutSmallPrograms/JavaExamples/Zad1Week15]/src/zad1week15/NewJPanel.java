/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJPanel.java
 *
 * Created on Jun 11, 2013, 8:16:43 AM
 */
package zad1week15;

/**
 *
 * @author grade
 */
public class NewJPanel extends javax.swing.JPanel {

   private double tempToCelsius;
   
    public NewJPanel() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblFarenhait = new javax.swing.JLabel();
        txtFieldFarenhait = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaResult = new javax.swing.JTextArea();
        btnToCelsius = new javax.swing.JButton();
        btnToKelvin = new javax.swing.JButton();
        btnToExit = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter the temparature here:"));

        lblFarenhait.setText("Farenhait temperature:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFarenhait, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(txtFieldFarenhait, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFarenhait, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFieldFarenhait, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtAreaResult.setColumns(20);
        txtAreaResult.setEditable(false);
        txtAreaResult.setRows(5);
        jScrollPane1.setViewportView(txtAreaResult);

        btnToCelsius.setText("Convert to Celsius");
        btnToCelsius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToCelsiusActionPerformed(evt);
            }
        });

        btnToKelvin.setText("Convert to Kelvin");
        btnToKelvin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToKelvinActionPerformed(evt);
            }
        });

        btnToExit.setText("Exit");
        btnToExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnToCelsius)
                        .addGap(18, 18, 18)
                        .addComponent(btnToKelvin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(btnToExit, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnToExit)
                    .addComponent(btnToCelsius)
                    .addComponent(btnToKelvin))
                .addContainerGap(42, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void btnToCelsiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToCelsiusActionPerformed

    double tempOfFarenhait = Double.parseDouble(txtFieldFarenhait.getText());
    tempToCelsius = 5.0 / 9.0 * (tempOfFarenhait - 32);
    String result = String.format("Temp v celsii e : %.2f", tempToCelsius);
    txtAreaResult.setText(result);
}//GEN-LAST:event_btnToCelsiusActionPerformed

private void btnToKelvinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToKelvinActionPerformed

        double tempToKelvin;
        tempToKelvin=tempToCelsius+273.15;
        String result=String.format("Temp v kelvini e %.2f!",tempToKelvin);
        txtAreaResult.setText(result);
}//GEN-LAST:event_btnToKelvinActionPerformed

private void btnToExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToExitActionPerformed
System.exit(0);
}//GEN-LAST:event_btnToExitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnToCelsius;
    private javax.swing.JButton btnToExit;
    private javax.swing.JButton btnToKelvin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFarenhait;
    private javax.swing.JTextArea txtAreaResult;
    private javax.swing.JTextField txtFieldFarenhait;
    // End of variables declaration//GEN-END:variables
}
