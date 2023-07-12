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

        /*
        .reduce(BinaryOperator) method explanation:
        [10, 20, 30]
        [a=10, b=20, 30]
        [a + b, 30]
        [30, 30]
        [a=30, b=30]
        [a + b]
        [60]
        60
         */
        int sumOfLikes = movies.stream()
                .map(Movie::getLikes)
//                .reduce((a, b) -> a + b)
//                .reduce((a, b) -> Integer.sum(a, b))
                .reduce(Integer::sum)
                .orElse(0);
        System.out.println(sumOfLikes);
    }
}
