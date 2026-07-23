package com.superthirty;

import java.util.Comparator;
import java.util.List;

public class ThirdHighestSalaryQ26 {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDTO.getEmployees();
        employees.stream().map(Employee::getSalary).distinct()
                .sorted(Comparator.reverseOrder()).skip(2).findFirst().ifPresent(System.out::println);

    }
}
