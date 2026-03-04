package org.example.lamdaandfunctionalinterface.lambda;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseLambda(s));
        System.out.println(reverse(s));
    }
    public static String reverse(String s){
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1+=s.charAt(i);
        }
        return s1;
    }
    public static String reverseLambda(String str){
        final String collect = IntStream.range(0, str.length())
                .mapToObj(i -> str.charAt(str.length() - i - 1))
                .map(String::valueOf)
                .collect(Collectors.joining());
        return collect;

    }

}
