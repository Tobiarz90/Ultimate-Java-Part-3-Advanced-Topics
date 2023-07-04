package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        var list = new GenericList<Integer>();
        list.add(1);
        int number = list.get(0);

        var userList = new GenericList<User>();
        userList.add(new User());
        User user = userList.get(0); // no explicit casting -> benefit of generics
    }
}
