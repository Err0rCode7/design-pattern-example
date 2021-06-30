package design.pattern.Iterator;

public class ApplicationMain {

    /**
     * Iterator Pattern Example
     *
     * 책과 책 선반의 관계에서 책 선반에서 이터레이터 패턴을 통해 책을 찾는다.
     */
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
