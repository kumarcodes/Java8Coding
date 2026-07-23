
package com.superthirty;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SalaryHistogram {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDTO.getEmployees();
        //Naive Approach
        List<Double> empListUnder30K = employees.stream().map(Employee::getSalary).filter(x -> x < 30000).toList();
        List<Double> empListBW30KAnd60K = employees.stream().map(Employee::getSalary)
                .filter(x -> x > 30000 && x < 60000).toList();
        List<Double> empListMoreThan60K = employees.stream().map(Employee::getSalary)
                .filter(x -> x > 60000).toList();
        System.out.println(empListUnder30K);
        System.out.println(empListBW30KAnd60K);
        System.out.println(empListMoreThan60K);
        //Pro Approach
        Map<String, List<Double>> histogram = employees.stream().map(Employee::getSalary).collect(Collectors.groupingBy(
                salary -> {
                    if (salary < 30000)
                        return "Under 30K";
                    if (salary >= 30000 && salary < 60000)
                        return "Between 30K and 60K";
                    return "More than or Equal to 60K";

                }));
        System.out.println(histogram);
    }
}
