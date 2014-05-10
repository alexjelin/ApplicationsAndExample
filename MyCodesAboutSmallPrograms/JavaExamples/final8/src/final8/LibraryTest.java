package final8;

import java.util.List;
import java.util.Vector;

public class LibraryTest {
    
    public static void main(String[] args) throws IllegalAccessException, Exception {
        Book book1 = new Book(20.00, "Java1", true);
        Book book2 = new Book(30.00, "Java2", false);
        
        NewsPaper newsPaper1 = new NewsPaper(2.50, "Today", true);
        NewsPaper newsPaper2 = new NewsPaper(3.50, "Pozvanete", false);
        List<Book> books = new Vector<>();
        books.add(book1);
        books.add(book2);
        Library library = new Library(books);
        library.addObject(newsPaper1);
        library.addObject(newsPaper2);
        String title=library.searchISBN(3);
        System.out.println(title);
        library.returnLowerBook();
        library.sortAsc();
        library.printNeshtoSi();
        
    }
}
