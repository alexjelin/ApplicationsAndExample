package circlecyllindertest;

import application15.Measurable;
import application15.Cilinder;
import application15.Circle;
import java.util.Random;

public class CircleCyllinderTest extends javax.swing.JFrame {
    
    Measurable[] measurables = new Measurable[10];
    private double radiusOfCircle;
    Circle newCircle = new Circle(radiusOfCircle);
    private int counter = 0;
    private double heifhtOfCilinder;
    Cilinder newCilinder = new Cilinder(radiusOfCircle, heifhtOfCilinder);
    private int couterForCilindyr;
    
    public CircleCyllinderTest() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblRad = new javax.swing.JLabel();
        txtFiledRadius = new javax.swing.JTextField();
        btnCircle = new javax.swing.JButton();
        LblHeight = new javax.swing.JLabel();
        TxtFieldHeight = new javax.swing.JTextField();
        btnCilinderCreation1 = new javax.swing.JButton();
        btnLargeNumber = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnShuffle2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaResult = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Create Cilinder"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Create Circle"));

        lblRad.setText("Radius:");

        txtFiledRadius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFiledRadiusActionPerformed(evt);
            }
        });

        btnCircle.setText("Create Circle");
        btnCircle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCircleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblRad, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(txtFiledRadius, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(btnCircle, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRad, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(txtFiledRadius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCircle))
                .addContainerGap())
        );

        LblHeight.setText("Height:");

        TxtFieldHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFieldHeightActionPerformed(evt);
            }
        });

        btnCilinderCreation1.setText("Create Cilinder");
        btnCilinderCreation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCilinderCreation1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(LblHeight)
                .addGap(49, 49, 49)
                .addComponent(TxtFieldHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCilinderCreation1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtFieldHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCilinderCreation1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        btnLargeNumber.setText("Largest mesure");
        btnLargeNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLargeNumberActionPerformed(evt);
            }
        });

        btnClose.setText("Exit");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnShuffle2.setText("Shuffle");
        btnShuffle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShuffle2ActionPerformed(evt);
            }
        });

        txtAreaResult.setColumns(20);
        txtAreaResult.setRows(5);
        jScrollPane1.setViewportView(txtAreaResult);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnShuffle2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addComponent(btnLargeNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLargeNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShuffle2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtFieldHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFieldHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFieldHeightActionPerformed
    
    private void btnCircleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCircleActionPerformed
        radiusOfCircle = Double.parseDouble(txtFiledRadius.getText());
        counter++;
        Circle test = new Circle(radiusOfCircle);
        newCircle = test;
        txtAreaResult.setText(String.format("%d", counter));
        for (int i = counter - 1; i < counter; i++) {
            measurables[i] = newCircle;
            String result = measurables[i].toString();
            
            txtAreaResult.setText(result);
        }
        
    }//GEN-LAST:event_btnCircleActionPerformed
    
    private void txtFiledRadiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiledRadiusActionPerformed
    }//GEN-LAST:event_txtFiledRadiusActionPerformed
    
    private void btnCilinderCreation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCilinderCreation1ActionPerformed
        heifhtOfCilinder = Double.parseDouble(txtFiledRadius.getText());
        counter++;
        for (int i = counter; i <= counter; i++) {
            measurables[i] = newCilinder;
            String result = measurables[i].toString();
            txtAreaResult.setText(result);
        }
    }//GEN-LAST:event_btnCilinderCreation1ActionPerformed
    
    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed
    
    private void btnShuffle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShuffle2ActionPerformed
        Random rand = new Random();
        int randomNumber = rand.nextInt(measurables.length - 1);
        String arrayResult;
        for (int i = 0; i < measurables.length; i++) {
            measurables[i] = measurables[randomNumber];
            arrayResult =measurables[i].toString();
            txtAreaResult.setText(arrayResult);
        }
    }//GEN-LAST:event_btnShuffle2ActionPerformed

    private void btnLargeNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLargeNumberActionPerformed
       double maxArea;
       for(int k=0;k<measurables.length;k++){
           // proverka za da ne grymne kogato stigne kraq na cikyla!
           
           if(k==measurables.length-1){
             if(measurables[k].computemesure()>measurables[k-1].computemesure()){
              maxArea=measurables[k].computemesure();
          }  
           }
          if(measurables[k].computemesure()>measurables[k+1].computemesure()){
              maxArea=measurables[k].computemesure();
          }
       }
      
    }//GEN-LAST:event_btnLargeNumberActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CircleCyllinderTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CircleCyllinderTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CircleCyllinderTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CircleCyllinderTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CircleCyllinderTest().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblHeight;
    private javax.swing.JTextField TxtFieldHeight;
    private javax.swing.JButton btnCilinderCreation1;
    private javax.swing.JButton btnCircle;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnLargeNumber;
    private javax.swing.JButton btnShuffle2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblRad;
    private javax.swing.JTextArea txtAreaResult;
    private javax.swing.JTextField txtFiledRadius;
    // End of variables declaration//GEN-END:variables
}