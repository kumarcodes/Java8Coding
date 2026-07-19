package com.superthirty;

import java.util.List;

public class TwoDistinctEmployeeNames {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDTO.getEmployees();
        List<String> distinctEmployeeNames = employees.stream().map(Employee::getName).distinct().toList();
        System.out.println(distinctEmployeeNames);
    }
}
