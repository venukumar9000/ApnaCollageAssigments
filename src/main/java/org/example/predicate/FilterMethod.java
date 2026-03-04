package org.example.predicate;

import java.util.*;
import java.util.stream.Collectors;

public class FilterMethod {

    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3,4,5,6,6,7,8);
        List<String> s=Arrays.asList("mai","sai","bay","hai");

        Map<Integer,String> mp = new HashMap<>();
        mp.put(1,"a");
        mp.put(2,"b ");
        mp.put(3,"c");
        mp.put(4,"y");
        mp.put(6,"z");

         List<Map.Entry<Integer, String>> collect = mp.entrySet().stream().filter(i -> i.getKey() % 2 == 0).collect(Collectors.toList());

        System.out.println(collect);


        for(Integer i :li){
         if(i%2==0){
             System.out.println(i);
         }
        }
        for(String str:s){
            if(str.startsWith("s")) {
                System.out.println(str);

            }
        }

        //using filter
         List<String> s1 = s.stream().filter(y -> y.startsWith("s")).collect(Collectors.toList());
        System.out.println(s1);

    }

}
