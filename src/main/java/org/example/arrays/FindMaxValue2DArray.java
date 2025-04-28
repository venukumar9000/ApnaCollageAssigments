package org.example.arrays;

public class FindMaxValue2DArray {
    public static void main(String[] args) {
        int [][]arr = {
                {1,12,4}
                ,{5,6,9}};
        System.out.println(max(arr));

    }
    public static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                max=Math.max(arr[i][j],max);
            }
        }
        return max;
    }
}
