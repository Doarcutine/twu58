package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        Library library = new Library();

        library.printWelcomeInformation();

        Scanner scanner = new Scanner(System.in);
        String temp = scanner.nextLine();

        while (true) {
            library.printMenu();
            int option = scanner.nextInt();
            library.responseUserChoseMenuOption(option);
            temp = scanner.next();
        }
    }
}
