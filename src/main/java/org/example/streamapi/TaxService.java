package org.example.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaxService {
    public List<Employee> taxPayers(String input){
        if(input.equalsIgnoreCase("tax")){
            List<Employee> employeeList =Database.getList().stream().filter(i->i.getSalary()>50000).collect(Collectors.toList());
            return employeeList;
        }else {
            List<Employee> employeeList =Database.getList().stream().filter(i->i.getSalary()<=50000).collect(Collectors.toList());
            return employeeList;
        }

    }

    public static void main(String[] args) {
        TaxService t = new TaxService();
        System.out.println(t.taxPayers("taxk"));

    }
}
