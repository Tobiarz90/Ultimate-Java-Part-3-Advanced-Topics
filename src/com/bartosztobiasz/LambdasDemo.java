package com.bartosztobiasz;

public class LambdasDemo {
    public static void show() {
        // lambda signature: methodName((type param1, type param2) -> { function body })
        greet((String message) -> {
            System.out.println(message);
        });
    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
