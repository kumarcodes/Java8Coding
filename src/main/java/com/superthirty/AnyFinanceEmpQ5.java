package com.superthirty;

import java.util.List;

public class AnyFinanceEmpQ5 {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDTO.getEmployees();
        boolean isFinanceEmpThere = employees.stream()
                .anyMatch(x -> x.getDepartment().equals("Finance"));
        List<String> empList = employees.stream().filter(x -> x.getDepartment().equals("Finance"))
                .map(Employee::getName).toList();
        System.out.println(empList);
        System.out.println(isFinanceEmpThere);

    }
}
