package com.lambdaschool.countries;

import com.lambdaschool.countries.models.Country;

@FunctionalInterface
public interface CheckCountry {
    boolean test(Country e);
}
