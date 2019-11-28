package com.telran;

public class CallCenterEmployee extends Employee {
    int hours;

    public CallCenterEmployee(int id, String name, String companyName, int basicSalary) {
        super(id, name, companyName, basicSalary);
        this.hours = hours;
    }
}
