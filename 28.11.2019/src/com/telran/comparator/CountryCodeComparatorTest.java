package com.telran.comparator;

import com.telran.CountryCode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountryCodeComparatorTest {

    @Test
    public void testCoutryCodeComparisonLess() {
        CountryCode Russland = new CountryCode("Russland", 7);
        CountryCode Deutschland = new CountryCode("Deutschland", 49);
        CountryCodeComparator comparator = new CountryCodeComparator();

        int result = comparator.compare(Russland, Deutschland);

        assertEquals(-1, result);
    }

    @Test
    public void testCoutryCodeComparisonGreater() {
        CountryCode Russland = new CountryCode("Russland", 7);
        CountryCode Deutschland = new CountryCode("Deutschland", 49);
        CountryCodeComparator comparator = new CountryCodeComparator();

        int result = comparator.compare(Deutschland, Russland);

        assertEquals(1, result);
    }

    @Test
    public void testCoutryCodeComparisonEqual() {
        CountryCode Russland1 = new CountryCode("Russland", 7);
        CountryCode Russland2 = new CountryCode("Russland_1", 7);
        CountryCodeComparator comparator = new CountryCodeComparator();

        int result = comparator.compare(Russland1, Russland2);

        assertEquals(0, result);
    }
}