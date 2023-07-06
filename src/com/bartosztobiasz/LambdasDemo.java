package com.bartosztobiasz;

public class LambdasDemo {
    public static void show() {
        // lambda signature: methodName(param -> function body)
        // one line of a function body -> remove brackets (curly braces/brackets)
        greet(message -> System.out.println(message)); // ang. concise - pol. zwięzły, krótki, treściwy
    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
