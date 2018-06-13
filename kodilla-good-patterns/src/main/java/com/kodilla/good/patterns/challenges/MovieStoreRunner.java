package com.kodilla.good.patterns.challenges;

import java.util.List;

public class MovieStoreRunner {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        String movies = movieStore.getTitles();

        System.out.println(movies);
    }
}
