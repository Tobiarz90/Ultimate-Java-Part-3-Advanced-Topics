package com.bartosztobiasz;

public class LambdasDemo {
    public static void show() {
        // lambda expression will be checked against the signature of a method of a functional interface
        // lambda signature: methodName((param1, param2) -> { function body })
        greet((message) -> { // remove type of parameters
            System.out.println(message);
        });
    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
