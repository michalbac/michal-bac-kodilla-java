package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public final class Continent {

    List<Country> continent = new ArrayList<>();

    public void addCountry(Country country){
        continent.add(country);
    }

    public Set<Country> getCountries() {
        return new HashSet<>(continent);
    }

}
