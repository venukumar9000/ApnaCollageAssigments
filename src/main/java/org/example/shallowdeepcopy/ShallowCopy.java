package org.example.shallowdeepcopy;

public class ShallowCopy {
    public static void main(String[] args) {
      Student s = new Student();

      s.setAge(25);

      s.name="venu";
        System.out.println(s.age+" age");
       System.out.println(s.name+ " name");
    }

}
class Student  {
    int age;
    String name;

    Student(){
        System.out.println(" default constructor");
    }
    Student(int age ){
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName(){
        return name;
    }
//    Student(String nmaes ){
//        name =nmaes;
//    }


}
