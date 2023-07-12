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

        int sumOfLikes = movies.stream()
                .filter(movie -> movie.getLikes() > 10)
                .collect(Collectors.summingInt(Movie::getLikes));
        System.out.println(sumOfLikes);
    }
}
