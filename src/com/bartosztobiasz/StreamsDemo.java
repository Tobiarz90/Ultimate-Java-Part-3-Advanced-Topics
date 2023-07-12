package com.bartosztobiasz;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 10, Genre.THRILLER),
                new Movie("b", 20, Genre.ACTION),
                new Movie("c", 30, Genre.ACTION)
        );

        Map<Genre, Set<Movie>> moviesByGenre = movies.stream()
                .collect(Collectors.groupingBy(
                        Movie::getGenre, Collectors.toSet()));
        System.out.println(moviesByGenre);
    }
}
