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

    //Test for Returning Book Feature

    @Test
    void testReturnBookSuccess() throws Exception {
        Book book = new Book("1112223334", "Harry Potter 1", "J K Rowling", 1997);
        library.addBook(book);
        library.borrowBook("1112223334");
        library.returnBook("1112223334");
        assertTrue(library.getBookByISBN("1112223334").isAvailable());
    }

    @Test
    void testReturnBookFailure() {
        Exception exception = assertThrows(Exception.class, () -> {
            library.returnBook("0000000000");
        });
        assertEquals("Book is not borrowed or not exist.", exception.getMessage());
    }

        //Test for view available books

        @Test
    void testViewAvailableBooks() throws Exception {
        Book book1 = new Book("1112223334", "Harry Potter 1", "J K Rowling", 1997);
        Book book2 = new Book("2223334445", "The Alchemist", "Paulo Coelho", 1988);
        Book book3 = new Book("3334445556", "Harry Potter 1", "J K Rowling", 2002);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.borrowBook("1112223334");
        assertEquals(2, library.viewAvailableBooks().size());
        assertEquals("2223334445", library.viewAvailableBooks().get(0).getIsbn());
    }
}

