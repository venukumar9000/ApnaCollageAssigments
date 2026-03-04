package org.example.recursion;

public class LastOccurenceInArray {
    public static void main(String[] args) {
     int [] n ={1,2,3,4,5,6,7,4,9};
        System.out.println(lastOccerance(n,4,0));
    }
    public static int lastOccerance(int [] arr,int key,int i){
        if(i==arr.length){
            return -1;
        }
         int isFound = lastOccerance(arr, key, i + 1);
         if(isFound !=-1 && arr[i]==key){
             return i;
         }

             return isFound;


    }
}
