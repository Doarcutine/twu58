package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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

}

