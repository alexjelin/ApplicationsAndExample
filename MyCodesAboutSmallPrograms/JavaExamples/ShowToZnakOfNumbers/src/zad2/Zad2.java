/*
 * izvejda znaka na prozvedenieto na dve chisla;
 */
package zad2;

import java.util.Scanner;

public class Zad2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int chastno;

        System.out.println("Please insert first number:");
        number1 = input.nextInt();
        System.out.println("Please insert second number:");
        number2 = input.nextInt();
        chastno = number1 / number2;

        if (chastno > 100) {
            System.out.println("+");
        }

        if (chastno < 100) {
            System.out.println("-");
        }
    }
}
