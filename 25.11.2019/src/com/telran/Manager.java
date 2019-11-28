package com.telran;

public class Manager extends Employee {
    private double coefficeent;

    public Manager(int id, String name, String companyName, int basicSalary, double coefficeent) {
        super(id, name, companyName, basicSalary);
        this.coefficeent = coefficeent;
    }
}
