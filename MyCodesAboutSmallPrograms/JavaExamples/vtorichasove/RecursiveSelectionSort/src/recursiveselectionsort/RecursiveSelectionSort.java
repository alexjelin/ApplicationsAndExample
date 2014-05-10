package recursiveselectionsort;

import java.util.Random;

public class RecursiveSelectionSort {

    public static <T extends Comparable<T>> void sort(T[] arr, int first) {
        T min = arr[first];
        int minIndex = first;
        for (int i = first + 1; i < arr.length; ++i) {
            if (min.compareTo(arr[i]) > 0) {
                min = arr[i];
                minIndex = 1;
            }
        }
        arr[minIndex] = arr[first];
        arr[first] = min;
        sort(arr, first + 1);
    }

    public static void main(String args[]) {
        Integer[] arr = {10, 8, 1, 47};
        RecursiveSelectionSort.sort(arr, 0);
        for (Integer n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
        Box[] arr1 = new Box[15];
        Random num = new Random();

        for (int i = 0; i < arr1.length; i++) {
            arr1[i].setVolume(num.nextInt() + 100);
        }

        RecursiveSelectionSort.sort(arr1, 0);
        
        for (Box n: arr) {
            System.out.print(n + " ");
        }
        
    }
}
