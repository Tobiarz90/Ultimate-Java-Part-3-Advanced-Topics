package com.bartosztobiasz;

public class LambdasDemo {
    public static void show() {
        // passing a Lambda Expression as a variable
        Printer printer = message -> System.out.println(message);
        printer.print("Hello World");
    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
