package com.twu.biblioteca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by Doarcutine on 2017/9/15.
 */
public class LibraryTest {
    Library library = new Library();

    @Test
    public void printWelcomeInformationTest() {
        library.printWelcomeInformation();
    }

    @Test
    public void userChoseValidMenuOptionTest() {
        int option = -1;
        assertEquals(false,library.responseUserChoseMenuOption(option));
    }

    @Test
    public void userChoseLegelMenuOptionTest() {
        int option = 2;
        assertEquals(true,library.responseUserChoseMenuOption(option));
    }

    @Test
    public void printMenuTest() {
        library.printMenu();
    }

    @Test
    public void userCheckoutBookTest() {
        assertTrue(library.userCheckoutBook("book1"));
    }

    @Test
    public void userReturnBookTest() {
        library.userCheckoutBook("book1");
        assertTrue(library.userReturnBook("book1"));
    }

    @Test
    public void printAvaliableBookListTest() {
        library.userCheckoutBook("book1");
        library.printAvaliableBookList();
    }



}

