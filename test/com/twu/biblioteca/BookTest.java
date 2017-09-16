package com.twu.biblioteca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Doarcutine on 2017/9/15.
 */
public class BookTest {
    Book book = new Book("book1", "author1", "publishTime1");

    @Test
    public void equalsTest() {
        Book book1 = new Book("book1", "author1", "publishTime1");
        Book book2 = new Book("book1", "author1", "publishTime1");
        assertTrue(book1.equals(book2));
    }

    @Test
    public void printBookDetailsTest() {
        book.printBookDetails();
    }

}

