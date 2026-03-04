package org.example.javatechie.java8interview;

import java.util.*;
import java.util.stream.Collectors;

public class FIndNthHigestSalary {
    public static void main(String[] args) {
        Map<String,Integer> emp = new HashMap<>();
        emp.put("john",10000);
        emp.put("venu",20000);
        emp.put("mani",245000);
        emp.put("kanta",280000);
        emp.put("cena",245000);
        emp.put("bunty",280000);
        emp.put("sunny",870000);

        nthhigestsal(4,emp);
    }
    public static void nthhigestsal(int num , Map<String,Integer>hs){
//        hs.entrySet()
//                .stream()
//                .sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
//                .skip(num-1)
//                .findFirst()
//                .ifPresentOrElse(
//                        e-> System.out.println(num+" th higest sal is :"+e.getKey()+" = "+e.getValue()),
//                        ()-> System.out.println("no enough entries in the map")
//                );

         List<Integer> collect = hs.values()
                .stream()
                .distinct()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

         if(num > collect.size()){
             System.out.println("not enough unique salary levels");
             return;
         }
         int nthsal=collect.get(num-1);
        System.out.println(num+" th higest sal is : "+nthsal);
        System.out.println("Employee with this sal :");
        hs.entrySet()
                .stream()
                .filter(e->e.getValue()==nthsal)
                .forEach(e-> System.out.println(e.getKey()+" "+e.getValue()));
    }
}
