package org.example.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StudentMain  {
    public static void main(String[] args) {

        ArrayList<Student> al = new ArrayList<>();
        Student s1 = new Student(10,"john","java");
        Student s2 = new Student(2,"cena","py");
        Student s3 = new Student(13,"roy","django");
        Student s4 = new Student(6,"mani","react");
        Student s5 = new Student(22,"sunny","javascript");


        al.addAll(Arrays.asList(s1, s2, s3, s4, s5));

        Collections.sort(al);

        System.out.println(al);


    }

}
