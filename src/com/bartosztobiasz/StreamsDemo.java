package com.bartosztobiasz;

import java.util.List;
import java.util.function.Predicate;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        Predicate<Movie> isPopular = movie -> movie.getLikes() > 10;
        movies.stream()
                .filter(isPopular)
                .map(Movie::getTitle)
                .forEach(System.out::println);
    }
}
