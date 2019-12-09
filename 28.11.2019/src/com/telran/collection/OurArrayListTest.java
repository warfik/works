package com.telran.collection;

import com.telran.CountryCode;
import com.telran.comparator.AbstractComparator;
import com.telran.comparator.CountryCodeComparator;
import com.telran.comparator.IntegerComparator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OurArrayListTest {

    @Test
    public void testAddGet_emptyObject_addsOneElement() {
        OurArrayList list = new OurArrayList();
        list.append(5);
        assertEquals(5, list.get(0));
    }

    @Test
    public void testAddGet_emptyObject_addsSeveralElement() {
        OurArrayList list = new OurArrayList();
        Integer[] expected = {1, 3, -10, 18, 4, 3, 7, 1, 3, 3, 3, 5, 5, 10, -18, 22, 28, 60, 15, 20};
        for (int i = 0; i < expected.length; i++) {
            list.append(expected[i]);
        }
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], list.get(i));
        }
    }

    @Test
    public void testSize_emptyObject_addsOneElement() {
        OurArrayList list = new OurArrayList();

        list.append(5);

        assertEquals(1, list.size());
    }

    @Test
    public void testSize_emptyObject_addsSeveralElement() {
        OurArrayList list = new OurArrayList();

        Integer[] expected = {1, 3, -10, 18, 4, 3, 7, 1, 3, 3, 3, 5, 5, 10, -18, 22, 28, 60, 15, 20};
        for (int i = 0; i < expected.length; i++) {
            list.append(expected[i]);
        }

        assertEquals(expected.length, list.size());
    }

    @Test
    public void test_set_value_in_index() {
        OurArrayList list = new OurArrayList();
        list.append("Katze");
        list.append("Hund");
        list.append("Maus");

        list.set("Fisch", 1);

        String[] expected = {"Katze", "Fisch", "Maus"};

        assertEquals(list.size(), expected.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(list.get(i), expected[i]);
        }
    }

    @Test
    public void remove_By_index() {

        OurArrayList list = new OurArrayList();
        list.append("Katze");
        list.append("Hund");
        list.append("Maus");

        String[] expected = {"Katze", "Hund"};

        list.removeById(2);

        assertEquals(list.size(), expected.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(list.get(i), expected[i]);
        }
    }

    @Test
    public void remove_By_first_index() {

        OurArrayList list = new OurArrayList();
        list.append("Katze");
        list.append("Hund");
        list.append("Maus");

        String[] expected = {"Hund", "Maus"};

        list.removeById(0);

        assertEquals(list.size(), expected.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(list.get(i), expected[i]);
        }
    }


    public void remove_By_last_index() {

        OurArrayList list = new OurArrayList();
        list.append("Katze");
        list.append("Hund");
        list.append("Maus");

        String[] expected = {"Katze", "Maus",};

        list.removeById(1);

        assertEquals(list.size(), expected.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(list.get(i), expected[i]);
        }
    }

    @Test
    public void remove_by_element() {
        OurArrayList list = new OurArrayList();
        String[] animals = {"Katze", "Fisch", "Maus", "Hund"};
        String[] expected = {"Katze", "Maus", "Hund"};

        for (int i = 0; i < animals.length; i++) {
            list.append(animals[i]);
        }

        list.remove("Fisch");


        assertEquals(3, list.size());


        for (int i = 0; i < expected.length; i++) {
            assertEquals(list.get(i), expected[i]);
        }

    }

    @Test
    public void testMax_severalIntegers() {
        OurArrayList list = new OurArrayList();

        list.append(5);
        list.append(15);
        list.append(2);
        list.append(5);

        AbstractComparator comparator = new IntegerComparator();

        assertEquals(15, list.max(comparator));
    }

    @Test
    public void testMin_severalIntegers() {
        OurArrayList list = new OurArrayList();

        list.append(5);
        list.append(15);
        list.append(2);
        list.append(5);

        AbstractComparator comparator = new IntegerComparator();

        assertEquals(2, list.min(comparator));
    }


    @Test
    public void sort() {
        CountryCode Russland = new CountryCode("Russland", 7);
        CountryCode Deutschland = new CountryCode("Deutschland", 49);
        CountryCode Thailand = new CountryCode("Thailand", 3);
        CountryCode Usa = new CountryCode("USA", 100);
        CountryCode Canada = new CountryCode("Canada", 42);

        OurArrayList codesList = new OurArrayList();
        codesList.append(Russland);
        codesList.append(Deutschland);
        codesList.append(Thailand);
        codesList.append(Usa);
        codesList.append(Canada);

        AbstractComparator comparator = new CountryCodeComparator();
        codesList.sort(comparator);

    }
}
