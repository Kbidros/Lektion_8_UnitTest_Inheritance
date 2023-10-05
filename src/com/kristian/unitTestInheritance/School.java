package com.kristian.unitTestInheritance;

public class School {

    String name;
    int rating;

    public School(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public void introduceStudent(Student student) {
        System.out.println("Hello there, my name is: " + student.name);



    }
}
