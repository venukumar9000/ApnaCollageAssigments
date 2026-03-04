package org.example.javatechie.java8interview;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindLongestString {
    public static void main(String[] args) {
     String[] s = {"hello","java","python","ruby"};
       longestSTring(s);
    }
    public static void longestSTring(String[] str){
         Optional<String> first = Arrays.stream(str)
                .sorted((i1, i2) -> Math.max(i1.length(), i2.length()))
                .findFirst();
        System.out.println(first);

    }
}
