package org.example.arrays;

import java.util.Arrays;

public class SortNumericArray {
    public static void main(String[] args) {
    String[] arr = {"mango","apple","banana"};

        System.out.println(Arrays.toString(arr));

        int []k={1,2,3};
        System.out.println(sumarray(k));
    }
    public static void sortStringArray(String[]arr){

        String temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[i].compareToIgnoreCase(arr[j])>0){

                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

    }
    public static int sumarray(int []s){
        int sum=0;
        for(int i=0;i<s.length;i++){
            sum+=s[i];
        }
        return sum;
    }
}
