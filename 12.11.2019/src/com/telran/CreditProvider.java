package com.telran;

public class CreditProvider {

    public static final int Salborder = 20000;
    public static final int mid = 50;
    public static final int old = 70;

    private String name;
    private String surname;
    private boolean isLazy;
    private boolean isKind;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public boolean isLazy() {
        return isLazy;
    }

    public boolean isKind() {
        return isKind;
    }

    public CreditProvider(String name, String surname, boolean isLazy, boolean isKind) {
        this.name = name;
        this.surname = surname;
        this.isLazy = isLazy;
        this.isKind = isKind;
    }

    public boolean toProvide(CreditUser creditUser) {
        if (this.isLazy) {
            if (creditUser.annualSalary > Salborder) {
                return true;
            } else {
                return false;
            }
        }

        if (!this.isKind) {
            if (creditUser.annualSalary > Salborder && creditUser.age < mid)
                return true;
            else
                return false;
        }

        if (creditUser.annualSalary > Salborder && creditUser.age < old)
            return true;

        return false;
    }
}