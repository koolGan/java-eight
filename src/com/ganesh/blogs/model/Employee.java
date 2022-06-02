package com.ganesh.blogs.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Employee {
    private Integer id;
    private String name;
    private double salary;
    private Gender gender;
    private List<Long> mobiles;


    public Employee(Integer id, String name, double salary, Gender gender, List<Long> mobiles) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.mobiles = mobiles;
    }

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<Long> getMobiles() {
        return mobiles;
    }

    public void setMobiles(List<Long> mobiles) {
        this.mobiles = mobiles;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                ", mobiles=" + mobiles +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.getSalary(), getSalary()) == 0 && getId().equals(employee.getId()) && getName().equals(employee.getName()) && getGender() == employee.getGender() && getMobiles().equals(employee.getMobiles());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSalary(), getGender(), getMobiles());
    }

    public static List<Employee> getAllEmployee() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", 55000.00, Gender.M, Arrays.asList(9876797761l, 9078131233l)));
        employees.add(new Employee(2, "Rohit", 95000.00, Gender.M, Arrays.asList(9879897761l, 9034131233l)));
        employees.add(new Employee(3, "Arjun", 65000.00, Gender.M, Arrays.asList(9870897761l, 90990131233l)));
        employees.add(new Employee(4, "Somil", 85000.00, Gender.M, Arrays.asList(9878997761l, 89867131233l)));
        employees.add(new Employee(5, "Asif", 59000.00, Gender.M, Arrays.asList(6734378123l, 2313134533l)));
        employees.add(new Employee(6, "Atib", 52000.00, Gender.M, Arrays.asList(9878897761l, 2313131233l)));
        employees.add(new Employee(7, "Shoeph", 45000.00, Gender.M, Arrays.asList(9878897761l, 2313131233l)));
        employees.add(new Employee(8, "Rani", 55500.00, Gender.F, Arrays.asList(9878897761l, 2313131233l)));
        employees.add(new Employee(9, "Rohan", 55800.00, Gender.M, Arrays.asList(9878897761l, 2313131233l)));
        employees.add(new Employee(10, "July", 59000.00, Gender.F, Arrays.asList(9878897900l, 6786713123l)));
        return employees;
    }
}

