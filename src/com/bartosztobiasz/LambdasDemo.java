package com.bartosztobiasz;

public class LambdasDemo {
    private final String prefixField = "-";

    public void show() {
        // accessing local variables in lambda's body
        String prefixVar = "-";
        greet(message -> System.out.println(prefixVar + message));

        // accessing (static and instance) fields in lambda's body
        greet(message -> System.out.println(prefixField + message));

        // this -> references to enclosing object -> new LambdasDemo()
        greet(message -> System.out.println(this));
    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
