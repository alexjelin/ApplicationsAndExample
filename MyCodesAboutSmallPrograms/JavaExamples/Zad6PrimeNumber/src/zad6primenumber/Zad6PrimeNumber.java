package zad6primenumber;

import java.util.Scanner;

public class Zad6PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.println("pLeASe insert the number in range of 0 to 100");
        number = input.nextInt();
        while (number < 0 && number > 100) {
            System.out.println("pLeASe insert the number in range of 0 to 100");
            number = input.nextInt();
        }

        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println("chisloto e neprosto!");
                break;
            } else {
                System.out.println("chisloto e prosto!");
                break;
            }
        }

    }
}
