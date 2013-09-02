/*
 * konzolno prilojenie,koeto proverqva za nalichie na 7 ca
 * kato treta cifra
 */
package zad3;

import java.util.Scanner;

public class Zad3 {

    public static void main(String[] args) {
        int numberOfUser;
        Scanner input = new Scanner(System.in);
        int divisor;
        int digit1;
        int digit2;
        int digit3;

// inicializirane na chislo ot potriitelq
        System.out.println("Molq vavedete proizvolno chislo");
        numberOfUser = input.nextInt();

// vazmojnost potribitelqt da proverqva nqklko chislo,dokato ne vavede 0 
        while (numberOfUser != 0) {

            digit1 = numberOfUser % 10;
            divisor = numberOfUser / 10;
            digit2 = divisor % 10;
            divisor = divisor / 10;
            digit3 = divisor % 10;
            divisor = divisor / 10;


            if (digit3 == 7) {
                System.out.println("Chisloto e sydyrja 7");
            } else {
                System.out.println("Chisloto Ne sydyrja 7!!");
            }
            System.out.println("Molq vavedete proizvolno chislo! za izhod vavedete+"
                    + "0!");
            numberOfUser = input.nextInt();
        }
    }
}
