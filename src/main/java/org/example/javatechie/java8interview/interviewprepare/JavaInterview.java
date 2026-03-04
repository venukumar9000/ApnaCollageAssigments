package org.example.javatechie.java8interview.interviewprepare;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaInterview {
    public static void main(String[] args) {
        List<Integer> in = Arrays.asList(1,2,3,4,5,7,7,5);

        final List<Integer> collect = in.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(i -> i.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(collect);

        List<String> li = Arrays.asList("mani","bunnysss","chantis");
         List<String> collect1 = li.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .limit(1).toList();
        System.out.println(collect1);

        List<Integer> l = Arrays.asList(1,2,3,4,5,6);
         Map<Boolean,List<Integer>> mp=l.stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0));

        System.out.println("even :"+mp.get(true));
        System.out.println("odd :"+mp.get(false));

        Map<String, List<Integer>> map =
                l.stream().collect(Collectors.groupingBy(
                        i -> i % 2 == 0 ? "Even" : "Odd"
                ));
        System.out.println(map);

        List<Student> s = List.of(
                new Student(13, 45, "john", "java"),
                new Student(23, 100, "bunty", "dsa"),
                new Student(24, 95, "chnati", "python"),
                new Student(25, 56, "sunny", "c"),
                new Student(27, 76, "mani", "sharp"),
                new Student(29, 87, "gopi", "maps")
        );

    }
}
