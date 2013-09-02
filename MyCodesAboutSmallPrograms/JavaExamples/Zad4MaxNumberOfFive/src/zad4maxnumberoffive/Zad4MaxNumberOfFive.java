/*
 * opredelqne na nai golqmoto cqlo chislo ot 5;
 */
package zad4maxnumberoffive;

import java.util.Scanner;

public class Zad4MaxNumberOfFive {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int number3;
        int number4;
        int number5;


        System.out.println("Please insert first number:");
        number1 = input.nextInt();
        System.out.println("Please insert second number:");
        number2 = input.nextInt();
        System.out.println("Please insert third number:");
        number3 = input.nextInt();
        System.out.println("Please insert fourth number:");
        number4 = input.nextInt();
        System.out.println("Please insert fifth number:");
        number5 = input.nextInt();

        int largest = number1;
        if (largest < number2) {
            largest = number2;
        }

        if (largest < number3) {
            largest = number3;
        }

        if (largest < number4) {
            largest = number4;
        }

        if (largest < number5) {
            largest = number5;
        }

        System.out.printf("nai golqmoto chislo e %d!\n", largest);
    }
}
