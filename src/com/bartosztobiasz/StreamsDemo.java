package com.bartosztobiasz;

import java.util.List;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("b", 30),
                new Movie("a", 10),
                new Movie("a", 10),
                new Movie("c", 20)
        );

        movies.stream()
                .map(Movie::getLikes)
                .distinct() // get unique items
                .forEach(System.out::println);
    }
}
