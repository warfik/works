package com.telran;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        MaxStack<Auto> autoBStack = new MaxStack<>(new BrandAutoComparator());

        MaxStack<Auto> autoDStack = new MaxStack<>(new DateAutoComparator());

        MaxStack<Auto> autoMStack = new MaxStack<>(new modelAutoComparator());

        Auto citroen = new Auto("Citroen", "C4", 2010);
        Auto opel = new Auto("Opel", "Astra", 2012);
        Auto nissan = new Auto("Nissan", "X-Trail", 2018);


        autoBStack.addLast(citroen);
        autoBStack.addLast(opel);
        autoBStack.addLast(nissan);
        if autoBStack.

        System.out.println(autoStack.max());
    }
}

class Auto {
    String brand;
    String model;
    int date;

    public Auto(String brand, String model, int date) {
        this.brand = brand;
        this.model = model;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", date=" + date +
                '}';
    }
}

class DateAutoComparator implements Comparator<Auto>{
    @Override
    public int compare(Auto o1, Auto o2) {
        return o1.date-(o2.date);
    }
}
class BrandAutoComparator implements Comparator<Auto> {
    @Override
    public int compare(Auto o1, Auto o2) {
        return o1.brand.compareTo(o2.brand);
    }
}
class modelAutoComparator implements Comparator<Auto> {
    @Override
    public int compare(Auto o1, Auto o2) {
        return o1.model.compareTo(o2.model);
    }
}
