package com.bartosztobiasz;

import java.util.List;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        // data pagination (pol. dzielenie na strony)
        int page = 3;
        int pageSize = 10;
        movies.stream()
                .skip((page - 1) * pageSize)
                .limit(pageSize)
                .map(Movie::getTitle)
                .forEach(System.out::println);
    }
}
