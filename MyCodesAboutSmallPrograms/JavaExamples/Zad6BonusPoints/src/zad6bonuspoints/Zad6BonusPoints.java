/*
 * dobavqne na bonus tochki v zavisimost ot resultata na usera;
 */
package zad6bonuspoints;

import java.util.Scanner;

public class Zad6BonusPoints {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfUser;

        System.out.println("molq vavedete tochkite za bonus,koito imate( 1- 9 ) :");
        numberOfUser = input.nextInt();

        switch (numberOfUser) {
            case 1:
                System.out.println("Imate 10 bonus tochki!");
                break;
            case 2:
                System.out.println("Imate 20 bonus tochki!");
                break;
            case 3:
                System.out.println("Imate 30 bonus tochki!");
                break;
            case 4:
                System.out.println("Imate 400 bonus tochki!");
                break;
            case 5:
                System.out.println("Imate 500 bonus tochki!");
                break;
            case 6:
                System.out.println("Imate 600 bonus tochki!");
                break;
            case 7:
                System.out.println("Imate 7000 bonus tochki!");
                break;
            case 8:
                System.out.println("Imate 8000 bonus tochki!");
                break;
            case 9:
                System.out.println("Imate 9000 bonus tochki!");
                break;
            default:
                System.out.println("Molq vavedete stoinost validna v intervala"
                        + "ot 1 do 9!!!");
                break;

        }
    }
}
