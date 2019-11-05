package com.telran;

import java.util.Arrays;

public class Arraymulti {
    public static void main(String[] args) {
        int [][] arr = fillBy(2,2);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println(Arrays.toString(getChess()));
	}
    static int[][]fillBy(int m, int n){
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = 1;
            }
        }
        return result;
    }
    static int[][] getChess(){
        int[][] result=new int[8][8];
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++) {
                if ((i+j)%2==1)
                    result[i][j]=1;
                else
                    result[i][j]=0;
            }
        }
    return result;
    }
    public static int getNum(int[][]array){
        int result =0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]<0){
                    result+=1;
                    break;
                }

            }

        }
    }
}
