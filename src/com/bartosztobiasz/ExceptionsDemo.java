package com.bartosztobiasz;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsDemo {
    public static void show() {
        try {
            var reader = new FileReader("file.txt");

            /*
            Code after the offending line won't be executed.
            offending — pol. przeszkadzający, sprawiający kłopoty
             */
            System.out.println("File opened.");
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
