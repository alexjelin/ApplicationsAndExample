/*
 * konzolno prilojenie za opredelqne na chislata,koito davat sumata na chislo vavedeno 
 * ot potribitelq;
 */
package zad8sumofsequance;

import java.util.Scanner;

public class Zad8SumOfSequance {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Molq vavedete chislo:\n");
        int numberOfUser;
        numberOfUser = input.nextInt();

        int[] array = {1, 2, 3, 4, 5898, 56, 13, 45, 67};
        int sum = array[0];
        int value = 0;
        for (int i = 0; i < array.length; i++) {
            if (sum != numberOfUser) {
                sum += array[i];
                value = array[i];

            }

        }
        System.out.printf("%d %d", value, sum);

    }
}
