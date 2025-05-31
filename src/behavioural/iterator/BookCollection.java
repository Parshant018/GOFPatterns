package behavioural.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookCollection {

    List<Book> books;

    public BookCollection() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public Iterator<Book> createIterator() {
        return new BookIterator(books);
    }

    //Java provides inbuild iterator interface, so there is no need to defin it explicitly
    private class BookIterator implements Iterator<Book> {

        List<Book> books;
        int pos = 0;

        public BookIterator(List<Book> books) {
            this.books = books;
        }

        @Override
        public boolean hasNext() {
            return pos < books.size();
        }

        @Override
        public Book next() {
            pos++;
            return books.get(pos-1);
        }
    }
}
