package com.bartosztobiasz;

import java.io.IOException;

public class Account {
    private float balance;

    public void deposit(float value) throws IOException {
        if (value <= 0) {
            throw new IOException(); // checked exception
        }
    }

    public void withdraw(float value) throws InsufficientFundsException {
        if (value > balance) {
            throw new InsufficientFundsException();
        }
    }
}
