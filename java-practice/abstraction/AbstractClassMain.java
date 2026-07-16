package abstraction;

abstract class Employee {

    protected int employeeId;
    protected String name;

    Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    // Normal Method
    public void login() {
        System.out.println(name + " logged in.");
    }

    // Normal Method
    public void logout() {
        System.out.println(name + " logged out.");
    }

    // Abstract Method
    public abstract double calculateSalary();

    // Normal Method
    public void displayDetails() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name        : " + name);
    }
}
class FullTimeEmployee extends Employee {

    private final double monthlySalary;

    FullTimeEmployee(int id, String name, double salary) {
        super(id, name);
        this.monthlySalary = salary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
class PartTimeEmployee extends Employee {

    private final int hoursWorked;
    private final double hourlyRate;

    PartTimeEmployee(int id, String name, int hoursWorked, double hourlyRate) {
        super(id, name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
public class AbstractClassMain {

    public static void main(String[] args) {

        Employee emp1 = new FullTimeEmployee(
                101,
                "Sidharth",
                60000);

        Employee emp2 = new PartTimeEmployee(
                102,
                "Rahul",
                120,
                250);

        emp1.displayDetails();
        emp1.login();
        System.out.println("Salary : " + emp1.calculateSalary());
        emp1.logout();

        System.out.println();

        emp2.displayDetails();
        emp2.login();
        System.out.println("Salary : " + emp2.calculateSalary());
        emp2.logout();
    }
}