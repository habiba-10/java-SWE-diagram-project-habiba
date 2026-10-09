package model;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private int id;
    private String name;
    private List<Employee> employees;

    // Constructor
    public Department(int id, String name) {
        this.id = id;
        this.name = name;
        this.employees = new ArrayList<>();
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    // Department Methods
    public void addEmployee(Employee employee) {
        if (employee != null && !employees.contains(employee)) {
            employees.add(employee);
            employee.setDepartment(this);
        }
    }

    public void removeEmployee(Employee employee) {
        if (employees.remove(employee)) {
            employee.setDepartment(null);
        }
    }

    public double calculateTotalSalary() {
        double total = 0.0;
        for (Employee emp : employees) {
            total += emp.calculateSalary();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numberOfEmployees=" + employees.size() +
                '}';
    }
}