package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        var instructors = new GenericList<Instructor>();
        instructors.add(new Instructor(10));
        instructors.add(new Instructor(20));
        instructors.add(new Instructor(30));
        /*
         GenericList<Instructor> -> converting to bytecode -> GenericList<Object>
         GenericList<User> -> converting to bytecode -> GenericList<Object>
         GenericList<Object> is not a subtype of itself.
        */
        Utils.printUsers(instructors); // (GenericList<User>)
    }
}
