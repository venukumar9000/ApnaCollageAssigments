package org.example.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Flow;
import java.util.function.Consumer;

public class ConsumerExample implements Consumer<Integer> {

    //by using implements consumer
    @Override
    public void accept(Integer t) {
        System.out.println("printing.. "+t);
    }
    public static void main(String[] args) {
        //by using lamba
        Consumer<Integer> integerConsumer = (t) -> System.out.println("print :" + t);
        integerConsumer.accept(10);

        ConsumerExample consumerExample = new ConsumerExample();
        consumerExample.accept(20);

        //forEach internally uses consumer interface

        List<Integer> li = Arrays.asList(1,2,3,4,5);
//        li.forEach(integerConsumer);
        li.forEach(t-> System.out.println("print foreach :"+t));
    }


}
