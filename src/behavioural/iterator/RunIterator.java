package behavioural.iterator;

import java.util.Iterator;

public class RunIterator {
    public void run() {
        BookCollection collection = new BookCollection();
        collection.addBook(new Book("The Monk Who Sold His Ferrari", "Robin Sharma"));
        collection.addBook(new Book("Stop Worrying And Start Living", "Dale Carnegie"));

        Iterator<Book> iterator = collection.createIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }
}
