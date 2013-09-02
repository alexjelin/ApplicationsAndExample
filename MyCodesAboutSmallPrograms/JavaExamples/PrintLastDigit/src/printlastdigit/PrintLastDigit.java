/*
 * koznzolno prilojenie za otpechatvane na poslednata 
 * cifra ot 3 cifreno chislo na Angliiski ;
 */
package printlastdigit;

import java.util.Scanner;

public class PrintLastDigit {

    public static void printTheLastDigit(int number) {

        int digit = number % 10;
        switch (digit) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("FIve");
                break;
            case 6:
                System.out.println("SIx");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("Please insert correct value");
                break;

        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert the three digits number:");

        int inputNumber;
        inputNumber = input.nextInt();

        printTheLastDigit(inputNumber);
    }
}
