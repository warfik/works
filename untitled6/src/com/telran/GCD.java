package com.telran;

public class GCD {

    public static void main(String[] args) {

    }
    public int GCD ( int a, int b){
        if (b == 0)
            return Math.abs(a);
        return GCD(b, a % b);
    }
}
