package zad2equalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Zad2EqualArrays {

    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[6];
        Scanner input = new Scanner(System.in);

        for (int number : array1) {
            number = input.nextInt();
            System.out.printf(" Elementyty,koito vavedahte  e %d\n", number);
        }

        for (int number : array2) {
            number = input.nextInt();
            System.out.printf(" Elementyty,koito vavedahte  e %d\n", number);
        }
        
                if (Arrays. equals(array1,array2)) {
                    System.out.println("Dvata masiva sa ednakvi!");
                } else {
                    System.out.println("Dvata masiva sa razlichni!");
                }
            }
        }
    

