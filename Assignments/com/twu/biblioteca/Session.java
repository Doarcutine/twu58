package com.twu.biblioteca;

/**
 * Created by Doarcutine on 2017/9/22.
 */
public class Session {
    public static String currentUserLibarayNumber = "-1";
    public static boolean IsLogin() {
        return !currentUserLibarayNumber.equals("-1");
    }
}
