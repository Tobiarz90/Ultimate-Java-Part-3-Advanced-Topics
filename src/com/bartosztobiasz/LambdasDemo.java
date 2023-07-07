package com.bartosztobiasz;

public class LambdasDemo {
    public LambdasDemo(String message) {
        System.out.println(message);
    }

    public static void show() {
        // passing value to a class constructor as a Method Reference
        greet(message -> new LambdasDemo(message));
        greet(LambdasDemo::new);
    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
