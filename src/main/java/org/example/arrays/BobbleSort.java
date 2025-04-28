package org.example.arrays;

import java.util.Arrays;

public class BobbleSort {
    public static void main(String[] args) {
        int [] arr={5,10,3,2,1};
         int[] bubblesort = bubblesort(arr);
        System.out.println(Arrays.toString(bubblesort));

        for(int i=arr.length-1;i>=0;i--){

        }

    }
    public static int[] bubblesort(int []n){
        for(int i=0;i<n.length-1;i++){
            for(int j=0;j<n.length-i-1;j++){
                if(n[j]>n[j+1]){
                    int temp =n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                }
            }
        }
        return n;
    }
}
