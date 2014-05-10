package final8;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
import javax.naming.spi.DirStateFactory;

public class Library<T extends Media> {

    private List<T> resources = new Vector<>();

    public Library(Collection<T> resources1) {
        resources.addAll(resources1);
    }

    @Override
    public String toString() {
        ListIterator iterator = resources.listIterator();
        String result = "";
        while (iterator.hasNext()) {
            result += iterator.next().toString();
        }
        return result;
    }

    public void addObject(T object) {
        resources.add(object);
    }

    public void sortAsc() {
        Collections.sort(resources, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                if (o1.getId() > o2.getId()) {
                    return 1;
                } else if (o1.getId() < o2.getId()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(resources.toString());
        this.resources.toString();
    }

    public String searchISBN(int id) {
        T obj;
        sortAsc();
        String title = "";
        for (int i = 0; i < resources.size(); i++) {
            if (id == resources.get(i).getId()) {
                title = resources.get(i).getTitle();
                break;
            }
        }
        return title;
    }

    public String returnLowerBook() {
        List<Book> list = new Vector<>();
        for (int i = 0; i < resources.size(); i++) {
            if (resources.get(i) instanceof Book) {
                list.add((Book) resources.get(i));
            }
        }

        Collections.sort(list, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        Book book = list.get(0);
        System.out.println(book.getTitle());
        return book.getTitle();
    }

    public void printNeshtoSi() {
        List<String> array = new Vector<>();
        String result = "";
        int counter = 0;
        for (int i = 0; i < resources.size(); i++) {
            array.add(result);
            result = "";
            counter = 0;
            T object = resources.get(i);
            for (int j = 0; j < resources.size(); j++) {
                if (object.getId() == resources.get(j).getId()) {
                    counter++;
                    result += String.format("%s - %d", resources.get(j), counter);
                }

            }
        }

        ListIterator iterator = array.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
