package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        KeyValuePair<Integer, User> pair = new KeyValuePair<>(1, new User(10));
        Utils.print("Ranking", pair);
    }
}
