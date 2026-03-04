package org.example.lamdaandfunctionalinterface.lambda;

import java.util.List;

public class LetterStartWithAInList {
    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Banana", "Avocado", "Mango", "Apricot");
        System.out.println(countStartWithA(words));
    }
    public static long countStartWithA(List<String>words){
         return words.stream()
                .filter(i -> i.startsWith("A"))
                .count();
    }
}
