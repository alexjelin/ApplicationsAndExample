/*
 * konzolno prilojenie za opredelqne na nai 
 * golqmoto chislo ot 3 po golemi ;
 */
package maxnumberofthreevalues;

import java.util.Scanner;

public class MaxNumberOfThreeValues {
// sazdavane na metod za opredelqne na max chislo mejdu dve

    public static int getMaxNumber(int number1, int number2) {
        int largest = 0;
        if (number1 > number2) {
            largest = number1;
        } else if (number2 > number1) {
            largest = number2;
        }
        return largest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert three number for comparision:");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thridNumber = input.nextInt();

        getMaxNumber(firstNumber, secondNumber);

        int max = 0;
        if (thridNumber > getMaxNumber(firstNumber, secondNumber)) {
            max = thridNumber;
        }

        System.out.printf("The max number is %d!\n", max);
    }
}
