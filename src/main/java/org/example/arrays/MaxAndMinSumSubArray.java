package org.example.arrays;

public class MaxAndMinSumSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
       int[] maxAndMin =maxSumSubArray(arr);
        System.out.println("Max :"+maxAndMin[0]);
        System.out.println("Min :"+maxAndMin[1]);
    }

    public static int[] maxSumSubArray(int[] arr) {
        int maxsum = Integer.MIN_VALUE;
        int minsum = Integer.MAX_VALUE;


        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                    maxsum = Math.max(currSum, maxsum);
                    minsum = Math.min(currSum, minsum);
                }
            }


        }
        return new int[]{maxsum, minsum};
    }
}
