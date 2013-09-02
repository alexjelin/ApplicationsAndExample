/*
 * konzolno prilojenie za prebroqvane za tova
 * kolko pati se povtarq nai-sreshtanoto chislo v masiv;
 */
package zad7broenenacifra;

public class Zad7BroeneNaCifra {

    public static void main(String[] args) {
        int[] array = {1, 2, 575, 6546, 554, 553, 552, 999, 785, 785, 785, 7854, 974, 123, 124, 25, 23};
// cikyl za Selection Sort;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        
        int value=0;
        int mostViewNumber=0;
         for (int i = 0; i < array.length; i++) {
             if(i==0){
                 continue;
             }
             if(array[i]==array[i-1]){
                 mostViewNumber=array[i];
                 value++;
             }
         }
         System.out.printf("Nai chest sreshtanoto chislo e %d i se povtarq %d!",mostViewNumber,value);
    }
    
}
