package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;



public class DomainOccourenceCount {
    public static void main(String[] args) {
        List<Employee> employeeList = ConvertSingleString.setEmployeeFields();
        Map<String, Long> countMap = employeeList.stream()
                .map(x -> x.getEmailId().substring(x.getEmailId().indexOf("@")))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(countMap);
    }
}
