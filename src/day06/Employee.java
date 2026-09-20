package day06;

public class Employee {
    static String company = "ABC";

    String name;
    int employeeId;
    double salary;

    Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }

    static void displayCompany() {
        System.out.println("Company: " + company);
    }
}
