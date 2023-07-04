package com.bartosztobiasz;

public class User implements Comparable<User> {
    private final int points;

    public User(int points) {
        this.points = points;
    }

    @Override
    public int compareTo(User other) {
        // 10 - 2 = 8
        // 10 - 10 = 0
        // 2 - 10 = -8
        return points - other.points;
    }

    @Override
    public String toString() {
        return "User{" +
                "points=" + points +
                '}';
    }
}
