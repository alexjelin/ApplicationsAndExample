/*
 * konzolno prilojeni za otkrivane na tova chislo v masiv;
 */
package findtheelement;

import java.util.Scanner;

public class FindTheElement {
public static void findTheRepeatNumber(int number,int[] array){
    for(int i=0;i<array.length;i++){
        if(number==array[i]){
            System.out.println("chisloto e otkrito");
        }
        else{
             System.out.println("chisloto ne e otkrito");
             break;
        }
    }
}
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please insert the number who u want:");
        
        int numberOfUser;
        int[] array={1,2,3,4,5,6,7,8,9,10};
        numberOfUser=input.nextInt();
        findTheRepeatNumber(numberOfUser, array);
                
    }
}
