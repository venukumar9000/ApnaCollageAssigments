package org.example.arrays;

public class BinarySearch {
    public static void main(String[] args) {
     int []arr={1,2,3,4,5};
     int target =3;
        boolean elementfound=binarySearch(arr,target);
        if(elementfound){
            System.out.println("element found");
        }else {
            System.out.println("element not found");
        }
        int mat[][]={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
                            };
       boolean res= binarySeachFor2Darray(mat,target);
       if(res){
           System.out.println("2D Array element found");
       }else {
           System.out.println("2D Array  element not found");
       }
    }
    public static boolean binarySearch(int []arr,int target){
        int start=0,end =arr.length-1;

        while(start<=end){
            int mid =(start+end)/2;
            if(arr[mid]==target){
                return true;
            } else if (arr[mid]<target) {
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return false;
    }
    public static boolean binarySeachFor2Darray(int [][] a, int tar){
        int m = a.length;
        int n=a[0].length;

        int start =0;
        int end =m*n-1;

        while (start<=end){
            int mid =start+(end-start)/2;
            int midValue = a[mid/n][mid%n];

            if(midValue==tar){
                return true;
            }else if(midValue< tar){
                start=mid +1;
            }else {
                end=mid-1;

            }
        }
        return false;
    }
}
