package com.telran;

public class MPV {

    public static void main(String[] args) {
        int sumM = 0;
        int sumP = 0;
        int sumV = 0;
        int month = 18;
        int abc = 10;
        int add = month - abc;
        int SalaryMV = 50;
        int SalaryP = 40;
        int monthM = SalaryMV + month;
        int monthP = SalaryP + (month / 2);
        int monthV = SalaryMV - abc;

        for (int m = SalaryMV; m < monthM; m++) {
            sumM += m;
        }
        for (int p = SalaryP; p < monthP; p++) {
            sumP += p;
        }
        sumP = sumP * 2;
        for (int v = SalaryMV; v > monthV; v--) {
            sumV += v;
        }
        sumV += (SalaryMV * add);

        int total = sumM + sumP + sumV;

        System.out.println(sumM);
        System.out.println(sumP);
        System.out.println(sumV);
        System.out.println("##########");

        System.out.println(total);


    }

}


