package com.telran.collection;

import org.junit.*;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

public class SortedNumbersListTest {
    SortedNumbersList list;
    int[] array;

    @Before
    public void init() {
        array = new int[]{19, 8, -6, 34};
        list = new SortedNumbersList(array);
    }

    @Test
    public void testSize() {
        assertEquals(4, list.size());
    }

    @Test
    public void testGet_allElements() {
        assertEquals(-6, list.get(0));
        assertEquals(8, list.get(1));
        assertEquals(19, list.get(2));
        assertEquals(34, list.get(3));
    }

    @Test
    public void testContains_true() {
        assertTrue(list.contains(-6));
        assertTrue(list.contains(8));
        assertTrue(list.contains(19));
        assertTrue(list.contains(34));
    }

    @Test
    public void testContains_false() {
        assertFalse(list.contains(-5));
        assertFalse(list.contains(9));
        assertFalse(list.contains(25));
    }

    @Test
    public void testUnion() {
        SortedNumbersList list = new SortedNumbersList(new int[]{ 1, 2, 3, 4, 5,});
        SortedNumbersList list2 = new SortedNumbersList(new int[]{6, 7, 5, 8, 9, 10});
        SortedNumbersList unionResult = list.union(list2);
        SortedNumbersList expected = new SortedNumbersList(new int[]{ 1, 2, 3, 4, 5, 6,7,8,9,10});
        assertEquals(unionResult.size(), expected.size());
        for (int i = 0; i < unionResult.size(); i++) {
            assertEquals(unionResult.get(i), expected.get(i));
        }
    }
}
