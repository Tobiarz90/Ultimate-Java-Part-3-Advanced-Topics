package com.bartosztobiasz;

public class Instructor extends User {
    private final String name;

    public Instructor(int points, String name) {
        super(points);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "name='" + name + "', " +
                super.toString() +
                '}';
    }
}
