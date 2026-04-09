package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;



public class DomainOccourenceCount {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1l, "Rohit", "rohit@gmail.com", "IT");
        Employee employee2 = new Employee(2l, "Rahul", "rahul@gmail.com", "IT");
        Employee employee3 = new Employee(3l, "Ankit", "ankit@gmail.com", "IT");
        Employee employee4 = new Employee(4l, "Suman", "suman@yahoo.com", "HR");
        Employee employee5 = new Employee(5l, "Anand", "anand@yahoo.com", "HR");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        Map<String, Long> countMap = employeeList.stream()
                .map(x -> x.getEmailId().substring(x.getEmailId().indexOf("@")))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(countMap);
    }
}
