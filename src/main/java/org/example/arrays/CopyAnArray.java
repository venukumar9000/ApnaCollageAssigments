package org.example.arrays;

import java.util.Arrays;

public class CopyAnArray {
    public static void main(String[] args) {
        int[] k={1,2,3};
        newArray(k);


    }
    public static void newArray(int [] arr){
      int [] newArr=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            newArr[i]=arr[i];


        }
        System.out.println("new arry"+Arrays.toString(newArr));
        System.out.println("old arry"+Arrays.toString(arr));
    }
}
