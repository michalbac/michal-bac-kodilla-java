package com.kodilla.good.patterns.Food2Door;

public class ExtraFoodShop implements Producer {

    private String name;

    public ExtraFoodShop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void process(Product product) {
        System.out.println("\nProduct: " + product.getProductName() + ", weight: " + product.getWeight() + ", price: " + product.getPrice() + ", ordered from ExtraFoodShop" + "\nPackage will be prepared to the transportation soon");
    }
}
