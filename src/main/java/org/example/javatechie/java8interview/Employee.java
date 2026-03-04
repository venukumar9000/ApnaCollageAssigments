package org.example.javatechie.java8interview;


import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Employee {

    private Integer id;

    private String name;

    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    public static void main(String[] args) {


        List<Employee> employees = List.of(
                new Employee(1, "Alice Johnson", "alice.johnson@example.com"),
                new Employee(2, "Bob Smith", "bob.smith@example.com"),
                new Employee(3, "Charlie Brown", "charlie.brown@example.com"),
                new Employee(4, "Diana Prince", "diana.prince@example.com"),
                new Employee(5, "Ethan Hunt", "ethan.hunt@example.com"),
                new Employee(1, "Fiona Adams", "fiona.adams@example.com"),
                new Employee(1, "George Parker", "george.parker@example.com"),
                new Employee(8, "Hannah Lee", "hannah.lee@example.com"),
                new Employee(9, "Ian Wright", "ian.wright@example.com"),
                new Employee(10, "Julia Roberts", "julia.roberts@example.com")
        );


        final Set<Employee> collect = employees.stream().collect(Collectors.toSet());

        System.out.println(collect);
    }
}
