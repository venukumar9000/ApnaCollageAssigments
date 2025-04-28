package org.example.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToArrayList {
    public static void main(String[] args) {
        int[] l = {1, 23, 4};

        ArrayList<Integer> convert = convert(l);

        System.out.println(convert);
    }

    public static ArrayList<Integer> convert(int[] arr) {
        ArrayList<Integer> newArrList = new ArrayList<>();
        for (int num : arr) {
            newArrList.add(num);  // add each int as Integer
        }
        return newArrList;
    }
}
