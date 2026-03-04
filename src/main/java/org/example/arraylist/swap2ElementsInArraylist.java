package org.example.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class swap2ElementsInArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        int idx1=1,idx3=3;
        System.out.println(li);
        swapArraylist(li,idx1,idx3);
        System.out.println(li);

    }

    public static void swapArraylist(ArrayList<Integer> list,int idx1, int idx3){
        int temp;

            temp =list.get(idx1);
            list.set(idx1, list.get(idx3));
            list.set(idx3,temp );


    }
}
