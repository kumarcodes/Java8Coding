package com.superthirty;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * Question: Given a list of employees, produce a Map<String, String> where each
 * key is a department and the value is a formatted summary: count, avg salary, top earner.
 *
 * Learnings:
 * - Dropping the custom DTO means the downstream collector's job is to go straight
 *   from List<Employee> to a String, via collectingAndThen(toList(), formatter).
 * - Keeps the pipeline shorter, but loses type safety — if this map were consumed
 *   elsewhere (not just printed), a DTO would usually be worth bringing back.
 *
 * LeetCode-style tags: Streams, Collectors.groupingBy, Collectors.collectingAndThen
 */
public class DepartmentSalaryReport {

    public static void main(String[] args) {
        List<Employee> employees = EmployeeDTO.getEmployees();

        Map<String, String> report = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(Collectors.toList(), DepartmentSalaryReport::summarize)
                ));

        report.forEach((dept, summary) -> System.out.println(dept + " -> " + summary));
    }

    private static String summarize(List<Employee> deptEmployees) {
        int count = deptEmployees.size();
        double avg = deptEmployees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
        String topEarner = deptEmployees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .map(Employee::getName)
                .orElse("N/A");

        return String.format("count=%d, avgSalary=%.2f, topEarner=%s", count, avg, topEarner);
    }
}