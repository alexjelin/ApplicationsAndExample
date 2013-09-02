/*
 * prilojenie za testvane na metodite i svoistvata na class Complex;
 */
package complex;

import java.util.Scanner;

public class ComplexTestApp {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Molq vavedete komplesno chislo");
        double realPart1 = input.nextDouble();
        double imagineryPart1 = input.nextDouble();
        Complex test = new Complex(realPart1, imagineryPart1);
        System.out.printf("Normata na kompleksnoto chislo e %.4f!\n", test.norm(realPart1, imagineryPart1));
        // izvejdane na sumata na dve kompleksni chisla

        System.out.println("Molq vavedete sledvashto komplesno chislo:");
        double realPart2 = input.nextDouble();
        double imagineryPart2 = input.nextDouble();
        double[] sum = test.sumComplexNumbers(realPart2, imagineryPart2);
        String sumOfComplexNumbers = "Sumata e :";
        for (int i = 0; i < sum.length; i++) {
            sumOfComplexNumbers += String.format("%.2f ", sum[i]);
        }
        System.out.printf(sumOfComplexNumbers + "\n");
        // izvejdane na razlikata na dve kompleksni chisla;

        double[] razlika1 = test.razlikaComplexNumbers(realPart2, imagineryPart2);
        String razlikaOfComplexNumbers = "Razlikata e :";
        for (int i = 0; i < razlika1.length; i++) {
            razlikaOfComplexNumbers += String.format("%.2f ", razlika1[i]);
        }
        System.out.printf(razlikaOfComplexNumbers + "\n");

        // izvejdane na delenieto na dve kompleksni chisla;   
        double[] delenie = test.partitionOFNumbers(realPart2, imagineryPart2);
        String delenieOfComplexNumbers = "Delemoto e :";
        for (int i = 0; i < delenie.length; i++) {
            delenieOfComplexNumbers += String.format("%.2f ", delenie[i]);
        }
        System.out.printf(delenieOfComplexNumbers + "\n");
        
// izvejdane na rezultata ot umnojenieto na dve kompleksni chisla;
        
        double[] multiplication = test.multiplicationOFNumbers(realPart2, imagineryPart2);
        String multiplicationOfComplexNumbers = "Ymnojenieto  e :";
        for (int i = 0; i < multiplication.length; i++) {
            multiplicationOfComplexNumbers += String.format("%.2f ", multiplication[i]);
        }
        System.out.printf(multiplicationOfComplexNumbers + "\n");
        
    }
}
