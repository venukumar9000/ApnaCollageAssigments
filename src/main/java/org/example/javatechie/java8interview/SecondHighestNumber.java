package org.example.javatechie.java8interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int[] a={2,4,9,3,6,8};
        System.out.println(secHigestnum(a));
    }
    public static Integer secHigestnum(int [] num){
         Integer collect = Arrays.stream(num).boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                 .get();

         return collect;
    }
}
