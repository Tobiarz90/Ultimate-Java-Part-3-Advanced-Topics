package com.bartosztobiasz;

public class LambdasDemo {
    public static void show() {
        greet(new ConsolePrinter());
    }

    public static void greet(Printer printer) { // greet(ConsolePrinter printer)
        printer.print("Hello World");
    }
}
