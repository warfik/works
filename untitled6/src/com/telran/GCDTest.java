package com.telran;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class GCDTest {

    private com.telran.GCD gcd = new GCD();

    @Test
    public void gcdOfZeroAndNumberIsNumber() {
        assertEquals(42, gcd.GCD(0, 42));
    }

    @Test
    public void shouldCalculateGCDofTwoPositiveNumbers() {
        assertEquals(120, gcd.GCD(1080, 1920));

    }
    @Test
            public void Negative() {

        assertEquals(3, gcd.GCD(21, -9));
    }
}
