/*
 * konzolno prilojenie,koeto pokazva redica ot posledovatelno narastvashti chisla v 
 * masiv;
 */
package zad5;

import java.util.Scanner;

public class Zad5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Molq vavedete 10 chisla za zaplavane na masiva!");
        for (int counter = 0; counter < array.length; counter++) {
            array[counter] = input.nextInt();
        }

        // proverka za povatrqshti se elementi i kolko pati se povtarqd podred;
        int broqch = 0;
        int value = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 9) {
                break;
            }
            if (i==0)
            {
                continue;
            }

            if (array[i] == (array[i-1] + 1)) {
                broqch++;
                value = array[i];
                System.out.printf( "%d,",value);
            }
        }
        // sazdavane na nov masiv s povtarqshto se stoinosti;
        /*int stoinost;
        stoinost=value-1;
        int[] array2 = new int[broqch];
        String result = "Povtarqshtite stoinosti sa:";
        for (int j = 0; j < array2.length; j++) {
            array2[j] = stoinost;
            result += String.format("%d , ", value);
        }
        System.out.printf("%s", result);*/
    }
}
