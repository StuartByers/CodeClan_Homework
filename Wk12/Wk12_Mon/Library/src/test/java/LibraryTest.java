import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void setUp() {
        library = new Library(2);
        book1 = new Book("12 Rules for Life", "Jordan Peterson", "Self Help");
        book2 = new Book("Shoe Dog", "Phil Knight", "Biography");
        book3 = new Book("The Bourne Identity", "Robert Ludlum", "Fiction");
    }

    @Test
    public void testGetNumberOfBooks() {
        assertEquals(0, library.getNumberOfBooks());
    }

    @Test
    public void testAddBook() {
        assertTrue(library.addBook(book1));
        assertEquals(1, library.getNumberOfBooks());

        assertTrue(library.addBook(book2));
        assertEquals(2, library.getNumberOfBooks());

        assertFalse(library.addBook(book3));
        assertEquals(2, library.getNumberOfBooks());
    }

    @Test
    public void testIsLibraryFull() {
        library.addBook(book1);
        assertFalse(library.isLibraryFull());

        library.addBook(book2);
        assertTrue(library.isLibraryFull());
    }
}