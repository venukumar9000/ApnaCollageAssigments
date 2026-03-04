package org.example.consumer;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachMethod {
    public static void main(String[] args) {
        List<String> li= Arrays.asList("apple","banana","cat","bat");

        li.forEach(t-> System.out.println(t));

        // internal it uses consumer

        Consumer<String> str =(t)-> System.out.println(t);
            for (String s:li){
                str.accept(s);
            }

        Map<Integer,String> hs = new LinkedHashMap<>();
            hs.put(1,"mani");
            hs.put(2,"gani");
            hs.put(3,"sunny");
            hs.put(4,"bunny");

            hs.forEach((k,v)-> System.out.println(k+"="+v));
            hs.entrySet().forEach(System.out::println);




    }



}
