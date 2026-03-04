package org.example.lamdaandfunctionalinterface.lambda;

import java.util.stream.IntStream;

public class Foctorial {
    public static void main(String[] args) {
     int n=5;
        System.out.println(factorial(n));
        System.out.println(factorialLambda(n));
        IntStream.range(1,5).forEach(System.out::println);
        IntStream.rangeClosed(1,5).forEach(System.out::println);
    }
    public static int factorial(int n){
      int fact=1;
      for(int i=2;i<=n;i++){
          fact *=i;
      }
      return fact;
    }
    public static long factorialLambda(int n){
         return  (n == 0 || n == 1) ? 1L :
                IntStream.rangeClosed(2, n)
                        .mapToLong(i -> i)
                        .reduce(1L, (a, b) -> (a * b));

    }
}
