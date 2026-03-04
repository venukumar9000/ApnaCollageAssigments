package org.example.lamdaandfunctionalinterface.lambda;

import java.util.*;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PredicateAndFiltering {
    public static void main(String[] args) {
     Predicate<Integer>integerPredicate= getPositiveInteger();
        System.out.println(integerPredicate.test(10));
        System.out.println(integerPredicate.test(-10));
       Predicate<String>s=isEmptyString();
        System.out.println(s.test(""));
        int [] a={2,3,4,5,6,7,7,8};
        System.out.println(evenNum(a));
         Predicate<String> hasJava = stringContainsSubString("Java");
         String text1="Java is program";
         String text2="Python is program";
         String lower="apple";
          String digit="12345a";
          int k =17;

         boolean res = hasJava.test(text1);
        System.out.println("Does "+text1 +"Contains java "+res);
        boolean res1 = hasJava.test(text2);
        System.out.println("Does "+text2 +"Contains java "+res1);

        boolean checkLength =hasJava.test(text1);
        System.out.println("Check length :"+checkLength);


        System.out.println("IsLowercase : "+isLowerCaseStr().test(lower));
        System.out.println("dupliucates :"+duplicatePresentOrNot(lower));
        System.out.println("contains only digit :"+containsDigits().test(digit));
        System.out.println("Perfect sqrt :"+perfectSqrt().test(k));

    }

    public static Predicate<Integer> getPositiveInteger() {
        return n -> n > 0;
    }
    public static Predicate<String> isEmptyString(){
        return String::isEmpty;
    }
    public static List<Integer> evenNum(int[]arr){
        Predicate<Integer> evn = n-> n%2==0 ;
        List<Integer> evens=Arrays.stream(arr)
                .boxed()
                .filter(evn)
                .toList();

 return evens;

    }
    public static Predicate<String> stringContainsSubString(String subStr){
        return str->str.contains(subStr);
    }
    public static Predicate<String> checkLength(String str){
        return s -> str.length() > 5;
    }

    public static Predicate<String >isLowerCaseStr(){
        return s->s.chars()
                .allMatch(Character::isLowerCase);
    }
    public static boolean duplicatePresentOrNot(String str){
        Set<Character> uniqueChar=new HashSet<>();
        for(char c:str.toCharArray()){
            if(!uniqueChar.add(c)){
                return true;
        }
    }
        return false;
    }
    public static Predicate<String > containsDigits(){
        return s->s.chars()
                .allMatch(Character::isDigit);
    }
    public static Predicate<Integer> perfectSqrt(){
        Predicate<Integer> sqrty =i->{
            if(i<0){
                return false;
            }
            double sqrt= Math.sqrt(i);
            return sqrt==Math.floor(sqrt);
        };
     return sqrty;
    }


}

