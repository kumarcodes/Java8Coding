package com.topfifty;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupDepartmentBy {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "Engineering"),
                new Employee(2, "Bob", "Sales"),
                new Employee(3, "Charlie", "Engineering"),   // same department as Alice
                new Employee(4, "David", "Sales"),           // same department as Bob
                new Employee(5, "Eve", "HR")
        );
        groupEmployeesByDepartment(employees);
        cleanLogicgroupEmployeesByDepartment(employees);
    }

    private static void groupEmployeesByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> empMap = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        for (Map.Entry<String, List<Employee>> entry : empMap.entrySet()) {
            System.out.println(entry.getKey());
            List<String> name = entry.getValue().stream().map(Employee::getName).toList();
            System.out.println(name);
        }
    }

    private static void cleanLogicgroupEmployeesByDepartment(List<Employee> employees) {
            employees.stream().collect(Collectors.groupingBy(Employee::getDepartment))
                    .forEach((dept,name)->{
                        System.out.println(dept);
                        System.out.println(name.stream().map(x->x.getName()).toList());
                    });
    }
}
