package com.bartosztobiasz;

public class LambdasDemo {
    public static void show() {
        // Anonymous Inner Class
        greet(new Printer() {
            @Override
            public void print(String message) {
                // this - represents a current instance of the anonymous inner class -> new Printer()
                System.out.println(message);
            }
        });
    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
