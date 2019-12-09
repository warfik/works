package com.telran.comparator;

import com.telran.CountryCode;

public class CountryCodeComparator extends AbstractComparator {

    @Override
    public int compare(Object o1, Object o2) {
        CountryCode countryCode1 = (CountryCode) o1;
        CountryCode countryCode2 = (CountryCode) o2;

        if (countryCode1.getCountryCode() < countryCode2.getCountryCode())
            return -1;
        else if (countryCode1.getCountryCode() > countryCode2.getCountryCode())
            return 1;
        return 0;

    }

}
