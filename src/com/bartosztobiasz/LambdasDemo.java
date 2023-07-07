package com.bartosztobiasz;

public class LambdasDemo {
    public static void show() {
        // passing instance methods as a Method Reference
        var demo = new LambdasDemo();
        greet(message -> demo.printInstance(message));
        greet(demo::printInstance); // ObjectName::methodName
    }

    public void printInstance(String message) {
        System.out.println(message);
    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
