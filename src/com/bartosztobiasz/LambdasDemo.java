package com.bartosztobiasz;

public class LambdasDemo {
    public static void show() {
        // passing static methods as a Method Reference
        greet(message -> printStatic(message));
        greet(LambdasDemo::printStatic); // ClassName::methodName
    }

    public static void printStatic(String message) {
        System.out.println(message);
    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
