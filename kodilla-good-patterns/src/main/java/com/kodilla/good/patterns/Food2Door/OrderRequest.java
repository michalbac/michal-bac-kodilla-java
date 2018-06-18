package com.kodilla.good.patterns.Food2Door;

import java.time.LocalDate;

public class OrderRequest {

    private Customer customer;
    private Product product;
    private Producer producer;
    private LocalDate orderDate;

    public OrderRequest(Customer customer, Product product, Producer producer, LocalDate orderDate) {
        this.customer = customer;
        this.product = product;
        this.producer = producer;
        this.orderDate = orderDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public Producer getProducer() {
        return producer;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
}
