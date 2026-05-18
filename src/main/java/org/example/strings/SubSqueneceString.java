package org.example.strings;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SubSqueneceString {
    public static void main(String[] args) {
        String ss = "abc";
       String t = "ahbgdc";
        System.out.println( subQuenece(ss,t));
        String s = "A man, a plan, a canal: Panama";
        isPalindrome(s);

        String[] sss = {"flower", "flow", "floght"};
        System.out.println("longest preFIX "+longestCommonPrefix(sss));
        System.out.println( calculateAge("29-12-1996"));
         long l = daysBetween(LocalDate.of(2026, 01, 01), LocalDate.of(2026, 01, 19));
        System.out.println(l);
        System.out.println("weekends "+getWeekends(LocalDate.parse("2025-01-01"),LocalDate.parse("2026-01-01")));


        List<Integer> li = Arrays.asList(1,2,3,4,5,8);
        int sum = li.stream()
                .filter(i->i%2==0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("list----------"+sum);
        String str = "java programming";


        Optional<Map.Entry<Character, Long>> c = str.chars()
                .mapToObj(i->(char)i)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                        .entrySet().stream().
                        filter(i->i.getValue()==1)
                                .findFirst();

        System.out.println("first occur "+c.get().getValue());

        List<String> words= Arrays.asList("venu","bunty","manakanta","cnu");


        List<String > ls=words.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
              .toList();

        System.out.println("sorted "+ls);

        List<Integer> ks= Arrays.asList(1,2,3,4,5,5,6,6);

         Integer first = ks.stream()
                .distinct()
                 .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                 .orElseThrow();
        System.out.println(first);

        List<Integer> lis = Arrays.asList(1,2,3,4,5,110,120,130);

        List<Integer> lsis=lis.stream()
                .filter(i->i>100)
                .toList();

        System.out.println(lsis);


        String sm = "java programming is good language";

        Arrays.stream(sm.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().forEach(System.out::println);

        List<Integer> sis = Arrays.asList(1,2,3,4,5);

         List<String> list = sis.stream()
                .map(String::valueOf).
                toList();
        System.out.println(list);

        List<String> word= Arrays.asList("venu","bunty","manakanta","cnu","abc");

        Map<Integer, List<String>> map=word.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(map);

    }
    public static boolean subQuenece(String s , String str){
        for(int i=0;i<s.length();i++) {
            if (s.contains(String.valueOf(str.charAt(i)))) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
    public static boolean isPalindrome(String s) {
        String str =s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str);
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
       String ss= rev.toLowerCase();
        System.out.println(rev);
        if(str.equalsIgnoreCase(rev)){
            return true;
        }

        return false;
    }
    public static String longestCommonPrefix(String[] str){

        Arrays.sort(str);
        StringBuilder sb = new StringBuilder();
        int minLength = Math.min(str[0].length(),str[str.length-1].length());
       for(int i=0;i<minLength;i++){
           if (str[0].charAt(i) == str[str.length-1].charAt(i)) {
               sb.append(str[0].charAt(i));
           }else{
               break;
           }
       }

       return sb.toString();
    }
    public static int calculateAge(String dob) {
        DateTimeFormatter dateTimeFormatter =  DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate localDate = LocalDate.parse(dob, dateTimeFormatter);
        return Period.between(localDate, LocalDate.now()).getYears();
    }
    public static long daysBetween(LocalDate d1, LocalDate d2){
        return ChronoUnit.DAYS.between(d1,d2);
    }
    public static List<LocalDate> getWeekends(LocalDate start,LocalDate end){
        List<LocalDate> weekends= new ArrayList<>();
        while (!start.isAfter(end)){
            DayOfWeek day = start.getDayOfWeek();
            if(day==DayOfWeek.SATURDAY || day==DayOfWeek.SUNDAY){
                weekends.add(start);
            }
            start=start.plusDays(1);
        }
        LocalDate lastDay = YearMonth.of(2026, 2).atEndOfMonth();
        System.out.println(lastDay);

        return weekends;
    }

}
