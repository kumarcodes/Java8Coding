package com.superthirty;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LowestPaidEmployeeQ9 {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDTO.getEmployees();
        Optional<Employee> emp = employees.stream().min(Comparator.comparingDouble(Employee::getSalary));
        emp.ifPresent(x -> System.out.println(x.getName()));
        System.out.println(Arrays.toString(emp.stream().toArray()));
    }
}
