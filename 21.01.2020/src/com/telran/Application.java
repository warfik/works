package com.telran;

import com.telran.printer.PrintStreamAdapter;
import com.telran.printer.PrintWriterAdapter;

import java.io.PrintWriter;

public class Application {

    public static void main(String[] args) {

        PrintStreamAdapter psa = new PrintStreamAdapter(System.out);
        PrintWriterAdapter pwa = new PrintWriterAdapter(new PrintWriter(System.out, true));
        String testLine = "Hello World!";
        int numOfLines = 10000;

        PrintTester psaTest = new PrintTester(psa);
        PrintTester pwaTest = new PrintTester(pwa);

        long speedOfPsa = psaTest.testPrintPerformance(testLine, numOfLines);
        long speedOfPwa = pwaTest.testPrintPerformance(testLine, numOfLines);

        System.out.println("\n*****************\n");
        System.out.println("printStream: " + speedOfPsa);
        System.out.println("printWriter: " + speedOfPwa);
    }
}