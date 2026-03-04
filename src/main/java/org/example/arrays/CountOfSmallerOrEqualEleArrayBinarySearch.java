package org.example.arrays;

import java.util.Arrays;

public class CountOfSmallerOrEqualEleArrayBinarySearch {
    public static void main(String[] args) {
        int[] arr= {1,2,4,5,7,8,9,12,14,17,21};
        int [] a={1,2,3,4,5,6,12,12,12,12};
        int [] ak={1,2,3,4,5,6,12,12,12,12};
        int k=12;
        int l=7;

        System.out.println(binary(arr,k));
        System.out.println(binary(a,k));
        System.out.println(binary(ak,l));
        int []occ={3,4,4,4,4,5};
        int tar=4;
        System.out.println(Arrays.toString(firstandlastoccur(occ, tar)));

    }

    public static int binary(int []arr,int key) {
        int l=0;int h=arr.length-1; int mid=0;

        while (l<=h){
             mid = (l+h)/2;
            if(key==arr[mid]){
              while (mid+1 <arr.length && arr[mid+1]==key){
                  mid++;
              }
               break;
            }else if(key <arr[mid]){
                h=mid-1;
            }
            else {
                l=mid+1;
            }
        }
        if(arr[mid]>key){
            return mid;
        }else {
            return mid + 1;
        }

    }
    public static int[] firstandlastoccur(int[]nums,int target){
        for(int i=0;i<nums.length;i++){
            for(int j=nums.length-1;j>=0;j--){
                if(nums[i]==target && nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
