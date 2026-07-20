package com.superthirty;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class AverageSalaryQ12 {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDTO.getEmployees();
        //Approach 1
        Double average = employees.stream().map(Employee::getSalary).collect(Collectors.averagingDouble(x -> x));
        System.out.println(average);
        //Approach 2
        OptionalDouble result = employees.stream().mapToDouble(Employee::getSalary).average();
        System.out.println(result);
    }
}
