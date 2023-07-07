package com.bartosztobiasz;

import java.util.function.Supplier;

public class LambdasDemo {
    public static void show() {
        // lambda signature: methodName(() -> { return something; })
        // no parameters -> empty brackets (parenthesis)
//        Supplier<Double> getRandom = () -> { return Math.random(); };

//        Supplier<Double> getRandom = () -> Math.random();

        Supplier<Double> getRandom = Math::random;

        // lazy evaluation
        Double random = getRandom.get(); // this function is not executed until we explicitly call it
        System.out.println(random);
    }
}
