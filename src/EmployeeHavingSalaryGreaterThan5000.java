package src;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeHavingSalaryGreaterThan5000 {

    public List<String> getEmployeeSalary(){

        List<Employee> employeeList =
                Arrays.asList
                        (new Employee("Suresh",1,100000.10),
                                new Employee("Nikhil",2,26500.10),
                                new Employee("Vijay",3,582200.10),
                                new Employee("Neha",4,1052660.10));
        //System.out.println(employeeList);

        List<String> limit = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getEmployeeSalary).reversed())
                .map(Employee::getEmployeeName)
                .limit(3).toList();

        boolean employeeName = employeeList.stream()
                .map(Employee::getEmployeeSalary)
                .anyMatch(x->x>5000);
        System.out.println(employeeName);


        /*return Collections.singletonList
                (employeeList.stream()
                .filter(x -> x.getEmployeeSalary() > 50000)
                .map(Employee::getEmployeeName)
                .collect(Collectors.joining(",")));*/
        return limit;
    }

    public static void main(String[] args) {
        EmployeeHavingSalaryGreaterThan5000 evenNumbers = new EmployeeHavingSalaryGreaterThan5000();
        System.out.println(evenNumbers.getEmployeeSalary());


    }

}

