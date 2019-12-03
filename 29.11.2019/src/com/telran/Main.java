package com.telran;

public class Main {

    public static void main(String[] args) {

        System.out.println(Nod(48500, 2500));
    }
    //
    // наибольший общий делитель
    //
    public static int Nod(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
}
