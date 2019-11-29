package com.telran;

import com.telran.app.*;

public class Application {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle('+', 7, 10);
        Shape line1 = new Line('-', 5);
        Shape line2 = new Line('*', 15);
        Shape rectangle2 = new Rectangle('+', 5, 5);
        Shape[] allShapes = new Shape[]{rectangle, line1, line2, rectangle2};
        Picture picture = new Picture(allShapes);
        picture.draw();
    }
}
