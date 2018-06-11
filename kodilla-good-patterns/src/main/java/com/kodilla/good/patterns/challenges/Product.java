package com.kodilla.good.patterns.challenges;

public class Product {

    private String productName;
    private double productPrice;
    private boolean productAvailable;


    public Product(String productName, double productPrice, boolean productAvailable) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productAvailable = productAvailable;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public boolean isProductAvailable() {
        return productAvailable;
    }
}
