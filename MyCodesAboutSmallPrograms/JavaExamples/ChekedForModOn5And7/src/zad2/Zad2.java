/*
 * konzolno prilojenie za proverka dali dadeno chislo se deli
 * na 5 i 7 ;
 */
package zad2;

import java.util.Scanner;

public class Zad2 {

    public static void main(String[] args) {
        int numberOfUser;
        Scanner input = new Scanner(System.in);

        System.out.println("Molq vavedete proizvolno chislo");
        numberOfUser = input.nextInt();

        while (numberOfUser != 0) {

            if (numberOfUser % 5 == 0 && numberOfUser%7==0) {
                System.out.println("Chisloto se deli na 5 i 7!!!");
            } else {
                System.out.println("Chisloto e nedleimo na 7 i 5!!!");
            }
            System.out.println("Molq vavedete proizvolno chislo! za izhod vavedete+"
                    + "0!");
            numberOfUser = input.nextInt();
        }
    }
}
