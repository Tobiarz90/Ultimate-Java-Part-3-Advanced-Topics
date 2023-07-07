package com.bartosztobiasz;

public class Movie {
    private final String title;
    private final int likes;

    public Movie(String title, int likes) {
        this.title = title;
        this.likes = likes;
    }

    public int getLikes() {
        return likes;
    }

    public String getTitle() {
        return title;
    }
}
