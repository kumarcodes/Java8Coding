package com.superthirty;

import java.util.List;

public class IncrementSalaryQ25 {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDTO.getEmployees();
        List<Employee> list = employees.stream().map(x ->
                new Employee(x.getId(), x.getName(), x.getDepartment(),
                        x.getSalary() * 1.10, x.isActive(), x.getEmail())).toList();
        list.forEach(x -> System.out.println(x.getName() + " " + x.getSalary()));
    }
}
