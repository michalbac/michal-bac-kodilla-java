package com.kodilla.exception.test;

public class FlightExceptionRunner {

    public static void main(String[] args) {
    Flight flight = new Flight("Oslo", "New York");
    Flight flight1 = new Flight("Amsterdam", "Warsaw");

    FlightFinder flightFinder = new FlightFinder();

    try {
        flightFinder.findFilght(flight);
    } catch (RouteNotFoundException e) {

        System.out.println("Airport not found!\n");
    }

        try {
            flightFinder.findFilght(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("Airport not found!\n");
        }

    }

}
