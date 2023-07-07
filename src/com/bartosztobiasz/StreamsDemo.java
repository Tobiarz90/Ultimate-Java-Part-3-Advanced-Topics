package com.bartosztobiasz;

import java.util.List;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        // Mapping
        movies.stream()
                .map(Movie::getTitle) // pipe #1
                .forEach(System.out::println); // pipe #2

        movies.stream()
                .mapToInt(Movie::getLikes) // primitive variation of .map()
                .forEach(System.out::println);
    }
}
