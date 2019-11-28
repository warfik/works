package com.telran.app;

abstract public class Shape {

    protected char symbol;


    public Shape(char symbol) {
        this.symbol = symbol;
    }

    abstract void draw();

    public char getSymbol() {
        return symbol;
    }
}

