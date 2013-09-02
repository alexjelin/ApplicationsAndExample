package caloriescalculator;

import calculatorzaotslabvane.Calories;
import calculatorzaotslabvane.Gender;
import javax.swing.JOptionPane;

public class CalculatorForm extends javax.swing.JFrame {

    public CalculatorForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDanni = new javax.swing.JPanel();
        lblSize = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        txtSize = new javax.swing.JTextField();
        txtGender1 = new javax.swing.JTextField();
        txtWeifht = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        helplbl1 = new javax.swing.JLabel();
        helplbl2 = new javax.swing.JLabel();
        helplbl3 = new javax.swing.JLabel();
        helplbl4 = new javax.swing.JLabel();
        pnlKaloriiNaDen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtlNivoNaAktivnost = new javax.swing.JTextField();
        helplbl6 = new javax.swing.JLabel();
        btnAvCal = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtAverageCal = new javax.swing.JTextField();
        helplbl5 = new javax.swing.JLabel();
        pnlRazhodKalorii = new javax.swing.JPanel();
        lblIzrazhodvaniCal = new javax.swing.JLabel();
        txtIzrazhodeniCal = new javax.swing.JTextField();
        helplbl8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtMaxCal = new javax.swing.JTextField();
        helplbl10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlDanni.setBackground(new java.awt.Color(255, 255, 102));
        pnlDanni.setBorder(javax.swing.BorderFactory.createTitledBorder("Lichni danni"));

        lblSize.setText("Visochina:");

        lblGender.setText("Pol:");

        lblWeight.setText("Teglo:");

        lblAge.setText("Vazrast:");

        helplbl1.setText("maj 1 ,jena 0");

        helplbl2.setText("sm");

        helplbl3.setText("kg");

        helplbl4.setText("godini");

