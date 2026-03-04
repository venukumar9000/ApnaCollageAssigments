package org.example.javatechie.java8interview;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        String s="ilovoeindia";
        findDuplicates(s);
    }
    public static void findDuplicates(String str){
         List<Map.Entry<String, Long>> collect = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(i -> i.getValue() == 1)
                 .findFirst()
                         .stream().toList();
        System.out.println(collect);
    }
}
