package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        var users = new GenericList<User>();
        users.add(new User(10));
        users.add(new User(20));
        users.add(new User(30));
        Utils.printUsers(users);
    }
}
