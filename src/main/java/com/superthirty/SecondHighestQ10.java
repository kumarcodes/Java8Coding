package com.superthirty;

import java.util.Comparator;
import java.util.List;

public class SecondHighestQ10 {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDTO.getEmployees();
        employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary)
                .reversed()).skip(1).findFirst().ifPresent(System.out::println);
    }
}
