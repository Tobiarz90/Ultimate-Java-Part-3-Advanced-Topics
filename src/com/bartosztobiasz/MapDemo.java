package com.bartosztobiasz;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void show() {
        Customer customer1 = new Customer("a", "e1");
        Customer customer2 = new Customer("b", "e2");

        HashMap<String, Customer> map = new HashMap<>(); // maps a key to a value

        map.put(customer1.getEmail(), customer1);
        map.put(customer2.getEmail(), customer2);
        System.out.println(map);

        Customer customer = map.get("e1"); // the cost of finding the Object in a HashMap is very small, and it's constant
        System.out.println(customer);

        Customer unknown = new Customer("Unknown", "");
        Customer customer_ = map.getOrDefault("e10", unknown);
        System.out.println(customer_);

        boolean exists = map.containsKey("e10");
        System.out.println(exists);

        map.replace("e1", new Customer("a++", "e1"));
        System.out.println(map);

        for (String key : map.keySet()) {
            System.out.println(key);
        }

        for (Customer value : map.values()) {
            System.out.println(value);
        }

        for (Map.Entry<String, Customer> entry : map.entrySet()) {
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
