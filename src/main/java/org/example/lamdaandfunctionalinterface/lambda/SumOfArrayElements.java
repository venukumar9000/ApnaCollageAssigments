package org.example.lamdaandfunctionalinterface.lambda;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SumOfArrayElements {
    public static void main(String[] args) {
        int []a={1,2,3,4,5};
        System.out.println(sum(a));
    }
    public static int sum(int[]arr){
       return Arrays.stream(arr)
               .reduce(0,(a,b)->a+b);

    }
}
