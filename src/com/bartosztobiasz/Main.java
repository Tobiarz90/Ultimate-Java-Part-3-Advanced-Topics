package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        new GenericList<Integer>().add("a"); // COMPILE time error -> benefit of generics
    }
}
