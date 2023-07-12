package com.bartosztobiasz;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        // concatenating names of movies using a collector
        String string = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .map(Movie::getTitle)
                .collect(Collectors.joining(", "));
        System.out.println(string);
    }
}
