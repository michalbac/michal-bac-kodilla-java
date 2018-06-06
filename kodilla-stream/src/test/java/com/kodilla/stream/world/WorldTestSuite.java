package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;


public class WorldTestSuite {

    @Test

    public void testGetPeopleQuantity() {
        //Given
        Country Poland = new Country("Poland", new BigDecimal("38000000"));
        Country Austria = new Country("Austria", new BigDecimal("8500000"));
        Country Finland = new Country("Finland", new BigDecimal("5400000"));
        Country Thailand = new Country("Thailand", new BigDecimal("60000000"));
        Country Vietnam = new Country("Vietnam", new BigDecimal("92000000"));
        Continent Europe = new Continent();
        Continent Asia = new Continent();


        //When
        Europe.addCountry(Poland);
        Europe.addCountry(Austria);
        Europe.addCountry(Finland);
        Asia.addCountry(Thailand);
        Asia.addCountry(Vietnam);
        World world = new World();
        world.addContinent(Asia);
        world.addContinent(Europe);

        //Then
        BigDecimal expectedSand = new BigDecimal("203900000");
        Assert.assertEquals(expectedSand, world.getPeopleQuantity());

    }
}
