package com.aiinterview;

import java.util.*;
import java.util.stream.Collectors;

public class DeptCount {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Rohit", "IT", 50000),
                new Employee("Amit", "HR", 40000),
                new Employee("Priya", "IT", 70000),
                new Employee("Neha", "Finance", 60000),
                new Employee("Raj", "IT", 90000),
                new Employee("Karan", "HR", 55000)
        );
        //Question 1: Employee Department Count
        Map<String, Long> deptCount = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        for (Map.Entry<String, Long> entryMap : deptCount.entrySet()) {
            System.out.println(entryMap.getKey() + " ->" + entryMap.getValue());
        }
        //Question 2: Employee with Highest Salary in Each Department
        Map<String, Optional<Employee>> countMap = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));

        for (Map.Entry<String, Optional<Employee>> entry : countMap.entrySet()) {
            System.out.print(entry.getKey() + "= ");
            if (entry.getValue().isPresent()) {
                System.out.println(entry.getValue().get().getName());
            }
        }
    }
}
