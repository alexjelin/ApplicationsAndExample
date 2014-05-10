package exampleswitstricturesinjava;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import javax.swing.text.html.HTMLDocument;

public class ExamplesWitStricturesInJava {

    public static void main(String[] args) {
        /* List<Integer> numbers = new ArrayList<>();
         Random rand = new Random();
         for (int i = 0; i < 10; i++) {
         int number = rand.nextInt(555);
         numbers.add(number);
         }
         print(numbers);
         int max = Collections.max(numbers);
         System.out.printf("\n Max value is: >> %d << \n", max);
         * */
        /* Random rand = new Random();
         Stack<Integer> stack = new Stack<>();
         for (int i = 0; i < 10; i++) {
         int number = rand.nextInt(555);
         stack.push(number);
         }
         print(stack);
         int min = Collections.min(stack);
         System.out.printf("\n > Min value :%d <", min);
         * */
        /*PriorityQueue queue = new PriorityQueue();
        for (int i = 0; i < 10; i++) {
            queue.offer(5);
        }
        System.out.printf("\n Size of queue is :%d \n", queue.size());
        while (queue.size() != 0) {
            System.out.printf("%s | ", queue.peek());
            queue.poll();
        }
        * */
        
        HashMap<Integer,String> test=new HashMap<>();
        test.put(1,"aa");
       Set<Map.Entry<Integer,String>> test1=test.entrySet()
    }

    public static void print(Collection<Integer> collection1) {
        Iterator iterator = collection1.iterator();
        while (iterator.hasNext()) {
            System.out.printf("%s | ", iterator.next());
        }
    }
}
