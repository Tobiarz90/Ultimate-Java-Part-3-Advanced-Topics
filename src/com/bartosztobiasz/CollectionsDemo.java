package com.bartosztobiasz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();

        Collections.addAll(collection, "a", "b", "c");
        collection.add("d");

        System.out.println(collection.size());

        Object[] objectArray = collection.toArray();

        // `String[0]` provides enough capacity for a collection of any size.
        String[] stringArray = collection.toArray(new String[0]);

        // interface Collection<E> extends Iterable<E>
        for (var item : collection) {
            System.out.println(item);
        }

        // programing against interfaces -> use `Collection<String>` instead of `var`
        Collection<String> other = new ArrayList<>();
        // addAll(Collection<String> or any type that extends Collection<String>)
        other.addAll(collection); // (wildcard)

        // comparing collections based on their content
        System.out.println(collection.equals(other));

        collection.remove("a");
        System.out.println(collection.contains("a"));

        System.out.println(collection);

        collection.clear();
        System.out.println(collection.isEmpty());
    }
}
