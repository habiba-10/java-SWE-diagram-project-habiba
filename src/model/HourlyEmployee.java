package model;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    // Constructor
    public HourlyEmployee(int id, String name, Gender gender, LocalDate hireDate,
                          double hourlyRate, double hoursWorked) {
        super(id, name, gender, hireDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Getters and Setters
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // Overridden calculateSalary method
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    // toString method
    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", hireDate=" + getHireDate() +
                ", hourlyRate=" + hourlyRate +
                ", hoursWorked=" + hoursWorked +
                '}';
    }
}