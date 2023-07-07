package com.bartosztobiasz;

import java.util.List;
import java.util.function.Consumer;

public class LambdasDemo {
    public static void show() {
        List<Integer> list = List.of(1, 2, 3);

        // Imperative Programming (for, if/else, switch/case) - programming style/paradigm
        // -> implementing logic using instructions; HOW it should be done?
        for (Integer item : list) {
            System.out.println(item);
        }

        // Declarative Programming - programming style/paradigm
        // -> WHAT should be done?

        // #1 - anonymous inner class
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer item) {
                System.out.println(item);
            }
        });

        // #2 - lambda expression
        list.forEach((Integer item) -> {
            System.out.println(item);
        });

        // #3 - no type specified
        list.forEach((item) -> {
            System.out.println(item);
        });

        // #4 - single argument and one-line body
        list.forEach(item -> System.out.println(item));

        // #5 - method reference
        list.forEach(System.out::println);
    }
}
