package com.superthirty;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumSalaryDeptWiseQ17 {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDTO.getEmployees();
        Map<String, Double> sumMap =  employees.stream().collect(Collectors.groupingBy(
                Employee::getDepartment,Collectors.summingDouble(Employee::getSalary)));
        System.out.println(sumMap);
    }
}
