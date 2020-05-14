package com.telran;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        CharPrinter runnable = new CharPrinter('*', 100);
        Thread th = new Thread(runnable);
        CharPrinter printerp = new CharPrinter('+', 100);
        Thread th1 = new Thread(printerp);

        CharPrinter printerm = new CharPrinter('-', 100);
        Thread th2 = new Thread(printerm);

        long currentTime = System.currentTimeMillis();
        th.start();
        th1.start();
        th2.start();
        th.join();
        th1.join();
        th2.join();
        th.

        long executionTime = System.currentTimeMillis() - currentTime;
        System.out.println("Time of execution is :" + executionTime);
        System.out.println("End of main");
    }
}
