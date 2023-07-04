package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        // instance of the User class or any of its derivatives (pol. pochodne)
        Utils.printUser(new User(10));
        Utils.printUser(new Instructor(10));
    }
}
