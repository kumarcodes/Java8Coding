package com.superthirty;

import java.util.Comparator;
import java.util.List;

public class TopThreeSalaryQ11 {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDTO.getEmployees();
        employees.stream().map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder()).limit(3)
                .forEach(System.out::println);
    }
}
