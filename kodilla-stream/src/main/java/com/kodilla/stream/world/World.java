package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public final class World {

    List<Continent> World = new ArrayList<>();

    public void addContinent (Continent continent) {
        World.add(continent);
    }

    public List<Continent> getWorld() {
        return new ArrayList<>(World);
    }

//    public Set<BigDecimal> getPeopleQuantity() {
//        return getWorld().stream()
//                .flatMap(continent -> continent.getCountries().stream())
//                .map(Country::getPeopleQuantity)
//                .collect(Collectors.toSet());
//    }
}
