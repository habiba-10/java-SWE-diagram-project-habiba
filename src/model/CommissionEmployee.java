package model;

import java.time.LocalDate;

public class CommissionEmployee extends Employee {
    private double baseSalary;
    private double commissionRate;
    private double salesAmount;

    // Constructor
    public CommissionEmployee(int id, String name, Gender gender, LocalDate hireDate,
                              double baseSalary, double commissionRate, double salesAmount) {
        super(id, name, gender, hireDate);
        this.baseSalary = baseSalary;
        this.commissionRate = commissionRate;
        this.salesAmount = salesAmount;
    }

    // Getters and Setters
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }

    // Additional Method according to diagram
    public double calculateCommission() {
        return salesAmount * commissionRate;
    }

    // Overridden calculateSalary method
    @Override
    public double calculateSalary() {
        return baseSalary + calculateCommission();
    }

    // toString method
    @Override
    public String toString() {
        return "CommissionEmployee{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", hireDate=" + getHireDate() +
                ", baseSalary=" + baseSalary +
                ", commissionRate=" + commissionRate +
                ", salesAmount=" + salesAmount +
                '}';
    }
}