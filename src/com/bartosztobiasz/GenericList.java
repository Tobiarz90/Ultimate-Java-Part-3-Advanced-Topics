package com.bartosztobiasz;

/*
Applying constrains/restrictions to generic class:
<T extends Class/Interface & Class/Interface & ...>
 */
public class GenericList<T extends Comparable> {
    private final T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}
