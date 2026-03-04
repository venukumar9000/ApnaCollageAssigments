package org.example.streamapi;

import java.util.*;

public class SortMapUsingStreams {
    public static void main(String[] args) {
        Map<String ,Integer> hm = new HashMap<>();
        hm.put("cat",2);
        hm.put("apple",7);
        hm.put("egg",1);
        hm.put("bat",3);
        hm.put("banana",4);

        List<Map.Entry<String,Integer>> entries = new ArrayList<>(hm.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });
        for(Map.Entry<String ,Integer> entry:entries){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        System.out.println("using lambda-------");
        Collections.sort(entries,((o1, o2) -> o2.getKey().compareTo(o1.getKey())));

        for(Map.Entry<String,Integer> entry:entries){
            System.out.println(entry.getKey()+" ="+entry.getValue());
        }
        //by using stream api
        System.out.println(" sort based on key");
        hm.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("sort by value");
        hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        //if map contains employee object

//        Map<Employee,Integer> emp= new TreeMap<>(new Comparator<Employee>() {
//
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return (int)(o2.getSalary()-o1.getSalary());
//            }
//        });
        //it is a functional interface we can use lambda
        Map<Employee,Integer> emp= new TreeMap<>(((o1, o2) ->(int) (o1.getSalary()-o2.getSalary())));



        emp.put(new Employee(10,"phani","angular",1000000.00),100);
        emp.put(new Employee(20,"bunny","java",2000000.00),10);
        emp.put(new Employee(30,"sunny","c",1300000.00),90);
        emp.put(new Employee(40,"mummy","c++",200000.00),40);
        emp.put(new Employee(50,"daddy","kotlin",300000.00),76);

        System.out.println(emp+" old approach");


        //using stream
        System.out.println("using streams");
        emp.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName))).forEach(System.out::println);


    }
}
