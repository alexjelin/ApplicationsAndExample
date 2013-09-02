/*
 * konzolno prilojenie za sortirane chrez metoda QUICK SORT!
 * 
 * */
package quicksort;

public class QuickSort {

    private int[] array;
    private int value;
    
    public QuickSort(int[] array1,int number){
        this.array=array1;
        this.value=number;
    }

    private void quicksort(int low, int high) {
        int i = low, j = high;
        int pivot = array[low + (high - low) / 2];

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }

            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                exchange(i,j);
                i++;
                j--;
            }
        }
        
        if (low < j) {
            quicksort(low, j);
        }
        if (i < high) {
            quicksort(i, high);
        }
    }

    private void exchange(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] tesst={1,2,5846,65,8,7};
        int number=0;
        QuickSort test=new QuickSort(tesst, number);
        test.quicksort(0, 2);
        for(int number10:tesst){
            System.out.printf("%d ",number10);
        }
    }
}
