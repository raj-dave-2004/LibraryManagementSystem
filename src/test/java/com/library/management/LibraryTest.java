package test.java.com.library.management;

import main.java.com.library.management.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
    }

    //Test for Add Books Feauture

    @Test
    void testAddBook() {
        Book book = new Book("1112223334", "Harry Potter 1", "J K Rowling", 1997);
        library.addBook(book);
        assertEquals(1, library.getAllBooks().size());
    }

     //Test for Borrow Books Feature

    @Test
    void testBorrowBookSuccess() throws Exception {
        Book book = new Book("1112223334", "Harry Potter 1", "J K Rowling", 1997);
        library.addBook(book);
        library.borrowBook("1112223334");
        assertFalse(library.getBookByISBN("1112223334").isAvailable());
    }

    @Test
    void testBorrowBookFailure() {
        Exception exception = assertThrows(Exception.class, () -> {
            library.borrowBook("0000000000");
        });
        assertEquals("Book is not available or not exist.", exception.getMessage());
    }
}

