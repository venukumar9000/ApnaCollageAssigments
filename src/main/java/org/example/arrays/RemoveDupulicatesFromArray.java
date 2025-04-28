package org.example.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupulicatesFromArray {
    public static void main(String[] args) {
        int []arr ={1,1,2,3,2,3,4,5};
      Set<Integer> s = new LinkedHashSet<>();
      for(int num :arr){
          s.add(num);
      }
        System.out.println(s);
        System.out.println(fact(5));
        System.out.println(sum(3));

    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fn=n*fact(n-1);
        return fn;
    }
    public static int sum(int n ){
        if(n==1){
            return 1;
        }
        int sum = n*sum(n-1);
        return sum;
    }

}
