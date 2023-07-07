package com.bartosztobiasz;

import java.util.Comparator;
import java.util.List;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("b", 30),
                new Movie("a", 10),
                new Movie("c", 20)
        );

        // sorting stream elements

        // by implementing `Comparable` interface
        movies.stream()
                .sorted() // Movie implements Comparable<Movie>
                .forEach(System.out::println);

        // by implementing `Comparator` interface as a lambda expression
        movies.stream()
                .sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
                .forEach(System.out::println);

        /*
        by implementing the functional interface `Function`
        and using this implementation
        as a parameter of the static `comparing()` method of the `Comparator` interface
         */
        movies.stream()
                .sorted(Comparator.comparing(Movie::getTitle)
                        .reversed()) // changing order of sorting
                .forEach(System.out::println);
    }
}
