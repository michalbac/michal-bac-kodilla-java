package com.kodilla.good.patterns.Food2Door;

public class GlutenFreeShop implements Producer {

    private String name;

    public GlutenFreeShop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void process(Product product) {
        System.out.println("\nProduct: " + product.getProductName() + ", weight: " + product.getWeight() + ", price: " + product.getPrice() + ", ordered from ExtraFoodShop" + "\nWe will sent this order directly to your customer");
    }
}