package primerenfinalenizpit;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class Invoice<E extends Product> {

    List<E> pList = new Vector<E>();

    public Invoice(Collection<E> collection) {
        pList.addAll(collection);
    }

    public Invoice() {
    }

    @Override
    public String toString() {
        String result = "";
        ListIterator iterator = pList.listIterator();

        while (iterator.hasNext()) {
            result += iterator.next().toString();
        }
        return result;
    }

    public void addArrayPr(E[] array) {
        List<E> test = Arrays.asList(array);
        pList.addAll(test);
    }

    public void sortList() {
        Collections.sort(this.pList, new ProductComparator());
    }

    public void extractTwoLargeNumbers() {
        E max1 = Collections.max(pList, new Comparator<E>() {
            @Override
            public int compare(E o1, E o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        pList.remove(max1);
        E max2 = Collections.max(pList, new Comparator<E>() {
            @Override
            public int compare(E o1, E o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        String result1 = max1.toString();
        String result2 = max2.toString();
        System.out.println(result1);
        System.out.println(result2);
    }

    public void printElements() {
        ListIterator iterator = this.pList.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
