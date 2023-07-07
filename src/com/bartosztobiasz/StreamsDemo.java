package com.bartosztobiasz;

import java.util.List;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        // limit(n)
        movies.stream()
                .limit(2)
                .map(Movie::getTitle)
                .forEach(System.out::println);
    }
}
