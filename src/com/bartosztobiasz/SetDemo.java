package com.bartosztobiasz;

import java.util.*;

public class SetDemo {
    public static void show() {
        Set<String> set = new HashSet<>();
        set.add("sky");
        set.add("is");
        set.add("blue");
        set.add("blue");
        System.out.println(set);

        // Remove duplicates from a `Collection`
        Collection<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "c");
        Set<String> set_ = new HashSet<>(list); // overloaded constructor
        System.out.println(set_);

        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));

        // Union operation -> combine two sets
        set1.addAll(set2);

        // Intersection (pol. skrzyżowanie, część wspólna) operation -> items common in both sets
//        set1.retainAll(set2);

        // Difference operation -> items from the first `Set` that are not present in the other `Set`
//        set1.removeAll(set2);

        System.out.println(set1);
    }
}
