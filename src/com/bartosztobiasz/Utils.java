package com.bartosztobiasz;

// non-generic class
public class Utils {
    // generic method
    public static <T extends Comparable<T>> T max(T first, T second) {
        return first.compareTo(second) > 0 ? first : second;
    }
}
