package com.bartosztobiasz;

import java.util.List;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        // get total likes from all movies

        int sumOfLikes = movies.stream()
                .map(Movie::getLikes)
                .reduce(0, Integer::sum); // .reduce(initialValue, BinaryOperator)
        System.out.println(sumOfLikes);
    }
}
