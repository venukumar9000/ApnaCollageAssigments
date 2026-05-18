package org.example.arrays;

import java.util.*;

public class TwoSumOptimized {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // value -> index

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int needed = target - num;

            System.out.println("Iteration " + i + ": num=" + num + ", needed=" + needed + ", map=" + map);

            if (map.containsKey(needed)) {
                System.out.println("Found! " + num + " + " + needed + " = " + target);
                return new int[]{map.get(needed), i};
            }

            map.put(num, i);
        }

        return new int[]{}; // No pair found
    }

    public static void moveZerosToLast(int[] nums){
        int pos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp =nums[i];
                nums[i]=nums[pos];
                nums[pos]=temp;

                pos++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public  static int secondMax(int[]nums){
        if (nums.length <2){
            System.out.println("array elemets are too short");
        }
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                secMax=max;
                max=nums[i];
            }else if(nums[i]>secMax && max !=nums[i]){
                secMax=nums[i];
            }
        }
        return secMax;
    }

   public static void reverseArray(int []nums , int start, int end){
        while(start < end){
            int temp =nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }

   }
   public static void rotateArrayByPosition(int []nums, int k){
        int n =nums.length;
         k =k%n;
         reverseArray(nums,k,k-1);
       System.out.println(Arrays.toString(nums));
   }
    public static int  longestSubarray(int[] arr, int m) {
        // code here

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=i;k<j;k++){
                    if(arr[i]+arr[j]==m){
                        return arr.length;
                    }
                }
            }
        }
        return -1;

    }
    public static void removeDuplicates(int []nums){
        Set<Integer >set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        System.out.println(set);
    }
    public static int averageArray(int[] nums){
        int sum=0;
        int n =nums.length;
        int avg=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        avg=sum/n;
        return avg;
    }
    public static void countPosNeZero(int []nums){
        int posCount=0;
        int negCount=0;
        int zerosCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                negCount++;
            }else if(nums[i]==0){
                zerosCount++;
            }else {
                posCount++;
            }
        }
        System.out.println("posCount :"+posCount+" negCount :"+negCount+" zerosCount :"+zerosCount);
    }
    public static void  rev(int []nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int temp =nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void secMin(int []nums){
        int min=Integer.MAX_VALUE;
        int secMin=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                secMin=min;
                min=nums[i];
            } else if (secMin > min && nums[i]<secMin) {
                secMin=nums[i];

            }
        }
        System.out.println(secMin);
    }
    public static void sortAcendingOrder(int [] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void mergeTwoArrays(int []num1,int []num2){
        int [] arr =new int[num1.length+num2.length];
        int index=0;
        for(int i=0;i<num1.length;i++){
            arr[i]=num1[i];
            index++;
        }
        for(int i=0;i<num2.length;i++){
            arr[index]=num2[i];
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int removDuplicatetwopointers(int[]nums){
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
            }
        }

        return i+1;
    }
    public static void reverse(int []nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public static void rotateArrayBYKplaces(int []nums ,int k){
        int n = nums.length;
        k=k%n;

            reverse(nums,0,k-1);
            reverse(nums,k,n-1);
            reverse(nums,0,n-1);

        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroLastPlaces(int []nums){
        int start=0;
        int end=0;
        int size =nums.length;
        while (start < size){
            if(nums[start] != 0){
                int temp = nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
                end++;
            }else{
                start++;
            }
        }
        System.out.println(Arrays.toString(nums));

    }
    public static void moveZero(int []nums){
        List<Integer> temp = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                temp.add(nums[i]);
            }
        }

        int n =temp.size();
        for(int i=0;i< n;i++){
            nums[i]=temp.get(i);
        }

        for(int i=n;i<nums.length;i++){
            nums[i]=0;
        }
        System.out.println("MOve :"+Arrays.toString(nums));
    }
    public static  void thirdMax(int []nums){
        Integer max=null;
        Integer secMax=null;
        Integer thirdmax=null;

        for(Integer num:nums){
            if(max !=null && num==max) continue;;
            if(secMax !=null && num==secMax)continue;
            if(thirdmax !=null && num ==thirdmax) continue;
            if(max==null || num>max){
                thirdmax=secMax;
                secMax=max;
                max=num;
            }
            else if(secMax==null || num>secMax){
                thirdmax=secMax;
                secMax=num;
            }else if(thirdmax==null || num>thirdmax ){
                thirdmax=num;
            }
        }
        System.out.println(thirdmax);
    }
    public static void majority(int[]nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max=Integer.MIN_VALUE;

            for(Map.Entry<Integer,Integer>entry:map.entrySet()){
                max=Math.max(max,entry.getValue());
                if(entry.getValue()==max){
                    System.out.println(entry.getKey());
                }
            }


    }
    public  static  void palindromeArray(int []nums){
        int n= nums.length;
        for(int i=0;i<n/2;i++){
            for(int j=n;j>=n/2;j--){
             if(nums[i]==nums[j]){
                 System.out.println("palindronm");
             }else {
                 System.out.println("not");
             }
            }
        }

    }


    public static void main(String[] args) {
       int[] arr= {-5, 8 ,-14, 2, 4 ,12}; int k = 15;
        int[] nums = {2, 15,0,0, 11,21, 7};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Result: [" + result[0] + ", " + result[1] + "]");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
//        moveZerosToLast(nums);
        System.out.println(secondMax(nums));



        rotateArrayByPosition(nums,3);
        System.out.println(longestSubarray(arr,k));
        int []a = {1,1,2,3,3,4,4,4,5};
        removeDuplicates(a);
        int []aa={1,-2,3,4,5};
        System.out.println(averageArray(aa));

        int [] b ={1,2,-1,3,-6,0,0};
        countPosNeZero(b);
        rev(aa);
        secMin(aa);
        sortAcendingOrder(b);
        int []a1={1,2,3};
        int []a2={4,5,6};
        mergeTwoArrays(a1,a2);

        int []rotate={1,2,3,4,5,6,7};
        rotateArrayBYKplaces(rotate,3);

        int [] zeros ={0, 1, 0, 3, 12};
//        moveZeroLastPlaces(zeros);
        moveZero(zeros);
        int []l ={10, 9, 8, 7};
        thirdMax(l);
        int []az={1,2,3,4,2,4,3,2,2,2,2};
        majority(az);
        int [] palinddorm={1,2,3,2,1};
        palindromeArray(palinddorm);







    }

}


