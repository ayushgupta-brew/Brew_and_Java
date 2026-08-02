package Java8;

import java.util.function.Consumer;

/*
Consumer<T>

Purpose:
- Accepts one input.
- Performs an operation.
- Returns nothing.

Functional Method:
void accept(T t)

Default Method:
Consumer<T> andThen(Consumer<? super T> after)
*/

public class ConsumerInJava8 {

    public static void main(String[] args) {

        // Employee Object
        Employee employee = new Employee(101, "Ayush", 70000);

        // Consumer 1 -> Print Employee Details
        Consumer<Employee> printEmployee = emp -> {
            System.out.println("Employee Details");
            System.out.println("Id : " + emp.getId());
            System.out.println("Name : " + emp.getName());
            System.out.println("Salary : " + emp.getSalary());
            System.out.println();
        };

        // Consumer 2 -> Increase Salary
        Consumer<Employee> incrementSalary = emp -> {
            emp.setSalary(emp.getSalary() + 5000);
            System.out.println("Salary Incremented");
        };

        // Consumer 3 -> Calculate Bonus
        Consumer<Employee> calculateBonus = emp -> {
            double bonus = emp.getSalary() * 0.10;
            System.out.println("Bonus : " + bonus);
        };

        // Consumer 4 -> Send Notification
        Consumer<Employee> sendNotification = emp ->
                System.out.println("Notification sent to " + emp.getName());

        // Consumer 5 -> Save Employee
        Consumer<Employee> saveEmployee = emp ->
                System.out.println("Employee saved to database.");



        // Step 1
        printEmployee.accept(employee);

        // Step 2
        incrementSalary.accept(employee);

        // Step 3
        printEmployee.accept(employee);

        // Step 4
        calculateBonus.accept(employee);

        // Step 5
        sendNotification.accept(employee);

        // Step 6
        saveEmployee.accept(employee);



        System.out.println("\n----------- Using andThen() -----------");

        Consumer<Employee> employeeWorkflow =
                printEmployee
                        .andThen(incrementSalary)
                        .andThen(printEmployee)
                        .andThen(calculateBonus)
                        .andThen(sendNotification)
                        .andThen(saveEmployee);

        employeeWorkflow.accept(employee);

        System.out.println("\n----------- Passing Consumer to Method -----------");

        process(employee, printEmployee);

        System.out.println("\n----------- Callback Example -----------");

        execute(employee, sendNotification);
    }

    // Method accepting Consumer
    static void process(Employee employee, Consumer<Employee> consumer) {
        consumer.accept(employee);
    }

    // Callback Example
    static void execute(Employee employee, Consumer<Employee> consumer) {
        System.out.println("Executing Task...");
        consumer.accept(employee);
    }
}