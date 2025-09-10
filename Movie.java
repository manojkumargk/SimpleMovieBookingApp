package com;
public class Movie {
    private String title;
    private boolean adult;

    public Movie(String title, boolean adult) {
        this.title = title;
        this.adult = adult;
    }

    public String getTitle() { return title; }
    public boolean isAdult() { return adult; }
}
