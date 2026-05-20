package org.example.latest_interview_preparation.java8streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {
    //print list which starting with 1 { 21,13,1,4,223,44,12,4,55}  13,1,12

    public static List<Integer> startsWithOne(List<Integer> li){
        List<Integer> startWithOne=li.stream()
                .filter(i->String.valueOf(i).endsWith("1"))
                .toList();

        return startWithOne;


    }

    //print prime numbers between 1 to 10

    public static List<Integer> primeNumbers(List<Integer> list){
     return    list.stream()
                .filter(num->IntStream.range(2,num).noneMatch(i->num%i==0)).toList();
    }
    // count vowels in a sentence
    public static long  countVowels(String str){
         long count = str.chars()
                .mapToObj(ch -> (char) ch)
                .filter(ch -> "aeiouAEIOU".indexOf(ch) != -1)
                .count();
         return count;
    }
    // count k no of vowels in a string

    public static String kVowels(String str,int k){
       return Arrays.stream(str.split(" "))
                .filter(i->countVowels(i)==k)
                .collect(Collectors.joining(" "));

    }
    public static void isAnagram(String str1,String str2){

        if(str1.length() !=str2.length()){
            System.out.println("not anagram");
        }
         boolean equals = str1.chars()
                .sorted()
                .mapToObj(ch -> (char) ch).toList()
                .equals(str2.chars()
                        .sorted()
                        .mapToObj(ch -> (char) ch).toList());
        if(equals){
            System.out.println("anagrams");
        }else {
            System.out.println("not anagram");
        }


    }
    public static void countFerquecy(List<String >list){
         Map<Character, Long> collect = list.stream()
                .collect(Collectors.groupingBy(str -> str.charAt(0), Collectors.counting()));
        System.out.println(collect);
    }

    public static void endWith1(List<Integer>li){
         List<Integer> list = li.stream()
                .distinct()
                .filter(i -> String.valueOf(i).endsWith("1"))
                .sorted()
                .toList();
        System.out.println(list);
    }
    public static int sumOfDigits(int number){
       return String.valueOf(number)
                .chars()
                .map(Character::getNumericValue)
                .sum();
    }
    public static int mostRepeatedElement(List<Integer>list){
         Integer i = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse(0);

         return i;
    }
    public static Map<String ,Boolean> isPlaindrome(List<String > list){
         Map<String, Boolean> collect = list.stream()
                .collect(Collectors.toMap(
                        str -> str,
                        str -> str.equals(
                                new StringBuilder(str).reverse().toString()
                        )
                ));

        return collect;
    }

    public static Map<String,List<Integer>> groupRanges(List<Integer>li){
       return li.stream()
                .collect(Collectors.groupingBy(num->{
                    int start = ((num-1)/10)*10 +1;
                    int end = start+9;


                    return start +"-"+end;
                }));
    }
    public static char minFrequency(String str){
       String s= str.replaceAll(" ","");

        final Character c1 = s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .min(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse('\0');

    return c1;
    }
    public static List<Integer> distictNumberEndWith1(List<Integer>li){
        return li.stream()
                .distinct()
                .filter(i->String.valueOf(i).endsWith("1"))
                .toList();
    }
    public static List<Integer> fibonaci(){

       return Stream.iterate(new int[]{0,1},
                num->new int[]{num[1],num[0]+num[1]})
                .limit(10)
                .map(num->num[0])
                .collect(Collectors.toList());
    }

    public static int neartestELe(List<Integer>li ,int target){
       return li.stream()
                .min(Comparator.comparing(
                        i->Math.abs(target-i)
                )).orElse(0);
    }

    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(21,1,12,13,14,22,3,4,17,3,11,13,12,15);
        System.out.println(startsWithOne(list));

        System.out.println(primeNumbers(list));

        String str ="i have an orange in my house";
        System.out.println(countVowels(str));
        int k=3;
        System.out.println(kVowels(str,k));
        String s="abc";
        String s1="abcd";
        isAnagram(s,s1);

        List<String> li = Arrays.asList("apple","apricot","blueberry","banana","car");
        countFerquecy(li);
        List<Integer> lis= Arrays.asList(22,12,21,33,11,3,1,41,51);
        endWith1(lis);

        int n=12345;

        System.out.println(sumOfDigits(n));

        List<Integer> list1=Arrays.asList(1,2,3,4,5,5,5,5,5,6,6,6,6,6,4,55,6,66,6,7);

        System.out.println(mostRepeatedElement(list1));

        List<String> list2= Arrays.asList("level","madam","apple","venu");

        System.out.println(isPlaindrome(list2));

        System.out.println(groupRanges(list));

        String str1=" banana appllee";
        System.out.println(minFrequency(str1));

        System.out.println(distictNumberEndWith1(lis));

        System.out.println(fibonaci());

        List<Integer> list3=Arrays.asList(1,2,3,5,6,10,11);
        System.out.println(neartestELe(list3,7));

        List<Integer> ll=list3.stream()
                .sorted(Comparator.reverseOrder())
                .limit(4)
                .toList();

        System.out.println(ll);


        String word = "java is good programming";

         String collect = Arrays.stream(word.split(" "))
                .map(i -> new StringBuilder(i).reverse().toString())
                .collect(Collectors.joining(" "));


        System.out.println(collect);


    }
}

