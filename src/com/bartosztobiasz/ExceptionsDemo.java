package com.bartosztobiasz;

public class ExceptionsDemo {
    public static void show() {
        var account = new Account();
        account.deposit(-1);
    }
}
