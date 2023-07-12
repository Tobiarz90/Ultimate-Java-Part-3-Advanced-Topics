package com.bartosztobiasz;

import java.util.HashMap;
import java.util.List;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

        // key: title
        // value: Movie

        // imperative programming
        HashMap<String, Movie> movieMap = new HashMap<>();
        for (Movie movie : movies) {
            if (movie.getLikes() > 10) {
                movieMap.put(movie.getTitle(), movie);
            }
        }
        System.out.println(movieMap);
    }
}
