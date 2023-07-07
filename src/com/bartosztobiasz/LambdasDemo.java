package com.bartosztobiasz;

import java.util.function.Predicate;

public class LambdasDemo {
    public static void show() {
        Predicate<String> isLongerThan5 = str -> str.length() > 5;
        boolean result = isLongerThan5.test("sky");
        System.out.println(result);
    }
}
