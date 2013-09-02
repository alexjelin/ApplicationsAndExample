/*
 * namirane na nai golqmoto chislo izmejdu 3;
 */
package zad3maxnumber;

import java.util.Scanner;

public class Zad3MaxNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int number3;

        System.out.println("Please insert first number:");
        number1 = input.nextInt();
        System.out.println("Please insert second number:");
        number2 = input.nextInt();
        System.out.println("Please insert third number:");
        number3 = input.nextInt();
        
        int largest=number1;
        if(largest<number2){
            largest=number2;
        }
        
        if(largest<number3){
            largest=number3;
        }
        
        System.out.printf("nai golqmoto chislo e %d!\n",largest);
    }
}
