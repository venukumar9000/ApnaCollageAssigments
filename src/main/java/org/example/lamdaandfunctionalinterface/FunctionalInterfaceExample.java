package org.example.lamdaandfunctionalinterface;

import org.example.streamapi.Database;
import org.example.streamapi.Employee;

import java.util.Comparator;
import java.util.List;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Calculator calculator  = ()->{
            List<Employee> employeeList=Database.getList();

            employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::println);
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
            System.out.println("Total employeeList :"+employeeList.size());
            System.out.println("Before soring");
            for(Employee emp:employeeList){
                System.out.println(emp.getName()+"_"+emp.getSalary());
            }
            System.out.println("after sorting");
            employeeList.sort((new MyComparator()));
            for(Employee employee:employeeList){
                System.out.println(employee.getName()+"___"+employee.getSalary());
            }
            employeeList.sort(new SalaryComparator());
            System.out.println("Sarelryijk=------");
            for(Employee employee:employeeList){
                System.out.println(employee.getName()+"___"+employee.getSalary());
            }
            System.out.println("SOty by name and sal");
            employeeList.sort(Comparator.comparing(Employee::getName)
                    .thenComparingDouble(Employee::getSalary));
            for(Employee employee:employeeList){
                System.out.println(employee.getDept()+"__"+employee.getName()+"___"+employee.getSalary());
            }

        };
         calculator.mi();


    }
}
//functional interface
interface Calculator{
    void mi();

}
class  MyComparator implements Comparator<Employee> {


    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getName().length(),o2.getName().length());
    }
}
class SalaryComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o2.getSalary(),o1.getSalary());
    }
}





