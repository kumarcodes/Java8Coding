package com.superthirty;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class OneEmployeeNames {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDTO.getEmployees();
        List<String> empNames = employees.stream().map(Employee::getName).toList();
        System.out.println(empNames);
    }
}
