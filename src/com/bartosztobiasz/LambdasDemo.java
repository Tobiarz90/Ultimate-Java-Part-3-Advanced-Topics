package com.bartosztobiasz;

import java.util.List;
import java.util.function.Consumer;

public class LambdasDemo {
    public static void show() {
        List<String> list = List.of("a", "b", "c");

        Consumer<String> print = System.out::println;
        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());

        // Chaining Consumers
        /*
        From docs of andThen(Consumer):
        (T t) -> { accept(t); after.accept(t); }

        1. this.accept(t);
        2. after.accept(t);

        this: `print`
        after: `printUpperCase`
         */
        list.forEach(print.andThen(printUpperCase));
    }
}
