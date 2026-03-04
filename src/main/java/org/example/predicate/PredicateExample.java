package org.example.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample implements Predicate<Integer> {
    // implementation approach
    @Override
    public boolean test(Integer t) {
        if(t%2==0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
      Predicate<Integer> k=  (t)->{
            if(t%2==0){
                return true;
            }else{
                return false;
            }
        };
        PredicateExample  predicateExample= new PredicateExample();
        System.out.println(predicateExample.test(10));
        System.out.println(k.test(11)+" sec");

        //predicate using filter

        List<Integer> li = Arrays.asList(1,2,3,4,5,6);
        li.stream().filter(predicateExample).forEach(System.out::println);

        //using dynamic
        li.stream().filter(i->i%2==0).forEach(System.out::println);
    }
}
