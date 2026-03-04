package org.example.recursion;

public class printDecOrder {
    public static void main(String[] args) {
        printDec(10);
        printAsc(5);
    }
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void  printAsc(int n){
        if(n==1){
            System.out.print(1 +" ");
            return;
        }
        printAsc(n-1);
        System.out.print(n +" ");
    }
}
