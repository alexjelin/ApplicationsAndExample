/*
 * konzolno prilojnie za proverka dali edno chislo e chetno ili nechetno;
 */
package zad1;

import java.util.Scanner;

public class Zad1 {

    public static void main(String[] args) {
        int numberOfUser;
        Scanner input = new Scanner(System.in);
        String result = null;

        System.out.println("Molq vavedete proizvolno chislo");
        numberOfUser = input.nextInt();

        while (numberOfUser != 0) {

            if (numberOfUser % 2 == 0) {
                System.out.println("Chisloto e chetno!");
            } else {
                System.out.println("Chisloto e nechetno!");
            }
            System.out.println("Molq vavedete proizvolno chislo! za izhod vavedete+"
                    + "0!");
            numberOfUser = input.nextInt();

        }
    }
}
