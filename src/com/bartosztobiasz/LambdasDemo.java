package com.bartosztobiasz;

import java.util.function.Predicate;

public class LambdasDemo {
    public static void show() {
        // Combining Predicates
        Predicate<String> hasLeftBrace = str -> str.startsWith("{");
        Predicate<String> hasRightBrace = str -> str.endsWith("}");

        Predicate<String> hasBraces =
                hasLeftBrace.and(hasRightBrace); // &&
        hasLeftBrace.or(hasRightBrace); // ||

        hasBraces.negate(); // !

        System.out.println(hasBraces.test("{key:value}"));
    }
}
