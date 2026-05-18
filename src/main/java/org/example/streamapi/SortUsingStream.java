package org.example.streamapi;

import java.sql.ClientInfoStatus;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        final Map<String, Employee> collect = emp.stream().collect(Collectors.groupingBy(Employee::getDept,
                Collectors.collectingAndThen(
                        Collectors.toList(),
                        list->{
                            List<Double> salaries=list.
                                    stream()
                                    .map(Employee::getSalary)
                                    .distinct()
                                    .sorted(Comparator.reverseOrder())
                                    .toList();

                             Double targetSal = salaries.size() > 1 ? salaries.get(1) : salaries.get(0);

                             return list.stream()
                                     .filter(i->i.getSalary()==targetSal)
                                     .findFirst()
                                     .orElse(null);
                        }



                )));
        System.out.println(collect);
        Map<String, List<Employee>> result =
                emp.stream().collect(Collectors.groupingBy(
                        Employee::getDept,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> {
                                    double max = list.stream()
                                            .mapToDouble(Employee::getSalary)
                                            .max()
                                            .orElse(Double.MIN_VALUE);

                                    return list.stream()
                                            .filter(e ->e.getSalary()==max)
                                            .collect(Collectors.toList());
                                }
                        )
                ));
        System.out.println(result);
         Map<String, List<Double>> collect1 = emp.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.collectingAndThen(Collectors.toList(),
                list ->
                    list.stream()
                            .map(Employee::getSalary)
                            .sorted(Comparator.reverseOrder())
                            .limit(3)
                            .collect(Collectors.toList())

        )));
        System.out.println(collect1);

        //Find department with highest average salary
        final Map<String, Double> collect2 = emp.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.collectingAndThen(
                Collectors.toList(),
                list -> {
                     double sum = list.stream()
                            .mapToDouble(Employee::getSalary)
                            .sum();
                    return sum/list.size();
                }


        )));
        System.out.println(collect2);


    }

}
//class MyComparator implements Comparator<Employee>{
//
//    @Override
//    public int compare(Employee o1, Employee o2) {
//        return (int) (o2.getSalary()-o1.getSalary());//decending order
//    }
//}
