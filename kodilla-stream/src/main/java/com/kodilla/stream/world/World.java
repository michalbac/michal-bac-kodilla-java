package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public final class World {

    List<Continent> continents = new ArrayList<>();

    public void addContinent (Continent continent) {
        continents.add(continent);
    }

    public List<Continent> getWorld() {
        return new ArrayList<>(continents);
    }

    public BigDecimal getPeopleQuantity() {
        return getWorld().stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
