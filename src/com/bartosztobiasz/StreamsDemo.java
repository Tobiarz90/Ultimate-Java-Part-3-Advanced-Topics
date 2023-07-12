package com.bartosztobiasz;

import java.util.List;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        boolean anyMatch = movies.stream()
                .anyMatch(movie -> movie.getLikes() > 20);
        System.out.println(anyMatch);
    }
}
