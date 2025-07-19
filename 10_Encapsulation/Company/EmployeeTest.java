package Company;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee("Latika", 24, 50000);
        emp.displayEmployeeDetails(); // Accessible within the same package
    }
}

