package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        var instructors = new GenericList<Instructor>();
        instructors.add(new Instructor(10, "name1"));
        instructors.add(new Instructor(20, "name2"));
        instructors.add(new Instructor(30, "name3"));
        Utils.printUsers(instructors); // (GenericList<?>)

        GenericList<Integer> integers = new GenericList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        Utils.printUsers(integers); // It doesn't make sense to pass anything here.
    }
}
