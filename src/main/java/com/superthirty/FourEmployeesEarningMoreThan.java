package com.superthirty;

import java.util.List;

public class FourEmployeesEarningMoreThan {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDTO.getEmployees();
        List<String> empNames = employees.stream().filter(x -> x.getSalary() > 50000)
                .map(Employee::getName).toList();
        System.out.println(empNames);
    }
}
