package com.bartosztobiasz;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionsDemo {
    public static void show() {
        try {
            var reader = new FileReader("file.txt");
            var value = reader.read();
        } catch (FileNotFoundException e) { // child
            // FileNotFoundException extends java.io.IOException
            e.printStackTrace();
        } catch (IOException e) { // parent
            System.out.println("Could not read data.");
        }
    }
}
