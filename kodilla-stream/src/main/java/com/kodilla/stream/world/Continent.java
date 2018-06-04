package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public final class Continent {

    Set<Country> continent = new HashSet<>();

    public void addCountry(Country country){
        continent.add(country);
    }

    public Set<Country> getCountries() {
        return continent;
    }

}
