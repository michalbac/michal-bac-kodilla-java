package com.kodilla.good.patterns.Food2Door;

public class HealthyShop implements Producer {

    private String name;

    public HealthyShop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void process(Product product) {
        System.out.println("\nProduct: " + product.getProductName() + ", weight: " + product.getWeight() + ", price: " + product.getPrice() + ", ordered from HealthyShop" + "\nOrder will be sent to you via courier");
    }
}
