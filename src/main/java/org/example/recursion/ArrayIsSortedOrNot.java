package org.example.recursion;

public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int [] n ={1,2,3,4,5};
        System.out.println(isSorted(n,0));
    }
    public static boolean isSorted(int [] arr, int k){
        if(k==arr.length-1){
            return true;
        }
        if(arr[k]>arr[k+1]){
            return false;
        }
      return   isSorted(arr, k+1);

    }
}
