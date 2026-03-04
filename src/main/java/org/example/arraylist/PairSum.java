package org.example.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class PairSum {
    public static void main(String[] args) {
        int target = 8;
        ArrayList<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(8);
        li.add(6);
        li.add(2);
        li.add(5);
        li.add(4);
        li.add(8);
        li.add(3);
        li.add(7);
        Collections.sort(li);
        pairSum(li, target);
    }

    public static void pairSum(ArrayList<Integer> list, int target) {
        int start = 0;
        int end = list.size() - 1;

        while (start < end) {
            int sum = list.get(start) + list.get(end);

            if (sum == target) {
                System.out.println("(" + list.get(start) + ", " + list.get(end) + ")");
                start++;
                end--; // move both pointers to avoid duplicates
            } else if (sum < target) {
                start++; // need a bigger sum
            } else {
                end--; // need a smaller sum
            }
        }
    }
}
