package org.example.streamapi.mapflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EKDatabase {
    public static List<Customer> getAllCustomers(){
       return Stream.of(
                new Customer(10,"john","john@gmail.com", Arrays.asList("9000918988","9888989877")),
                new Customer(10,"venu","venu@gmail.com", Arrays.asList("778787888","8878776665")),
                new Customer(10,"johncena","cena@gmail.com", Arrays.asList("555656563","8880989897")),
                new Customer(10,"john","john@gmail.com", Arrays.asList("999864443","8777465432"))
                ).collect(Collectors.toList());


    }
}
