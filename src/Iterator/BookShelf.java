package Iterator;

import java.util.ArrayList;

/**
 * Created by mafuyuk on 2016/12/03.
 */
public class BookShelf implements Aggregate {
    private ArrayList<Book> books;

     public BookShelf() {
         this.books = new ArrayList<Book>();
     }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
