package com.bartosztobiasz;

import java.util.stream.IntStream;

public class StreamsDemo {
    public static void show() {
        /*
        additional methods in `IntStream` compared to `Stream`:
        .range()
        .rangeClosed()
         */

        // upper bound is exclusive
        IntStream.range(1, 6).forEach(System.out::println); // 1 to 5

        // upper bound is inclusive
        IntStream.rangeClosed(1, 6).forEach(System.out::println); // 1 to 6
    }
}
