package com.bartosztobiasz;

public class Utils {
    // bounded wildcard (either an upper or a lower inheritance constraint)
    // class CAP#1 extends User {}
    public static void printUsers(GenericList<? extends User> users) {
        // cannot instantiate capture class nor its subtypes -> cannot add anything to the list -> read-only list
        // users.add(new CAP#1());

        for (int i = 0; i < 10; i++) {
            // either Object, User or Instructor object from `get()` method

//            Object object = users.get(i);

            User object = users.get(i);

            // We don't know whether object from `get()` will be a `User` object or `Instructor` object.
            // incompatible types compile time error for: Instructor object = users.get(i);

//            Instructor object = (Instructor) users.get(i);

            System.out.println(object);
        }
    }
}
