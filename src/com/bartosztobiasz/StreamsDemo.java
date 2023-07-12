package com.bartosztobiasz;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        // key: title
        // value: Movie
        Map<String, Movie> movieMap = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
//                .collect(Collectors.toMap(Movie::getTitle, movie -> movie));
                .collect(Collectors.toMap(Movie::getTitle, Function.identity()));
        System.out.println(movieMap);
    }
}
