package com.telran;

import org.junit.Test;

import static org.junit.Assert.*;

public class GCDTest {

    private GCD gcd = new GCD();

        @Test
        public void gcdOfZero() {
            assertEquals(42, gcd.GCD(0, 42));
        }

        @Test
        public void CalculateGCD() {
            assertEquals(120, gcd.GCD(1080, 1920));
        }
        @Test
        public void NegativeGCD() {

            assertEquals(3, gcd.GCD(21, -9));
        }
    }
