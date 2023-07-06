package com.bartosztobiasz;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show() {
        Queue<String> queue = new ArrayDeque<>();

        /*
        `add()` and `offer()` differ from each other in different implementations of a `Queue` interface
        `ArrayDeque<>()` -> no differance
         */
        queue.add("c");
        queue.add("a");
        queue.add("b");
        queue.offer("d");
        System.out.println(queue); // d -> b -> a -> c

        /*
        If the queue isn't empty, returns an item at the front of the queue,
        otherwise returns `null`.
         */
//        var front = queue.peek();

        /*
        If the queue isn't empty, returns an item at the front of the queue,
        otherwise throws a `java.util.NoSuchElementException`.
         */
        var front = queue.element();

        System.out.println(front);

        /*
        If the queue isn't empty, removes an item at the front of the queue,
        otherwise returns `null`.
         */
//        var head = queue.poll();

        /*
        If the queue isn't empty, removes an item at the front of the queue,
        otherwise throws a `java.util.NoSuchElementException`.
         */
        var head = queue.remove();

        System.out.println(head);
        System.out.println(queue);
    }
}
