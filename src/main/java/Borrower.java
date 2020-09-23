import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> privateCollection;

    public Borrower(String name){
        this.name = name;
        this.privateCollection = new ArrayList<>();
    }

    public int getCollection(){
        return this.privateCollection.size();
    }

    public void borrow(Library library, String name) {
        Book book = library.findBook(name);
        library.removeBook(book);
        this.privateCollection.add(book);
        }
}
