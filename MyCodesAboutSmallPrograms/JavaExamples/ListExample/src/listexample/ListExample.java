package listexample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class ListExample {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 20000; i++) {
            numbers.add(rand.nextInt(100));
        }

        String[] maxNumbers = sort100(numbers);
        for (int i = 0; i < maxNumbers.length; i++) {
            System.out.println(maxNumbers[i]);
        }
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        
        String[] minNumbers = sortMin10(numbers);
        for (int i = 0; i < minNumbers.length; i++) {
            System.out.println(minNumbers[i]);
        }
    }

    public static void printElements(Collection collection1) {
        Iterator it = collection1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }

    public static String[] sort100(List<Integer> list) {
        Collections.sort(list);
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i <= 100; i++) {
            int frequnace = Collections.frequency(list, i);
            numbers.put(i, frequnace);
        }

        List<Map.Entry> a = new ArrayList<Map.Entry>(numbers.entrySet());
        Collections.sort(a,
                new Comparator() {
            public int compare(Object o1, Object o2) {
                Map.Entry e1 = (Map.Entry) o1;
                Map.Entry e2 = (Map.Entry) o2;
                return ((Comparable) e1.getValue()).compareTo(e2.getValue());
            }
        });
        String[] text = new String[a.size()];
        int counter = 0;
        for (Map.Entry e : a) {
            String element = e.getKey() + " " + e.getValue();
            text[counter] = element;
            counter++;
        }

        String[] resultArray = new String[10];
        int counter2 = 0;
        for (int i = text.length - 1; i >= 91; i--) {
            resultArray[counter2] = text[i];
            counter2++;
        }
        return resultArray;
    }

    public static String[] sortMin10(List<Integer> list) {
        Collections.sort(list);
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i <= 100; i++) {
            int frequnace = Collections.frequency(list, i);
            numbers.put(i, frequnace);
        }

        List<Map.Entry> a = new ArrayList<Map.Entry>(numbers.entrySet());
        Collections.sort(a,
                new Comparator() {
            public int compare(Object o1, Object o2) {
                Map.Entry e1 = (Map.Entry) o1;
                Map.Entry e2 = (Map.Entry) o2;
                return ((Comparable) e1.getValue()).compareTo(e2.getValue());
            }
        });
        String[] text = new String[a.size()];
        int counter = 0;
        for (Map.Entry e : a) {
            String element = e.getKey() + " " + e.getValue();
            text[counter] = element;
            counter++;
        }

        String[] resultArray = new String[10];
        int counter2 = 0;
        for (int i = 0; i < 10; i++) {
            resultArray[counter2] = text[i];
            counter2++;
        }
        return resultArray;
    }
}
