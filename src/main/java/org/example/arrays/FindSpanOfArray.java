package org.example.arrays;

public class FindSpanOfArray {
    public static void main(String[] args) {
        int []a={22,2,3,4,5,6,7,8,21,3};
//        System.out.println(span(a));
        System.out.println(secMax(a));

        int [] ar={11,12,13,14,15,16,17,18,19,21};
        int key =7;
        System.out.println(binarySearch(ar,key));
        int ceil=9;
        System.out.println(ceilbinarySearch(ar,ceil));
        int floor=10;
        System.out.println(floorBinarySearch(ar,floor));

        int [] desbr={9,8,7,6,5,4,3,2};
        int s=3;
        System.out.println(binarySearchdesc(desbr,s));
    }
    public static int span(int []arr){
        int max=arr[0];
        int min=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else if(arr[i]<min) {
                min=arr[i];
            }
        }
        return max-min;
    }
    public static int secMax(int []aa){
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        for(int i=0;i<aa.length;i++){
            if(aa[i]>max){
                secMax=max;
                max=aa[i];
            }
            else if(aa[i]<max && aa[i]>secMax){
                secMax=aa[i];
            }
        }
        return secMax;
    }
    public static int binarySearch(int []arr,int target){
        int low=0;
        int high=arr.length-1;

        while (low<=high){
            int mid =(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }

            if(target >arr[mid]){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return -1;
    }
    public static int ceilbinarySearch(int []arr,int target){
        int low=0;
        int high=arr.length-1;

        while (low<=high){
            int mid =(low+high)/2;
            if(arr[mid]==target){
                return arr[mid];
            }

            if(target >arr[mid]){
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        if(low<arr.length) {
            return arr[low];
        }else {
            return -1;
        }
    }
    public static int floorBinarySearch(int [] arr, int floor){
        int a =0;
        int b =arr.length-1;

        while (a<=b){
            int mid=(a+b)/2;
            if(floor == arr[mid]){
                return arr[mid];
            }
            else if(floor < arr[mid]){
                b=mid-1;
            }else {
                a=mid+1;
            }
        }
        if(b>=0) {
            return arr[b];
        }
        return -1;
    }
    public static int binarySearchdesc(int []arr, int key ){
        int low=0;
        int high=arr.length-1;

        while (low<=high){
            int mid=(low+high)/2;
            if(key ==arr[mid]){
                return mid;
            }
            else if(key < arr[mid]){
               low=mid+1;
            }else {
                high=mid-1;
            }
        }
        return -1;
    }


}
