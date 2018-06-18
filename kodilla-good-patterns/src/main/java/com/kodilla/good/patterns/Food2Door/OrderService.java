package com.kodilla.good.patterns.Food2Door;

import java.time.LocalDate;

public class OrderService {

    public boolean order(Customer customer, Product product,Producer producer, LocalDate orderDate) {

        System.out.println("Creating order for user: " + customer.getCustomerName() + "\nOrdered product is: " + product.getProductName() + "\nOrder value is: " + product.getPrice());

        return true;
    }
}
