/*
 * konzolno prilojenie za razmqna na dve promenlivi;
 */
package zad1;

import java.util.Scanner;

public class Zad1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfOne;
        int numberOfTwo;
        int a = 0;
        int b = 0;

        System.out.println("Please insert first number:");
        numberOfOne = input.nextInt();
        System.out.println("Please insert second number:");
        numberOfTwo = input.nextInt();

        // uslovna konstrukciq za swapvane;

        if (numberOfOne > numberOfTwo) {
            a = numberOfOne;
            b = numberOfTwo;
            // swapvame
            a = numberOfTwo;
            b = numberOfOne;
            System.out.println("chislata sa razmeneni uspeshno!");
        } else {
            System.out.println("Nqma nujd ot razmqna");
        }
    }
}
