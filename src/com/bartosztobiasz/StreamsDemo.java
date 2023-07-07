package com.bartosztobiasz;

import java.util.List;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        // Declarative (Functional) Programming
        long count = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .count();
        System.out.println(count);
    }
}
