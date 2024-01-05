import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        List<Book>bookList = new LinkedList<>();

        Book b1 = new Book("The Tempest",3.59);
        Book b2 = new Book("Hamlet",9.59);
        Book b3 = new Book("King Lear",6.59);
        Book b4 = new Book("Romeo and Juliet",8.59);

        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);

        Collections.sort(bookList);

        Iterator<Book> iterator = bookList.iterator();

        while (iterator.hasNext()){
            Book book = iterator.next();
            System.out.println(book);
        }


    }
}