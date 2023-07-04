package com.bartosztobiasz;

public class ExceptionsDemo {
    public static void show() {
        var account = new Account();
        try {
            account.withdraw(10);
        } catch (AccountException e) {
            Throwable cause = e.getCause();
            System.out.println(cause.getMessage());
        }
    }
}
