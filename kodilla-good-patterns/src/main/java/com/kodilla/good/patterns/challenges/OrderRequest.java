package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

public class OrderRequest {

    private User user;
    private Product product;
    private int orderNumber;
    private LocalDate orderDate;

    public OrderRequest(User user, Product product, int orderNumber, LocalDate orderDate) {
        this.user = user;
        this.product = product;
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
}
