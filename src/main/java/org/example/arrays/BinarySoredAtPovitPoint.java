package org.example.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BinarySoredAtPovitPoint {
    public static void main(String[] args) {
        int []arr= {7,8,9,10,1,2,3,4,5,6};
        int t =8;
        System.out.println(rotateAtPivot(arr,t));
        System.out.println(Arrays.toString(revereseArray(arr)));
        int n =10899;
        System.out.println(reverseNumber(n));
        pattern(7);
//        pattern2(5,5);
        int [] k = {-1,-2,-3,-4,-5};
        pairPrint(k);
        pairSubArray(k);
        subArraySum(k);
        kadanes(k);
    }
    public static int rotateAtPivot(int []arr, int target){
        int l=0;int h=arr.length-1; int mid =0;
        while(l<=h){
            if(target==arr[mid]){
                return mid;
            }
            else if(arr[l]<=arr[mid]){
                if(target >=arr[l] && target<arr[mid]){
                    h=mid-1;
                }else{
                    l=mid+1;
                }
            }
            else {
                if (target > arr[mid] && target <= arr[h]) {
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }
            }
        }
        return -1;
    }
    public static int[] revereseArray(int [] arr){
        int []newArry= new int[arr.length];

        for(int i=0;i<=arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                newArry[i]=arr[i];
                arr[i]=arr[j];
                arr[j]=newArry[i];
            }
        }

        return newArry;
    }
    public static int reverseNumber(int num){
        int rev=0;
        while(num !=0){
            rev=rev*10+num%10;

            num=num/10;

        }
        return rev;
    }
    public static void pattern(int n ){
        for(int i=1;i<n;i++){
            for(int j=1;j<=n;j++){
                if((i==2 ||i==3) && (j==2||j==3||j==4)){
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();

        }
        System.out.println("++++++++++++++++++");
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= n; j++) {
                if(j<=n-i) {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println("++++++++++++++++++");
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= n-i+1; j++) {

                    System.out.print(j);

            }

            System.out.println();
        }
        int num=1;
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(num);
                num++;

            }

            System.out.println();
        }
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= n; j++) {
                if(j<n-i+1) {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
        int num1=1;
        for(int i=1;i<=n;i++) {
            for (int j = i; j <=n; j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }


    }
//    public static void pattern2(int rows, int col){
//        for(int i=1;i<=rows;i++){
//
//            for(int j=i;j<=col;j++){
//                System.out.print(" ");
//
//            }
//            for(int j=1;j<=col;j++){
//                if(i==1 || i<=rows || j==1 ||j<=col){
//                    System.out.print("*");
//                }
//
//            }
//            System.out.println();
//        }
//    }
    public static  void pairPrint(int [] nums){
        int totalParis=0;
        for(int i=0;i<=nums.length;i++){
            for(int j =i+1;j<nums.length;j++){
                System.out.print("("+nums[i]+","+nums[j]+")");
                totalParis++;
            }
            System.out.println();
        }
        System.out.println(totalParis);
    }
    public static  void pairSubArray(int [] nums) {
        int totalSubArray = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(nums[k] + " ");

                }
                totalSubArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(totalSubArray);
    }
    public static void subArraySum(int []nums){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                   sum=sum+nums[k];
                }
               max= Math.max(sum,max);


            }
            System.out.println();
        }
        System.out.println("max "+max);
    }
    public static void kadanes(int []nums){
        int max=Integer.MIN_VALUE;
        int currSum=0;
        int min =Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            max=Math.max(currSum,max);
            if(currSum < 0){
                currSum=0;
            }
        }

        System.out.println("Max :"+max);
    }
}
