package com.telran;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Function<String, String> iden = String::new;
        System.out.println(iden.apply("Hello" ));
    }
}
