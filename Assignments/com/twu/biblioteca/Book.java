package com.twu.biblioteca;

/**
 * Created by Doarcutine on 2017/9/15.
 */
public class Book{
    private String name;
    private String author;
    private String publishTime;
    private boolean whetherInLibrary;

    public Book(String name, String author, String publishTime) {
        this.name = name;
        this.author = author;
        this.publishTime = publishTime;
        this.whetherInLibrary = true;
    }

    public boolean equals(Book anotherBook) {
        return this.name.equals(anotherBook.name) && this.author.equals(anotherBook.author) && this.publishTime.equals(anotherBook.publishTime);
    }

    public void printBookDetails() {
        System.out.println(name + "\t" + author + "\t" + publishTime);
    }

    public boolean isAvaliable() {
        return whetherInLibrary;
    }

    public void changeAvaliableStatus(boolean status) {
        whetherInLibrary = status;
    }

    public String getName() {
        return name;
    }
}
