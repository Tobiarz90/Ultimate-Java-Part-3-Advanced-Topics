package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        var list = new List();
        list.add(1);
        System.out.println(list.get(0));

        var userList = new UserList();
        userList.add(new User());
        System.out.println(userList.get(0));
    }
}