        javax.swing.GroupLayout pnlDanniLayout = new javax.swing.GroupLayout(pnlDanni);
        pnlDanni.setLayout(pnlDanniLayout);
        pnlDanniLayout.setHorizontalGroup(
            pnlDanniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanniLayout.createSequentialGroup()
                .addGroup(pnlDanniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDanniLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(pnlDanniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDanniLayout.createSequentialGroup()
                                .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(helplbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDanniLayout.createSequentialGroup()
                                .addComponent(lblWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtWeifht, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(helplbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlDanniLayout.createSequentialGroup()
                                .addComponent(lblSize, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(helplbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlDanniLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(txtGender1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(helplbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlDanniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlDanniLayout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(230, Short.MAX_VALUE)))
        );
        pnlDanniLayout.setVerticalGroup(
            pnlDanniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanniLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(pnlDanniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGender1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(helplbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDanniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSize, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(helplbl2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDanniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWeifht, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(helplbl3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlDanniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(helplbl4))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(pnlDanniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlDanniLayout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(137, Short.MAX_VALUE)))
        );

        pnlKaloriiNaDen.setBackground(new java.awt.Color(153, 51, 0));
        pnlKaloriiNaDen.setBorder(javax.swing.BorderFactory.createTitledBorder("Kalorii na den"));

        jLabel1.setText("Nivo na aktinovst:");

        helplbl6.setText("Lipsva - 1 , Slabo - 2 , Sredno - 3 , silno - 4 ,Ekstremalno -5");

        btnAvCal.setText("Sredno Kalorii nujni na den:");
        btnAvCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvCalActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));

        txtAverageCal.setEditable(false);

        helplbl5.setText("Cal.");

        javax.swing.GroupLayout pnlKaloriiNaDenLayout = new javax.swing.GroupLayout(pnlKaloriiNaDen);
        pnlKaloriiNaDen.setLayout(pnlKaloriiNaDenLayout);
        pnlKaloriiNaDenLayout.setHorizontalGroup(
            pnlKaloriiNaDenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKaloriiNaDenLayout.createSequentialGroup()
                .addGroup(pnlKaloriiNaDenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlKaloriiNaDenLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtlNivoNaAktivnost, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlKaloriiNaDenLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnAvCal, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtAverageCal, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(helplbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlKaloriiNaDenLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(helplbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        pnlKaloriiNaDenLayout.setVerticalGroup(
            pnlKaloriiNaDenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKaloriiNaDenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlKaloriiNaDenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtlNivoNaAktivnost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(helplbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlKaloriiNaDenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(pnlKaloriiNaDenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAvCal, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAverageCal, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(helplbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pnlRazhodKalorii.setBackground(new java.awt.Color(255, 204, 0));
        pnlRazhodKalorii.setBorder(javax.swing.BorderFactory.createTitledBorder("Razod Na Kalorii na Den"));

        lblIzrazhodvaniCal.setText("Izrazhodvani Kalorii v fizichesko natovarvane:");

        helplbl8.setText("Cal.");

        jButton1.setText("Maximum Calorii dnevno za otslabvane s 1/2 kg dnevno");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        helplbl10.setText("Cal.");

        javax.swing.GroupLayout pnlRazhodKaloriiLayout = new javax.swing.GroupLayout(pnlRazhodKalorii);
        pnlRazhodKalorii.setLayout(pnlRazhodKaloriiLayout);
        pnlRazhodKaloriiLayout.setHorizontalGroup(
            pnlRazhodKaloriiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRazhodKaloriiLayout.createSequentialGroup()
                .addGroup(pnlRazhodKaloriiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRazhodKaloriiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlRazhodKaloriiLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblIzrazhodvaniCal, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlRazhodKaloriiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlRazhodKaloriiLayout.createSequentialGroup()
                        .addComponent(txtMaxCal, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(helplbl10, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlRazhodKaloriiLayout.createSequentialGroup()
                        .addComponent(txtIzrazhodeniCal, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(helplbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        pnlRazhodKaloriiLayout.setVerticalGroup(
            pnlRazhodKaloriiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRazhodKaloriiLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlRazhodKaloriiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIzrazhodvaniCal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIzrazhodeniCal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(helplbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlRazhodKaloriiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaxCal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(helplbl10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlRazhodKalorii, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlDanni, javax.swing.GroupLayout.PREFERRED_SIZE, 316, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlKaloriiNaDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlKaloriiNaDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlDanni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlRazhodKalorii, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAvCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvCalActionPerformed
        String gender = txtGender1.getText();
        int numberOfGender = Integer.parseInt(gender);
        Gender gender2 = Gender.MALE;

        if (numberOfGender == 0) {
            gender2 = Gender.FEMALE;
        }

        if (numberOfGender == 1) {
            gender2 = Gender.MALE;
        }

        if (numberOfGender != 1 && numberOfGender != 0) {
            JOptionPane.showMessageDialog(rootPane, "Vavedena greshna stoinost!");
        }

        String age = txtAge.getText();
        int age2 = Integer.parseInt(age);
        String weight = txtWeifht.getText();
        double weight2 = Double.parseDouble(weight);
        String size = txtSize.getText();
        double size2 = Double.parseDouble(size);


        Calories cal = new Calories(weight2, size2, age2, gender2);

        String nivoNaAkt = txtlNivoNaAktivnost.getText();
        int nivoInt = Integer.parseInt(nivoNaAkt);
        double result = cal.dailyAverageCaloriesBurn(nivoInt, gender2);
        String resultInTxt = String.format("%.2f", result);
        txtAverageCal.setText(resultInTxt);

    }//GEN-LAST:event_btnAvCalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String gender = txtGender1.getText();
        int numberOfGender = Integer.parseInt(gender);
        Gender gender2 = Gender.MALE;

        if (numberOfGender == 0) {
            gender2 = Gender.FEMALE;
        }

        if (numberOfGender == 1) {
            gender2 = Gender.MALE;
        }

        if (numberOfGender != 1 && numberOfGender != 0) {
            JOptionPane.showMessageDialog(rootPane, "Vavedena greshna stoinost za pol!Molq korigiraite!");
        }

        String age = txtAge.getText();
        int age2 = Integer.parseInt(age);
        String weight = txtWeifht.getText();
        double weight2 = Double.parseDouble(weight);
        String size = txtSize.getText();
        double size2 = Double.parseDouble(size);


        Calories cal = new Calories(weight2, size2, age2, gender2);

        String cal1 = txtIzrazhodeniCal.getText();
        int cal2 = Integer.parseInt(cal1);
        double result = cal.dailyCaloriesTotalToLosePerWeek(cal2, gender2);
        String resultInTxt = String.format("%.2f", result);
        txtMaxCal.setText(resultInTxt);

    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvCal;
    private javax.swing.JLabel helplbl1;
    private javax.swing.JLabel helplbl10;
    private javax.swing.JLabel helplbl2;
    private javax.swing.JLabel helplbl3;
    private javax.swing.JLabel helplbl4;
    private javax.swing.JLabel helplbl5;
    private javax.swing.JLabel helplbl6;
    private javax.swing.JLabel helplbl8;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblIzrazhodvaniCal;
    private javax.swing.JLabel lblSize;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JPanel pnlDanni;
    private javax.swing.JPanel pnlKaloriiNaDen;
    private javax.swing.JPanel pnlRazhodKalorii;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtAverageCal;
    private javax.swing.JTextField txtGender1;
    private javax.swing.JTextField txtIzrazhodeniCal;
    private javax.swing.JTextField txtMaxCal;
    private javax.swing.JTextField txtSize;
    private javax.swing.JTextField txtWeifht;
    private javax.swing.JTextField txtlNivoNaAktivnost;
    // End of variables declaration//GEN-END:variables
}
