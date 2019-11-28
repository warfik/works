package com.telran;

import com.telran.app.*;

public class Application {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle('+', 7, 25);
        Shape line = new Line('-', 25);
        Shape line2 = new Line('*', 25);
        Shape rectangle2 = new Rectangle('@', 25, 25);
        Shape[] allShapes = new Shape[]{rectangle, line, line2, rectangle2};
        Picture picture = new Picture(allShapes);
        picture.draw();
    }
}
