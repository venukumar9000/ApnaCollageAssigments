package org.example.latest_interview_preparation.javastreams;

public class Employee {
    private Long id;
    private String name;
    private Double salary;

    private Long age;

    private String dept;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Employee() {
    }

    public Employee(Long id, String name, Double salary, Long age, String dept) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", dept='" + dept + '\'' +
                '}';
    }
}
