package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Boss extends Employee{
    private List<Employee> employeeList = new ArrayList<>();

    public Boss(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    void removeEmployee(Employee employee) {
        employeeList.remove(employee);

    }

    @Override
    void printEmployee() {
        System.out.println("--------------");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Salary: " + this.salary);
        for (Employee employee : employeeList) {
            employee.printEmployee();
        }
    }
}
