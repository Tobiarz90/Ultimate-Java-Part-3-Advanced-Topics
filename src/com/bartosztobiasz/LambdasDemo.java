package com.bartosztobiasz;

import java.util.function.BinaryOperator;

public class LambdasDemo {
    public static void show() {
        var x = 1 + 2; // + (addition operator) == BinaryOperator
        // singleResult = operand1 BinaryOperator operand2

        // BinaryOperator<Integer> == BiFunction<Integer, Integer, Integer>
        BinaryOperator<Integer> add = (a, b) -> a + b;
        int result = add.apply(1, 2);
        System.out.println(result);
    }
}
