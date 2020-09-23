import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book1;
    private Book book2;

    @Before
    public void before(){
        borrower = new Borrower("Duncan");
        library = new Library(2);
        book1 = new Book("Dune", "Frank Herbert", "Sci-Fi");
        book2 = new Book("Post Office", "Charles Bukowski", "Autobiographical Novel");
        library.addBook(book1);
        library.addBook(book2);
    }

    @Test
    public void collectionStartsAt0(){
        assertEquals(0, borrower.getCollection());
    }

    @Test
    public void canBorrowBook(){
        borrower.borrow(library, "Dune");
        assertEquals(1, borrower.getCollection());
        assertEquals(1, library.getCollection());
    }
}
