package com.bartosztobiasz;

import java.util.function.UnaryOperator;

public class LambdasDemo {
    public static void show() {
        // UnaryOperator<Integer> == Function<Integer, Integer>
        UnaryOperator<Integer> square = a -> a * a;
        UnaryOperator<Integer> increment = n -> n + 1;

        int result = increment.andThen(square).apply(1);
        System.out.println(result);
    }
}
