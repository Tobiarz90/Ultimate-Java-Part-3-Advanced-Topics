package com.bartosztobiasz;

public class Movie implements Comparable<Movie> {
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

    @Override
    public int compareTo(Movie other) {
        return title.compareTo(other.getTitle());
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", likes=" + likes +
                '}';
    }
}
