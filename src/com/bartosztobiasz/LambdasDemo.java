package com.bartosztobiasz;

import java.util.function.IntBinaryOperator;

public class LambdasDemo {
    public static void show() {
        // IntBinaryOperator = BinaryOperator<Integer> == BiFunction<Integer, Integer, Integer>
        IntBinaryOperator add = (a, b) -> a + b;
        int result = add.applyAsInt(1, 2);
        System.out.println(result);
    }
}
