package test;

import model.*;
import java.time.LocalDate;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("=== Testing Employee Management System ===");

        // 1. Create Department
        Department devDept = new Department(101, "Software Engineering");

        // 2. Create Employees
        Employee emp1 = new MonthlyEmployee(
            1, "Habiba Ezat", Gender.FEMALE, LocalDate.of(2023, 1, 15),
            12000.0, 1500.0, 500.0
        );

        Employee emp2 = new HourlyEmployee(
            2, "Ahmed Ali", Gender.MALE, LocalDate.of(2023, 5, 20),
            150.0, 160.0
        );

        Employee emp3 = new CommissionEmployee(
            3, "Sara Mohamed", Gender.FEMALE, LocalDate.of(2024, 2, 10),
            5000.0, 0.05, 100000.0
        );

        // 3. Add Employees to Department
        devDept.addEmployee(emp1);
        devDept.addEmployee(emp2);
        devDept.addEmployee(emp3);

        // 4. Print Department & Employee Details
        System.out.println("\n--- Department Info ---");
        System.out.println(devDept);

        System.out.println("\n--- Employee Salaries ---");
        for (Employee emp : devDept.getEmployees()) {
            System.out.println(emp.getName() + " (" + emp.getClass().getSimpleName() + "): $" + emp.calculateSalary());
        }

        System.out.println("\n-------------------------------------------");
        System.out.println("Total Department Salary: $" + devDept.calculateTotalSalary());
        System.out.println("===========================================");
    }
}