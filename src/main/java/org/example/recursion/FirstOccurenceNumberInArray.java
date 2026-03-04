package org.example.recursion;

public class FirstOccurenceNumberInArray {
    public static void main(String[] args) {
     int [] n={1,2,3,4,5,6,7,5};

        System.out.println(firstOccurance(n,5,0));
    }
    public static int firstOccurance(int [] arr,int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
      return   firstOccurance(arr,key,i+1);

    }
}
