package org.example.arrays;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {

        int []n={7,2,3,8,1,4};
        bubbleSort(n);

    }
    public static void bubbleSort(int [] arr){

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[i] > arr[j+1]){
                    int temp =arr[i];
                    arr[i]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
