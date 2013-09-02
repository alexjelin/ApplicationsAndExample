package homework14;

import java.util.Random;

public class TestFrame extends javax.swing.JFrame {

    public TestFrame() {
        initComponents();
    }
    Point pointA = new Point(15.00, 8, 9);
    Point pointB = new Point(15.65, 10, 9);
    Line myLineA = new Line(57, 0, 0, pointA, pointB);
    Line myLineB = new Line(5, 0, 0, pointA, pointB);

    public HeavyElement[] mixHeavyObjects(HeavyElement[] hs) {
        Random rand = new Random();
        int number = rand.nextInt(hs.length - 1);
        for (int i = 0; i < hs.length; i++) {
            hs[i] = hs[number];
        }
        return hs;
    }

    public HeavyElement[] shuffleArray() {
        HeavyElement[] hsArray = new HeavyElement[4];
        hsArray[0] = pointA;
        hsArray[1] = pointB;
        hsArray[2] = myLineA;
        hsArray[3] = myLineB;
        HeavyElement[] result = mixHeavyObjects(hsArray);
        return result;

    }

    public void printPoints() {
        String resultOfPointA = String.format("%s\n", pointA.toString());
        String resultOfPointB = String.format("%s\n", pointB.toString());
        String returnText = "";
        for (int i = 0; i < shuffleArray().length; i++) {
            if (shuffleArray()[i] == pointA) {
                returnText += String.format("%s!\nIndeksat e %d!\n", resultOfPointA, i);
            }
            if (shuffleArray()[i] == pointB) {
                returnText += String.format("%s\nIndeksat e %d!\n", resultOfPointB, i);
            }
        }

        txtAreaPoints.setText(returnText);
    }

    public void printLines() {
        String resultOfLineA = String.format("%s\n", myLineA.toString());
        String resultOfLineB = String.format("%s\n", myLineB.toString());
        String returnText1 = "";
        String text2 = "";
        for (int i = 0; i < shuffleArray().length; i++) {
            if (shuffleArray()[i] == myLineB) {
                returnText1 += String.format("%s\nIndeksat e %d!\n", resultOfLineB, i);
            }
            if (shuffleArray()[i] == myLineA) {
                text2 += String.format("%s\nIndeksat e %d!\n", resultOfLineA, i);
            }
        }

        txtAreaPoints.setText(returnText1 + text2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLines = new javax.swing.JButton();
        btnShuffle1 = new javax.swing.JButton();
        btnPoints1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaLines = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaPoints = new javax.swing.JTextArea();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLines.setText("Lines");
        btnLines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLinesActionPerformed(evt);
            }
        });

        btnShuffle1.setText("Shuffle");
        btnShuffle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShuffle1ActionPerformed(evt);
            }
        });

        btnPoints1.setText("Points");
        btnPoints1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoints1ActionPerformed(evt);
            }
        });

        txtAreaLines.setColumns(20);
        txtAreaLines.setRows(5);
        jScrollPane1.setViewportView(txtAreaLines);

        txtAreaPoints.setColumns(20);
        txtAreaPoints.setRows(5);
        jScrollPane2.setViewportView(txtAreaPoints);

        btnClose.setText("exit");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnShuffle1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPoints1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLines, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnClose)
                        .addGap(160, 160, 160))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPoints1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShuffle1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLines, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLinesActionPerformed
        printLines();
    }//GEN-LAST:event_btnLinesActionPerformed

    private void btnShuffle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShuffle1ActionPerformed
        shuffleArray();
    }//GEN-LAST:event_btnShuffle1ActionPerformed

    private void btnPoints1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoints1ActionPerformed
        printPoints();
    }//GEN-LAST:event_btnPoints1ActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

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
            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnLines;
    private javax.swing.JButton btnPoints1;
    private javax.swing.JButton btnShuffle1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtAreaLines;
    private javax.swing.JTextArea txtAreaPoints;
    // End of variables declaration//GEN-END:variables
}
