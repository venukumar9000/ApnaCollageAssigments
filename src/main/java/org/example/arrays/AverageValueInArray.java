package org.example.arrays;

public class AverageValueInArray {
    public static void main(String[] args) {
      int[] a ={1,2,3,4,5};
        System.out.println(average(a));
    }
    public static int average(int []n){
        int sum=0;
        for(int i=0;i<n.length;i++){
            sum+=n[i];

        }
      int  avg =sum/n.length;
        return avg;
    }
}
