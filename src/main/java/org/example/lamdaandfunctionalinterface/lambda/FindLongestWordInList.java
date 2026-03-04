package org.example.lamdaandfunctionalinterface.lambda;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindLongestWordInList {
    public static void main(String[] args) {
        List<String> words = List.of("java", "javascript", "python", "go");
        System.out.println(longestWord(words));

    }
    public static Optional<String> longestWord(List<String>li){
         return li.stream()
                .max(Comparator.comparing(String::length));


    }
}
