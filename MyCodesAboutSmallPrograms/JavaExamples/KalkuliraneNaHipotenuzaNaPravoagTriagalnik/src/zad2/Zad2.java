/*
 * konzolno prilojenie za namirane na hipotenuzata v pravoagalen triagalnik;
 */
package zad2;

import javax.swing.JOptionPane;

public class Zad2 {

    public static void main(String[] args) {
        String inputnumber1;
        String inputnumber2;
        double a;
        double b;


        inputnumber1 = JOptionPane.showInputDialog("Molq vavedete parviqt katet na triagalnika");
        a = Double.parseDouble(inputnumber1);
        if (a < 0) {
            throw new ArithmeticException("Vavedenoot chislo e po malko ot nula");
        }

        inputnumber2 = JOptionPane.showInputDialog("Molq vavedete parviqt katet na triagalnika");
         b = Double.parseDouble(inputnumber2);

        if (b < 0) {
            throw new ArithmeticException("Vavedenoot chislo e po malko ot nula");
        }

        double hipotenuza = (Math.pow(a, 2) + Math.pow(b, 2));
        double hipotenuza2=Math.sqrt(hipotenuza);
        
        String result=String.format("resultat za hipetonuza e : %.2f",hipotenuza2);
        // izvejdane na stoinosta na hipotenuzata;
        JOptionPane.showMessageDialog(null, result);

    }
}
