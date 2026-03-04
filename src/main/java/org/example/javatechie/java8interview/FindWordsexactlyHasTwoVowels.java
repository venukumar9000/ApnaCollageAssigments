package org.example.javatechie.java8interview;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.regex.Pattern.matches;

public class FindWordsexactlyHasTwoVowels {
    public static void main(String[] args) {

        String str ="I am learning stream API in java";
        findVowels(str);
         List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        divideListEvenAndOdd(list);
        String s="k ssismsipi";
        charOccur(s);
        int [] aa={1,6,7,7,8,8,1};
        System.out.println(findsumOfUniqueEle(aa));
        findNonrepeateChar(s);
        findRepeatedChat(s);

        String [] strs={"123","abc","cdf","456"};
        removeStringCollectIntegers(strs);
        int [] aaa={12,6,7,6,7};
        findproductofFirsttwoElemts(aaa);
        String[] str1 = {"pan", "nap", "bat", "tab", "cat"};

        groupAnagrams(str1);
        int []k ={1,2,3,4,5,5};
        System.out.println(k.length+" djk");
        multiplyAlternateNumsInArray(k);

        int [] z={3,5,6,0,7,0};
        bringZeroToStart(z);
        isDistinctIntegers(z);

        List<String> li=Arrays.asList("a1c34","x3b5","s4f6t7");
        printOnlynums(li);
        List<String>ll = Arrays.asList("apple","banana","airplane","bat","cat");
        listStringGroupThemByfirstChar(ll);

        String j ="javadeveloper";
        frequencyCountMaxOccur(j);

        List<String> kl =Arrays.asList("apple","banana","cat");
        convertListOfStringTomapbasedoncount(kl);
        converEachCharAsKeyValuePairs(kl);

        int [] zx= {1,2,3,4,5,6,7,10};
        int target =7;
        System.out.println(binarySearch(zx,target));
        System.out.println(spanOfArray(zx));


    }
    public static void findVowels(String str){
        Arrays.stream(str.split(" "))
                .filter(i->i.replaceAll("[^aeiouAEIOU]","").length()==2)
                .forEach(System.out::println);

    }
    public static void  divideListEvenAndOdd(List<Integer>li){
         List<List<Integer>> collect = li.stream()
                .collect(Collectors.groupingBy(i -> i % 2 == 0)).entrySet().stream().map(i -> i.getValue()).collect(Collectors.toList());
        System.out.println(collect);
    }
    public static void  charOccur(String str){
        Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(i->i,Collectors.counting()))
                .entrySet().stream().forEach(System.out::println);
    }
    public static int findsumOfUniqueEle(int [] ar){
         int reduce = Arrays.stream(ar)
                .distinct()
                .reduce(0, (a, b) -> a + b);

         return reduce;

    }
    public static void findNonrepeateChar(String str){
        final String s = Arrays.stream(str.split(""))
                .filter(i->!i.equals(" "))
                .collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(i -> i.getValue() == 1).map(Map.Entry::getKey).findFirst().get();
        System.out.println(s+" :is the char");
    }
    public static void findRepeatedChat(String str){

         String s = Arrays.stream(str.split(""))
                .filter(i -> !i.equals(" "))
                .collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(i -> i.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .get();
        System.out.println(s);
    }
    public static void removeStringCollectIntegers(String []str){
         List<Integer> collect = Arrays.stream(str)
                .filter(i -> i.matches("[0-9]+")).map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
    public static void findproductofFirsttwoElemts(int [] arr){
         Integer reduce = Arrays.stream(arr)
                .boxed()
                .limit(2)
                .reduce(1, (k, i) -> k * i);
        System.out.println(reduce);
    }
    public static void groupAnagrams(String [] arr){
         Collection<List<String>> values = Arrays.stream(arr)
                .collect(Collectors.
                        groupingBy(i -> Arrays.stream(i.toLowerCase().split(""))
                                .sorted().collect(Collectors.toList()))).values();

        System.out.println(values);

         Collection<List<String>> values1 = Arrays.stream(arr)
                .collect(Collectors.groupingBy(
                        i -> {
                            char[] chars = i.toCharArray();
                            Arrays.sort(chars);
                            return new String(chars);
                        },LinkedHashMap::new,Collectors.toList()
                )).values();
        System.out.println(values1);

    }
    public static void multiplyAlternateNumsInArray(int[]aa){

         Integer reduce = IntStream.range(0, aa.length-1).filter(i -> i % 2 == 0)
                .map(i->aa[i])
                .reduce(1, (a, b) -> a * b);
        System.out.println(reduce);

        //first and last multiply

          IntStream.range(0, aa.length / 2)
                .map(i -> aa[i] * aa[aa.length - i - 1]).forEach(System.out::println);

    }
    public static void bringZeroToStart(int [] arr){
         List<Integer> collect = Arrays.stream(arr)
                .filter(i -> i == 0)
                .boxed()
                .collect(Collectors.toList());
         List<Integer> collect1 = Arrays.stream(arr).filter(i -> i != 0)
                .boxed().collect(Collectors.toList());
         List<Integer> integers = new ArrayList<>();
         integers.addAll(collect1);
         integers.addAll(collect);
        System.out.println(integers);

        //2nd approach

         List<Integer> collect2 = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.partitioningBy(x -> x != 0))
                .values().stream().flatMap(i -> i.stream())
                .collect(Collectors.toList());

        System.out.println(collect2);


    }
    public static void  isDistinctIntegers(int[]arr){
        final boolean b = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                        .values().stream().noneMatch(i->i>1);
        System.out.println(b);

         double v = Arrays.stream(arr)
                .boxed()
                .reduce(0, Integer::sum) / (double) arr.length;

        System.out.println("AVG : "+v);
    }
    public static void printOnlynums(List<String> str){
         List<String> collect = str.stream()
                .map(i -> i.replaceAll("\\D+", ""))
                .collect(Collectors.toList());

        System.out.println(collect);
    }
    public static void listStringGroupThemByfirstChar(List<String >str){
         List<Map.Entry<Character, Long>> collect = str.stream()
                .collect(Collectors.groupingBy(i -> i.charAt(0), Collectors.counting()))
                .entrySet().stream().collect(Collectors.toList());
        System.out.println(collect);
    }
    public static void frequencyCountMaxOccur(String str){
        final Map.Entry<String, Long> stringLongEntry = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get();

        System.out.println(stringLongEntry.getKey());
    }
    public static void  convertListOfStringTomapbasedoncount(List<String>str){
         Map<String, Long> collect = str.stream().collect(Collectors.groupingBy(
                 i -> i,
                 Collectors.summingLong(String::length)));
        System.out.println(collect);
    }
    //o/p {apple={a=1, p=2, l=1, e=1}, mango={m=1, a=1, n=1, g=1, o=1}, kiwi={k=1, i=2, w=1}}
    public static void converEachCharAsKeyValuePairs(List<String >str){
         Map<String, Map<Character, Long>> collect = str.stream()
                .collect(Collectors.toMap(
                        word -> word,
                        word -> word.chars()
                                .mapToObj(i -> (char) i)
                                .collect(Collectors
                                        .groupingBy(c -> c,
                                                Collectors.counting()))
                ));

        System.out.println(collect);
    }
    public static int binarySearch(int [] arr,int target){
        int start =0;
        int end=arr.length;

       while (start<=end) {
           int mid=(start+end)/2;
           if (target==arr[mid]) {
               return mid;
           }
           else if (target < arr[mid]) {
                 end=mid-1;
           }
           else {
               start=mid+1;

           }

       }
       return -1;
    }
    //span =max-min
    public static int spanOfArray(int[]a){
        int max=Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;

//        for(int i=0;i<a.length;i++){
//            if(a[i]>max){
//                max=a[i];
//            } else if (a[i]<min) {
//                min=a[i];
//            }
//            else {
//                return -1;
//            }
//
//            System.out.println("max "+max);
//            System.out.println("min "+min);
//
//        }

        for (int i=0;i<a.length;i++){
            max=Math.max(a[i],max);
            min=Math.min(a[i],min);


        }
        int span =max-min;
       return span;
    }


}
