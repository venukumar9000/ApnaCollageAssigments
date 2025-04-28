package org.example.arrays;

public class findAnElementPresentInArray {
    public static void main(String[] args) {
        int []a ={1,2,3,4,5};
        int ele =4;
        System.out.println(findElement(a,ele));
        System.out.println(findIndex(a,ele));
    }
    public static boolean findElement(int [] arr , int element){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                return true;
            }
        }
        return false;
    }
    public static int findIndex(int [] a,int index){
        for(int i=0;i<a.length;i++){
            if(a[i]==index){
                return i;
            }
        }
        return -1;
    }

}
