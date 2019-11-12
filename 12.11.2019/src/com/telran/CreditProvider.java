package com.telran;

public class CreditProvider {
    CreditProvider(){}

    CreditProvider(String nameIn, String surnameIn, int ageIn) {
        name = nameIn;
        surname = surnameIn;
    }

    String name;
    String surname;

    boolean CreditUser(CreditUser user) {
        System.out.println("Hello, my name is " + name + " " + surname );
    return true;
    }

}
