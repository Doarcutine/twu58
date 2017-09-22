package com.twu.biblioteca;

/**
 * Created by Doarcutine on 2017/9/22.
 */
public class Movie {
    private String name;
    private String year;
    private String director;
    private String movieRating;
    private boolean whetherInLibrary;

    public Movie(String name, String year, String director, String movieRating, boolean whetherInLibrary) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.movieRating = movieRating;
        this.whetherInLibrary = whetherInLibrary;
    }

    public boolean isAvaliable() {
        return whetherInLibrary;
    }

    public void changeAvaliableStatus(boolean status) {
        whetherInLibrary = status;
    }

    public void PrintMovieDetail() {
        System.out.println(name + "\t" + year + "\t" + director + "\t" + movieRating);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getMovieRating() {
        return movieRating;
    }

    public void setMovieRating(String movieRating) {
        this.movieRating = movieRating;
    }




}
