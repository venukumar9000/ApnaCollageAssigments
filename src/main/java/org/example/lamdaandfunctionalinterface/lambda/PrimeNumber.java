package org.example.lamdaandfunctionalinterface.lambda;

import java.util.stream.IntStream;

public class PrimeNumber {
    public static void main(String[] args) {
        int n =20;
        System.out.println(isPrime(n));
        System.out.println(isPrimeLambda(n));
    }
    public static boolean isPrime(int n){
      boolean isPrime=true;
      for(int i=2;i<=n;i++){
          if(n % i ==0){
              return !isPrime;
          }else {
              return isPrime;
          }
      }
      return isPrime;
    }
    public static boolean isPrimeLambda(int n){
       return n>1 &&
               IntStream.rangeClosed(2, (int) Math.sqrt(n))
                       .allMatch(i->n %i !=0);

    }
}
