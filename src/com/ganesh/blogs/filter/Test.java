package com.ganesh.blogs.filter;

import com.ganesh.blogs.model.Employee;
import com.ganesh.blogs.model.Gender;

public class Test {


    public static void main(String[] args) {
      //  Employee.getAllEmployee().stream().filter(e -> e.getSalary() > 80000).forEach(System.out::println);

        Employee.getAllEmployee().stream().filter(e -> e.getGender() == Gender.F).forEach(System.out::println);


    }
}
