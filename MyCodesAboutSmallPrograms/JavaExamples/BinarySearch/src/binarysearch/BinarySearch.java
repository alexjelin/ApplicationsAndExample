/*
 * konzolno prilojenie za tyrsene na opredeleno chislo chrez Binary Search;
 */
package binarysearch;

public class BinarySearch {

    public static double binarySearch(double[] a, double key) {

        if (a.length == 0) {
            return -1;
        }
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int middle = (low + high) / 2;
            if (key > a[middle]) {
                low = middle + 1;
            } else if (key < a[middle]) {
                high = middle - 1;
            } else { 
                return a[middle];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        double[] array = {1, 2, 575, 6546, 554, 553, 552, 999, 785, 7854, 974, 123, 124, 25, 23};
        // cikyl za Selection Sort;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    double temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        // opredelqme dali 2 se darja v masiva chrez metod za binarySearch;
        System.out.printf("Chislot %.2f se sardaja v masiva!", binarySearch(array, 2));
    }
}
