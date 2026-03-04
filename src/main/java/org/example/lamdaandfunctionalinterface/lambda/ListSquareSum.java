package org.example.lamdaandfunctionalinterface.lambda;

import java.util.Arrays;
import java.util.List;

public class ListSquareSum {
    public static void main(String[] args) {
        List<Integer>l = Arrays.asList(1,2,3,4,5);
        System.out.println(squareSum(l));
    }
    public static int  squareSum(List<Integer> li){
        final Integer reduce = li.stream()
                .map(i -> i * i)
                .reduce(0, (a, b) -> (a + b));

        return reduce;

    }

}
