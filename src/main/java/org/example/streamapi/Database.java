package org.example.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Database {

    public static List<Employee> getList(){
        List<Employee> emp = Arrays.asList(
                new Employee(1,"john","java",20000.00),
                new Employee(1,"cena","py",60000.00),
                new Employee(1,"ram","react",80000.00),
                new Employee(2,"cena","java",50000.00),
                new Employee(1,"mani","react",80000.00),
                new Employee(1,"sunny","react",70000.00));

        return emp;
    }
}
