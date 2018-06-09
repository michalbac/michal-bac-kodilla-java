package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightFinder {

    public void findFilght(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> airpots = new HashMap<>();
        airpots.put("Warsaw", true);
        airpots.put("London", true);
        airpots.put("Paris", false);
        airpots.put("Berlin", false);
        airpots.put("Nice", true);

        String airport = flight.getArrivalAirport();

        if (airpots.containsKey(airport)) {
            System.out.println("The airport: " + airport + "\nLanding possible: " + airpots.get(airport));
        } else {

            throw new RouteNotFoundException("This airport is not included in the map!");
        }
    }
}
