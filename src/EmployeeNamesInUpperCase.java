package src;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class EmployeeNamesInUpperCase {

    public List<String> getEmployeeSalary(){

        List<Employee> employeeList =
                Arrays.asList
                        (new Employee("Suresh",1,100000.10),
                                new Employee("Nikhil",2,26500.10),
                                new Employee("Vijay",3,582200.10),
                                new Employee("Neha",4,1052660.10));
        System.out.println(employeeList);

        return employeeList.stream()
                .map(Employee::getEmployeeName)
                .map(String::toUpperCase)
                .toList();
    }

    public static void main(String[] args) {
        EmployeeNamesInUpperCase evenNumbers = new EmployeeNamesInUpperCase();
        System.out.println(evenNumbers.getEmployeeSalary());


    }

}

