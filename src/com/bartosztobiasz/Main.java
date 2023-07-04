package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        try {
            ExceptionsDemo.show();
        } catch (Throwable e) {
            // Throwable -> generic error message
            System.out.println("An unexpected error occurred.");
        }
    }
}
