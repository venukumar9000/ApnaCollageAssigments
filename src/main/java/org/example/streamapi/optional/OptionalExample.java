package org.example.streamapi.optional;

import org.example.streamapi.mapflatmap.Customer;
import org.example.streamapi.mapflatmap.EKDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Customer customer= new Customer(10,"john","abd@gmail.com", Arrays.asList("9999090900","9888776655"));
        //empty
        //of
        //ofNullable
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

//         Optional<String> email = Optional.of(customer.getEmail());
//        System.out.println(email);

         Optional<String> email = Optional.ofNullable(customer.getEmail());
//        System.out.println(email);
//        if(email.isPresent()){
//            System.out.println(email);
//        }
//        System.out.println(email.orElse("deault@gmail.com"));
//        System.out.println(email.orElseThrow(()->new IllegalArgumentException("email is not found")));

        System.out.println(email.map(String::toUpperCase).orElseGet(()->"default email"));
        System.out.println(getALL("venu@gmail.com"));


    }
    public static Customer getALL(String email){
         List<Customer> allCustomers = EKDatabase.getAllCustomers();
         Customer customer = allCustomers.stream().filter(i -> i.getEmail().equalsIgnoreCase(email)).findAny().orElseThrow(()->new IllegalArgumentException("email not found"));
        return customer;
    }
    public static Customer getCustByEmail(String email){
        List<Customer> allCustomers = EKDatabase.getAllCustomers();
        return allCustomers.stream().filter(i -> i.getEmail().equalsIgnoreCase(email)).findAny().orElseThrow(()->new IllegalArgumentException("email not found"));

    }
}
