package org.example.arrays;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,7};
        int t =5;
//        prefixSum(arr);
        prefixPairs(arr,t);

    }
    public static void prefixSum(int [] num){

       for(int i=1;i<num.length;i++){
          num[i]=num[i-1]+num[i];

       }
        System.out.println(Arrays.toString(num));


    }

    public static void prefixPairs(int [] num,int target){




        for(int i=0;i<num.length;i++){
           for(int j=i+1;j<num.length;j++){
               if(num[i]+num[j]==target){
                   System.out.println("( "+num[i]+","+num[j]+")");
               }
           }

        }
        System.out.println(Arrays.toString(num));


    }


}
