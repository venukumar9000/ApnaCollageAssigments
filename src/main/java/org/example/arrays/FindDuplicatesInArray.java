package org.example.arrays;

import java.util.HashMap;
import java.util.HashSet;

public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 3, 5, 6};
        String[] s = {"aa", "aa", "bb", "c", "bb"};
        findDuplicates(s);
        findDuplicates(a);
    }

    public static void findDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }


    }

    public static void findDuplicates(String[] arr) {
        HashSet<String> hs = new HashSet<>();
        for(String s :arr){
            if(!hs.add(s)){
                System.out.println(s);
            }
        }
        }
    }

