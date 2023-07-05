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
        /*
        How to forbid passing any GenericList's type?
        bounded wildcard (either an upper or a lower inheritance constraint)
         */
        Utils.printUsers(integers);
    }
}
