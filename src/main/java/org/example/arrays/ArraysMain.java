package org.example.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ArraysMain {
    public static  void subArray(int []nums){
      for(int i=0;i<nums.length;i++){
          for(int j=i;j<nums.length;j++){
              for(int k=i;k<=j;k++){
                  System.out.print(nums[k]);
              }
              System.out.println();
          }
          System.out.println();
      }
    }
    public static void subArraySum(int[] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    System.out.print(arr[k]);
                }
                System.out.println("sum :"+sum);
                System.out.println();
            }
            System.out.println();
        }

    }

    public  static  void maxSum(int a[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                int sum =0;
                for(int k=i;k<=j;k++){
                    sum=sum+a[k];

                }
                if(max <sum){
                    max =sum;
                }
                System.out.println("sum :"+sum);
            }
        }
        System.out.println("max sum pair :"+max);
    }
    public static  void kadanesSubMaxArray(int []arr){
        int maxsum =Integer.MIN_VALUE;
        int currSum =0;
        for(int i=0;i<arr.length;i++){
            currSum=currSum+arr[i];
            maxsum=Math.max(currSum,maxsum);
            if(currSum < 0){
                currSum=0;
            }


        }
        System.out.println("Max sum :"+maxsum);
    }

    public static void duplicateArray(int [] ar){
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<ar.length;i++){
            int value =hm.getOrDefault(ar[i],0);
            System.out.println("value :"+value);
            hm.put(ar[i], value+1);

        }
        for (Map.Entry<Integer, Integer> integerIntegerEntry : hm.entrySet()) {
           if(integerIntegerEntry.getValue()>1){
               System.out.println("duplicate element :"+integerIntegerEntry.getKey());

           }
        }


    }


    public static void main(String[] args) {
        int []subArray = {10,3,3,-4};
        subArray(subArray);
        System.out.println("++++++++++");
        subArraySum(subArray);

        maxSum(subArray);
        System.out.println("kadanesmaz----------");
        kadanesSubMaxArray(subArray);
        System.out.println("________________________________________________________");
        duplicateArray(subArray);
        int[] h={4, 2 ,0,6,3,2,5};

    }

}
