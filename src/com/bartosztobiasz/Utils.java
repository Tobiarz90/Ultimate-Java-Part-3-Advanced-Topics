package com.bartosztobiasz;

public class Utils {
    public static void printUsers(GenericList<User> users) {
        for (int i = 0; i < 10; i++) {
            Instructor user = (Instructor) users.get(i);
            System.out.println(user);
        }
    }
}
