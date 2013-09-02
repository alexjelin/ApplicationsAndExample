/*
 * konzolno prilojenie za opredelqne dali element ot tablicata e po golqm ili po
 * malak ot sasednite mu;
 */
package arraycomprasion;

import java.util.Scanner;

public class ArrayComprasion {

    public static void arraySarchAndCompare(int number, int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (number == array[i]) {
                if (number > array[i + 1]) {
                    System.out.println("vasheto chislo e po-golqmo ot sasednoto si "
                            + "v dqsno po golemina\n");
                }

                if (number < array[i + 1]) {
                    System.out.println("vasheto chislo e po-MALKO ot sasednoto si "
                            + "v dqsno po golemina\n");
                }

                if (number > array[i - 1]) {
                    System.out.println("vasheto chislo e po-golqmo ot sasednoto si "
                            + "v LQVO po golemina\n");
                }

                if (number < array[i - 1]) {
                    System.out.println("vasheto chislo e po-MALKO ot sasednoto si "
                            + "v lqvo po golemina\n");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfUser;
        System.out.println("Molq vavedete chislo");
        numberOfUser = input.nextInt();

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        arraySarchAndCompare(numberOfUser, array);
    }
}
