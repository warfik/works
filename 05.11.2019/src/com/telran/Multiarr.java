package com.telran;

import java.util.Arrays;

public class Multiarr {

    public static void main(String[] args) {
        int[][] array = fillArray();

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        int[][] chessBoard = getChessboard();
        for (int i = 0; i < chessBoard.length; i++) {
            System.out.println(Arrays.toString(chessBoard[i]));
        }

    }

    // returns a double array with numbers from 0-99
    static int[][] fillArray() {
        int[][] result = new int[10][10];
        for (int i = 9; i > 0; i--) {
            for (int j = 9; j > 0; j--) {
                result[i][j] =  j*10 + i;
            }
        }
        return result;
    }

    static int[][] getChessboard() {
        int[][] result = new int[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 1)
                    result[i][j] = 1;
                else
                    result[i][j] = 0;

            }
        }
        return result;

    }

    static int getNumberSubarraysWithNegativeNumber(int[][] array) {
        int result = 0;
        A:
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    result += 1;
                    continue A;

                }
            }
        }

        return result;
    }
}
