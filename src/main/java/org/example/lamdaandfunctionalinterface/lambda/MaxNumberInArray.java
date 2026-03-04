package org.example.lamdaandfunctionalinterface.lambda;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MaxNumberInArray {
    public static void main(String[] args) {
        int [] a={1,2,3,4,10};
        System.out.println(max(a));
        String s ="Apple";
        System.out.println(startwith(s));
    }
    public static OptionalInt max(int [] arr){
       return Arrays.stream(arr)
                .max();
    }
    public static boolean startwith(String s){
       return IntStream.range(0,s.length())
                .filter(i->s.startsWith("A")).isParallel();

    }
}
