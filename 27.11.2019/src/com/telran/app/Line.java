package com.telran.app;

public class Line extends Shape {


    private int length;


    public Line(char symbol, int length) {
        super(symbol);
        this.length = length;
    }

    @Override
    public void draw() {
        for (int i = 0; i < length; i++) {
            System.out.print(symbol + " ");
        }


    }
}
