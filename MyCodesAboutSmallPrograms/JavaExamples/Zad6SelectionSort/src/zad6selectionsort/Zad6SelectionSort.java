/*
 * konzolno prilojenie za sortirane na massive;
 */
package zad6selectionsort;

public class Zad6SelectionSort {

    public static void main(String[] args) {
        int[] array = {1, 2, 575, 6546, 554, 553, 552, 999, 785, 7854, 974, 123, 124, 25, 23};
// cikyl za Selection Sort;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                   array[j]=temp;
                }
            }
        }
        for(int number:array){
            System.out.printf("%d ",number);
        }
    }
}
