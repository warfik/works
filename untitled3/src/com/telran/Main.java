package com.telran;

public class Main {

    public static void main(String[] args) {

            System.out.println(reverse("Привет мир") );
        }
        public static byte[] reverse (String str){

            byte [] strAsByteArray = str.getBytes();

            byte [] result =
                    new byte [strAsByteArray.length];

            for (int i = 0; i<strAsByteArray.length; i++)
                result[i] =
                        strAsByteArray[strAsByteArray.length-i-1];
            return result;

        }
    }


