package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Doarcutine on 2017/9/22.
 */
public class BookManager {
    private ArrayList<Book> bookList;

    public BookManager() {
        bookList = new ArrayList<Book>();
        bookList.add(new Book("book1", "author1", "publishTime1"));
        bookList.add(new Book("book2", "author2", "publishTime2"));
        bookList.add(new Book("book3", "author3", "publishTime3"));
        bookList.add(new Book("book4", "author4", "publishTime4"));
    }

    public void PrintAvaliableBookList() {
        for (Book currentBook : bookList) {
            if (currentBook.isAvaliable()) {
                currentBook.printBookDetails();
            }
        }
    }

    public boolean CheckoutBook(String name) {
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

    public void DoCheckoutBook() {
        if (Session.IsLogin()) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please input the book's name which you want to checkout:");
            String bookName = scanner.next();
            CheckoutBook(bookName);
        }
    }

    public boolean ReturnBook(String name) {
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

    public void DoReturnBook() {
        if (Session.IsLogin()) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please input the book's name which you want to return:");
            String bookName = scanner.next();
            ReturnBook(bookName);
        }
    }
}
