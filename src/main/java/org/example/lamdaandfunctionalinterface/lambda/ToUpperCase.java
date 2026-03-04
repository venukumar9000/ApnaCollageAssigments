package org.example.lamdaandfunctionalinterface.lambda;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ToUpperCase {
    public static void main(String[] args) {
    String s="hello";
        System.out.println(toUpperCaseLambda(s));
    }
    static String toUppercase(String str){
       String st=null;
       for(int i=0;i<str.length();i++){
           char ch =str.charAt(i);
           if(ch>='a' && ch<='z'){
               ch= (char) (ch-32);
           }
             st = String.valueOf(ch);
       }
   return st;
    }
    static String toUpperCaseLambda(String s){
         String collect = IntStream.range(0, s.length())
                .mapToObj(i -> {
                    char ch = s.charAt(i);
                    if (ch >= 'a' && ch <= 'z') {
                        ch = (char) (ch - 32);
                    }
                    return String.valueOf(ch);
                }).collect(Collectors.joining());

         return collect;
    }

}

