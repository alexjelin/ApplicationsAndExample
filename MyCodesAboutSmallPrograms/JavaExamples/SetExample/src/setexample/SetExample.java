package setexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set<String> metSet = new HashSet<>();
        metSet.add("football");
        metSet.add("baseball");
        metSet.add("basketball");
        metSet.add("golf");
        metSet.add("swimming");
        metSet.add("tennis");

        Set<String> womenSet = new HashSet<>();
        womenSet.add("football");
        womenSet.add("basketball");
        womenSet.add("soccer");
        womenSet.add("golf");
        womenSet.add("swimming");
        womenSet.add("water polo");
        System.out.println("--------------------------------------");
        printElements(metSet);
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        printElements(womenSet);
        System.out.println("Sortirovki :--------------------------------------");
        sortAndPrintEL(metSet);
        System.out.println("--------------------------------------");
        sortAndPrintEL(womenSet);
        System.out.println("--- Obratni Sortirovki :--------------------------------------");
        sortReverse(metSet);
        System.out.println("--------------------------------------");
        sortReverse(womenSet);
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        matchSportMethod(metSet, womenSet);
    }

    public static void printElements(Collection setCol) {
        Iterator iterator = setCol.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

    public static void sortAndPrintEL(Collection setCol) {
        List<String> test = new ArrayList<>(setCol);
        Collections.sort(test);
        printElements(test);
    }

    public static void sortReverse(Collection<String> setCol) {
        List<String> test = new ArrayList<>(setCol);
        Collections.sort(test, Collections.reverseOrder());
        printElements(test);
    }

    public static void matchSportMethod(Set<String> col1, Set<String> col2) {
        Iterator iterator1 = col1.iterator();
        Iterator iterator2 = col2.iterator();

        int sizeOfCOl1 = col1.size();
        int sizeOfCol2 = col2.size();

        Object[] array1 = col1.toArray();
        Object[] array2 = col2.toArray();

        if (sizeOfCOl1 > sizeOfCol2) {
            for (int i = 0; i < sizeOfCOl1; i++) {
                if (Arrays.binarySearch(array2, array1[i]) > 0) {
                    System.out.println(array1[i].toString());
                };
            }
        } else {
            for (int i = 0; i < sizeOfCol2; i++) {
                if (Arrays.binarySearch(array2, array1[i]) > 0) {
                    System.out.println(array1[i].toString());
                };
            }
        }
    }
}
