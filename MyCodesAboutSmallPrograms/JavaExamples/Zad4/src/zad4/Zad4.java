/*
 *konzolno prilojenie za opredelqne na tejeshta na chovek na lunata;
 * otnoshenito mejdu zemnoto i lunnoto grav. pole sa 17 %!
 */
package zad4;

import java.util.Scanner;

public class Zad4 {

    public static void main(String[] args) {
        double numberOfUser;
        Scanner input = new Scanner(System.in);
        double result;

// inicializirane na chislo ot potriitelq
        System.out.println("Molq vavedete tejest na chovek!");
        numberOfUser = input.nextDouble();
        // proverka za validaciq na tegloto;
        while (numberOfUser == 0) {
            System.out.println("Molq vavedete tejest na chovek!!!");
            numberOfUser = input.nextDouble();
        }

// vazmojnost potribitelqt da proverqva nqklko chislo,dokato ne vavede 0 
        while (numberOfUser != 0) {
            result = (numberOfUser/100 * (17));
            System.out.printf("Tejesta na chovek na lunata e : %.2f ! \n", result);
            System.out.println("Molq vavedete proizvolno chislo! za izhod vavedete+"
                    + "0!");
            numberOfUser = input.nextInt();
        }
    }
}
