package jksakjn;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Jksakjn {

    // create array of given size and fill with random integers
    public static void main(String args[]) {
        int[] data = new int[10]; // create space for array

        data[0] = 10;
        data[1] = 10;
        data[2] = 10;
        data[3] = 10;
        data[4] = 10;
        data[5] = 10;
        data[6] = 10;
        data[7] = 10;
        data[8] = 10;
        data[9] = 10;
        int searchKey = 10;
        int low = 0; // low end of the search area
        int mid = -2;
        int high = data.length - 1; // high end of the search area
        int middle = (low + high + 1) / 2; // middle element
        String location = " ";
        String position = "haha"; // return value; -1 if not found
        int i = 0;
        int j = 0;
        do // loop to search for element
        {
            // if the element is found at the middle
            if (searchKey == data[ middle]) {
                location += String.format("%d", middle);
                high += 2;
                middle = (low + high + 1) / 2;
                while (searchKey == data[middle]) {
                    if (middle < data.length) {
                        location += String.format("%d", middle);
                        high += 2;
                        middle = (low + high + 1) / 2;

                        if (middle == data.length) {
                            mid += 2;
                            middle = (low + mid + 1) / 2;
                            while (middle < data.length - 5) {
                                if (searchKey == data[ middle]) {
                                    location += String.format("%d", middle);
                                    mid += 2;
                                    middle = (low + mid + 1) / 2;

                                }
                            }
                            break;
                        }

                    }

                }
                break;
            } else if (searchKey < data[ middle]) {
                high = middle - 1; // eliminate the higher half
            } else // middle element is too low
            {
                low = middle + 1; // eliminate the lower half
            }
            middle = (low + high + 1) / 2; // recalculate the middle
        } while ((low <= high) && (position == "haha"));
char[] chars = location.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        System.out.println(sorted);
    }
}
