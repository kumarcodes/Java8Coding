package com.superthirty;

import java.util.List;

public class TotalSumQ13 {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDTO.getEmployees();
        Double result= employees.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println(result);
    }
}
