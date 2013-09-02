/*
 * konzolno prilojenie za obryshtane na chislo;
 */
package javaapplication92;

import java.util.Scanner;

public class JavaApplication92 {

    public static void arrayReverse(int array[]) {
        for (int i = array.length; i >= 0; i--) {
            System.out.printf("%d", array[i]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Molq vavedete chisloto,chiqto stoinost shte obryshtane");

        int[] numberOfUser = new int[3];
        numberOfUser[0] = input.nextInt();
        numberOfUser[1] = input.nextInt();
        numberOfUser[2] = input.nextInt();

        arrayReverse(numberOfUser);
    }
}
