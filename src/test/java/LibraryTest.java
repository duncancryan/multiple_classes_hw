import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;

    @Before
    public void before(){
        library = new Library(1);
        book1 = new Book("Dune", "Frank Herbert", "Sci-Fi");
        book2 = new Book("Post Office", "Charles Bukowski", "Autobiographical Novel");
    }

    @Test
    public void collectionStartsAt0(){
        assertEquals(0, library.getCollection());
    }

    @Test
    public void canAddBookToCollection(){
        library.addBook(book1);
        assertEquals(1, library.getCollection());
    }

    @Test
    public void canRemoveBook(){
        library.addBook(book1);
        library.removeBook(book1);
        assertEquals(0, library.getCollection());
    }

    @Test
    public void willNotAddIfStockIsFull(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(1, library.getCollection());
    }

    @Test
    public void canFindBookByTitle(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(book1, library.findBook("Dune"));
    }
}
