package com.bartosztobiasz;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        var list = new GenericList<String>();
        list.add("a");
        list.add("b");
        list.add("c");

        Iterator<String> iterator = list.iterator();
        // `Iterable` object: [a, b, c]
        //                     ^ (pointer)
        // `Iterator` is like a pointer.

        while (iterator.hasNext()) { // Do you have more items?
            // Yes, I do.

            /*
            `next()` method returns the element to which it points
            and moves the pointer to the next item.
             */
            var current = iterator.next();
            System.out.println(current);
        }
        // No, I don't.

        // for each loop is a syntactical sugar over the `Iterator` object.
        for (String item : list) {
            System.out.println(item);
        }
    }
}
