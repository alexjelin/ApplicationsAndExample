/*
 * konzolno prilojenie za sravnenie na dva masiva leksigrafski;
 */
package zad3;

import java.util.Arrays;

public class Zad3 {

    public static void main(String[] args) {
        int[] arrayOfChar = {'A', 'B', 'C', 'D', 'F'};
        int[] arrayOfChar2 = {'A', 'B', 'C', 'D', 'F'};
        int[] arrayOfChar3 = {'p', 'Y', 'T', 'W', 'I'};
// sravnenie na parvite dva masiva;
        boolean condition = false;
        if (Arrays.equals(arrayOfChar2, arrayOfChar)) {
            condition = true;
        }
        System.out.printf("Dvata edvakvili sa ? %b\n", condition);
        // sravnqvane leksografki na 3 tiq i parvi masiv!;
        condition = false;
        if (Arrays.equals(arrayOfChar3, arrayOfChar)) {
            condition = true;
        }
        System.out.printf("Dvata edvakvili sa ? %b\n", condition);
    }
}
