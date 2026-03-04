package org.example.generics;

import java.util.ArrayList;
import java.util.Collections;


public class SortingExample {
    public static void main(String[] args) {
        ArrayList<Integer> intergerlist=new ArrayList<>();
        intergerlist.add(10);
        intergerlist.add(1);
        intergerlist.add(5);
        intergerlist.add(4);
        intergerlist.add(6);
        System.out.println(intergerlist);

        ArrayList<String> str =new ArrayList<>();
        str.add("venu");
        str.add("zebra");
        str.add("apple");
        str.add("mango");
        str.add("banana");

//        for(Integer i:intergerlist){
//            System.out.println(i);
//        }
//        integerList(intergerlist);
//        for(String s:str){
//            System.out.println(s);
//        }
//        stringList(str);
        Collections.sort(intergerlist);
        System.out.println(intergerlist+" Sorted list");

        Utils.anyList(str);


    }
//    private static void integerList(ArrayList<Integer> integers){
//        for (Integer k:integers){
//            System.out.println(k);
//        }
//    }
//    private static void stringList(ArrayList<String> str){
//        for (String k:str){
//            System.out.println(k);
//        }
//    }



}
