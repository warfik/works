package com.telran.collection;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
public class OurHashSetTest {
    @Test
    public void test1() {
        OurSet<Integer> set = new OurHashSet<>() ;
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);
        set.add(2);
        Assert.assertEquals(3, set.size());

    }

    @Test
    public void test2() {
        OurSet<Integer> set = new OurHashSet<>() ;
        boolean result = set.add(1);
        Assert.assertTrue(result);
    }

    @Test
    public void test3() {
        OurSet<Integer> set = new OurHashSet<>() ;
        set.add(1);
        boolean result = set.add(1);
        Assert.assertFalse(result);
    }

    @Test
    public void test4() {
        OurSet<Integer> set = new OurHashSet<>() ;
        set.add(1);
        boolean result = set.remove(1);
        Assert.assertTrue(result);
    }

    @Test
    public void test5() {
        OurSet<Integer> set = new OurHashSet<>() ;
        set.add(1);
        boolean result = set.remove(2);
        Assert.assertFalse(result);
    }

    @Test
    public void test6() {
        OurSet<Integer> set = new OurHashSet<>() ;
        set.add(23);
        boolean contains = set.contains(23);
        Assert.assertTrue(contains);
    }

    @Test
    public void test7() {
        OurSet<Integer> set = new OurHashSet<>() ;
        set.add(1);
        boolean contains = set.contains(2);
        Assert.assertFalse(contains);
    }

    @Test
    public void test8() {
        OurSet<Integer> set = new OurHashSet<>() ;
        set.add(1);
        set.add(2);
        set.add(3);

        OurSet<Integer> otherSet = new OurHashSet<>() ;
        otherSet.add(1);
        otherSet.add(4);
        otherSet.add(5);

        Integer[] expected = {1, 2, 3, 4, 5};

        set.addAll(otherSet);

        Assert.assertEquals(set.size(), expected.length);
        for (Integer element : expected) {
            Assert.assertTrue(set.contains(element));
        }
    }

    @Test
    public void removeAll_removes_elemnts_that_are_in_other_set() {
        OurSet<Integer> set = new OurHashSet<>() ;
        set.add(1);
        set.add(2);
        set.add(3);

        OurSet<Integer> otherSet = new OurHashSet<>() ;
        otherSet.add(1);
        otherSet.add(2);
        otherSet.add(4);
        otherSet.add(5);

        Integer[] expected = {3};

        set.removeAll(otherSet);

        Assert.assertEquals(set.size(), expected.length);
        for (Integer element : expected) {
            Assert.assertTrue(set.contains(element));
        }
    }

    @Test
    public void test9() {
        OurSet<Integer> set = new OurHashSet<>() ;
        set.add(1);
        set.add(2);
        set.add(3);

        OurSet<Integer> otherSet = new OurHashSet<>() ;
        otherSet.add(1);
        otherSet.add(2);
        otherSet.add(4);
        otherSet.add(5);

        Integer[] expected = {1,2};

        set.retainAll(otherSet);

        Assert.assertEquals(set.size(), expected.length);
        for (Integer element : expected) {
            Assert.assertTrue(set.contains(element));
        }
    }
}