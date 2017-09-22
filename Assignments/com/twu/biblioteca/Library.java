package com.twu.biblioteca;

import java.util.Scanner;

/**
 * Created by Doarcutine on 2017/9/15.
 */
public class Library {
    private BookManager bookManager;
    private MovieManager movieManager;
    private UserManager userManager;

    public Library() {
        bookManager = new BookManager();
        movieManager = new MovieManager();
        userManager = new UserManager();

    }

    public void printMenu() {
        System.out.println("1.List All Avaliable Books");
        System.out.println("2.List All Avaliable Movies");
        System.out.println("3.Login");
        System.out.println("4.Quit");
        if (Session.IsLogin()) {
            System.out.println("5.Show User Information");
            System.out.println("6.Checkout Movie");
            System.out.println("7.Checkout Book");
            System.out.println("8.Return Book");
        }

        System.out.print("please input your choice:");
    }

    public void printWelcomeInformation() {
        System.out.println("welcome to biblioteca,please press enter to the main menu");
    }

    public boolean responseUserChoseMenuOption(int option) {
        if (option < 1) {
            System.out.println("Select a valid option!");
            return false;
        }
        jumpToUserChoseMenuOption(option);
        return true;
    }

    private void jumpToUserChoseMenuOption(int option) {
        Scanner scanner = new Scanner(System.in);
        String bookName;
        String libraryNumber = "-1";
        switch (option) {
            case 1:
                bookManager.PrintAvaliableBookList();
                break;
            case 2:
                movieManager.PrintAvaliableMovieList();
                break;
            case 3:
                userManager.DoLogin();
                break;
            case 5:
                if (Session.IsLogin()) {
                    userManager.GetUser(Session.currentUserLibarayNumber).ShowInformation();
                }
                break;
            case 6:
                movieManager.DoCheckoutMovie();
                break;
            case 7:
                bookManager.DoCheckoutBook();
                break;
            case 8:
                bookManager.DoReturnBook();
                break;
            default:
                System.exit(0);
        }
    }
}
