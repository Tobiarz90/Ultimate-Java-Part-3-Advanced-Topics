package com.bartosztobiasz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStreamsDemo {
    public static void show() {
        // from a Collection
//        Collection<Integer> collection; collection.stream();

        List<Integer> list = new ArrayList<>();
        list.stream();

        // from an array
        int[] numbers = {1, 2, 3};
        Arrays.stream(numbers).forEach(System.out::println);

        // from an arbitrary number of objects
        Stream.of(1, 2, 3); // static factory method

        // infinite streams
        // lazy evaluation: calling the function every time the stream is read
        Stream<Double> infiniteStream = Stream.generate(Math::random);
        infiniteStream
                .limit(3) // intermediate operation
                .forEach(System.out::println); // terminal operation

        Stream.iterate(1, n -> n + 1) // f(seed), f(f(seed)), etc.
                .limit(10)
                .forEach(System.out::println);
    }
}
