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
}

