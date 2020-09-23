import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> collection;
    private int capacity;

    public Library(int capacity){
        this.capacity = capacity;
        this.collection = new ArrayList<>();
    }

    public int getCollection(){
        return this.collection.size();
    }

    public boolean canAddBook(){
        return this.collection.size() < this.capacity;
    }

    public void addBook(Book book){
        if (canAddBook()) {
            this.collection.add(book);
        }
    }

    public void removeBook(Book book) {
        this.collection.remove(book);
    }

    public Book findBook(String name) {
        for (Book book : this.collection){
            if (book.getTitle().equals(name)){
                return book;
            }
        }
        return null;
    }
}
