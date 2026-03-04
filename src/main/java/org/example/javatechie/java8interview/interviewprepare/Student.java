package org.example.javatechie.java8interview.interviewprepare;


public class Student {

    private int age;
   private int marks;

   private String name;

   private String course;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Student(int age, int marks, String name, String course) {
        this.age = age;
        this.marks = marks;
        this.name = name;
        this.course = course;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
