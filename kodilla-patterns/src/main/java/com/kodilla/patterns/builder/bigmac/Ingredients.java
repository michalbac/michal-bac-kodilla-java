package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Ingredients {
    public static final String bun1 = "Bun with sesame";
    public static final String bun2 = "Bun without sesame";
    public static final int burgerMin = 1;
    public static final int burgerMax = 2;

    public static List<String> getSauces() {
        List<String> sauces = new ArrayList<>();
        sauces.add("Standard");
        sauces.add("Thausand island asuce");
        sauces.add("BBQ");

        return sauces;
    }

    public static List<String> getIngredients() {
        List<String> ingredientsList = new ArrayList<>();
        ingredientsList.add("lettuce");
        ingredientsList.add("onion");
        ingredientsList.add("bacon");
        ingredientsList.add("cucumber");
        ingredientsList.add("paprika");
        ingredientsList.add("chili");
        ingredientsList.add("mushrooms");
        ingredientsList.add("shrimps");
        ingredientsList.add("cheese");

        return ingredientsList;
    }
}
