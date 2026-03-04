package org.example.comparablecomparator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainClass {
    public static void main(String[] args) {
        Flight f1 = new Flight("mumbai","indigo",2.5f,"20:00");
        Flight f2 = new Flight("chennai","air india",3.5f,"09:00");
        Flight f3 = new Flight("vizag","indigo",1.5f,"100:00");
        Flight f4 = new Flight("kerala","indigo",7.5f,"11:00");
        Flight f5 = new Flight("tamil","indigo",9.5f,"17:00");
        Flight f6 = new Flight("hyderabad","indigo",6.5f,"14:00");

        ArrayList list= new ArrayList<>();
        list.add(f1);
        list.add(f2);
        list.add(f3);
        list.add(f4);
        list.add(f5);
        list.add(f6);


        int tar=11;
        int [] arr = {5,6,7,4,3,8,5,5,5};
        Map<Integer,Integer> mp= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int value=mp.getOrDefault(arr[i],0);
            mp.put(arr[i],value+1);
        }
        int max =0;

        for (Map.Entry<Integer,Integer> num:mp.entrySet()){
            max=Math.max(num.getValue(),max);
        }
        System.out.println(max+"max free");


    }
}
