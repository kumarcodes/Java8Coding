package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertSingleString {
    public static void main(String[] args) {

        List<Employee> employeeList=setEmployeeFields();

        String result = employeeList.stream().map(x -> x.getName().toUpperCase())
                .collect(Collectors.joining(" | "));
        System.out.println(result);
    }

    static List<Employee> setEmployeeFields() {
        Employee employee1 = new Employee(1L, "Rohit", "rohit@gmail.com", "IT");
        Employee employee2 = new Employee(2L, "Rahul", "rahul@gmail.com", "IT");
        Employee employee3 = new Employee(3L, "Ankit", "ankit@gmail.com", "IT");
        Employee employee4 = new Employee(4L, "Suman", "suman@yahoo.com", "HR");
        Employee employee5 = new Employee(5L, "Anand", "anand@yahoo.com", "HR");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        return employeeList;
    }
}
