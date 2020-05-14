package com.telran.stack;


import com.telran.comparator.EmptyListException;
import com.telran.comparator.IntegerOurComparator;
import com.telran.comparator.OurComparator;
import com.telran.comparator.StringComparator;
import org.junit.Test;


import static org.junit.Assert.*;

public class OurStackTest {

    OurStack<Integer> sourceInt = new OurStack<>();
    OurStack<String> sourceStr = new OurStack<>();
    OurComparator cpInt = new IntegerOurComparator();
    OurComparator cpString = new StringComparator();

    @Test
    public void Test1() throws EmptyListException {
        sourceInt.addLast(5);
        sourceInt.addLast(7);
        sourceInt.addLast(10);
        sourceInt.addLast(15);
        assertEquals((Integer) 15, sourceInt.getMax(cpInt));
    }

    @Test
    public void Test2() throws EmptyListException {
        sourceInt.addLast(66);
        sourceInt.addLast(52);
        sourceInt.addLast(8);
        sourceInt.addLast(20);
        assertEquals((Integer)20, sourceInt.getMax(cpInt));
    }

    @Test
    public void Test3() throws EmptyListException {
        sourceStr.addLast("a");
        sourceStr.addLast("b");
        sourceStr.addLast("c");
        sourceStr.addLast("d");
        OurComparator cpString = new StringComparator();
        assertEquals("d", sourceStr.getMax(cpString));
    }

    @Test
    public void Test4() throws EmptyListException {
        sourceStr.addLast("B");
        sourceStr.addLast("A");
        sourceStr.addLast("D");
        sourceStr.addLast("F");

        assertEquals("F", sourceStr.getMax(cpString));
    }
}