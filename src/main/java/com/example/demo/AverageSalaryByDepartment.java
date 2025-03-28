package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    int empId, salary;
    String empName, empDepartment;

    public int getEmpId() {
        return empId;
    }

    public int getSalary() {
        return salary;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpDepartment() {
        return empDepartment;
    }

    public Employee(int empId, int salary, String empName, String empDepartment) {
        this.empId = empId;
        this.salary = salary;
        this.empName = empName;
        this.empDepartment = empDepartment;
    }
}
public class AverageSalaryByDepartment {
    public static void main(String[] args) {
        Employee emp1 =  new Employee(1, 84618, "Steve Johnson", "MEC");
        Employee emp2 =  new  Employee(2, 119102, "Jane Miller", "MEC");
        Employee emp3 =new  Employee(3, 78978, "Bob Williams", "CIVIL");
        Employee emp4 = new  Employee(4, 98200, "Mary Brown", "CIVIL");
        Employee emp5 = new Employee(5, 79886, "John Johnson", "CIVIL");
        Employee emp6 = new  Employee(6, 103597, "Steve Garcia", "CIVIL");
        Employee emp7 =new  Employee(7, 54419, "Lisa Smith", "ECE");
        Employee emp8 = new  Employee(8, 117400, "Steve Williams", "MEC");
        Employee emp9 = new Employee(9, 84101, "Eve Doe", "CIVIL");
        Employee emp10 = new Employee(10, 33644, "Paul Brown", "MEC");
        Employee emp11 = new Employee(11, 56329, "Mark Doe", "CSE");
        Employee emp12 = new Employee(12, 84177, "Steve Johnson", "ECE");
        Employee emp13 = new Employee(13, 115134, "John Doe", "ECE");
        Employee emp14 = new Employee(14, 36142, "Steve Brown", "MEC");
        Employee emp15 = new Employee(15, 101309, "Mary Williams", "MEC");
        Employee emp16 =  new Employee(16, 41904, "Lisa Johnson", "ECE");
        Employee emp17 = new Employee(17, 40242, "Mary Brown", "CIVIL");
        Employee emp18 = new  Employee(18, 108863, "Eve Williams", "CSE");
        Employee emp19 = new  Employee(19, 88105, "John Martinez", "CSE");
        Employee emp20 = new Employee(20, 99014, "Alice Martinez", "CSE");
        Employee emp21 = new Employee(21, 52769, "Lisa Johnson", "CIVIL");
        Employee emp22 = new Employee(22, 74997, "Lisa Miller", "MEC");
        Employee emp23 =  new Employee(23, 55954, "Paul Martinez", "MEC");
        Employee emp24 = new Employee(24, 74888, "Mary Garcia", "ECE");
        Employee emp25 = new Employee(25, 90507, "Jane Martinez", "CIVIL");
        Employee emp26 = new Employee(26, 36625, "Paul Johnson", "ECE");
        Employee emp27 = new Employee(27, 89112, "Steve Jones", "CIVIL");
        Employee emp28 =  new Employee(28, 110632, "Lisa Smith", "ECE");
        Employee emp29 = new Employee(29, 42832, "Mary Johnson", "CIVIL");
        Employee emp30 = new Employee(30, 113529, "Mark Brown", "ECE");

        List<Employee> employeeList = Arrays.asList(
                emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10,
                emp11, emp12, emp13, emp14, emp15, emp16, emp17, emp18, emp19, emp20,
                emp21, emp22, emp23, emp24, emp25, emp26, emp27, emp28, emp29, emp30
        );
        Map<String, Double> avgSalaryAccToDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getEmpDepartment,
                Collectors.averagingInt(Employee::getSalary)));

        System.out.println("Average salary is: " + avgSalaryAccToDept);
        Map<String, List<Employee>> temp = employeeList.stream().collect(Collectors.groupingBy(Employee::getEmpDepartment));

    }

}
