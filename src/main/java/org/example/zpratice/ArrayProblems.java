package org.example.zpratice;

public class ArrayProblems {
    //Given an array and an integer K, find the longest-length contiguous subarray whose sum is less than or equal to K.
    //ip-->arr = [2, 1, 3, 1, 1, 1], K = 5
    //op-->Length: 4
    //(Subarray: [1, 3, 1] or [3,1,1] etc.)
    public static void longestSubArray(int [] nums,int k){
        int maxLen=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];

                if(sum <=k){
                    maxLen=Math.max(maxLen,j-i+1);
                }
            }
        }
        System.out.println(maxLen);
    }

    public static void main(String[] args) {
        int [] arr = {2, 1, 3, 1, 1, 1};
        int k=5;
        longestSubArray(arr,k);
    }
}
