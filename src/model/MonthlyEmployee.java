package model;

import java.time.LocalDate;

public class MonthlyEmployee extends Employee {
    private double monthlySalary;
    private double bonus;
    private double deductions;

    // Constructor
    public MonthlyEmployee(int id, String name, Gender gender, LocalDate hireDate,
                           double monthlySalary, double bonus, double deductions) {
        super(id, name, gender, hireDate);
        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
        this.deductions = deductions;
    }

    // Getters and Setters
    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getDeductions() {
        return deductions;
    }

    public void setDeductions(double deductions) {
        this.deductions = deductions;
    }

    // Overridden calculateSalary method
    @Override
    public double calculateSalary() {
        return monthlySalary + bonus - deductions;
    }

    // toString method
    @Override
    public String toString() {
        return "MonthlyEmployee{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", hireDate=" + getHireDate() +
                ", monthlySalary=" + monthlySalary +
                ", bonus=" + bonus +
                ", deductions=" + deductions +
                '}';
    }
}