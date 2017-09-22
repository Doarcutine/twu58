package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Doarcutine on 2017/9/20.
 */
public class UserManagerTest {
    UserManager userManager = new UserManager();

    @Test
    public void LoginValidateTest() {
        String libraryNumber = "zdy-001";
        String password = "123";
        assertTrue(userManager.LoginValidate(libraryNumber, password));
    }

    @Test
    public void UserIsExsitsTest() {
        String libraryNumber = "zdy-001";
        assertTrue(userManager.UserIsExsits(libraryNumber));
    }
}
