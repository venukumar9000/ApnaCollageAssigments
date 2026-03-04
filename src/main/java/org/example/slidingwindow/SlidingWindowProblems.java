package org.example.slidingwindow;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SlidingWindowProblems {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2,2,2,3,3};
        int k = 3;
        final int i = maxSumArray(arr, k);
        System.out.println(i);

        int[] arr1 = {0, 0, 1, 1, 1, 7,1,2, 2, 3, 3, 4,4};
//        System.out.println(removeDuplicates(arr1));
        int[] arr2 = {1, 0, 2, 0, 3, 5, 0, 7,5,6,5};
        System.out.println(moveZeros(arr2));
        System.out.println(removeElement(arr2,5));
//        System.out.println(Arrays.toString(removeEle(arr1,3)));

        System.out.println(returnDuplicates(arr));
        int [] nums ={5, 3, 8, 2, 6, 4, 7, 1, 9};
        int target=10;
        System.out.println(Arrays.toString(twosum(nums,target)));

        int [] n = {9,9,9};
        System.out.println(Arrays.toString(returnAdditionArray(n)));
        int [] nu = {4,1,2,1,2};
        appearsOnce(nu);
    }

    /*
    Given an array, find the maximum sum of any subarray of size K.
     Input: [2,1,5,1,3,2], k = 3
     Output: 9 → [5,1,3]
     */
    public static int maxSumArray(int[] nums, int k) {
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];

        }
        int maxSum = windowSum;
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i];
            windowSum -= nums[i - k];
            maxSum = Math.max(windowSum, maxSum);
        }
        return maxSum;
    }

    public static int removeDuplicates(int[] nums) {
        int write = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[write]) {
                write++;
                nums[write] = nums[i];
            }
        }
        return write + 1;
    }

    public static List<Integer> moveZeros(int[] nums) {
        List<Integer> li = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                li.add(nums[i]);
            } else {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            li.add(0);
        }
        return li;
    }
    public static List<Integer> removeElement(int [] nums , int remove){
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] != remove){
                li.add(nums[i]);
            }
        }
        return li;
    }
    public static int[] removeEle(int []nums, int val){
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val ){
                nums[j]=nums[i];
                j++;
            }
        }
        int [] res= new int[j];
        for(int i=0;i<j;i++){
            res[i]=nums[i];
        }
        return res;
    }
    public static Set<Integer> returnDuplicates(int []nums){
        Set<Integer > set = new HashSet<>();

        for(int num:nums){
            if(!set.contains(num)){
                set.add(num);
            }

        }
        return set;
    }
    public static int [] twosum(int [] nums, int target){

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int need = target-nums[i];
            if(map.containsKey(need)){
                return new int[]{map.get(need),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
    public static int [] returnAdditionArray(int []nums){
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i] < 9){
                nums[i]++;
                return nums;
            }
            nums[i]=0;
        }
        int []res = new int[nums.length+1];
        res[0]=1;
        return res;
    }
    public static void appearsOnce(int [] nums){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(int val:map.values()){
            if(val==1){
                map.entrySet().stream().map(Map.Entry::getKey).forEach(System.out::println);
            }
        }

    }
    public static void windowMinSubArraySumLength(int [] arr){
        int windowSum= arr[0];
        int minLengthSum=Integer.MAX_VALUE;

        for(int i=1;i<arr.length;i++){

        }

    }

}

