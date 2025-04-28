package org.example.arrays;

public class PrintGridArray {
    public static void main(String[] args) {
        int n=10;
        int m=10;
        int [][]arr = new int[n][m];
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print("- ");
            }
            System.out.println();
        }
    }

}
