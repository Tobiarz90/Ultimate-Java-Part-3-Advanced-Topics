package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        var instructors = new GenericList<Instructor>();
        instructors.add(new Instructor(10, "name1"));
        instructors.add(new Instructor(20, "name2"));
        instructors.add(new Instructor(30, "name3"));

        GenericList<User> users = new GenericList<>();
        /*
        Poor solution:
        iterate over instructors list and add them to users list
         */
        for (int i = 0; i < 10; i++) {
            Instructor instructor = instructors.get(i);
            users.add(instructor);
        }

        Utils.printUsers(users); // (GenericList<User>)
    }
}
