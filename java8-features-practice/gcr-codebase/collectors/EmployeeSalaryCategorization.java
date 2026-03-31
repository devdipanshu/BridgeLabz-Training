import java.util.*;
import java.util.stream.*;

class Employee{
    String department;
    double salary;
    Employee(String department,double salary){
        this.department=department;
        this.salary=salary;
    }
}

public class EmployeeSalaryCategorization{
    public static void main(String[] args){
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee("IT",50000));
        employees.add(new Employee("IT",70000));
        employees.add(new Employee("HR",40000));
        employees.add(new Employee("HR",60000));

        Map<String,Double> avgSalaryByDept=
            employees.stream()
            .collect(Collectors.groupingBy(
                e->e.department,
                Collectors.averagingDouble(e->e.salary)
            ));

        System.out.println(avgSalaryByDept);
    }
}
