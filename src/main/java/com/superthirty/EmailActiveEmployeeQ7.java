package com.superthirty;

import java.util.List;

public class EmailActiveEmployeeQ7 {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDTO.getEmployees();
        employees.stream().filter(x -> x.isActive()).map(Employee::getName).forEach(System.out::println);
    }
}
