package com.telran;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Integer> ourCoins01 = new ArrayList(Arrays.asList(3, 2, 1));
        List<Integer> ourCoins02 = new ArrayList(Arrays.asList(10, 5, 3, 2, 1));
        List<Integer> ourCoins03 = new ArrayList(Arrays.asList(5, 2, 1));
        int sum = 25;
        Exchange exchange01 = new Exchange(ourCoins01);
        Exchange exchange02 = new Exchange(ourCoins02);
        Exchange exchange03 = new Exchange(ourCoins03);
        int result01 = exchange01.moneyExchange(sum);
        int result02 = exchange02.moneyExchange(sum);
        int result03 = exchange03.moneyExchange(sum);
        System.out.println(result01);
        System.out.println(result02);
        System.out.println(result03);
    }
}