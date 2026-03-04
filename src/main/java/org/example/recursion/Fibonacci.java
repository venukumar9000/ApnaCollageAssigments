package org.example.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(25));
    }
    public static int fibonacci(int n){
      if(n==0 || n==1){
          return n;
      }
      int fn=fibonacci(n-1);
      int fm=fibonacci(n-2);
      int sm =fn+fm;
      return sm;
    }
}

