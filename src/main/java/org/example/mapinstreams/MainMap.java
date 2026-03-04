package org.example.mapinstreams;

import java.util.*;
import java.util.stream.Collectors;

public class MainMap {
    public static void main(String[] args) {
        List<Character> li = Arrays.asList('a','a','b','b','c');
         Map<Character, Long> collect = li.stream().collect(Collectors.groupingBy(i -> i, Collectors.counting()));

         collect.entrySet().stream().forEach(System.out::println);

        Map<String,Integer>map= new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);

        List<Map.Entry<String,Integer>> entries= new ArrayList<>(map.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        for(Map.Entry<String,Integer> entry:entries){
            System.out.println(entry);
        }

        map.entrySet().stream().sorted((i1,i2)->i1.getKey().compareTo(i1.getKey())).forEach(System.out::println);
        System.out.println("++++++");
        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).forEach(System.out::println);
        System.out.println("----------");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }

}
