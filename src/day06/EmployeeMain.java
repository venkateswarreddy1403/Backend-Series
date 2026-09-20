package day06;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee  employee1 = new Employee("Venky", 101, 2000000);
        Employee  employee2 = new Employee("Rahul", 103, 1200000);

        employee1.displayEmployee();
        employee2.displayEmployee();

        Employee.displayCompany();

        Employee.company = "XYZ";
        Employee.displayCompany();

        System.out.println(MathUtils.square(12));;

    }
}
