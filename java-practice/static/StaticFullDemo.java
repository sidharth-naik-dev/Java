class Employee {

    // Static Variables
    static String companyName = "Red-Raven Technologies";
    static int employeeCount = 0;

    // Instance Variables
    int employeeId;
    String employeeName;
    double salary;

    // Static Block
    static {
        System.out.println("----------- COMPANY INITIALIZATION -----------");
        System.out.println("Loading Employee class...");
        System.out.println("Company Name : " + companyName);
        System.out.println("-----------------------------------------------");
    }

    // Constructor
    Employee(int id, String name, double salary) {
        employeeId = id;
        employeeName = name;
        this.salary = salary;

        employeeCount++;

        System.out.println(employeeName + " object created.");
    }

    // Instance Method
    void displayEmployee() {
        System.out.println("\nEmployee Details");
        System.out.println("--------------------------");
        System.out.println("ID      : " + employeeId);
        System.out.println("Name    : " + employeeName);
        System.out.println("Salary  : " + salary);
        System.out.println("Company : " + companyName);
    }

    // Static Method
    static void displayCompanyInfo() {
        System.out.println("\nCompany Information");
        System.out.println("--------------------------");
        System.out.println("Company Name : " + companyName);
        System.out.println("Employees    : " + employeeCount);

        // Instead create an object if instance data is needed
        Employee temp = new Employee(999, "Temporary Employee", 0);

        System.out.println("\nAccessing instance variable through object");
        System.out.println("Employee Name : " + temp.employeeName);
    }

    // Static Method
    static void changeCompanyName(String newCompany) {
        companyName = newCompany;
    }

    // Instance Method
    void incrementSalary(double amount) {
        salary += amount;
    }
}

public class StaticFullDemo {
    public static void main(String[] args) {
        System.out.println("\nProgram Started\n");

        Employee.displayCompanyInfo();

        Employee e1 = new Employee(101, "Alice", 50000);
        Employee e2 = new Employee(102, "Bob", 60000);

        e1.displayEmployee();
        e2.displayEmployee();

        System.out.println("\nChanging company name...\n");

        Employee.changeCompanyName("NextGen Solutions");

        e1.displayEmployee();
        e2.displayEmployee();
        System.out.println("\nIncreasing Bob's salary...\n");

        e2.incrementSalary(5000);
        e2.displayEmployee();

        System.out.println("\nFinal Employee Count : " + Employee.employeeCount);
    }
}