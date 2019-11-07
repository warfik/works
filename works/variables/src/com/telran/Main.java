package com.telran;

public class Main {

    public static void main(String[] args) {
        {
            System.out.println("Task №1");

            System.out.println("summa variable 1001+10101 is " + Integer.toBinaryString(0b1001 + 0b10101));
            System.out.println("diff variable 1001101-10010 is " + Integer.toBinaryString(0b1001101 - 0b10010));
            System.out.println("summa variable 111+1011 is " + Integer.toBinaryString(0b111 + 0b1011));
            System.out.println("summa variable 10+11 is " + Integer.toBinaryString(0b10 + 0b11));
        }
        {
            System.out.println("Task №2");
            int petr = 5, vasily = petr * 3, maria = vasily - 7;
            // вводим переменные типа int и присваиваем значении им согласно поставленным условиям задачи.
            System.out.println("Summa Apples(all): " + (petr + vasily + maria));
            //выводим значение всех яблок у людей
            System.out.println("Summa Apples Petr and Maria is: " + (petr + maria));
            //выводим значение суммы яблок петра и марии
        }
    }
}
