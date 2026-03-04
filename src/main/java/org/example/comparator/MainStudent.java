package org.example.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainStudent {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.addAll(Arrays.asList(new Student(20,"venu","java",50),
                new Student(10,"john","java",75),
                new Student(12,"mani","java",30),
                new Student(2,"bunny","java",100),
                new Student(1,"tony ","java",60),
                new Student(11,"venu","java",35)));

//        System.out.println(s);

        final List<Student> studentList = sortByNameAndRollNo(s);
        studentList.stream().forEach(System.out::println);

        System.out.println("Sort By Marks desc");
        List<Student> sortByMarksDec=sortByMarksDec(s);
        sortByMarksDec.forEach(System.out::println);

        System.out.println("sort by length");
         List<Student> studentList1 = sortByLength(s);
         studentList1.forEach(System.out::println);


    }
    //2 names are equal and compare them and sort by rollno
    public static List<Student> sortByNameAndRollNo(ArrayList<Student> ss){

        final List<Student> studentList = ss.stream().sorted(Comparator.comparing(Student::getName).thenComparingDouble(Student::getRollNo)).collect(Collectors.toList());
        return studentList;

    }
    // sort by marks in decending order
    public static List<Student> sortByMarksDec(ArrayList<Student> marks){
        List<Student> studentmark=marks.stream().sorted(Comparator.comparingInt(Student::getMarks).reversed()).collect(Collectors.toList());

        return studentmark;
    }
    //sort student by name(based on length(desc) not alphabatically)

    public static List<Student> sortByLength(ArrayList<Student> length){
         List<Student> sortedByLength = length.stream().sorted(Comparator.comparingInt((Student s)->s.getName().length()).reversed()).collect(Collectors.toList());
         return sortedByLength;

    }

}
