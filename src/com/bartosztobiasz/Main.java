package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        var list = new ObjectList();
        list.add(1); // wrapper class for primitive type 'int': Integer.valueOf(1)
        list.add("1");
        list.add(new User());

        // PROBLEMS
        int number = (int) list.get(0); // explicit casting

        // risk of invalid casting -> java.lang.ClassCastException -> RUNTIME exception
        int number_ = (int) list.get(1);
    }
}
