package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        var max = Utils.max(
                new User(10),
                new User(3)
        );
        System.out.println(max);
    }
}
