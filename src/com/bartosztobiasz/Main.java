package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        var list = new GenericList<String>();
        list.add("a");
        list.add("b");
        list.add("c");

        // `list.items` -> the internal implementation of GenericList class is exposed to the outside
        for (var item : list.items) {
            System.out.println(item);
        }
    }
}
