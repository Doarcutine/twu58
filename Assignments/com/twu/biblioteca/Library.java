package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Doarcutine on 2017/9/15.
 */
public class Library {
    private ArrayList<Book> bookList;
    private ArrayList<String> menu;

    public Library() {
        bookList = new ArrayList<Book>();
        bookList.add(new Book("book1", "author1", "publishTime1"));
        bookList.add(new Book("book2", "author2", "publishTime2"));
        bookList.add(new Book("book3", "author3", "publishTime3"));
        bookList.add(new Book("book4", "author4", "publishTime4"));

        menu = new ArrayList<String>();
        menu.add("List All Avaliable Books");
        menu.add("Checkout book");
        menu.add("Return book");
        menu.add("Quit");
    }

    public void printMenu() {
        int index = 1;
        for (String option : menu) {
            System.out.println(index + "." + option);
            index++;
        }
        System.out.print("please input your choice:");
    }

    public void printWelcomeInformation() {
        System.out.println("welcome to biblioteca,please press enter to the main menu");
    }

    public boolean responseUserChoseMenuOption(int option) {
        if (option < 1 || option > menu.size()) {
            System.out.println("Select a valid option!");
            return false;
        }
        jumpToUserChoseMenuOption(option);
        return true;
    }

    private void jumpToUserChoseMenuOption(int option) {
        Scanner scanner = new Scanner(System.in);
        String bookName;
        switch (option) {
            case 1:
                printAvaliableBookList();
                break;
            case 2:
                System.out.print("Please input the book's name which you want to checkout:");
                bookName = scanner.next();
                userCheckoutBook(bookName);
                break;
            case 3:
                System.out.print("Please input the book's name which you want to return:");
                bookName = scanner.next();
                userReturnBook(bookName);
                break;
            default:
                System.exit(0);
        }
    }

    public void printAvaliableBookList() {
        for (Book currentBook : bookList) {
            if (currentBook.isAvaliable()) {
                currentBook.printBookDetails();
            }
        }
    }

    public boolean userCheckoutBook(String name) {
        for (Book currentBook : bookList) {
            if (currentBook.getName().equals(name) && currentBook.isAvaliable()) {
                currentBook.changeAvaliableStatus(false);
                System.out.println("Thank you! Enjoy the book");
                return true;
            }
        }
        System.out.println("That book is not available.");
        return false;
    }

    public boolean userReturnBook(String name) {
        for (Book currentBook : bookList) {
            if (currentBook.getName().equals(name) && !currentBook.isAvaliable()) {
                currentBook.changeAvaliableStatus(true);
                System.out.println("Thank you for returning the book.");
                return true;
            }
        }
        System.out.println("That is not a valid book to return.");
        return false;
    }

}
