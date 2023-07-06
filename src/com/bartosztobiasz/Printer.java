package com.bartosztobiasz;

// single abstract method -> Functional Interface
public interface Printer {
    void print(String message); // abstract method; Consumer

    // default method with an implementation
    default void printTwice(String message) {
        System.out.println(message);
        System.out.println(message);
    }

    // static method
    // ...
}
