package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Doarcutine on 2017/9/20.
 */
public class UserManager {
    private ArrayList<User> userList;

    public UserManager() {
        userList = new ArrayList<User>();
        userList.add(new User("zdy-001", "123", "zdy001", "001@tw.com", "001"));
        userList.add(new User("zdy-002", "123", "zdy002", "002@tw.com", "002"));
        userList.add(new User("zdy-003", "123", "zdy003", "003@tw.com", "003"));
        userList.add(new User("zdy-004", "123", "zdy004", "004@tw.com", "004"));
        userList.add(new User("zdy-005", "123", "zdy005", "005@tw.com", "005"));
    }


    public boolean LoginValidate(String libraryNumber, String password) {
        for (User user : userList) {
            if (user.getLibraryNumber().equals(libraryNumber) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public boolean UserIsExsits(String libraryNumber) {
        for (User user : userList) {
            if (user.getLibraryNumber().equals(libraryNumber)) {
                return true;
            }
        }
        return false;
    }

    public User GetUser(String libraryNumber) {
        for (User user : userList) {
            if (user.getLibraryNumber().equals(libraryNumber)) {
                return user;
            }
        }
        return null;
    }

    public void DoLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your library number:");
        String libraryNumber = scanner.next();
        if (UserIsExsits(libraryNumber)) {
            System.out.print("Please input your password:");
            String password = scanner.next();
            if (LoginValidate(libraryNumber, password)) {
                Session.currentUserLibarayNumber = libraryNumber;
            }
        }
    }
}
