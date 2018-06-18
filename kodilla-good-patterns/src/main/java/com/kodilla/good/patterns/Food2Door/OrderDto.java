package com.kodilla.good.patterns.Food2Door;

public class OrderDto {
    private Customer customer;
    private Product product;
    private boolean isOrdered;

    public OrderDto(Customer customer, Product product, boolean isOrdered) {
        this.customer = customer;
        this.product = product;
        this.isOrdered = isOrdered;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
