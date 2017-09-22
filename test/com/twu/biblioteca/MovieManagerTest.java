package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Doarcutine on 2017/9/22.
 */
public class MovieManagerTest {
    MovieManager movieManager = new MovieManager();

    @Test
    public void IsMovieExistsTest() {
        String name = "movie1";
        assertTrue(movieManager.IsMovieExists(name));
    }

    @Test
    public void CheckOutMovieTest() {
        String name = "movie1";
        assertTrue(movieManager.CheckoutMovie(name));
    }
}
