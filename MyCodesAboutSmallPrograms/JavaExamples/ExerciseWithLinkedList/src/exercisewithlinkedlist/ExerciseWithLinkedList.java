package exercisewithlinkedlist;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class ExerciseWithLinkedList {
    
    public static void main(String[] args) {
        String[] letters = {"A", "B", "C", "D", "E", "F", "G", "J", "K", "L", "M", "N", "P", "R", "S", "T", "W", "Y", "Z", "O"};
        Random rand = new Random();
        List<String> list1 = new LinkedList<>();
        List<String> list2 = new LinkedList<>();
        for (int i = 0; i < letters.length; i++) {
            list1.add(letters[rand.nextInt(letters.length)]);
        }
        
        list2 = reverseList(list1, list2);
        //printELements(list2);
        System.out.println("---------------------");
        //printELements(list1);
        list1 = reverseList(list1, list2);
        list2 = reverseList(list2, list1);
        list1.addAll(list2);
        printELements(list1);
    }
    
    public static void printELements(Collection<String> col) {
        Iterator it = col.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
    
    public static List<String> reverseList(List<String> col, List col2) {
        Object[] ar = col.toArray();
        for (int i = ar.length - 1; i >= 0; i--) {
            col2.add(ar[i]);
        }
        return col2;
    }
}