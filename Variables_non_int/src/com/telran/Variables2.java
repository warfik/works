package com.telran;

public class Variables2 {

    public static void main(String[] args) {
        double Maria = 1.0/3.0, Petr = Maria/2.0, Vasily = (Maria+Petr)*4.0;
        System.out.println("Total is: " + (Maria+Petr+Vasily) + ". Integer is: " + (int)(Math.floor(Maria+Petr+Vasily)));
    }
}
