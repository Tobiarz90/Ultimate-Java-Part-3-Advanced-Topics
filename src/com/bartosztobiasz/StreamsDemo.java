package com.bartosztobiasz;

import java.util.List;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        boolean allMatch = movies.stream()
                .allMatch(movie -> movie.getLikes() > 10);
        System.out.println(allMatch);
    }
}
