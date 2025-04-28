package org.example.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayPratice {

    public static void main(String[] args) {
        int[] n ={2,6,5,8,11};
        int target=14;
        System.out.println(test(n,target));
        System.out.println(Arrays.toString(testIndex(n,target)));
        System.out.println("----------------");
        System.out.println(testIndexUsingHashmap(n,target));
        System.out.println(Arrays.toString(testUsingHashMapIndex(n,target)));

    }
    public static boolean test(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return true;
                }

            }
        }
        return false;
    }
    public static int [] testIndex(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }

            }
        }
       return new int[]{-1,-1};
    }
    public static boolean testIndexUsingHashmap(int [] arr,int target){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int num =arr[i];
            int moreneeded =target-num;
            if(hm.containsKey(moreneeded)){
                return true;
            }else {
                hm.put(arr[i],i);
            }
        }
        return false;
    }
    public static  int[] testUsingHashMapIndex(int []num,int target){
        HashMap <Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<num.length;i++){
            int arr =num[i];
            int moreneeded = target-arr;
            if(hm.containsKey(moreneeded)){
                 int i1 = hm.get(moreneeded);

                return new int[]{i1,i};
            }
            hm.put(num[i],i);
        }
        return new int[]{-1,-1};
    }
}
