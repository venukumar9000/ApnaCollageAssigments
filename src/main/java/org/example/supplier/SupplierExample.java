package org.example.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample implements Supplier<String> {
    @Override
    public String get() {
        return "Hello";
    }

    public static void main(String[] args) {
         String string = new SupplierExample().get();
        System.out.println(string);

        // refracter
        Supplier<String > supplier =()-> "hello";
        System.out.println("ref "+supplier.get());

        // again refracter

        List<String> li = Arrays.asList("a","b","c");
        System.out.println( li.stream().findAny().orElseGet(supplier));

        //second way

        List<String>list = Arrays.asList();
        System.out.println(list.stream().findAny().orElseGet(()->"Hi "));


    }
}
