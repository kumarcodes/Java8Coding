package com.java8;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployeeByDeptAvgSalary {
    public static void main(String[] args) {
        List<Employees> employees = List.of(
                new Employees(1, "Aarav", "Engineering", 85000),
                new Employees(2, "Diya", "Engineering", 95000),
                new Employees(3, "Kabir", "Engineering", 78000),
                new Employees(4, "Meera", "Sales", 60000),
                new Employees(5, "Rohan", "Sales", 65000),
                new Employees(6, "Sanya", "HR", 50000),
                new Employees(7, "Ishaan", "HR", 99000),
                new Employees(8, "Tara", "HR", 52000)
        );
        //1. Group employees by department and calculate the average/highest salary in each department.
        Map<String, Double> countMap = groupEmpDeptWiseAvgSalary(employees);
        //2. Print Employee name dept wise
        Map<String, List<String>> empMapDeptWise = printEmpNameDeptWise(employees);
        //3. Find the top 3 highest-paid employees in the organization.
        List<Employees> empList = employees.stream()
                .sorted(Comparator.comparingDouble(Employees::getSalary).reversed()).limit(3).collect(Collectors.toList());
        System.out.println(empList);

    }

    private static Map<String, Double> groupEmpDeptWiseAvgSalary(List<Employees> employees) {
        Map<String, Double> map = employees.stream().collect(Collectors.groupingBy(Employees::getDepartment,
                Collectors.averagingDouble(Employees::getSalary)));
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "-> " + entry.getValue());
        }
        return map;
    }

    private static Map<String, List<String>> printEmpNameDeptWise(List<Employees> employees) {

        Map<String, List<String>> empMapDeptWise = employees.stream().collect(Collectors.groupingBy
                (Employees::getDepartment, Collectors.mapping(Employees::getName, Collectors.toList())));
        for (Map.Entry<String, List<String>> entry : empMapDeptWise.entrySet()) {
            System.out.println(entry.getKey() + "-> " + entry.getValue());
        }
        return empMapDeptWise;
    }
}
