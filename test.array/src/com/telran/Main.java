package com.telran;

public class Main {

    public static void main(String[] args) {
        // Нахождение максимального значения в массиве myArray из 4 элементов типа double.
        double[] myArray = {11, 5.8, 11.1, 10.9};

        // Переменной max задаем значение нулевого элемента.
        double max = myArray[0];

        // Перебираем все элементы массива.
        for (int i = 1; i < myArray.length; i++) {
            // Сравниваем значение переменной max со значениями элемента массива.
            // Если значение элемента массива больше значения переменной max,
            // то новое значение переменной max будет равно значению этого элемента.

            if (myArray[i] > 0) {
                max = myArray[i];
            }
        }

        // Выводим на экран наибольший элемент массива myArray.
        System.out.println("Максимальное значение в массиве myArray: " + max);
    }
}