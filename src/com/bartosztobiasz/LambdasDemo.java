package com.bartosztobiasz;

import java.util.function.Function;

public class LambdasDemo {
    public static void show() {
//        Function<String, Integer> map = str -> str.length();
        Function<String, Integer> map = String::length;

        int length = map.apply("Sky");
        System.out.println(length);
    }
}
