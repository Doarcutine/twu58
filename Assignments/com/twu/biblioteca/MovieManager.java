package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Doarcutine on 2017/9/22.
 */
public class MovieManager {
    private ArrayList<Movie> movieList;

    public MovieManager() {
        movieList = new ArrayList<Movie>();
        movieList.add(new Movie("movie1", "2017", "director1", "1",true));
        movieList.add(new Movie("movie2", "2017", "director2", "2",true));
        movieList.add(new Movie("movie3", "2017", "director3", "unrated",true));
    }

    public void PrintAvaliableMovieList() {
        for (Movie movie : movieList) {
            if (movie.isAvaliable()) {
                movie.PrintMovieDetail();
            }
        }
    }

    public boolean CheckoutMovie(String name) {
        for (Movie movie : movieList) {
            if (movie.getName().equals(name)) {
                movie.changeAvaliableStatus(false);
                return true;
            }
        }
        return false;
    }

    public void DoCheckoutMovie() {
        if (Session.IsLogin()) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Please input the movie's name which you want to checkout:");
            String movieName = scanner.next();
            CheckoutMovie(movieName);
        }
    }

    public boolean IsMovieExists(String name) {
        for (Movie movie : movieList) {
            if (movie.isAvaliable() && movie.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
