package org.example.strings;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class
          everseVowels {
    public static void main(String[] args) {

        System.out.println(reverseVowel("hello"));

        List<Integer> li = Arrays.asList(1,2,3,4,5);
        List<Integer> l2 = Arrays.asList(1,2,3,4,5);
        Map<String, List<Integer>> map =
                li.stream()
                        .collect(Collectors.groupingBy(i -> i % 2 == 0?"even":"odd"));
        System.out.println(map);
        List<Integer> l= new CopyOnWriteArrayList<>(l2);
        for(Integer listed : l){
            System.out.println(l);
            l.add(10);
        }
        Map<Integer,String> hs= new ConcurrentHashMap<>();
        hs.put(10,"john");
        hs.put(11,"venu");

        for(Integer key : hs.keySet()){
            System.out.println("keys :"+ key);
            hs.put(13,"mani");
        }
        LocalDate date = LocalDate.of(2025, 12, 25);
        LocalDate date1 = LocalDate.now();

        LocalDate newdate = date1.plusDays(30);

        System.out.println(newdate.getDayOfWeek());

        System.out.println(date);

        LocalDate dob = LocalDate.of(1996,12,29);
        LocalDate presentDay = LocalDate.now();
         int days = Period.between(dob, presentDay).getDays();
        System.out.println(days+"days");
         long between = ChronoUnit.DAYS.between(dob, presentDay);

        System.out.println(between);
         LocalDate localDate = presentDay.withDayOfMonth(presentDay.lengthOfMonth());
        System.out.println(localDate);


    }
    public static String reverseVowel(String str){
        char [] ch =str.toCharArray();
        int start=0;
        int end=str.length()-1;
        while(start<end){
           if(!isVowel(ch[start])){
               start++;
           }else if(!isVowel(ch[end])){
               end--;
           }else{
               char temp =ch[start];
               ch[start]=ch[end];
               ch[end]=temp;
               start++;
               end--;
           }
        }
       return String.valueOf(ch);

    }




    private static boolean isVowel(char ch) {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
}
