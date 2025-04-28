package org.example.arrays;

import java.util.Arrays;

public class FindDiagonalSumOf2DMatrix {
    public static void main(String[] args) {
        int [][]n={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(diagonalSum(n));
        int sums=0;

            for(int j=0;j<n[1].length;j++){
                sums+=n[1][j];
            
        }
        System.out.println("sums :"+sums);

    }
    public static int  diagonalSum(int [][]arr){
        int sum =0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j){
                    sum+=arr[i][j];
                } if(j==arr.length-1-i){
                    sum+=arr[i][j];
                }
            }
        }
        return sum;
    }
}
