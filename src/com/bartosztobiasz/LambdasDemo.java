package com.bartosztobiasz;

public class LambdasDemo {
    public static void show() {
        // single parameter -> remove brackets (parenthesis)
        // lambda signature: methodName(param -> { function body })
        greet(message -> {
            System.out.println(message);
        });
    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
