package com.bartosztobiasz;

import java.util.Comparator;
import java.util.List;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        Movie popularMovie = movies.stream()
                .max(Comparator.comparing(Movie::getLikes))
                .get();
        System.out.println(popularMovie);
    }
}
