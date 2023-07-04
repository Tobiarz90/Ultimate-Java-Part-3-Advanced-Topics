package com.bartosztobiasz;

public class GenericList<T extends Number> {

    /*
    'T' zostanie przekonwertowane przez kompilator Javy do klasy 'Object'
    lub innej klasy wskazanej po słowie kluczowym 'extends' (np. 'Number').
     */
    private final T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }
}
