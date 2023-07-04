package com.bartosztobiasz;

// non-generic class
public class Utils {
    // generic method with multiple type parameters
    // naming convention: two type parameters -> K (Key), V (Value)
    public static <K, V> void print(K key, V value) {
        System.out.println(key + "=" + value);
    }
}
