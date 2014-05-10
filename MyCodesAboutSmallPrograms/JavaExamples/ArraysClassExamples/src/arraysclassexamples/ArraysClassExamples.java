package arraysclassexamples;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import javax.swing.text.html.HTMLDocument;

public class ArraysClassExamples {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();

        int counter = 0;
        int value = 0;
        while (counter < 10) {
            int number = rand.nextInt(999);
            if (counter == 2) {
                value = number;
            }
            numbers[counter] = number;
            counter++;
        }

        printArray(numbers);
        Arrays.sort(numbers);
        int i = Arrays.binarySearch(numbers, value);
        System.out.println(String.format("Index na tyrsena stoinost:%d,", i));
        Arrays.fill(numbers, 7);
        printArray(numbers);
        List list = Arrays.asList(numbers);
        printCollection(list);
        removeElements(list);
    }

    public static void printArray(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            System.out.println(String.format("%d,", Array[i]));
        }
    }

    public static void printCollection(List<Integer> collection1) {
        ListIterator iterator = collection1.listIterator();

        while (iterator.hasNext()) {
            System.out.println(String.format("%s", iterator.next().toString()));
        }
    }

    public static void removeElements(Collection<Integer> collection1) {
        Iterator iterator = collection1.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
            System.out.println("OK \n");
        }
    }
}
