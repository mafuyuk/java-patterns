package Iterator;

/**
 * Created by mafuyuk on 2016/12/03.
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("A book"));
        bookShelf.appendBook(new Book("B book"));
        bookShelf.appendBook(new Book("C book"));
        bookShelf.appendBook(new Book("D book"));

        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}
