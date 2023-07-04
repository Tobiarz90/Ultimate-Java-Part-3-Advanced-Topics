package com.bartosztobiasz;

import java.io.IOException;

public class Account {
    private float balance;

    public void deposit(float value) throws IOException {
        if (value <= 0) {
            throw new IOException(); // checked exception
        }
    }

    public void withdraw(float value) throws AccountException {
        if (value > balance) {
            var fundsException = new InsufficientFundsException(); // przyczyna
            var accountException = new AccountException(); // wyjątek ogólny

            // inicjalizacja przyczyny wystąpienia wyjątku ogólnego
            accountException.initCause(fundsException);
            throw accountException;
        }
    }
}
