package org.example.streamapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortUsingStream {

    public static void main(String[] args) {
        List<Integer> lin = Arrays.asList(8,5,2,6,3,1,6);

        System.out.println(lin);

        Collections.sort(lin);
        System.out.println(lin +"after sorting");

        List<Employee> emp =Database.getList();
//        Collections.sort(emp, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return (int)(o1.getSalary()-o2.getSalary());
//            }
//        });

        //as it is functional interface we can use lambda
        Collections.sort(emp,(o1,o2)->(int)(o1.getSalary()- o2.getSalary()));
        System.out.println(emp);
        System.out.println("++++++++++++++++++++++++++++++++");
        //using only stream
        emp.stream().sorted((o1, o2) -> (int)(o2.getSalary()-o1.getSalary())).forEach(System.out::println);
        //using streams
        System.out.println("based on name");
        emp.stream().sorted(Comparator.comparing(e->e.getName())).forEach(System.out::println);
        emp.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).forEach(System.out::println);
    }

}
//class MyComparator implements Comparator<Employee>{
//
//    @Override
//    public int compare(Employee o1, Employee o2) {
//        return (int) (o2.getSalary()-o1.getSalary());//decending order
//    }
//}
