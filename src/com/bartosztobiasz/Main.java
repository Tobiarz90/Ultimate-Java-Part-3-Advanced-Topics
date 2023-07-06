package com.bartosztobiasz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("b", "e3"));
        customers.add(new Customer("a", "e2"));
        customers.add(new Customer("c", "e1"));

        Collections.sort(customers); // (`Collection` implementing `Comparable` interface)
        System.out.println(customers); // sorted collection
    }
}
