package com.telran;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        Function<Integer, Integer> miltwice = x ->2*x;
        System.out.println(miltwice.apply(10));
    }
}
