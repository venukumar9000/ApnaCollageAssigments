package org.example.streamapi.mapflatmap;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapVsFlatmap {

    public static void main(String[] args) {
        List<Customer> customerList=EKDatabase.getAllCustomers();
        //using map
         List<String> collect = customerList.stream().map(Customer::getEmail).collect(Collectors.toList());
        System.out.println(collect);
       //using flatmap
       customerList.stream().flatMap(customer -> customer.getPhoneNo().stream()).forEach(System.out::println);


    }
}
