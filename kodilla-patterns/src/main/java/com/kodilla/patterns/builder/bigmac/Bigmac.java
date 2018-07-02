package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final String bun;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    private Bigmac(final String bun, final int burgers, final String sauce, final List<String> ingredeitns) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredeitns);
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredeitns() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

    public static class BigMacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigMacBuilder bun(String bun) {
            this.bun = bun;
            return this;
        }

        public BigMacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigMacBuilder ingredient (String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build () {
            if (!(burgers >= Ingredients.burgerMin && burgers <= Ingredients.burgerMax)) {
                throw new IllegalStateException("Qunatity of burgers should be between " + Ingredients.burgerMin + " and " + Ingredients.burgerMax);
            }
            if (!(Ingredients.getSauces().contains(sauce))) {
                throw new IllegalStateException("Sauce should be one of the following: " + Ingredients.getSauces());
            }
            for (int n=0; n < ingredients.size(); n++){
                if (!(Ingredients.getIngredients().contains(ingredients.get(n)))) {
                    throw new IllegalStateException("Indicated ingredient cannot be added to the BigMac");
                }
            }
            if (!(bun.equals(Ingredients.bun1) || bun.equals(Ingredients.bun2))) {
                throw new IllegalStateException("Bun in your bicmac should be " + Ingredients.bun1 + " or " + Ingredients.bun2);

            }
            return new Bigmac(bun, burgers, sauce, ingredients);
        }

    }
}
