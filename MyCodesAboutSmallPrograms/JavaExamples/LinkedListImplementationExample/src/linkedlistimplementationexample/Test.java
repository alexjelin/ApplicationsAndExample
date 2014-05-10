
package linkedlistimplementationexample;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        List<String> list1=new List<>("brum");
        Random rand=new Random();
        int counter=0;
        while(counter<11)
        {
            counter++;
            String number="aa"+rand.nextInt(99);
            list1.insertAtFront(number);
        }
        
        String result=list1.toString();
        System.out.println(result);
    }
}
