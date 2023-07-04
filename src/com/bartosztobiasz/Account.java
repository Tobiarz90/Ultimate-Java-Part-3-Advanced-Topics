package com.bartosztobiasz;

public class Account {
    public void deposit(float value) {
        // defensive programming -> coding in a defensive manner
        if (value <= 0) {
            throw new IllegalArgumentException(); // unchecked exception
        }
    }
}
