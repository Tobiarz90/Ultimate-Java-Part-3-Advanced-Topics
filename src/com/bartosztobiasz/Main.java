package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
//        GenericList<Integer> numbers = new GenericList<Integer>();
        GenericList<Integer> numbers = new GenericList<>();

        numbers.add(1); // boxing process:
        // primitive value -> Java compiler wraps the value -> instance of an Integer class (box)
        int number = numbers.get(0); // unboxing process
    }
}
