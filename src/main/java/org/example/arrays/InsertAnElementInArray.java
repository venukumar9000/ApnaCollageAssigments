package org.example.arrays;

import java.util.Arrays;

public class InsertAnElementInArray {
    public static void main(String[] args) {
        int [] a ={1,2,3,4,5};
        int ele =7;
        insertElement(a,ele);


    }
    public static void insertElement(int [] arr ,int insertEle){
        int pos=2;
        int [] newArr = new int[arr.length+1];
        for(int i =0;i<pos;i++){
          newArr[i]=arr[i];
        }
        newArr[pos]=insertEle;
        for(int i=2;i<arr.length;i++){
            newArr[i+1]=arr[i];
        }

        for(Integer n : newArr){
            System.out.println(n);
        }

    }

}
