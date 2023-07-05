package com.bartosztobiasz;

public class Utils {
    // class CAP#1 {}
    public static void printUsers(GenericList<?> users) {
        // cannot instantiate capture class -> cannot add anything to the list -> read-only list
        // users.add(new CAP#1());

        for (int i = 0; i < 10; i++) {
            // unknown object from `get()` method -> assign it to `Object` type variable
            Object object = users.get(i);
            System.out.println(object);
        }
    }
}
