package com.bartosztobiasz;

public class Main {
    public static void main(String[] args) {
        var instructors = new GenericList<Instructor>();
        instructors.add(new Instructor(10, "name1"));
        instructors.add(new Instructor(20, "name2"));
        instructors.add(new Instructor(30, "name3"));
        /*
        (GenericList<? extends User>):
            (GenericList<User>)
            or
            (GenericList<derivative of User>):
                (GenericList<Instructor>)
         */
        Utils.printUsers(instructors);
    }
}
