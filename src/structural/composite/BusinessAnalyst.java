package structural.composite;

public class BusinessAnalyst extends Employee{

    public BusinessAnalyst(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    void addEmployee(Employee employee) {

    }

    @Override
    void removeEmployee(Employee employee) {

    }

    @Override
    void printEmployee() {
        System.out.println("--------------");
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Salary: " + this.salary);
    }
}
