package com.java8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class CustomListToMap {
    public static void main(String[] args) {
        List<Employee> employeeList = ConvertSingleString.setEmployeeFields();
        Map<String, List<Employee>> countMap = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDept));
        countMap.forEach((k, v) ->
        {
            System.out.println(k + " " + v);
        });

        //If we want to print just the name department wise
        Map<String, List<String>> nameMap = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDept, Collectors.mapping(Employee::getName, Collectors.toList())));
        nameMap.forEach((k, v) ->
                System.out.println(k + " " + v)
        );

    }
}
