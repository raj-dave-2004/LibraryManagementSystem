package main.java.com.library.management;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    //Implementation of adding books feauture

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }

    //Implementation of borrowing books feauture

    public Book getBookByISBN(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public void borrowBook(String isbn) throws Exception {
        Book book = getBookByISBN(isbn);
        if (book != null && book.isAvailable()) {
            book.setAvailable(false);
        } else {
            throw new Exception("Book is not available or not exist.");
        }
    }

    //Implementation of returning books feauture

    public void returnBook(String isbn) throws Exception {
        Book book = getBookByISBN(isbn);
        if (book != null && !book.isAvailable()) {
            book.setAvailable(true);
        } else {
            throw new Exception("Book is not borrowed or not exist.");
        }
    }

    //Implementation of view available books feature

    public List<Book> viewAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }
}