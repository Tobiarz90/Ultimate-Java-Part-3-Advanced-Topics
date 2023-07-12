package com.bartosztobiasz;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 10, Genre.THRILLER),
                new Movie("b", 20, Genre.ACTION),
                new Movie("c", 30, Genre.ACTION)
        );

        /*
        partitioning data
        into two categories
        false: movies with 20 likes or fewer
        true: movies with more than 20 likes
         */

        Map<Boolean, String> partitionedMovies = movies.stream()
                .collect(Collectors.partitioningBy(
                        movie -> movie.getLikes() > 20,
                        Collectors.mapping(Movie::getTitle, Collectors.joining(", "))
                ));
        System.out.println(partitionedMovies);
    }
}
