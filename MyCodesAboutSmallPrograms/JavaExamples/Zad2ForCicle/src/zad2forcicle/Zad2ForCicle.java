/*
 * konzolno prilojenie za opredelqne na chislata , koito se delqt na 5 v daden interval;
 */
package zad2forcicle;

import java.util.Scanner;

public class Zad2ForCicle {

    public static void main(String[] args) {
        Scanner vhod = new Scanner(System.in);
        int number1;
        int number2;

        System.out.println("Molq vavedete intervala,za koito iskate da namirite chislata"
                + "delqshti se na 5!");
        number1 = vhod.nextInt();
        number2 = vhod.nextInt();

        for (int counter = number1; counter <= number2; counter++) {
            if (counter % 5 == 0) {
                System.out.printf("Chisloto %d se deli na 5!\n", counter);
            }
        }
    }
}
