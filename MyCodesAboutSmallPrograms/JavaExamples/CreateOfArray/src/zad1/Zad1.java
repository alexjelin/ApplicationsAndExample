// konzolno prilojenie za sazdavane na masiv,inicializaciq na elementite mu i tqhnoto 
// printirane ;

package zad1;

public class Zad1 {

    public static void main(String[] args) {
       int[] array=new int[20];
       
       for(int counter=0;counter<array.length;counter++){
           array[counter]=counter*5;
       }
       
       for(int number:array){
           System.out.printf("%d ", number);
       }
       
    }
}
