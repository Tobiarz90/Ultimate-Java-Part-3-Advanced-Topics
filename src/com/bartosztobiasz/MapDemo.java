package com.bartosztobiasz;

import java.util.ArrayList;
import java.util.List;

public class MapDemo {
    public static void show() {
        List<Customer> customers = new ArrayList<>();

        // Algorithm for finding a `Customer` with a particular email
        for (Customer customer : customers) {
            if (customer.getEmail().equals("e1")) {
                System.out.println("Found!");
            }
        }

        /*
        When calculating the cost of an algorithm, use The Big O notation - `O(n)`.
        `n` -> the number of customers in the list.
         */
    }
}
