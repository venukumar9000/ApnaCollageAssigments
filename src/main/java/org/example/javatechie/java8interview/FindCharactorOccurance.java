package org.example.javatechie.java8interview;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindCharactorOccurance {
    public static void main(String[] args) {
        String str = "ilovejavatechie";
        findcharOccur(str);
    }
    public static void findcharOccur(String str){
        Map<String, Long>mp =Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(mp);

    }

}
