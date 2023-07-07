package com.bartosztobiasz;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show() {
        List<Movie> movies = List.of(
                new Movie("a", 10),
                new Movie("b", 15),
                new Movie("c", 20)
        );

        // stream of two lists
        Stream<List<Integer>> stream = Stream.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6)
        );

        // print every item of every list
        stream
                // flatten: from `Stream<List<Integer>>` to `Stream<Integer>`
//                .flatMap(list -> list.stream()) // make stream out of every list
                .flatMap(Collection::stream)
                .forEach(System.out::println);
    }
}
