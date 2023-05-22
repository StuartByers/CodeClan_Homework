import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getNumberOfBooks() {
        return this.books.size();
    }

    public boolean addBook(Book book) {
        if (isLibraryFull()) {
            return false;
        }
        this.books.add(book);
        return true;
    }

    public boolean isLibraryFull() {
        return this.books.size() >= this.capacity;
    }
}
