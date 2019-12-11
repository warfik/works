package com.telran;

public class LCM {
public static void main(String [] args){
    System.out.println(gcf(768,1024));
    System.out.println(lcm(768,1024));

}
   public static int gcf(int a, int b)
    {
        while (a != b)
        {
            if (a > b) a -= b;
            else b -= a;
        }
        return a; }

    public static int lcm(int a, int b)
    {
        return (a * b) / gcf(a, b);
    }
}
