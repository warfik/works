package com.telran.collections;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class OurHashMapTest {

    @Test
    public void testPut_checkWithJavaHashmap() {
        OurHashMap<String, Integer> hm = new OurHashMap<>();
        hm.put("eins", 1);
        hm.put("zwei", 2);
        hm.put("drei", 3);
        hm.put("vier", 4);
        hm.put("fünf", 5);
        hm.put("sechs", 6);

        HashMap<String, String> hmTest = new HashMap<>();
        hmTest.put("eins", "1");
        hmTest.put("zwei", "2");
        hmTest.put("drei", "3");
        hmTest.put("vier", "4");
        hmTest.put("fünf", "5");
        hmTest.put("sechs", "6");

        assertEquals(hm.size(), hmTest.size());
        assertEquals(hm.contains("eins"), hmTest.containsKey("eins"));
        assertEquals(hm.contains("drei"), hmTest.containsKey("drei"));
    }

    @Test
    public void testGet_inList() {
        OurHashMap<String, String> hm = new OurHashMap<>();
        hm.put("eins", "1");
        hm.put("zwei", "2");
        hm.put("drei", "3");
        hm.put("vier", "4");
        hm.put("fünf", "5");
        hm.put("sechs", "6");

        assertEquals(hm.get("eins"), "1");
        assertEquals(hm.get("zwei"), "2");
        assertEquals(hm.get("drei"), "3");
        assertEquals(hm.get("vier"), "4");
        assertEquals(hm.get("fünf"), "5");
        assertEquals(hm.get("sechs"), "6");

        assertNull(hm.get("null"));
    }

    @Test
    public void testGet_notInList() {
        OurHashMap<String, String> hm = new OurHashMap<>();
        hm.put("eins", "1");
        hm.put("zwei", "2");
        hm.put("drei", "3");
        hm.put("vier", "4");
        hm.put("fünf", "5");
        hm.put("sechs", "6");

        assertNull(hm.get("ten"));
        assertNull(hm.get("eleven"));
        assertNull(hm.get("null"));
    }

    @Test
    public void testContains_inList_true() {
        OurHashMap<String, String> hm = new OurHashMap<>();
        hm.put("eins", "1");
        hm.put("zwei", "2");
        hm.put("drei", "3");
        hm.put("vier", "4");
        hm.put("fünf", "5");
        hm.put("sechs", "6");
        assertTrue(hm.contains("eins"));
        assertTrue(hm.contains("zwei"));
        assertTrue(hm.contains("drei"));
    }

    @Test
    public void testContains_inList_false() {
        OurHashMap<String, String> hm = new OurHashMap<>();
        hm.put("ein", "1");
        hm.put("zwei", "2");
        hm.put("drei", "3");
        assertFalse(hm.contains("null"));
        assertFalse(hm.contains("zehn"));
        assertFalse(hm.contains("vier"));
    }

    @Test
    public void testRemove_inList_checkWithSizeAndContains() {
        OurHashMap<String, String> hm = new OurHashMap<>();
        hm.put("eins", "1");
        hm.put("zwei", "2");
        hm.put("drei", "3");
        hm.put("vier", "4");
        hm.put("fünf", "5");
        hm.put("sechs", "6");

        assertEquals(hm.size(), 6);
        assertTrue(hm.contains("eins"));
        assertTrue(hm.remove("eins"));
        assertFalse(hm.contains("eins"));
        assertEquals(hm.size(), 5);
        assertEquals(hm.size(), 5);
        assertTrue(hm.contains("drei"));
        assertTrue(hm.remove("drei"));
        assertFalse(hm.contains("drei"));
        assertEquals(hm.size(), 4);
    }

    @Test
    public void testRemove_notInLins_checkWithSize() {
        OurHashMap<String, String> hm = new OurHashMap<>();
        hm.put("eins", "1");
        hm.put("zwei", "2");
        assertEquals(hm.size(), 2);
        assertFalse(hm.remove("zehn"));
        assertEquals(hm.size(), 2);
    }

    @Test
    public void testSize_checkWithPut() {
        OurHashMap<String, String> hm = new OurHashMap<>();
        hm.put("eins", "1");
        assertEquals(hm.size(), 1);
        hm.put("zwei", "2");
        assertEquals(hm.size(), 2);
        hm.put("drei", "3");
        assertEquals(hm.size(), 3);
        hm.put("vier", "4");
        assertEquals(hm.size(), 4);
        hm.put("fünf", "5");
        assertEquals(hm.size(), 5);
        hm.put("sechs", "6");
        assertEquals(hm.size(), 6);
    }

    @Test
    public void testSize_checkWithRemove() {
        OurHashMap<String, String> hm = new OurHashMap<>();
        assertEquals(hm.size(), 0);
        hm.put("eins", "1");
        hm.put("zwei", "2");
        hm.put("drei", "3");
        hm.put("vier", "4");
        hm.put("fünf", "5");
        hm.put("sechs", "6");

        assertEquals(hm.size(), 6);
        hm.remove("eins");
        assertEquals(hm.size(), 5);
        hm.remove("zwei");
        assertEquals(hm.size(), 4);
        hm.remove("fünf");
        assertEquals(hm.size(), 3);
        hm.remove("vier");
        assertEquals(hm.size(), 2);
    }
}