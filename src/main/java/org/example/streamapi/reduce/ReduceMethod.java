package org.example.streamapi.reduce;

import org.example.streamapi.mapflatmap.Customer;
import org.example.streamapi.mapflatmap.EKDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class ReduceMethod {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(1,2,3,4,5);

        //find sum
       Integer sum = li.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);

        //find max
        Integer max=li.stream().reduce((a,b)->a>b?a:b).orElseGet(()->0);
        System.out.println(max);
        //find avg
        Integer avg = (int) li.stream().mapToInt(i->i).average().orElseGet(()->0);
        System.out.println(avg);

        List<Customer> customer= EKDatabase.getAllCustomers();
         OptionalDouble average = customer.stream().
                filter(i -> i.getEmail().equalsIgnoreCase("john@gmail.com"))
                .flatMap(i -> i.getPhoneNo().stream())
                .mapToDouble(String::length)
                .average();

        System.out.println(average.getAsDouble());

    }
}
