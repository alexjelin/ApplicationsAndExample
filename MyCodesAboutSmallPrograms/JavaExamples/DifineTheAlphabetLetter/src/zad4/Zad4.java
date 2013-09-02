/*
 * konzolno prilojenie za opredelnq na bukva ot azbukata s chislo 
 * ot 0-9 ! 
 */
package zad4;

import java.util.Scanner;

public class Zad4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;

        System.out.println("Please insert number:");
        number1 = input.nextInt();

        switch (number1) {
            case 0:
                System.out.println("Nqma takava bukva!");
                break;
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            case 4:
                System.out.println("D");
                break;
            case 5:
                System.out.println("E");
                break;
            case 6:
                System.out.println("F");
                break;
            case 7:
                System.out.println("J");
                break;
            case 8:
                System.out.println("K");
                break;
            case 9:
                System.out.println("L");
                break;
            default:
                System.out.println("Please insert the correct value!");
                break;
        }
    }
}
