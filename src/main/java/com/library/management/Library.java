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
}