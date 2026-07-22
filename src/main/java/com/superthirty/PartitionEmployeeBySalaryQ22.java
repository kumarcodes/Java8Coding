package com.superthirty;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEmployeeBySalaryQ22 {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDTO.getEmployees();
        //Approach 1 full employee
        employees.stream().collect(Collectors
                .partitioningBy(x -> x.getSalary() > 50000)).entrySet().forEach(System.out::println);
        //Approach 2 only employee names
        Map<Boolean, List<String>> map = employees.stream().collect(Collectors
                .partitioningBy(x -> x.getSalary() > 50000, Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(map);


    }
}
