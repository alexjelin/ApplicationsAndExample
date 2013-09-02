/*
 * chetene ot konzolata na 3 chisla i tqhnoto otpechatvane;
 */
package zad1;

import java.util.Scanner;

public class Zad1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int number3;

        System.out.println("Please insert three numbers and they will print on console:");
        number1 = input.nextInt();
        number2 = input.nextInt();
        number3 = input.nextInt();

        System.out.printf("Three numbers who u are enter are :"
                + "%d , %d , %d !", number1, number2, number3);
    }
}
