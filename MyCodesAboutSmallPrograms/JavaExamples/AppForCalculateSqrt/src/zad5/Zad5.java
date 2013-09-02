/*
 * konzolno prilojenie za presmqtane na kvadraten koren;
 */
package zad5;

import java.util.Scanner;

public class Zad5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number1;
        double number2;
        double number3;
        double diskrimenanta;
        double koreni;
        double result1;
        double result2;

        System.out.println("Prilojenieto shte izvede kvadratnite koreni na uravnenieto"
                + "a^2 + bx + c=0!!!");
        System.out.println("molq vavedete parvoto chislo");
        number1 = input.nextInt();
        System.out.println("molq vavedete vtoroto chislo");
        number2 = input.nextInt();
        System.out.println("molq vavedete tretoto chislo");
        number3 = input.nextInt();
        diskrimenanta = ((Math.pow(number2, 2)) - 4 * number1 * number3);

        if (diskrimenanta >= 0) {
            result1 = ((-number2 + Math.sqrt(diskrimenanta)) / number1);
            result2 = ((-number2 - Math.sqrt(diskrimenanta)) / number1);

            System.out.printf("Korenite na uravnenieto sa %.2f i %.2f ! \n", result1, result2);
        } else {
            System.out.println("Korenite na uravnenieto nereialni chisla!");
        }
    }
}
