package com.telran;

import org.junit.Test;

import static com.telran.Main.*;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void Nod() {
        assertEquals(9, gcd(225, 126));
        assertEquals(-1, gcd(3, 10));
        assertEquals(-1, gcd(1, 3));
    }
    @Test
    public void NodOfNull(){
        assertEquals(0,0,0);
    }

    @Test
    public void Nok() {
        assertEquals(3150, lcm(225, 126));
        assertEquals(-1, gcd(3, 10));
        assertEquals(-1, gcd(1, 3));
    }

    @Test
    public void result() {
        assertEquals(6, num3(28));
        assertEquals(2, num3(20));
        assertEquals(3, num3(21));
        assertEquals(4, num3(4));
        assertEquals(1, num3(1));
        assertEquals(5, num3(9));
        assertEquals(11, num3(101));
        assertEquals(0, num3(0));
    }
    @Test
    public void testnum4() {
        assertEquals(1, num4(1));
        assertEquals(1, num4(2));
        assertEquals(2, num4(3));
        assertEquals(2, num4(4));
        assertEquals(2, num4(5));
        assertEquals(3, num4(6));
        assertEquals(3, num4(7));
        assertEquals(3, num4(8));
        assertEquals(3, num4(9));
        assertEquals(4, num4(10));
        assertEquals(4, num4(11));
        assertEquals(6, num4(22));
        assertEquals(9, num4(51));
    }
    @Test
    public void testnum5(){
assertEquals(3,fib(44,5));
assertEquals(3,fib(1,5));
    }
}