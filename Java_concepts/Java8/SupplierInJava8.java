package Java8;

import java.util.function.Supplier;

/*
Supplier<T>

Purpose:
- Takes no input.
- Supplies (returns) an object.

Functional Method:
T get()

Common Uses:
- Lazy Object Creation
- Default Values
- Configuration
- Random Value Generation
- Factory Methods
*/

public class SupplierInJava8 {

    public static void main(String[] args) {

        // Supplier 1 -> Create Employee
        Supplier<Employee> employeeSupplier = () ->
                new Employee(101, "Ayush", 70000);

        // Step 1 : Create Employee
        Employee employee = employeeSupplier.get();

        // Step 2 : Print Employee
        System.out.println("Employee Created");
        System.out.println(employee);

        // Supplier 2 -> Generate Employee ID
        Supplier<Integer> employeeIdSupplier = () -> 102;

        System.out.println("\nGenerated Employee Id : "
                + employeeIdSupplier.get());

        // Supplier 3 -> Generate Department
        Supplier<String> departmentSupplier = () -> "Backend Development";

        System.out.println("Department : "
                + departmentSupplier.get());

        // Supplier 4 -> Generate Joining Bonus
        Supplier<Double> bonusSupplier = () -> 10000.0;

        System.out.println("Joining Bonus : ₹"
                + bonusSupplier.get());

        // Supplier 5 -> Generate Welcome Message
        Supplier<String> welcomeSupplier = () ->
                "Welcome " + employee.getName() + " to the company.";

        System.out.println(welcomeSupplier.get());

        System.out.println("\n----------- Passing Supplier to Method -----------");

        process(employeeSupplier);

        System.out.println("\n----------- Callback Example -----------");

        execute(welcomeSupplier);
    }

    // Method accepting Supplier
    static void process(Supplier<Employee> supplier) {

        Employee employee = supplier.get();

        System.out.println("Employee received from Supplier");
        System.out.println(employee);
    }

    // Callback Example
    static void execute(Supplier<String> supplier) {

        System.out.println("Executing Task...");
        System.out.println(supplier.get());
    }
}