package com.bartosztobiasz;

import java.util.List;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("c", 30),
                new Movie("b", 15)
        );

        movies.stream()
                .takeWhile(movie -> movie.getLikes() < 30) // takes elements matching a criterion
                .map(Movie::getTitle)
                .forEach(System.out::println);

        System.out.println("---");

        movies.stream()
                .dropWhile(movie -> movie.getLikes() < 30) // skips elements matching a criterion
                .map(Movie::getTitle)
                .forEach(System.out::println);
    }
}
