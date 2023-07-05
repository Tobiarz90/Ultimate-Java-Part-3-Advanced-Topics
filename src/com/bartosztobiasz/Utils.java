package com.bartosztobiasz;

public class Utils {
    // bounded wildcard (either an upper or a lower inheritance constraint)
    public static void printUsers(GenericList<? super User> users) {
        // add-only list // ???

        // users.add(new Object()); // ???
        users.add(new User(10));
        users.add(new Instructor(10, "name1")); // ???
    }
}
