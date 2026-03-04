package org.example.zpratice;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListProblems {
    // Remove all occurrences of a given value from ArrayList
    public static void removeOccur(List<Integer> li ,int key){
//       li.removeAll(Arrays.asList(key));
        li.removeIf(i->i==key);
        System.out.println(li);
    }
    //Check if two ArrayLists are equal (order matters)
    public static void equqlOrNot(List<Integer>li , List<Integer>l2){
     if(li.equals(l2)){
         System.out.println("equal");
     }else{
         System.out.println("not");
     }
    }
    public static void equqlOrSameElementwithOutOrder(List<Integer>li , List<Integer>l2){
        li.retainAll(l2);
        System.out.println(li);
    }
    //presnt in first absemt in last
    public static void presentFirst(List<Integer>l1,List<Integer>l2){
       l1.remove(l2);
        System.out.println(l1);
    }
    public static void main(String[] args) {
     List<Integer> li = new ArrayList<>(Arrays.asList(1,3,4,5,6,4,5,6,7));
       ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(20,40));

     int k=4;
     removeOccur(li,k);
     equqlOrNot(l1,l2);
     equqlOrSameElementwithOutOrder(l1,l2);
     presentFirst(l1,l2);


        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(20, 40));

        for (int num : list1) {
            if (!list2.contains(num)) {
                System.out.print(num + " ");
            }
        }
    

    }

}
